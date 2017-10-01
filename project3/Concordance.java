/*
Author: Collin Sherman
File: Concordance.java
Project: 3
Displays the frequency of words in a text file.
*/

import java.io.*;
import java.util.*;

public class Concordance{


    public static void main(String[] args){
        Map<String, Integer> concordance = new TreeMap<String, Integer>();

        try{
            File file = new File(args[0]);
            Scanner input = new Scanner(file);
            
            while(input.hasNext()){
                String word = input.next();
                Integer freq = concordance.get(word);
                concordance.put(word, (freq == null) ? 1 : freq + 1);
                }
            
            
            System.out.println(concordance.size() + "\ndistinct words:");
            System.out.println(concordance);

        }catch(IOException e){
            System.out.println(e.toString());
        }
    }
}

