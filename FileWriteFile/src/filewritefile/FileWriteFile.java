/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filewritefile;

import java.util.Scanner;
import java.io.*;

public class FileWriteFile {

    
    public static void main(String[] args) throws IOException{
        String filename;
        String friendname;
        int numberfriends;
        
        Scanner kb = new Scanner(System.in);
        
        System.out.print("How many friends do you have: ");
        numberfriends = kb.nextInt(); 
        kb.nextLine();
                
        System.out.print("Enter the filename: ");
        filename = kb.nextLine();
        
        File file = new File (filename);
        
        if(file.exists()){
            System.out.println("The file " + filename + " already exist."); //if the file does not exisit the progam executes
            System.exit(0);
        }
        PrintWriter outputFile = new PrintWriter(file);
        
        for (int i = 0; i <= numberfriends; i++){
          System.out.print("Enter the name of friends " + "number " + i + ": ");
          friendname = kb.nextLine();
          
          outputFile.println(friendname);
        }
        outputFile.close();
        System.out.println("Data written to the file.");
    }
    
}
