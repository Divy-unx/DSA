public class Main {
    public static void main(String[] args){
        // javac -d out src/Main.java
        // java -cp out Main Hello World
        //• First command:
        //
        //  javac -d out src/Main.java
        //
        //  This compiles src/Main.java.
        //
        //  - javac is the Java compiler.
        //  - src/Main.java is the source file.
        //  - -d out tells Java to put the compiled .class file inside the out directory.
        //
        //  After this, you get something like:
        //
        //  out/Main.class
        //
        //  Second command:
        //
        //  java -cp out Main hello world
        //
        //  This runs the compiled Java program.
        //
        //  - java starts the Java runtime.
        //  - -cp out means “look for compiled classes in the out directory”.
        //  - Main is the class containing public static void main.
        //  - hello world are command-line arguments.
        System.out.println("First args " + args[0]);
        System.out.println("Second args " + args[1]);

    }
}
