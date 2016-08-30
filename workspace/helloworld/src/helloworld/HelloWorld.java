package helloworld;

import java.util.LinkedList;

/**
 * Demo java
 * @author riguz
 *
 */
public class HelloWorld {

    public static void main(String[] args){
        // main entry:
        // TODO:
        
        System.out.println("Hello World!");
    }
    
    
    /**
     * Here is some text
     * @author riguz
     *
     */
    public class MyIntStack {
        private final LinkedList fStack;

        public MyIntStack() {
            fStack = new LinkedList();
        }

        public int pop() {
            return ((Integer) fStack.removeFirst()).intValue();
        }

        public void push(int elem) {
            fStack.addFirst(new Integer(elem));
        }

        public boolean isEmpty() {
            return fStack.isEmpty();
        }
    }
}
