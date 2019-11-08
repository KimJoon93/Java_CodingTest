import java.util.*;
public class Page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] pobi = {99,102};
		int[] crong = {211,212};
		
		System.out.println(solution(pobi, crong));		
	}
	
	public static int solution(int[] pobi, int[] crong) {
		
		int answer = -1;
		
		int[] pobiCard = new int[4];
		int[] crongCard = new int[4];
		
		//이상한 경우 
		if(!(pobi[1] - pobi[0] == 1) || !(crong[1] - crong[0] == 1)) {
			return -1;
		}
		
		ArrayList<Integer> array = new ArrayList<>();
		ArrayList<Integer> crongarray = new ArrayList<>();
		
		for(int i = 0; i<2; i++) {
			array.add(pobi[i]);
			crongarray.add(crong[i]);
		}
		
		int cardorder = 0;
		
		for(int i = 0; i<2; i++) {
			String[] nums = array.get(i).toString().split("");
			String[] crongnums = crongarray.get(i).toString().split("");
			
			for(int j = 0; j<nums.length; j++) {
				pobiCard[cardorder] = pobiCard[cardorder] + Integer.valueOf(nums[j]);
			}
			
			for(int j = 0; j<crongnums.length; j++) {
				crongCard[cardorder] = crongCard[cardorder] + Integer.valueOf(crongnums[j]);
			}

			cardorder++;
			pobiCard[cardorder] = 1;
			for(int j = 0; j<nums.length; j++) {
				pobiCard[cardorder] = pobiCard[cardorder] * Integer.valueOf(nums[j]);
			}
			crongCard[cardorder] = 1;
			for(int j = 0; j<crongnums.length; j++) {
				crongCard[cardorder] *= Integer.valueOf(crongnums[j]);
			}
						
			cardorder++;
		}
	
		Arrays.sort(pobiCard);
		Arrays.sort(crongCard);
 
		int pobimax = pobiCard[pobiCard.length-1];
		int crongmax = crongCard[crongCard.length-1];
		
		if(pobimax<crongmax)
			return 2;
		else if(pobimax>crongmax)
			return 1;
		else if(pobimax == crongmax)
			return 0;
		
		return answer;
	}

}
