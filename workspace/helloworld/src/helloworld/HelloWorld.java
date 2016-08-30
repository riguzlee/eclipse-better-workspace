package helloworld;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.Map;

/**
 * This is about <code>ClassName</code>. {@link com.yourCompany.aPackage.Interface}
 * 
 * @author author
 * @deprecated use <code>OtherClass</code>
 */
public class HelloWorld<E> extends Object implements Serializable {
    enum Color {
        RED, GREEN, BLUE
    };

    /* This comment may span multiple lines. */
    static final Object staticField = null;
    // This comment may span only this line
    private E   field;
    private Map field2;

    // TASK: refactor
    @SuppressWarnings(value = "all")
    public int foo(Integer parameter) {
        //abstractMethod(inheritedField);
        int local = 42 * hashCode();
        staticMethod();
        return foo(local) + parameter;
    }
    
    public static void staticMethod() {

    }

    public static void main(String[] args) {
        // main entry:
        // TODO:

        System.out.println("Hello World!");
    }

    /**
     * Here is some text
     * 
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
