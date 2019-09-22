import java.util.Arrays;

public class KNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		
		int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
		
		int[] answer = new int[commands.length];
		
		for(int i=0; i<commands.length; i++){
            
			int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
          
            Arrays.sort(temp);

            answer[i] = temp[commands[i][2]-1];
        }
		
		System.out.println(answer[0]+","+answer[1]+","+answer[2]);
	}

}
