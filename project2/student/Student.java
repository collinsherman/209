/* 
File: Student.java
Project: 2
*/

package student;

/**
* A <code>Student</code> object represents a name and a set of test scores for a student.
* @author Collin Sherman
* @version 1.0
*/
public class Student {

    //Class variable for default number of scores
    static public final int DEFAULT_NUM_SCORES = 3;

    //Instance variables
    //Each student object has a name and a set of test scores
    private String name;             
    private int[] scores;             

    //Constructors
    /**
    * Sets the student contstructor to take a name and number of scores as input
    * @param nm sets name for use in <code>Student</code> constructor
    * @param numScores sets number of spots to be made in the scores array
    */
    public Student(String nm, int numScores){
        name = nm;
        if(numScores <= 0)
            throw new IllegalArgumentException("i must be greater than 0.");
        scores = new int[numScores];
    }

    /*
    * If Student is called without any arguments, it will set Students as the name
    * and assign the default number of scores.
    */
    public Student(){
        this("Student", DEFAULT_NUM_SCORES);
    }

    /**
    * If only a name is input to Student, it will assign that name the default number of scores.
    * @param name sets name for use in <code>Student</code> constructor
    */
    public Student(String name){
        this(name, DEFAULT_NUM_SCORES);
    }

    // String representation
    /**
    * String that is displayed when the class is called to print.
    */
    public String toString(){
        String str;
        str = "Name: " + name  + "\nScores:\n";
        for (int score : scores)
             str += score + "\n";
        str += "Average: " + getAverage();
        return str;
    }  

    // Accessors and mutators
    /**
    * Sets name of student
    * @param nm sets name for use in <code>Student</code> constructor
    */
    public void setName(String nm){
         name = nm;
    }
    
    /**
    * Accesses name
    * @return name of student
    */
    public String getName(){
        return name;
    }
  
    /**
    * Sets the score at specific position in the array.  If a number out of the acceptable range
    * is input, an exception will be thrown.
    * @param i a position for the scores array
    * @param newScore sets score at certain position in scores array
    */
    public void setScore(int i, int newScore){
        if(i < 1 || i > scores.length)
            throw new IllegalArgumentException("i must be between 1 and " + scores.length);
        scores[i - 1] = newScore;
    }

    /**
    * Accesses the score at a specific position in the array.  If a number out of the acceptable range
    * is input, an exception will be thrown.
    * @param i a position for the scores array
    * @return score at a certain position i in the scores array
    */
    public int getScore(int i){
        if(i < 1 || i > scores.length)
            throw new IllegalArgumentException("i must be between 1 and " + scores.length);
        return scores[i - 1];
    }

    /**
    * Accesses length of scores array.
    * @return length of the scores array
    */
    public int getNumScores(){
        return scores.length;
    }
   
    // Other methods

    /**
    * Iterates through the score array, adds up the scores, and divides
    * that total by the amount of scores in the array, returning this average.
    * @return average of all of the scores in the array
    */
    public double getAverage(){
        int count = scores.length;
        int total = 0;        
        while(count != 0){
            total += scores[count - 1];
            count -= 1;
        }
        double avg = total/scores.length;
        return avg;
    }
    
    /**
    * Iterates through the score array and sets the highest score to high, which is returned.
    * @return highest number in the array
    */
    public int getHighScore(){
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
