/*
File: FileListing.java
Project: 3
*/

import java.io.*;
import java.util.*;

public class FileListing{
    /**
     * Outputs text in a file with numbered lines.
     * @author Collin Sherman
     * @version 1.0
     */

    public static void main(String[] args){
        int lines = 0;

        try{
            File inputFile = new File(args[0]);
            Scanner input = new Scanner(inputFile);
            File outputFile = new File("newCommand.txt");
            PrintWriter output = new PrintWriter(outputFile);       

            while(input.hasNextLine()){
                lines += 1;
                String line = input.nextLine();
                output.printf("%5d> ", lines);
                output.println(line);
            }
            output.close();

        }catch(IOException e){
            System.out.println(e.toString());
        }
    }
}