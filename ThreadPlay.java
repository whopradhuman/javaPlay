public class ThreadPlay {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread(), "Thread 1");
        Thread t2 = new Thread(new MyThread(), "Thread 2");
        Thread t3 = new Thread(new MyThread(), "Thread 3");
//        Thread t4 = new Thread(new MyThread(), "Thread 4");

        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.start();
//        t4.start();
    }

    static class MyThread implements Runnable {

        @Override
        public void run() {
            System.out.println("Total Threads Active: " + Thread.activeCount());
            System.out.println("started thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("terminated thread: " + Thread.currentThread().getName());

        }
    }
}
