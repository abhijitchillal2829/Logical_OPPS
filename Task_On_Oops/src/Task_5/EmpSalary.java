package Task_5;

public class EmpSalary {

	public static void main(String[] args) {
		
		FullTimeEmp FT = new FullTimeEmp();
		System.out.println("The incremented salary for Full Time Emp is :" +FT.Salary());
		
		HalfTimeEmp HT = new HalfTimeEmp();
		System.out.println("The incremented salary for Half Time Emp is :" +HT.Salary());

	}

}
