package thread;


public class ThreadState {


    public static void main(String[] args) throws Exception{
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myThread);
        thread1.start();
        thread2.start();
    }

}

class MyThread implements Runnable{

    @Override
    public synchronized void run(){
        for(int i = 0 ;i<10;i++){
            if(i==5) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}




class OtherThread extends Thread{

    private Object obj;
    public OtherThread(Object obj){
        this.obj = obj;
    }

    @Override
    public void run(){
        Thread.yield();
        synchronized (obj) {
            for(int i = 0;i<10;i++){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
            obj.notify();
        }
    }
}


class JoinThread implements Runnable{
    private OtherThread thread;
    private Object oo;
    public JoinThread(OtherThread thread,Object oo){
        this.thread = thread;
        this.oo = oo;
    }

    @Override
    public void run(){
        synchronized (oo){
            for(int i = 0;i<10;i++){
                if(i==5) {
                    System.out.println(thread.getState());
                    try {
                        oo.wait();
                        thread.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
