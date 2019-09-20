import java.util.Scanner;

public class Star_reverse {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        
        for(int j=0; j<a; j++) {
        	b++;
        	for(int i=0; i<b; i++){
            	System.out.print("*");	
            }
        	System.out.println("");
        }
	}

}
