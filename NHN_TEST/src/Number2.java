import java.util.*;

public class Number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> FQ = new ArrayList<>();
		ArrayList<Integer> NFQ = new ArrayList<>();
		ArrayList<Integer> IndexNFQ = new ArrayList<>();
		
		ArrayList<Integer> Answer = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		String[] doing = new String[num];
		
		sc.nextLine();
		
		for(int i=0; i<num; i++) {
			doing[i] = sc.nextLine();	
		}
			
		for(int i=0; i<doing.length; i++) {
			if(doing[i].equals("dequeue")) {
				
				int macIndex = 1;
				
				for(int j=0; i<FQ.size(); j++) {
					if(!NFQ.contains(FQ.get(j))) {
						NFQ.add(FQ.get(j));
					}
				}
				
				for(int j=0; i<NFQ.size(); j++) {
					if(NFQ.get(j) == FQ.get(j)) {
						IndexNFQ.add(1);
					}
					
					
					
				}
				
				

				
				Answer.add(FQ.get(macIndex));
				
				FQ.remove(macIndex);
				
				
			}else if(doing[i].contains("enqueue")) {
				FQ.add(Integer.parseInt(doing[i].substring(8)));
			}
		}
		
		
		
		
		
		
		
		for(int i=0; i<Answer.size(); i++) {
			if(i == Answer.size()-1) {
				System.out.print(Answer.get(i));
			}
			System.out.print(Answer.get(i)+" ");
		}
	}
}
