import java.util.Scanner;

public class Star_hard {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        for(int j=a; j>0; j--) {
        	System.out.print("a:" + a);
        	a=j;
        	System.out.print("a:" + a);
            for(int i=0; i<a; i++){
            	System.out.print("a:" + a);
            	System.out.print("*");
            }
        	System.out.print("a:" + a);
            System.out.println("");
        }
	}

}
