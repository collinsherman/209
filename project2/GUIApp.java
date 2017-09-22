// The app instantiates the view

import BreezySwing.GBFrame;
import student.Student;

public class GUIApp{

    public static void main(String[] args){
        final GBFrame view = new MainView(new Student("Ken Lambert", 5));
        view.setSize(300, 400);
        view.setVisible(true);
    }
}