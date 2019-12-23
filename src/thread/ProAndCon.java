package thread;

import java.util.LinkedList;

/**
 * 生产者消费者问题
 */
public class ProAndCon {
    //最大容量
    public static final int MAX_SIZE = 2;
    //存储媒介
    public static LinkedList<Integer> list = new LinkedList<>();

    class Producer implements Runnable {
        @Override
        public void run() {
            synchronized (list) {
                //仓库容量已经达到最大值
                while (list.size() == MAX_SIZE) {
                    System.out.println("仓库已满，生产者" + Thread.currentThread().getName() + "不可生产.");
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                list.add(1);
                System.out.println("生产者" + Thread.currentThread().getName() + "生产, 仓库容量为" + list.size());
                list.notify();
            }
        }
    }

    class Consumer implements Runnable {

        @Override
        public void run() {
            synchronized (list) {
                while (list.size() == 0) {
                    System.out.println("仓库为空，消费者" + Thread.currentThread().getName() + "不可消费.");
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                list.removeFirst();
                System.out.println("消费者" + Thread.currentThread().getName() + "消费，仓库容量为" + list.size());
                list.notify();
            }
        }
    }


    public static void main(String[] args) {
        ProAndCon proAndCon = new ProAndCon();
        Producer producer = proAndCon.new Producer();
        Consumer consumer = proAndCon.new Consumer();

        for (int i = 0; i < 10; i++) {
            Thread pro = new Thread(producer);
            pro.start();
            Thread con = new Thread(consumer);
            con.start();
        }
    }

}