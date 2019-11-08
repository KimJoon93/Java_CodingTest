import java.util.*;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.println(solution(number));
		
	}
	
	public static int solution(int number) {
		
		int clap = 0;
		
		ArrayList<Integer> array = new ArrayList<>();
		
		for(int i = 1; i<number+1; i++) {
			array.add(i);
		}
		
		for(int i=0; i<number; i++) {
			
			String numberword = array.get(i).toString();
			String[] Dnumber = numberword.split("");
			
			
			for(int j = 0; j<Dnumber.length; j++) {			
				if(Dnumber[j].equals("3") || Dnumber[j].equals("6") || Dnumber[j].equals("9")) {
					clap ++;
				}
			}
		}

		return clap;
	}

}
