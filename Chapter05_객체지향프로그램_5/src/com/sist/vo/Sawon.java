package com.sist.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*

@Getter
@Setter
@NoArgsConstructor //디폴트 생성자
@AllArgsConstructor //매개변수 생성자
@Data
*/

@AllArgsConstructor
@Data
public class Sawon {

	private int sabun;
	private String name;
	private String dept;
	private String job;
	private String regdate;
	private int pay;

	// 읽기 / 쓰기

	public static void main(String[] args) {

	}
}

/*
 * 
 * public int getSabun() { return sabun; }
 * 
 * 
 * public void setSabun(int sabun) { this.sabun = sabun; }
 * 
 * 
 * public String getName() { return name; }
 * 
 * 
 * public void setName(String name) { this.name = name; }
 * 
 * 
 * public String getDept() { return dept; }
 * 
 * 
 * public void setDept(String dept) { this.dept = dept; }
 * 
 * 
 * public String getJob() { return job; }
 * 
 * 
 * public void setJob(String job) { this.job = job; }
 * 
 * 
 * public String getRegdate() { return regdate; }
 * 
 * 
 * public void setRegdate(String regdate) { this.regdate = regdate; }
 * 
 * 
 * public int getPay() { return pay; }
 * 
 * 
 * public void setPay(int pay) { this.pay = pay; }
 */
