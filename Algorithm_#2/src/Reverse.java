
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {22,57,11,32,91,68,70}; 
		
		int n = array.length;
		
		for(int i=0; i<n/2; i++) {
			int memory = array[i];
			array[i] = array[n-i-1];
			
			array[n-i-1] = memory;
		}
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
