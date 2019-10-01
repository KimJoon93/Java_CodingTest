import java.util.*;
public class Factorial {
	
	static int factorial(int n) {
		if(n>0)
			return n * factorial(n-1);
		else
			return 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력하시오: ");
		
		int k = sc.nextInt();
		
		System.out.println(factorial(k));
		
	}

}
