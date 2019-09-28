import java.util.Scanner;
public class SumForPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("1 부터 n까지의 합 구하기 ");
		
		do {
			n = sc.nextInt();
		}while(n<=0);
		
		int sum = 0;
		
		for(int i=0; i<=n; i++)
			sum += i;
		
		System.out.println(sum+ "입니다!");

	}

}
