
public class Tower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 타워는 1이상 50만 이하 */
		int tower = 5;
		
		/* 높이는 1이상 1억 이하 */
		int[] heights = {9,6,5,7,4};
		
		
		int[] answer = new int[heights.length];
		
//		for(int i=height.length-1; i>0; i--) {
//			
//			if(height[i] < height[i-1]) {
//			
//				answer[i] = i;
//			
//			}else if(i==1){
//				
//				answer[i-1] = 0;
//				
//			}else {
//				if(height[i] < height[i-2]) {
//					answer[i]= i-1;
//				}else {
//					answer[i] = 0;
//				}
//				// 뚫린 경우 나머지 부딪힐때까지 들어가야
//				// 7[3] < 9[1]? == ###answer[i]= i-1 ###  7[3] < 6[0]?
//				
//			}
//		}
		
		for(int i=0;)
		
		for (int i=0; i<heights.length; i++){
			
            for (int j=i+1; j<heights.length; j++){
                
            	if (heights[i] > heights[j]){
                    answer[j]=i+1;
            	}
        		System.out.println(answer[0]+","+answer[1]+","+answer[2]+","+answer[3]+","+answer[4]);
            	
            }

        }
		
		System.out.println(answer[0]+","+answer[1]+","+answer[2]+","+answer[3]+","+answer[4]);
	}

}
