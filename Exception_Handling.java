public class Exception_Handling {
    public static void main(String[] args)
    {
        // This won't work because we are passing a string to an integer variable
        // int myInt = Integer.parseInt("dido");


        // Handling Exception using Try-Catch Method
        // try {
        //     int myInt = Integer.parseInt("1");
        // }
        // catch(NumberFormatException nfe)
        // {
        //     System.out.println("Cannot Print Because that's a string babe 😍");
        // }
        // System.out.println("End");

        // Handling Exception using Default Uncaught Exception Handler

        // Thread thread = new Thread(new Runnable() {
        //     @Override
        //     public void run() {
        //         int myInt = Integer.parseInt("dido");
        //     }
        // });

        // Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
        //     @Override
        //     public void uncaughtException(Thread t, Throwable e) {
        //         System.out.println("Exception caught from thread: " + t.getName());
        //         System.out.println("Exception message: " + e.getMessage());
        //     }
        // });

        // thread.start();
        // System.out.println("End of Main Thread");

        // Handling Exception using Custom Uncaught Exception Handler
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int myInt = Integer.parseInt("dido");
            }
        });

        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Custom Handler: Exception caught from thread: " + t.getName());
                System.out.println("Custom Handler: Exception message: " + e.getMessage());
            }
        });

        thread.start();
        System.out.println("End of Main Thread");
    }
}