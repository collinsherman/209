// Put controls in a window

import javax.swing.*;
import BreezySwing.*;
import student.Student;

public class MainView extends GBFrame{

    private IntegerField scoreField, positionField;
    private JButton updateButton;
    private JTextArea displayArea;
    private Student model;

    public MainView(Student s){
        this.setTitle("Student View");
        model = s;
        JLabel positionLabel = addLabel("Position",1,1,1,1);
        JLabel scoreLabel = addLabel("Score",2,1,1,1);
        positionField = addIntegerField(0, 1,2,1,1);
        scoreField = addIntegerField(0, 2,2,1,1);
        displayArea = addTextArea("", 3,1,2,1);
        displayArea.setEditable(false);
        updateButton = addButton("Update",4,1,2,1);
        displayArea.setText(model.toString());
        scoreField.setHorizontalAlignment(JTextField.CENTER);
        positionField.setHorizontalAlignment(JTextField.CENTER);
    } 

    public void buttonClicked(JButton button){                    
        int position = positionField.getNumber();
        if (position < 1 || position > model.getNumScores()){
            JOptionPane.showMessageDialog(this, 
                                          "Position out of range",
                                          "Student View", 
                                          JOptionPane.ERROR_MESSAGE);
            return;
        }
        int score = scoreField.getNumber();
        if (score < 0 || score > 100){
            JOptionPane.showMessageDialog(this, 
                                          "Score out of range",
                                          "Student View", 
                                          JOptionPane.ERROR_MESSAGE);
            return;
        }
        model.setScore(position, score);
        displayArea.setText(model.toString());
    }
}