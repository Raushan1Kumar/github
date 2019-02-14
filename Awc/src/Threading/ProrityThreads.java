package Threading;

public class ProrityThreads extends Thread {
    public void run() {
    	System.out.println("Prority of Thread :"+Thread.currentThread().getName());
    }
	public static void main(String[] args) {
		ProrityThreads t=new ProrityThreads();
         t.start();
         t.setName("Raushan");
         t.setPriority(Thread.MIN_PRIORITY);
         ProrityThreads t1=new ProrityThreads();
        t1.start();
        //t1.setDaemon(true);
        t1.setName("Aarti");
        t1.setPriority(Thread.MAX_PRIORITY);
        ProrityThreads t2=new ProrityThreads();
        t2.start();
        t2.setName("Shivani");
        t2.setPriority(Thread.NORM_PRIORITY);
	}

}
