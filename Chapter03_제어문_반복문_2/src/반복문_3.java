// 별 출력
public class 반복문_3 {
	public static void main(String[] args) {

		//char c = 'A';
		for (int j = 1; j <= 4; j++) {
			for (int i = 1; i <= 4; i++) {

				//System.out.print(c);
				
				if(i==j) {
					System.out.print("#");
				}else {
					System.out.print(i);
				}
			}
			//c++;
			System.out.println();
		}
		System.out.println();
		
		//변수 위치만 잘 바꿔주면됌
		
		for(int x=1; x<=4; x++) {
			for(char y='A'; y<='D'; y++) {
				System.out.print(y);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int p=1; p<=4; p++) {
			for(int k=1; k<=5-p; k++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		for(int t=1; t<=6; t++) {
			for(int q=1; q<=6; q++) {
				if((t+q)==6) {
					//System.out.print(t+" "+q +" "+(t+q));
					System.out.printf("[%d,%d]\n",t,q);
				}
			}
		}
		
		for(int i=1; i<=4; i++) {
			System.out.println();
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=5-i; k++) {
				System.out.print("★");	
			}
			
		}
		
	}
	
	
	
}
