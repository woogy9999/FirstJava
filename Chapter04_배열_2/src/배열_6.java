import java.util.Scanner;

public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		int kor[]=new int[3];
		int eng[]=new int[3];
		int math[]=new int[3];
		
		int[] total=new int[3];
		double[] avg=new double[3];
		char[] score=new char[3];
		int[] rank=new int[3];
		
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<kor.length; i++) {

			System.out.println((i+1)+" 국어 입력 : ");
			kor[i]=scan.nextInt();
			
			System.out.println((i+1)+" 영어 입력 : ");
			eng[i]=scan.nextInt();
			
			System.out.println((i+1)+" 수학 입력 : ");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		for(int i=0; i<kor.length; i++) {
			System.out.printf("%5d%5d%5d%7d%7.2f\n",kor[i],eng[i],math[i],total[i],avg[i]);
		}
	}

}
