package Logical_Programme_Pune;

public class Reveser_String {

	public static void main(String[] args) {
		
		String name = "Abhijit";
		
		String name1 = "";
		
		for(int i=name.length()-1;i>=0;i--) {
			
			name1 = name1 + name.charAt(i);
		}
		System.out.println("Rev string is :" + name1);
		
		System.out.println();
		
		String s = "Abhijit Chillal";
		String s1 = "";
		
		for(int j=s.length()-1;j>=0;j--) {
			
			s1 = s1 + s.charAt(j);
		}System.out.println("Rev s is :" + s1);

	}

}
