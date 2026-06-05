package src.com.dsa.practice;

public class BasicExecution {
	
	//Execution of Main method in Stack area

		public static void main(String[] args) {
			System.out.println("main start");
			m1();
			System.out.println("main end");
		}
		
		public static void m1() {
			m3();
			System.out.println("m1 called");
			m2();
		}
		
		public static void m2() {
			System.out.println("m2 called");
		}
		
		public static void m3() {
			System.out.println("m3 called");
		}
}
