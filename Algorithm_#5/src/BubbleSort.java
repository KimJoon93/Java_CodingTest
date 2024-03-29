import java.util.*;
public class BubbleSort {
	
	static void swap(int[]a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bubbleSort(int[] a, int n) {
		for(int i=0; i<n-1; i++) {
			for(int j=n-1; j>i; j--) {
				if(a[j-1] > a[j])
					swap(a, j-1,j);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("요소수: ");
		int n = sc.nextInt();
		int[] x = new int[n];
		
		for(int i=0; i<n; i++) {
			x[i] = sc.nextInt();
		}
		
		bubbleSort(x,n);
		
		System.out.println("오름차순 정렬!");
		
		for (int i = 0; i < n; i++) {
			System.out.println("x["+i+"] = "+x[i]);
		}
		
		

	}

}
