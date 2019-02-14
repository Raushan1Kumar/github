package Threading;

public class ThreadOneByOne {
	public static volatile boolean isActive;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isActive=true;
		Thread thread=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					if(isActive) {
						System.out.println("thread 1");
						isActive=false;
					}
				}
			}
			
		});
		Thread thread1=new Thread(new Runnable(){ 
			
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					if(!isActive) {
						System.out.println("Thread 2");
						try {
							
							Thread.sleep(100);
						}catch(Exception ex) {
							System.out.println("threaad");
						}
						isActive=true;
					}
				}
			}
		});
		thread.start();
		thread1.start();
	}

}
