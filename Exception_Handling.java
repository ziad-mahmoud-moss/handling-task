public class Exception_Handling {
    public static void main(String[] args)
    {
        // This will fail because we're trying to convert a string into a number
        // int myInt = Integer.parseInt("moss");


        // Example of handling an exception using try-catch
        // try {
        //     int myInt = Integer.parseInt("1");
        // }
        // catch(NumberFormatException nfe)
        // {
        //     System.out.println("Oops! That's a string, not a number ");
        // }
        // System.out.println("Program finished successfully");

        // Handling exception using the Default Uncaught Exception Handler

        // Thread thread = new Thread(new Runnable() {
        //     @Override
        //     public void run() {
        //         int myInt = Integer.parseInt("moss");
        //     }
        // });

        // Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
        //     @Override
        //     public void uncaughtException(Thread t, Throwable e) {
        //         System.out.println("Default Handler: Exception detected in thread: " + t.getName());
        //         System.out.println("Default Handler: Error message: " + e.getMessage());
        //     }
        // });

        // thread.start();
        // System.out.println("Main thread has ended");

        // Handling exception using a Custom Uncaught Exception Handler
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int myInt = Integer.parseInt("moss");
            }
        });

        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Custom Handler: Error caught from thread: " + t.getName());
                System.out.println("Custom Handler: Error details: " + e.getMessage());
            }
        });

        thread.start();
        System.out.println("Main thread execution completed");
    }
}
