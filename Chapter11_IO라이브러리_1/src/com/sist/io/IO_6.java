package com.sist.io;

import java.io.*;

// 폴더 / 파일 / (폴더/ 파일 존재여부 확인) => 삭제
public class IO_6 {
	public static void main(String[] args) {
		File dir = new File("c:\\java_data");
		// rm 파일명 => rm -rf 폴더명

		// dir.delete();
		File[] files = dir.listFiles();
		for (File f : files) {
			f.delete();
		}
		dir.delete();
		System.out.println("삭제 완료!!");
	}
}
