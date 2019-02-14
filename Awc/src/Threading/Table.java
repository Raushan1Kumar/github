package Threading;

public class Table extends Thread {
	int j=10;
	public void run() {
		try {
		for(int i=1;i<11;i++) {
			Thread.sleep(700);
			System.out.println(j*i);
		}}catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		
		Table t=new Table();
		Table t1=new Table();
		t.start();
		//t1.start();
	}

}
