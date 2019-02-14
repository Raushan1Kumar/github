package Map1;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Raushan");
		hm.put(2, "Aarti");
		hm.put(3, "Shivani");
		for(Entry<Integer, String> m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
