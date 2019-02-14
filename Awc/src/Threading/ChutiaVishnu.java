package Threading;

public class ChutiaVishnu {

	public static void main(String[] args) {
		int i=4;
		int j=0;
		try {
			int k=i/j;
			System.out.println(k);
		}catch(Exception e) {
			System.out.println(e);
		}
		finally{
			System.out.println("always");
		}

	}

}
