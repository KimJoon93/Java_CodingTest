import java.util.*;

public class Number1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int cardNum = sc.nextInt();
		String[] card = new String[cardNum];
		
		
		for(int i=0; i<cardNum; i++) {
			card[i] = sc.next();
		}
		
		ArrayList<String> kind = new ArrayList<>();
		
		for(int i=0; i<cardNum; i++) {
			if(!kind.contains(card[i])) {
				kind.add(card[i]);
			}
		}
		
		int[] cardCount = new int[kind.size()];
		
		for(int i=0; i<kind.size(); i++) {
			cardCount[i] = 0;
		}
		
		for(int j=0; j<kind.size(); j++) {
			for(int i=0; i<cardNum; i++) {
				if(kind.get(j).equals(card[i])) {
					cardCount[j] = cardCount[j] +1;
				}
			}
		}
		
		
		Boolean allSame = false;
		int sum = 0;
		
		for(int i=0; i<cardCount.length; i++) {
			sum+=cardCount[i];
		}
		
		if(sum%kind.size() == 0) {
			allSame = true;
		}
		
		if((sum+1)%kind.size() ==0) {
			allSame = true;
			cardNum++;
		}
		
		
		if(allSame)
			System.out.println("Y");
		else
			System.out.println("N");
		
		
		System.out.println(cardNum);
		System.out.println(kind.size());
		
		
//		//확
//		for(int i=0; i<cardNum; i++) {
//			System.out.println(card[i]);
//		}
	}

}
