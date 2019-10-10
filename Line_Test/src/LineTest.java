import java.util.*;
import java.io.*;

public class LineTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		

//		Scanner sc = new Scanner(System.in);
//        int seat = sc.nextInt();
//        
//        int[] z = new int[seat];
//        
//        for(int i=0; i<seat; i++){
//            z[i] = sc.nextInt();            
//        }
//        
//        ArrayList<Integer> num= new ArrayList<Integer>();
//        ArrayList<Integer> nums= new ArrayList<Integer>();
//        
//        for(int i=0; i<seat; i++){
//            if(z[i] == 1){
//                num.add(i);
//            }
//        }
//        
//        for(int i =0; i<num.size()-1; i++) {
//        	nums.add((num.get(i+1) - num.get(i))/2);
//        }
//        
//        
//        
//        System.out.println(nums);
		
		 	ArrayList<Integer> time = new ArrayList<>();
	        ArrayList<Integer> z = new ArrayList<>();
	    
	        int order = 1;
	        
	        Scanner sc = new Scanner(System.in);
	        int message = sc.nextInt();
	        int consumer = sc.nextInt();
	        
	        int[] answerList = new int[consumer];
	        
	        for(int i=0; i<message; i++){
	            time.add(sc.nextInt());
	        }
	        
	        for(int i=0; i<consumer; i++){
	            z.add(time.get(i));
	            answerList[i] = time.get(i);
	            order++;
	        }
	        
	        for(int i=0; i<consumer; i ++) {
	        	answerList[i] = Collections.min(z) + z.get(order); 
	        	
	        }
	        
	        
//	        answer = Collections.min(z) + z.get(order); 
//	        
	        System.out.println(order);
        
        


	}

}
