package bar;

import org.python.util.PythonInterpreter;
import org.python.core.*;

public class JythonIntegration {
    public static void main(String[] args) {
        PythonInterpreter interp = new PythonInterpreter();
        System.out.println("Java: Hello World");

        // execute a py script file
        interp.execfile("/Users/gaurav/playground/jython_demo/scripts/py_client.py");

        // set var in interpreter and print using jython
        interp.set("a", new PyInteger(42));
        interp.exec("print(a)");

        // computer something in interpreter and then get value out in a java object
        interp.exec("x = 2 + 6");
        PyObject x = interp.get("x");
        System.out.println("x from jython: " + x);

        interp.cleanup();
    }
}