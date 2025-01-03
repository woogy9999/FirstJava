//6. 0~9사이의 난수를 100개 발생해서 
//   빈도를 구해서 출력하시오 
//   예)
//   0의 개수: 1
//   1의 개수: 1
//   ..
//   9의 개수: 0

package 문제;

public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		int sum=0;
		for(int i=0; i<100; i++) {
			int c=(int)(Math.random()*10);
			
			arr[c]++;
			
	
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+"의 개수 : "+arr[i]+"\n");
			sum+=arr[i];
		}
		System.out.println(sum);
		
	}

}
