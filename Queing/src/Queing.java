import java.util.Queue;
import java.util.LinkedList;

public class Queing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 2;
		int y = 16;
		
		System.out.println(x%y);
		
		//First In First Out 먼저들어간놈이 먼저 나옴 
		Queue queue = new LinkedList();
		
		queue.offer("1");
		queue.offer("2");
		queue.offer("3");
		queue.offer("4");
		
		System.out.println(queue);
		
		queue.poll();
		
		// 먼저 들어온 1이 빠져나
		queue.forEach((value)->{
			System.out.println(value);
		});
//		System.out.println(queue.get(0));
		
//		//2가 나옴 
//		System.out.println(queue.peek());
		

	}

}
