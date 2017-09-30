/*
Author: Collin Sherman
File: FileStats.java
Project: 3
Counts number of lines, words, and characters in text file.
*/

import java.io.*;
import java.util.*;

public class FileStats{

    public static void main(String[] args){
        int lines = 0;
        int words = 0;
        int chars = 0;

        try{
            File file = new File(args[0]);
            Scanner input = new Scanner(file);
            while(input.hasNextLine()){
                lines += 1;
                String line = input.nextLine();
                chars += line.length();   
                         
                Scanner lineScan = new Scanner(line);
                while(lineScan.hasNext()){
                    String word = lineScan.next();
                    words += 1;
                }
            }
            System.out.print(lines);
            System.out.print("\n");
            System.out.print(chars);
            System.out.print("\n");
            System.out.print(words);
        }
        
        catch(IOException e){
            System.out.println(e.toString());
        }
    }
}