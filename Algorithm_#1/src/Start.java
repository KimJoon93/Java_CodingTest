import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("세 정수의 최대값을 구합니다!");
		
		System.out.print("a의 값: ");
		int a = sc.nextInt();
		
		System.out.print("b의 값: ");
		int b = sc.nextInt();
		
		System.out.print("c의 값: ");
		int c = sc.nextInt();
		
		
		int max = a;
		
		if(b>max)
			max=b;
		if(c>max)
			max=c;
		
		System.out.println("최대값은 "+ max + "입니다. ");
	}

}