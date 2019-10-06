
public class Calculator {
	
	public int evaluate(String expression) {
		int sum = 0;
		String[] array = new String[expression.length()];
		array = expression.split("");
		System.out.println(array[0]+ "===" + array[1]);
		
		for(int i=1; i<expression.length(); i+=2) {	
			if(array[i].equals("+")) {
				sum = Integer.parseInt(array[i-1]) + Integer.parseInt(array[i+1]);
				array[i+1] = Integer.toString(Integer.parseInt(array[i-1]) + Integer.parseInt(array[i+1]));
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		int sum = calculator.evaluate("1+2+4");
		System.out.println("1+2+3 = " + sum);
	}

}
