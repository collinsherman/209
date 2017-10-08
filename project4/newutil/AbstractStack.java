package newutil;

import java.util.*;

abstract public class AbstractStack<E> extends AbstractCollection<E> 
                           implements TrueStack<E>{

    abstract public E peek();

    abstract public E pop();

    abstract public void push(E newElement);

    public boolean add(E newElement){
        this.push(newElement);
        return true;
    }        

    /**
     * This method checks for equality in identity, structure, and type.
     * @param other of type object
     * @return False if not the same in every way, true if the equal in all ways.
     */
    public boolean equals(Object other){
        if (this == other) return true;
        if (! (other instanceof Stack)) return false;
        Stack<E> otherStack = (Stack)other;
        if (this.size() != otherStack.size()) return false;
        Iterator<E> otherIter = otherStack.iterator();
        for (E thisElement : this)
            if (! thisElement.equals(otherIter.next()))
                return false;
        return true;    
    }
}