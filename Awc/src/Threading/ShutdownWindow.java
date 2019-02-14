package Threading;

public class ShutdownWindow {

	public static void main(String[] args)throws Exception {
		
Runtime.getRuntime().exec("c:\\Windows\\System32\\Shutdown -s -t 0");
	}

}
