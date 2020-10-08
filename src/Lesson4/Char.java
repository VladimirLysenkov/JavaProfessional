package Lesson4;

public class Char{
    private int counter;
    private volatile char currentChar = 'A';


    char getCurrentChar() {
        return currentChar;
    }

    synchronized void increment(){
        counter++;
        if (counter % 3 == 0)
            currentChar = 'A';
        else currentChar++;
    }
}
