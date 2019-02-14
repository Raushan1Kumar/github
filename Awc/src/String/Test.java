package String;

public class Test {

	public static void main(String[] args) {
	String s="My name is raushan Kumar";
       String arr[]=s.split("\\s");
       String t="";
       for(String s2:arr) {
    	   
       
       
       String first=s2.substring(0, 1);
       String second=s2.substring(1);
       String s3=first.toLowerCase();
       String s4=second.toUpperCase();
       t+=s3+s4+" ";
       
       
       
       }
       System.out.println(t.trim());
       String s3="my...name...is";
   	int s1=s3.indexOf('e');
   	int s2=s3.indexOf('y');
   	System.out.println(s1+" "+s2);
       String d=s.substring(s2,s1);
       System.out.println(d);

	}
	}


