package dat.sem2.threads;

/**
 The purpose of Threads01 is to...

 @author kasper
 */
public class Threads01 {

    public static void main( String[] args ) throws Exception{
        /*
        New thread by making an anonymous subclass of Thread
        */
        Thread t = new Thread() {
            @Override
            public void run() {
                String[] messages = { "Hej", "Hallo", "Halløj", "Hejsa", "Davs" };
                for ( String msg : messages ) {
                    System.out.println( msg );
                    try {
                        Thread.sleep( 1 );
                    } catch ( InterruptedException ex ) {
                        System.out.println( "Hov - jeg blev afbrudt" );
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                String[] messages = { "Hej2", "Hallo2", "Halløj2", "Hejsa2", "Davs2" };
                for ( String msg : messages ) {
                    System.out.println( msg );
                    try {
                        Thread.sleep( 1 );
                    } catch ( InterruptedException ex ) {
                        System.out.println( "Hov - jeg blev afbrudt2" );
                    }
                }
            }
        };


        System.out.println( "Starter tråd" );
        t.start();
//        t.join();
        t2.start();
//        t2.join();
//        t.join(3000);
//        t.interrupt();
        System.out.println( "Main er færdig" );
    }

}
