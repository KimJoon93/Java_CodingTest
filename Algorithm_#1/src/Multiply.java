import java.util.*;

public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> la = new ArrayList<Integer>();
		ArrayList<Integer> realla = new ArrayList<Integer>();
		
		
		int n = 5;
		
		for(int j=1; j<n+1; j++) {
			
			la.add(j*(j+1));
			la.add(j*(j+1)*(j+2));
			la.add(j*(j+1)*(j+2)*(j+3));
			la.add(j*(j+1)*(j+2)*(j+3)*(j+4));
		}
		
		Collections.sort(la);
		
		 for(int i=0; i<la.size(); i++) {
			 
			 if(!realla.contains(la.get(i))) {
			
				 if(la.get(i) > 0) {
				
					 realla.add(la.get(i));
				 }
			 }
		 }

		System.out.println(realla.get(n));
		
//		int j = 0;
//		
//		int a = j;
//		
//		for(int i=0; i<10; i++) {
//			a *= j+i;
//			
//			System.out.println(a);
//		}
	}

}
