import java.util.*;

public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();

		int[] answer = Solution(money);
		
		ArrayList<Integer> array = new ArrayList<>();
		for(int i=0; i<answer.length; i++) {
			array.add(answer[i]);
		}
		System.out.println(array);

	}

	public static int[] Solution(int money) {

		int[] answer = new int[9];
		
		int[] kind = {50000,10000,5000,1000,500,100,50,10,1};
		
		for(int i = 0; i<answer.length; i++) {
			int num = 1;		
			while(kind[i]*num <= money){
				num++;
			}
			num--;
			answer[i] = num;
			money = money - kind[i] * num;
		}
				
		return answer;
	}

}
