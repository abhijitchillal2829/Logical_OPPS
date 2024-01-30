package Logical;

public class Reverse_string {
	public static void main(String[] args) {
	String rev ="";
	String name ="Rupaleen";
	int l = name.length();
	for (int i= l-1;i>=0;i--)
	{
		rev = rev + name.charAt(i);		

	}
      System.out.println("Reverse of: "+"name :" +rev);
}
	
}


