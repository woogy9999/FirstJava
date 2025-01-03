
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 문자열_1 {
	public static void main(String[] args) {
		String[] names = { "홍길동", "박문수", "강감찬", "이순신", "김두한" };
		// 문자열 => 데이터추가 / 데이터 수정(X)
		
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i]+" ");
		}
		System.out.println();
		for(String name:names) {
			
			System.out.print(name+" ");
		}
		
		System.out.println();
		System.out.println(Arrays.toString(names));
		
//		List list = new ArrayList();
//		list.add("a");
//		
	}

}
