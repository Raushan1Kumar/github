import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Raushan");
		hm.put(3, "Aarti");
		hm.put(2, "Shivani");
		for(Map.Entry h: hm.entrySet()) {
			System.out.println(h.getKey()+"  "+h.getValue());
		}

	}

}
