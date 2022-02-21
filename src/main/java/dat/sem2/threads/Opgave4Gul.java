package dat.sem2.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Opgave4Gul
{

    public static void main(String[] args) {
        ExecutorService workingJack = Executors.newFixedThreadPool(16);
        System.out.println("Opgave starter");

        for (int i = 0 ; i < 3200 ; i++)
        {
            Runnable myTask = new MyTaskOpgave4(i);
            workingJack.submit(myTask);
        }

        workingJack.shutdown();
    }
}

class MyTaskOpgave4 implements Runnable {

    int threadNr;

    MyTaskOpgave4(int threadNr)
    {

        this.threadNr = threadNr;
    }

    @Override
    public void run()
    {

        while (true)
        {
            System.out.println(threadNr+": "+ "panik!");
        for(int i = 0; i < 100000; i++)
        {
            System.out.println(threadNr+": " + " " + i);
        }

        }
    }
}