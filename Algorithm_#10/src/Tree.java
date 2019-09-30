import java.util.*;

public class Tree {
	
	static void min(int[] x) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int message = sc.nextInt();
		int consumer = sc.nextInt();
		
		int[] messagetime = new int[message];
		int[] consumertime = new int[consumer];
		
		int count = 0;
		
		for(int i=0; i<message; i++) {
			messagetime[i] = sc.nextInt();
		}
		
		
		for(int i=0; i<consumer; i++) {
			consumertime[i] = messagetime[i];
			count++;
		}
		
		int minIndex = 0;
		
		while(count<message) {
			
			for(int i=0; i<consumer; i++) {
				if(consumertime[minIndex] > consumertime[i])
					minIndex = i;
			}
			
			consumertime[minIndex] += messagetime[count];
			count++;
		}
		
		
		
		int max = consumertime[0];
		
		for(int i=0; i<consumer; i++) {
			if(max<consumertime[i])
				max = consumertime[i];
		}
		
		System.out.println(max);

	}

}
