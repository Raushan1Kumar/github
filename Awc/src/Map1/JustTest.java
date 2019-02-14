package Map1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JustTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap<String,String> map=new HashMap<String,String>();
      HashMap<String,String> m=new HashMap<String,String>();
      ArrayList<String> list=new ArrayList<String>();
      ArrayList<String> list1=new ArrayList<String>();
      map.put("Delhi", "Raushan");
      map.put("Noida", "Arti");
      map.put("Patna", "Shivani");
      for(Map.Entry<String, String> entry:map.entrySet()) {
         
    	  list.add(entry.getKey());
    	  list1.add(entry.getValue());
    	  System.out.println(entry.getKey() +" "+entry.getValue());
      }
      for(String l:list) {
    	  
    	  m.put("name", l);
    	  System.out.println(l);
      }
     for(String l:list1) {
    	  
    	  m.put("value", l);
    	  System.out.println(l);
      }
     for(Map.Entry<String, String> entry:m.entrySet()) {
     
   	  System.out.println(entry.getKey() +" "+entry.getValue());
     }
	}

}
