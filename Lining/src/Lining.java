import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lining {
	
	public int factorial(int n) {
        int result = 1;
        for(int i = 1; i<=n;i++) {
            result *= i;
        }
        return result;
    }
	
	//사람 수 n (20 이하 자연수)
	//k번째 방법 (n! 이하 자연수)
    
    public int[] setAlign(int n, long k) {
        int[] answer = new int[n];
        
        List<Integer> list = new ArrayList<>();
        

        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        
        
        int num = n;
        
        long remain;
        
        int share;
        
        List<Integer> result = new ArrayList<>();
        
        while(num > 0) {
            num--;
            remain = k % factorial(num);
            share = (int) (k/factorial(num));
            
            if(remain == 0) {
                share--;
                result.add(list.get(share));
                list.remove(share);
                break;
            }
            
            result.add(list.get(share));
            list.remove(share);
            
            k = remain;
        }
        
        for(int i = list.size()-1; i>=0;i--) {
            result.add(list.remove(i));
        }
        
        for(int i = 0; i<result.size();i++) {
            answer[i] = result.get(i);
        }
        
        
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lining lining = new Lining();
		
		1, 3 ,5
		1, 5 ,3 
        System.out.println(Arrays.toString(lining.setAlign(5, 1)));
		
//		//사람 수 n (20 이하 자연수) 
//		int n = 19;
//		
//		//k번째 방법 (n! 이하 자연수)
//		long k = 5;
//		
//		//정답 
//		int answer[] = new int[n];
//		
//		int fac = 1;
//		
//		for(int i=1; i<n+1; i++) {
//			fac = fac * i;
//		}
//		
//	System.out.println(fac);
//		
//		//곱해주는 자연수 
//		int z = 1;
//		
//		if(k<fac/n) {
//			answer[0] = z;				
//		}else {
//			System.out.println("들어갔닝");
//			z++;
//			while((fac/n)*z<k) {
//				z++;	
//				}
//			answer[0] = z;
//		}
//		
//		System.out.println(answer[0]);
			
	}

}
