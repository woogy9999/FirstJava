package com.sist.exception;

import java.io.FileReader;
import java.io.IOException;

import javax.management.modelmbean.InvalidTargetObjectTypeException;

public class 예외처리_finally {
	public static void main(String[] args) {
//		FileReader fr = null;
//		try {
//			fr = new FileReader("c:\\javaDev\\seoul_nature.txt");
//
//			int i = 0;
//			// => 정수형으로 'A'=> 65
//			while ((i = fr.read()) != -1) {
//
//				System.out.println((char) i);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fr.close();
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
		// 자동 rescource
		try {
			FileReader fr = new FileReader("c:\\javaDev\\seoul_nature.txt");

			int i = 0;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
