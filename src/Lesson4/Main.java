package Lesson4;

public class Main {
    static final Object lock = new Object();
    final static Char myChar = new Char();
    public static void main(String[] args) {
        new Thread(new Printer('A')).start();
        new Thread(new Printer('B')).start();
        new Thread(new Printer('C')).start();
    }
}



