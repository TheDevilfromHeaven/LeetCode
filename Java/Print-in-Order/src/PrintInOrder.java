import java.util.concurrent.atomic.AtomicInteger;

public class PrintInOrder {
    /*
    * 作者：LeetCode
      链接：https://leetcode-cn.com/problems/print-in-order/solution/an-xu-da-yin-by-leetcode/
      来源：力扣（LeetCode）
    * 官方解法。
    * 第一次接触多线程，积累一下。
    * */
    private AtomicInteger firstJobDone = new AtomicInteger(0);
    private AtomicInteger secondJobDone = new AtomicInteger(0);

    public PrintInOrder() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        // mark the first job as done, by increasing its count.
        firstJobDone.incrementAndGet();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (firstJobDone.get() != 1){
            //waiting for the first job to be done.
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        //mark the second as done, by increasing its count.
        secondJobDone.incrementAndGet();
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (secondJobDone.get() != 1){
            //waiting for the second job to be done.
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }


    /*
    * 作者：pulsaryu
      链接：https://leetcode-cn.com/problems/print-in-order/solution/gou-zao-zhi-xing-ping-zhang-shi-xian-by-pulsaryu/
      来源：力扣（LeetCode）
    * */
//    private boolean firstFinished;
//    private boolean secondFinished;
//    private Object lock = new Object();
//
//    public void first(Runnable printFirst) throws InterruptedException {
//
//        synchronized (lock) {
//            // printFirst.run() outputs "first". Do not change or remove this line.
//            printFirst.run();
//            firstFinished = true;
//            lock.notifyAll();
//        }
//    }
//
//    public void second(Runnable printSecond) throws InterruptedException {
//
//        synchronized (lock) {
//            while (!firstFinished) {
//                lock.wait();
//            }
//
//            // printSecond.run() outputs "second". Do not change or remove this line.
//            printSecond.run();
//            secondFinished = true;
//            lock.notifyAll();
//        }
//    }
//
//    public void third(Runnable printThird) throws InterruptedException {
//
//        synchronized (lock) {
//            while (!secondFinished) {
//                lock.wait();
//            }
//
//            // printThird.run() outputs "third". Do not change or remove this line.
//            printThird.run();
//        }
//    }

    public static void main(String[] args) {
        PrintInOrder printInOrder = new PrintInOrder();
        Thread thread1 = new Thread(() -> {
            try {
                printInOrder.first(() ->{
                    System.out.println("one");
                });
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                printInOrder.second(() -> {
                    System.out.println("two");
                });
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });
        Thread thread3 = new Thread(() -> {
            try {
                printInOrder.third(() -> {
                    System.out.println("third");
                });
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });

        thread3.start();
        thread2.start();
        thread1.start();
    }
}
