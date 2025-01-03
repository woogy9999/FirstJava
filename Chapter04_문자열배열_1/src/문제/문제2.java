//2. 1월달 사원(1번부터 5번사원)의 실적이 50 45 35 12 70 이다. (실적 0~100) 
//1)사번별 실적을 출력하시오.
//사원(1) 50..
//2) 1월 실적의 총점과 평균을 출력하시오.
//3) 실적이 제일 큰 사원의 사번과 실적, 작은 사원의 사번과 실적을 출력하시오.



package 문제;

public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int employ[]= {50,45,35,12,70};
		int sum=0;
		double avg=0.0;
		int max=employ[0];
		int min=employ[0];
		int maxcount=0,mincount=0;
		
		for(int i=0; i<employ.length; i++) {
			System.out.print("사원 ("+(i+1) +") "+employ[i]);
			System.out.println();
			sum+=employ[i];
			
			if(employ[i]>max) {
				max=employ[i];
				maxcount=i+1;
			}
			
			if(employ[i]<min) {
				min=employ[i];
				mincount=i+1;
			}
			
		}
		avg=sum/employ.length;
		
		System.out.println("총점은 : "+sum);
		System.out.println("평균은 : "+avg);
		System.out.println("실적 큰 사원의 사번 : "+maxcount +" 실적 : "+max);
		System.out.println("실적 작은 사원의 사번 : "+mincount +" 실적 : "+min);
	}

}
