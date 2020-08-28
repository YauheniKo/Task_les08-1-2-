package by.htp.test1;

public class Main {

	public static void main(String[] args) {
		Test1 test1=new Test1();
		test1.setA(3);
		test1.setB(4);
		test1.print(test1.getA());
		
		test1.print(test1.getB());
		test1.max(test1.getA(), test1.getB());
		test1.sum(test1.getA(), test1.getB());
	}

}
