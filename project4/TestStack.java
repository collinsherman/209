import java.util.*;
import newutil.TrueStack;
import newutil.ArrayStack;
// import newutil.LinkedStack;

public class TestStack{

    public static void main(String[] args){

        // Create a list and add some strings
        System.out.println("Push E0 through E5 onto stack.");
        List<String> lst = new ArrayList<String>();
        for (int i = 0; i <= 5; i++)
            lst.add("E" + i);

        // Create a stack and push the strings
        TrueStack<String> stk = new ArrayStack<String>(); 
        for (String str : lst)
            stk.push(str);

        System.out.println("\nExpect 6 (size), false (isEmpty), and E5 (peek): ");
        System.out.println(stk.size());
        System.out.println(stk.isEmpty());
        System.out.println(stk.peek());

        // Search for a given string
        System.out.println("\nSearch for E1, E40, and all the data in the list:");
        System.out.println("Expect true:  " + stk.contains("E1"));
        System.out.println("Expect false: " + stk.contains("E40"));
        System.out.println("Expect true:  " + stk.containsAll(lst));

        // Display items from bottom to top
        System.out.println("\nExpect E0 through E5 (toString and for loop):");
        System.out.println(stk.toString());
        for (String s : stk)                       
            System.out.print(s + " ");

        // Clone and display a new stack
        System.out.println("\nClone and display items:");
        TrueStack<String> newStk = new ArrayStack<String>(stk);
        System.out.println(newStk);

        // Test equality
        System.out.println("\n\nCompare stack to itself, to clone, and to list");
        System.out.println("Expect true:  " + stk.equals(stk));
        System.out.println("Expect true: " + stk.equals(newStk));
        System.out.println("Expect false:  " + stk.equals(lst));

        // Pop and display items from the stack
        System.out.println("\nPop all items, expect E5 through E0:");
        while (! stk.isEmpty())                       
            System.out.println(stk.pop());

        System.out.println("\nTesting peek on empty stack, expect exception:");
        try{
            System.out.println(stk.peek());
        }catch(RuntimeException e){
            System.out.println(e.toString());
        }

        System.out.println("\nTesting pop on empty stack, expect exception:");
        try{
            System.out.println(stk.pop());
        }catch(RuntimeException e){
            System.out.println(e.toString());
        }
    }
}