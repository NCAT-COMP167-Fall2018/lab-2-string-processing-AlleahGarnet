/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Rakiyah
 */
public class Lab2 {
    private static String[] records;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        records = new String[100];
        
        try{
        Scanner reader = new Scanner(new File(args[0]));
            
        int currentIndex = 0;    
            while(reader.hasNext()){
                String[] line = reader.nextLine().split(",");
                
                String firstName =  line [0];
                String lastName = line[1];
                String age = line[2];
                String gender = line[3];
                String phoneNumber = line[4];
                String email = line[5]; 
                
                records[currentIndex]= String.format(" ");
                 String output = String.format("%-20s%10s%6s%12s%30s%30s", firstName,lastName,age,gender,phoneNumber,email);
                 System.out.println(output);
            }
        } catch(FileNotFoundException ex){
            System.err.println("Could not find input file");
        }
        
                
    }
    
}
