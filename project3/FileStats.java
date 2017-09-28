/*
Author: Collin Sherman
File: FileStats.java
Project: 3
Counts number of lines, words, and characters in text file.
*/

import java.io.*;
import java.util.Scanner;

public class FileStats{

    public static void main(String[] args){
        int lines = 0;
        int words = 0;
        int chars = 0;

        try{
            File file = new File(command.txt);
            Scanner input = new Scanner(file);
        }catch(IOException e){
            System.out.println(e.toString());
        }
        while(input.hasNextLine){
            String line = input.nextLine();
            while(line.hasNext){
                String word = line.next();
                System.out.println(word.next());
            }
        }
    }
}