import java.util.HashSet;
import java.util.LinkedList;

public class Union {

	public static void main(String[] args) {
		HashSet<Integer> h=new HashSet<Integer>();
		LinkedList<Integer> l=new LinkedList<Integer>();
		LinkedList<Integer> k=new LinkedList<Integer>();
		l.add(10);
		l.add(5);
		l.add(10);
		h.add(5);
		h.add(3);	
		h.add(9);
		h.addAll(l);
		l.retainAll(k);
		System.out.println(h);
		System.out.println(l);

	}

}
