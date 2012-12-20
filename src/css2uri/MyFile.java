/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package css2uri;

import java.io.*;
/**
 *
 * @author Alex
 */
public class MyFile {
    
    public File file;
    
    public MyFile(String filename)  {
        try {
            file = new File(filename);
        } catch (Exception e) {
            System.out.println(e);
        }   
    }
    
     public String getContent() {
         
        StringBuilder strContent = new StringBuilder();

        int ch;
        
        try {
            FileInputStream fin;
            
            fin = new FileInputStream(file);
            
            while ((ch = fin.read()) != -1) {
                strContent.append((char) ch);
            }
            
            fin.close();
            
        } catch(Exception e) {
            System.out.println(e);
        }       

        return strContent.toString();
     }
    
     
     public static void saveContent() {
         
     }
    
}
