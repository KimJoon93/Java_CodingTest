
public class Start2 {
	
		static int Start2(int a, int b, int c) {
			int max =a;
			
			if(b>max)
				max=b;
			if(c>max)
				max=c;
			
			return max;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Start2(3,5,4));
		System.out.println(Start2(3,100,40));
		System.out.println(Start2(3,5,40));

	}

}
