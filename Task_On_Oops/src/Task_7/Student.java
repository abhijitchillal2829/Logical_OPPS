package Task_7;

public class Student {
	private int standard;
	private int rollNo;
	private int Id;
	
	public Student(int standard, int rollNo, int Id) {
		this.standard = standard;
		this.rollNo = rollNo;
		this.Id = Id;
	}
	
//	Getter Method--------
	public int getstdName() {
		return standard;
	}
	
	public int getrollNo() {
		return rollNo;
	}
	
	public int getId() {
		return Id;
	}
	
//	Setter Method----------
	public void setstdName(int standard) {
		this.standard = standard;
	}
	
	public void setrollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public void setId(int Id) {
		this.Id = Id;
	}
	
	public static void main(String[] args) {
		
		Student st = new Student(7, 21, 1234);
		
		System.out.println("Student standard :" +st.getstdName());
		System.out.println("Student rollNo :" +st.getrollNo());
		System.out.println("Student Id :" +st.getId());
		
	}

}
