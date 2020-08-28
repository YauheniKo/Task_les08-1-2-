package by.htp.test1;

public class Test1 {
	private int a;
	private int b;
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void print(int a) {
		System.out.println(a);
		
	}
	public void sum(int a, int b) {
		System.out.println("sum= "+a+b);
	}
	public void max(int a, int b) {
		if(a>b) {
		System.out.println("max= "+a);
		}
		else if(a==b) {
			System.out.println(a+"="+b);
		}
		else
			System.out.println("max= "+b);
	}
	

}
