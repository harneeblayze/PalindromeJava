/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javamentorship;

import java.util.Scanner;

/**
 *
 * @author HARNY
 */
public class JavaMentorship {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JavaMentorship j = new JavaMentorship();
        j.isPalindrome("ghg");
         
        
        // TODO code application logic here
    }
    
    private void isPalindrome(String test){
         //test = new String();
        String s2 = "";
        String s3 = "";
        String h1;
        // TODO code application logic here/* IMPORTANT: Multiple classes and nested static classes are supported */
        String x[] = new String[test.length()];
        String y[] = new String[test.length()];
        for (int i = 0; i < x.length; i++) {
            x[i]=(String.valueOf(test.charAt(i)));
            s2 = new String(x[i]);
  
            

                  
        }
        for (int i = y.length-1; i >= 0; i--) {
            y[i] = (String.valueOf(test.charAt(i)));
            s3 = new String(y[i]);
            
            
        }
        if(s2.equalsIgnoreCase(s3)){
             System.out.print("true");;
        }else{
             System.out.print("false");;}
        
       
        
    
    
    }
        // TODO code application logic here
    }

