
public class Start3 {
	
	// 4개 값의 최대값을 구하는 max4 메소드 작성하라
	static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if(b>max)
			max = b;
		
		if(c>max)
			max = c;
		
		if(d>max)
			max = d;
		
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(max4(5,2,3,4));
		
	}

}
