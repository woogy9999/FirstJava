
// 1|양화진외국인선교사묘원|양화진외국인선교사묘원은 서울 마포구 합정동에 위치한 외국인 선교사들의 공동묘지이다.|04084 서울 마포구 양화진길 46 (합정동, 양화진홍보관)
// 1|
//도봉산|
//하늘을 깎아세운 만길 봉우리도봉(道峰)산은 이름 그대로 봉우리가 길인 산|
//132-010 서울특별시 도봉구 도봉동 경기 의정부시, 양주시 장흥면 일대

import com.sist.data.*;

public class 문자열배열_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String seoul = ArrayData.arrayData("seoul_location.txt");
		String[] seoul_data = seoul.split("\n");
		for (String s : seoul_data) {
			String[] data = s.split("\\|");
			if (data[3].contains("마포")) {

				System.out.println("번호:" + data[0]);
				System.out.println("명소명:" + data[1]);
				System.out.println("주소:" + data[3]);
				System.out.println("소개:" + data[2]);
				System.out.println("=================================================================");
			}

		}
	}

}
