import java.util.*;

public class Frog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
			
		System.out.println(solution(word));

	}
	
	public static String solution(String word) {
		
		String result = "";
		String[] array_word = word.split("");
		
		String[] change_word = {"Z","Y","X","W","V","U","T","S","R","Q","P","O","N","M","L","K","J","I","H","G","F","E","D","C","B","A"};
		
		ArrayList<String> change_word_list = new ArrayList<>();
		
		for(int i = 0; i<change_word.length; i++) {
			change_word_list.add(change_word[i]);
		}
		
		Collections.reverse(change_word_list);
		
		Map<String, String> alpha = new HashMap<>();
		Map<String, String> beta = new HashMap<>();
		
		for(int i = 0; i < change_word.length; i++) {
			alpha.put(change_word_list.get(i), change_word[i]);
			beta.put(change_word_list.get(i).toLowerCase(), change_word[i].toLowerCase());
		}
		
		for(int i = 0; i < array_word.length; i++) {
			
			char ch = array_word[i].charAt(0);
			
			if(Character.isUpperCase(ch)) {
				array_word[i] = alpha.get(array_word[i]);
			}else if(Character.isLowerCase(ch)) {
				array_word[i] = beta.get(array_word[i]);	
			}
			
		}
		
		for(int i = 0; i<array_word.length; i++) {
			result = result + array_word[i];
		}
		return result;		
	}

}
