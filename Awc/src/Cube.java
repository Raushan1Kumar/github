
public class Cube {
	int roll;
	String name;
	Cube(int roll1,String name1){
		roll=roll1;
		name=name1;}
	void disp() {
		System.out.println(roll+" "+name);
	}
	public static void main(String[] args) {
		Cube c=new Cube(1,"raushan");
		c.disp();
	}

}
