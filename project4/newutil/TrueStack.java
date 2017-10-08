package newutil;

import java.util.Collection;

/**
 * This interface adds the three stack-specific methods to
 * those of Collection and Iterable.
 * @author Ken Lambert
 * @version 1.0
 */
public interface TrueStack<E> extends Collection<E>{

   /**
   * Returns the element at the top of the stack.
   * Precondition: the stack is not empty.
   * @return the top element
   * @throws IllegalStateException if the stack is empty.
   */
   public E peek();

   /**
   * Removes and returns the element at the top of the stack.
   * Precondition: the stack is not empty.
   * @return the top element
   * @throws IllegalStateException if the stack is empty.
   */
   public E pop();

   /**
    * Adds an element to the top of the stack.
    * @param newElement the element to add.
    */
   public void push(E newElement);
}