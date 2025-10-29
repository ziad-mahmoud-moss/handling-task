// Starts a new thread that prints the message "Hello from me to my babyyyyyyy" at runtime.

public class MyThread extends Thread {

@Override

public void run() {

System.out.println("welcome babyyyy how ara you ??? ");

}

}

public class Main {

public static void main(String[] args) {

Thread t = new MyThread();

t.start();

}

}


------------------------------------------------------------------

// The task (Runnable) is executed within a new thread that prints "Hello from MyBest"

public class MyTask implements Runnable {

@Override

public void run() {

System.out.println("Hello from MyBest . whera are yuuu ??");

}

}

public class Main {

public static void main(String[] args) {

Runnable task = new MyTask();

Thread t = new Thread(task);

t.start();

}

}


