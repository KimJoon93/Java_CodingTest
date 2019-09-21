import java.util.Stack;

public class Stacking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//아래부터 쌓고 위에서 부터 꺼냄 LIFO (Last In First Out)
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		
		System.out.println(stack);
		System.out.println("Stack 사이즈: "+stack.size());
		System.out.println("Stack 가장 위: "+ stack.peek());
		System.out.println("Stack re사이즈: "+stack.size());
		
		System.out.println(stack.pop());
		
		System.out.println("Stack 1개 뽑은 후 사이즈 : "+stack.size());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		//오류 발생 EmptyStack Exception
		System.out.println(stack.pop());
		
		
		

	}

}
