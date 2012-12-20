/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package css2uri;

import java.util.regex.*;

/**
 *
 * @author Alex
 */
public class Init {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        String filename = args[0];
        
        for (String s: args) {
            System.out.println(s);
        }
        
        MyFile myfile = new MyFile(filename);
        String content = myfile.getContent();
            
        Pattern pattern = Pattern.compile("^.+}");
        Matcher matcher = pattern.matcher(content);
        

        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.start());
            System.out.println(matcher.end());

            found = true;
        }
        if(!found){
            System.out.println("No match found.");
        }        
        
        
        //System.out.println(content);
    }
}
