package newutil;

import java.util.*;

/**
 * Array stack lets you push and pop in constant time
 */

public class ArrayStack<E> extends AbstractStack<E>{

    private List<E> list;

    public ArrayStack(){
        list = new ArrayList<E>();
    }

    public ArrayStack(Collection<E> col){
        this();
        this.addAll(col);
    }

    public E peek(){
        if(list.isEmpty())
            throw new IllegalStateException("Stack cannot be empty.");
        return list.get(list.size() - 1);
    }

    public E pop(){
        if(list.isEmpty())
            throw new IllegalStateException("Stack cannot be empty.");
        return list.remove(list.size() - 1);
    }

    public void push(E newElement){
        list.add(newElement);
    }

    public int size(){
        return list.size();
    }

    public Iterator<E> iterator(){
        return new StackIterator<E>(list.iterator());
    }

    private class StackIterator<E> implements Iterator<E>{

        private Iterator<E> iter;
        
        private StackIterator(Iterator<E> iter){
            this.iter = iter;
        }

        public boolean hasNext(){
            return iter.hasNext();
        }
    
        public E next(){
            return iter.next();
        }
    
        /**
         * Remove is unsupported by stacks, so will not work.
         */
        public void remove(){
            throw new UnsupportedOperationException(
                  "remove not supported by stacks");
        }
    
        
    }
}