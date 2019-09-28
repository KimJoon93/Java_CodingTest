
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[] {1,2,3,4,5};
		
		int[] b = a.clone();
		
		int max = a[0];
		
		for(int i=0; i<a.length; i++) {
			if(a[i]>max)
				max = a[i];
		}
		
		b[4] = 0;
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("MAX: "+ max);
	}

}
