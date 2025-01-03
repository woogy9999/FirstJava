package com.sist.main;

import java.io.*;
import java.util.*;

public class IO_2 {
	public static void main(String[] args) {
		ObjectInputStream ois = null;
		// 역직렬화 => 객체단위로 원상복귀
		try {
			FileInputStream fis = new FileInputStream("c:\\java_data\\sawon_info.txt");
			ois = new ObjectInputStream(fis);
			// 파일을 읽어서 => 객체(Object) 단위로 데이터를 읽어온다.
			List<Sawon> list = (List<Sawon>) ois.readObject();
			//List<Sawon> => 데이터형으로 인식
			for(Sawon sa:list) {
				System.out.println(sa.getSabun()+" "
						+sa.getName()+" "
						+sa.getDept()+" "
						+sa.getJob()+" "
						+sa.getPay()+" ");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (Exception e2) {
				// TODO: handle exception

			}
		}
	}
}
