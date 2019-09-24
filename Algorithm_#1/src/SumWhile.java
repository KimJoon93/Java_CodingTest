import java.util.Scanner;

public class SumWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n의 값: ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i<=n) {
			sum += i;
			i++;
		}
		
		
		System.out.print("Sum 값: " + sum);
	}

}
