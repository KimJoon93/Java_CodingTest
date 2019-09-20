
public class Location {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] v = {{1, 4}, {3, 4}, {3, 10}};
		
		int[] answer = new int[2];
					
		answer[0] = v[0][0]^v[1][0]^v[2][0];    
		answer[1] = v[0][1]^v[1][1]^v[2][1];
		
		System.out.println("정답: "+ answer[0]+","+answer[1]);
	}

}
