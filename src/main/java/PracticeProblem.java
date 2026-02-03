import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		Scanner s = new Scanner(System.in);
		String x=s.nextLine();
		System.out.println("In: "+x);
	}

	public static void q2() {
		Scanner s = new Scanner(System.in);
		int x=s.nextInt();
		System.out.print("In: ");
		int y=s.nextInt();
		System.out.print("In: ");
		System.out.println(x/y);
		System.out.println(x%y);
	}

	public static void q3() {
		Scanner s = new Scanner(System.in);
		String x=s.nextLine();
		System.out.println("In: "+x+" was the text you wrote");
	}

	public static void q4() {
		Scanner s = new Scanner(System.in);
		int x=s.nextInt();
		System.out.print("In: ");
		System.out.println(x*5);
		
	}

	public static void q5() {
		Scanner s = new Scanner(System.in);
		Boolean x=s.nextBoolean();
		System.out.println("In: "+x+" is a boolean");
		
	}

	public static void q6() {
		Scanner s = new Scanner(System.in);
		Double x=s.nextDouble();
		System.out.print("In: ");
		System.out.println(x-3.2);
		
	}

}
