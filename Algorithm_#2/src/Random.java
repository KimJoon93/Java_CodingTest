import java.util.*;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
		double randomValue = Math.random();
		
		int intvalue = (int)(randomValue * 100) +1; 
		
		
		
		System.out.print(intvalue);
	}

}
