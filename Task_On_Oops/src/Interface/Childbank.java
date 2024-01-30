package Interface;

public class Childbank implements Icici, Axis{

	public static void main(String[] args) {
		
		Childbank cb = new Childbank();
		cb.m1();
		cb.m2();
		cb.m3();
		cb.m4();
		cb.m5();
		cb.m6();
		
		System.out.println();
		
		Icici i = new Childbank();
		i.m1();
		i.m2();
		i.m3();

	}

	@Override
	public void m1() {
		System.out.println("m1");
		
	}

	@Override
	public void m2() {
		System.out.println("m2");
		
	}

	@Override
	public void m3() {
		System.out.println("m3");
		
	}

	@Override
	public void m5() {
		System.out.println("m5");
		
	}

	@Override
	public void m6() {
		System.out.println("m6");
		
	}

	@Override
	public void m4() {
		System.out.println("m4");
		
	}

}
