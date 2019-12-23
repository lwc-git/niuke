package thread;


public class RunAndThread {

    public static void main(String[] args) {
        Integer ticket = 10;
        RThread rThread = new RThread(ticket);
        Thread thread1 = new Thread(rThread, "线程1");
        Thread thread2 = new Thread(rThread, "线程2");
        thread1.setPriority(10);
        thread2.setPriority(1);
        thread2.start();
        thread1.start();

    }

}

class RThread implements Runnable{
    private volatile Integer ticket;
    public RThread(Integer ticketNum){
        this.ticket = ticketNum;
    }

    @Override
    public void run(){
        while(ticket>0){
            synchronized (ticket) {
                System.out.println(Thread.currentThread().getName() + ":" + ticket--);
                ticket.notify();
            }
        }
    }
}