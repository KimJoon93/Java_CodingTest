import java.util.Arrays;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String answer = "";
	     String temp = "";
		
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		int i = 0;
		
		System.out.println(participant[0]+","+participant[1]+","+participant[2]);
		
		while(i < completion.length){
            if(!completion[i].equals(participant[i])){
                temp = participant[i];
                break;
            }else{
                i++;
            }
        }
        
        if(!temp.equals("")){
            answer = temp;
        }else{
            answer = participant[participant.length-1];
        }
        
        System.out.println(answer);
		
	}

}