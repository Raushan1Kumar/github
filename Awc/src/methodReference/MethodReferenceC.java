package methodReference;

public class MethodReferenceC {
    public static void reference() {
    	System.out.println("Method Reference");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MethodReference ref=MethodReferenceC::reference;
       ref.show();
	}

}
