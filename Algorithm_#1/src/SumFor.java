import java.util.Scanner;

public class SumFor {
	
	static int sumfor(int n) {
		
		int sums= n*(n+1)/2;
		
		return sums;
	}
	
	static int sumRange(int a , int b) {
		
		int sum = 0;
		
		for(int i=a; i<=b; i++) {
			sum = a+i;
		}
		
		return sum;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구한다! ");
		System.out.print("n의 값: ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		int sum2 = 0;
		
		int sum3 = 0;
		
		sum3 = (1+n)*n/2;
		
		sum2= n*(n+1)/2;
		
		for(int i=0; i<=n; i++)
			sum+=i;
		
		System.out.println(sum);
		
		System.out.println("sum2의 값: " + sum2);
		
		System.out.println("sumfor 값: " + sumfor(n));
		
		System.out.println("sum3의 값: " + sum3);
		
		System.out.println("sumRange의 값: " + sumRange(1,5));
		
		for(int i=0; i<30; i++) {
			int consumer1 = 0;
		}
		
	}

}
