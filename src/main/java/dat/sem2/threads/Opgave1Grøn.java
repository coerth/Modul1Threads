package dat.sem2.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Opgave1Grøn {
    public static void main(String[] args) {
        ExecutorService workingJack = Executors.newFixedThreadPool(4);
        System.out.println("Opgave starter");

        char c;

/*        System.out.println("Med for loopets i værdi:");

        for (int i = 65; i <= 90; i++) {
            Runnable myTaskA = new MyTaskOpgave1a(i);
            workingJack.submit(myTaskA);
        }*/

        System.out.println("\n med char loopets værdi:");

        for(c = 'A' ; c <= 'Z' ; c++)

        {
            Runnable myTaskB = new MyTaskOpgave1b(c);
            workingJack.submit(myTaskB);
        }

        workingJack.shutdown();
    }
}

class MyTaskOpgave1a implements Runnable {

        int charInt;
        char theChar;

        MyTaskOpgave1a(int charInt )
        {

            this.charInt = charInt;
            theChar = (char)charInt;
        }

        @Override
        public void run() {
            System.out.println( charInt+": "+ theChar + theChar +theChar);
        }
    }

class MyTaskOpgave1b implements Runnable {

    int charInt;
    char theChar;

    MyTaskOpgave1b(char c)
    {

        this.charInt = c;
        theChar = c;
    }

    @Override
    public void run() {
        System.out.println( charInt+": "+ theChar+theChar+theChar);
    }
}
