package exception;

public class ExceptionDemo {
    public static void m1() {//called method
		int a=10;
		int b=0;
		try {
			
		
		int c=a/b;
		System.out.println(c);
			}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception ");
		}
				
	}
public static void main(String[] args) {
	try {
	m1();//caller method
	}catch(ArithmeticException e) {
		System.out.println(" EXCEPTION HANDLED");
	}
	}
}
