import javax.annotation.processing.SupportedSourceVersion;

public class JustTest {

	public static void main(String[] args) {
		String s="my Name is Raushan Kumar";
		String r=s.replaceAll(" ", "");
		System.out.println(r);
		String g=r.replaceFirst("Raushan", "Aarti");
		System.out.println(g);
		String h=g.replaceAll("a", "A");
		System.out.println(h);
		int j=s.lastIndexOf("r");
		System.out.println(j);
		
	}

}
