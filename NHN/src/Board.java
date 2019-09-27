import java.util.*;

public class Board {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> nameList = new ArrayList<>();
		ArrayList<String> realNameList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int w = sc.nextInt();
		
		String[][] members = new String[n][n];
		
		int realN = n;
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++) {
				members[i][j] = sc.next();
			}
		}
		
		if(n>101) {
			
			System.out.println("");
			
		}else if(members[0][0].equals(members[0][1])){
			
			for(int i=0; i<realN; i++){				
				for(int j=0; j<realN; j++) {
								
					if(j==realN-1) {
						System.out.print(members[i][j]+"\n");	
					}else {
						System.out.print(members[i][j] + " ");
					}
				}
			}	
				
		}else {
			//돌린 횟수
			int k = 0;
			if(w>0) {
				k = w % (4*(n-1));
			}else if(w<0){
				k =  (-1*w) % (4*(n-1));
				k = -1*k;
			}

			int ver = 0;
			int hor = n-1; 
			
			while(n > 1) {
				
				// 끝 숫자 배열에 순서대로 넣어주기 
				for(int i=ver; i<hor+1; i++){
					
					for(int j=ver; j<hor+1; j++) {
						
						if(i==ver) {
							nameList.add(members[i][j]);
						}
						
						if(j==hor) {
							nameList.add(members[i][j]);
						}						
					}
				}
				
				for(int i=hor; i>ver-1; i--) {

					for(int j=hor; j>ver-1; j--) {
						
						if(i==hor) {
							nameList.add(members[i][j]);
						}
						
						if(j==ver) {
							nameList.add(members[i][j]);
						}
					}
				}
				
				//겹치는 부분 제거 
				for(int i=0; i<nameList.size(); i++) {
					if(!realNameList.contains(nameList.get(i))) {
						realNameList.add(nameList.get(i));
					}
				}
				
				
				if(k>0) {
					
					//회전 시계방향 k번 
					for(int i=0; i<k; i++) {
						String memory = realNameList.get(0);
						String memory2 = realNameList.get(1);
						
						realNameList.set(0, realNameList.get(realNameList.size() -1));
						
						for(int j=1; j<4*(n-1); j+=2) {
							
							if(j==(4*(n-1))-1) {
								realNameList.set(j, memory);
							}else {
								realNameList.set(j, memory);
								memory = realNameList.get(j+1);
								
								realNameList.set(j+1, memory2);
								memory2 = realNameList.get(j+2);
							}
						}
					}
					
					
				}else if(k<0) {
					// k가 음수일때 
					for(int j=0; j<(-1*k); j++) {
						//반시계방향 k번 회전 
						Queue queue = new LinkedList();
						
						for(int i =0; i<realNameList.size(); i++) {
							queue.offer(realNameList.get(i));
						}
						String queueMemory = realNameList.get(0);
						queue.poll();
						queue.offer(queueMemory);
						
						for(int i =0; i<realNameList.size(); i++) {
							String quepeek = queue.peek().toString();
							realNameList.set(i, quepeek);
							queue.poll();
						}
					}
				}
				
				int order = 0;
				
				// 배열에 추가해주기
				for(int i=ver; i<hor+1; i++){
					
					for(int j=ver; j<hor+1; j++) {
						
						if(i==ver) {
							members[ver][j] = realNameList.get(order);
							order++;
						}
					}
				}
				
				order--;
				for(int i=ver; i<hor+1; i++){
							
					for(int j=ver; j<hor+1; j++) {
								
						if(j==hor) {
							members[i][hor] = realNameList.get(order);
							order++;
						}
					}
				}
				
				order--;
				for(int i=hor; i>ver-1; i--) {

					for(int j=hor; j>ver-1; j--) {
						
						if(i==hor) {
							members[hor][j] = realNameList.get(order);
							order++;
						}
					}
				}
				
				order--;
				for(int i=hor; i>ver; i--) {

					for(int j=hor; j>ver-1; j--) {
						
						if(j==ver) {
							members[i][ver] = realNameList.get(order);
							order++;
						}
					}
				}
				
				// 숫자 줄이기 
				n= n-2;
				// k -1 곱하기 
				k = -1*k;
				
				ver = ver+1;
				hor = hor-1;
				
				nameList.clear();
				realNameList.clear();
				order = 0;
								
			}
			
			// -----------정답 -----------------
			for(int i=0; i<realN; i++){
							
				for(int j=0; j<realN; j++) {
								

					if(j==realN-1) {
						System.out.print(members[i][j]+"\n");	
					}else {
						System.out.print(members[i][j] + " ");
					}
				}
			}		
		}	
	}
}
