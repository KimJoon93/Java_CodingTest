
public class Target {
	
	public int target(int[] numbers, int target) {
		
        return DFS(numbers, target, 0, 0);
        
    }
	
	public int DFS(int[] numbers, int target, int index, int num) {
        if(index == numbers.length) {
            return num == target ? 1 : 0;
        } else {
            return DFS(numbers, target, index + 1, num + numbers[index])
                    + DFS(numbers, target, index + 1, num - numbers[index]);
        }
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1,1,1,1,1};

        int target = 3;
 
        System.out.println(new Target().target(numbers, target));

	}

}
