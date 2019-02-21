/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author New
 */
public class DataAccess {
    private File target_file;
    
    //constructor
    public DataAccess(){
    }
    //overloaded constructor
    public DataAccess( String target_file ) {
        this.target_file = new File(target_file.toLowerCase());
    }
    
    //NEW - set the file name
    public void setTarget_file(File target_file){
        this.target_file = target_file;
    }
    
    //get=read
    public ArrayList<String> getAll() {
        ArrayList<String> list = null;
        if (this.target_file.exists() && !isEmpty()) {
            try (Scanner scan = new Scanner(this.target_file)) {
                list = new ArrayList();
                while (scan.hasNextLine()) {
                    list.add(scan.nextLine());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }   
        }
        return list;
    }
    //getbyid=find-one
    public String getById( int id ){
        String data = null;
        if (this.target_file.exists() && !isEmpty()) {
            try (BufferedReader br = new BufferedReader(new FileReader(this.target_file))) {
                //find the desired record
                String line = "";
                while ((line = br.readLine()) != null) {
                    String col[] = line.split("\\|");
                    if ( Integer.parseInt(col[0]) == id ) {
                        data = line;
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return data;
    }
    //set=writenew
    public int set( String action, int id, String recordLine ){
        int affected = -1;
        switch (action) {
            case "addnew":
                affected = this.addNew(id, recordLine);
                break;
            case "modify":
                affected = this.update( "edit", id, recordLine);
                break;
            case "remove":
                affected = this.update( "delete", id, null);
                break;
            default:
                //do nothing
        }
        return affected;
    }
    //check file is empty
    public boolean isEmpty(){
        return this.target_file.exists() && this.target_file.length() == 0;
    }
    //private addnew record line
    private int addNew( int id, String recordLine ){
        int isAdded = -1;
        try(PrintWriter out = new PrintWriter( new FileWriter(this.target_file, true) )) {
            String newLine = String.join("|", Integer.toString(id), recordLine);
            out.println( newLine );
            isAdded = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            return isAdded;
        }
    }
    //private update a specific record line
    private int update( String action, int id, String recordLine ){
        ArrayList<String> temp_list = new ArrayList();
        try( Scanner  scan = new Scanner(this.target_file); ) {
            if (this.target_file.exists() && !isEmpty()) {
                while ( scan.hasNextLine() ) {
                    String line = scan.nextLine();
                    switch (action) {
                        case "delete":
                            if ( !line.startsWith( Integer.toString(id)) ) {
                                temp_list.add( line );
                            }
                            break;
                        case "edit":
                            if ( line.startsWith( Integer.toString(id)) ) {
                                String newLine = String.join("|", Integer.toString(id), recordLine);
                                temp_list.add( newLine );
                            }else{
                                temp_list.add( line );
                            }
                            break;
                        default:
                            throw new AssertionError();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if ( temp_list.size() > 0 ) {
                try(PrintWriter out = new PrintWriter( new FileWriter(this.target_file) )) {
                    for (String s : temp_list) {
                        out.println( s );
                    }
                    return 1;
                } catch (Exception e) {
                    e.printStackTrace();
                    return 0;
                }
            }else{
                return 0;
            }
        }
    }
}
