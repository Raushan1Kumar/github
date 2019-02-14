package Map1;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Raushan");
		hm.put(2, "Aarti");
		hm.put(3, "shilpy");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
