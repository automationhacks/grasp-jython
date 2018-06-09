package bar;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * JSR 223, Scripting for the Java language, added the javax.script package to Java 6. 
 * It allows multiple scripting languages to be used through the same API as long as 
 * the language provides a script engine. It can be used to embed Jython in your 
 * application alongside many other languages that have script engines 
 * such as JRuby or Groovy.
 */
public class Jsr223Integration {
    public static void main(String[] args) throws ScriptException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("python");
        engine.eval("import sys");
        engine.eval("print(sys)");

        engine.put("a", 42);
        engine.eval("print a");

        engine.eval("x = 2 + 3");
        Object x = engine.get("x");
        System.out.println("x: " + x);
    }
}