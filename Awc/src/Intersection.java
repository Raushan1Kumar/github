import java.util.LinkedList;

public class Intersection {

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(8);
		l.add(7);
		l.add(3);
		l.add(1);
		LinkedList<Integer> k=new LinkedList<Integer>();
		k.add(7);
		k.add(1);
		k.add(8);
		k.add(10);
		l.retainAll(k);
		//l.removeAll(k);
		System.out.println(l);
		//System.out.println(l);

	}

}
