/* 
Author: Collin Sherman
File: Student.java
Project: 2
*/

/**
* A <code>Student</code> object represents a name and a set of test scores for a student.
* @author Collin Sherman
* @version 1.0
*/

package student;

public class Student {

    //Class variable for default number of scores
    static public final int DEFAULT_NUM_SCORES = 3;

    //Instance variables
    //Each student object has a name and a set of test scores
    private String name;             
    private int[] scores;             

    //Constructors
    public Student(String nm, int numScores){
        /*Sets the student contstructor to take a name and number of scores as input.*/
        name = nm;
        if(numScores <= 0)
            throw new IllegalArgumentException("i must be greater than 0.");
        scores = new int[numScores];
    }

    public Student(){
        /*If Student is called without any arguments, it will set Students as the name
         and assign the default number of scores.*/
        this("Student", DEFAULT_NUM_SCORES);
    }

    public Student(String name){
        /*If only a name is input to Student, it will assign that name the default number of scores.*/
        this(name, DEFAULT_NUM_SCORES);
    }

    // String representation
    public String toString(){
        /*String that is displayed when the class is called to print.*/
        String str;
        str = "Name: " + name  + "\nScores:\n";
        for (int score : scores)
             str += score + "\n";
        str += "Average: " + getAverage();
        return str;
    }  

    // Accessors and mutators
    public void setName(String nm){
        /*Sets name of student*/
         name = nm;
    }
    
    public String getName(){
        /*Accesses and returns name*/
        return name;
    }
  
    public void setScore(int i, int newScore){
        /*Sets the score at specific position in the array.  If a number out of the acceptable range
        is input, an exception will be thrown.*/
        if(i < 1 || i > scores.length)
            throw new IllegalArgumentException("i must be between 1 and " + scores.length);
        scores[i - 1] = newScore;
    }

    public int getScore(int i){
        /*Accesses and returns the score at a specific position in the array.  If a number out of the acceptable range
        is input, an exception will be thrown*/
        if(i < 1 || i > scores.length)
            throw new IllegalArgumentException("i must be between 1 and " + scores.length);
        return scores[i - 1];
    }

    public int getNumScores(){
        /*Accesses and returns length of scores array.*/
        return scores.length;
    }
   
    // Other methods

    public double getAverage(){
        /*Iterates through the score array, adds up the scores, and divides
        that total by the amount of scores in the array, returning this average.*/
        int count = scores.length;
        int total = 0;        
        while(count != 0){
            total += scores[count - 1];
            count -= 1;
        }
        double avg = total/scores.length;
        return avg;
    }
    
    public int getHighScore(){
        /*Iterates through the score array and sets the highest score to high, which is returned.*/
        int count = scores.length;
        int high = scores[count - 1];
        while(count != 1){
            if(high < scores[count - 2])
                high = scores[count - 2];
            count -= 1;
        }
        return high;
    }
}
