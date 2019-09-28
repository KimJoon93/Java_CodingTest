import java.util.Scanner;
public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int no;
		
		System.out.println("2자리 정수를 입력하시오! ");
		
		do {
			System.out.print("입력: ");
			no = sc.nextInt();
			
		}while(no<10 || no>99);
		
		System.out.println("변수값은 "+no+"가 되었습니다.");
		
	}

}
