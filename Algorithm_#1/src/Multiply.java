import java.util.*;

public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> la = new ArrayList<Integer>();
		ArrayList<Integer> realla = new ArrayList<Integer>();
		
		
		int n = 5;
		
		int k = 1;
		
		int nums = 0;
		
		for(int j=1; j<n+1; j++) {
			
			if(nums <= n*(n+1)) {
				nums = j*(j+k);
				la.add(nums);
				
				
//				k++;
//				nums = nums * (j+k);
//				la.add(nums);
			}
			
		}
		
		Collections.sort(la);
		
		 for(int i=0; i<la.size(); i++) {
			 
			 if(!realla.contains(la.get(i))) {
			
				 if(la.get(i) > 0) {
				
					 realla.add(la.get(i));
				 }
			 }
		 }

		System.out.println(realla.get(n-1));
		System.out.println(realla);
	}

}
