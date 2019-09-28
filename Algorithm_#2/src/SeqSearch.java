import java.util.*;
public class SeqSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색값: ");
		int ky = sc.nextInt();
		
		int idx = seqSearch(x,num,ky);
		
		if(idx==-1) {
			System.out.println("그런거 없");
		}else {
			System.out.println("ky는 " + idx +"번재 있음!");
		}
		
		
	
	}
	
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		while(true) {
			if(i == n)
				return -1;
			if(a[i] == key)
				return i;
			
			i++;
			
			
		}
	}

}
