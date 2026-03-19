// Threads in Java
// A thread is the smallest unit of execution within a process.
// In Java, you can create threads by either extending the Thread class or implementing the Runnable interface.

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + ", Count: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();
    }
}
// In this example, we have created a custom thread by extending the Thread class. The run method contains the code that will be executed by the thread. In the main method, we create two instances of the custom thread and start them using the start() method. When you run this code, you will see interleaved output from both threads as they execute concurrently.
