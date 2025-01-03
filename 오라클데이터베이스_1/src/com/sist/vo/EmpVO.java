package com.sist.vo;

import java.util.*;

import lombok.Data;

/*
  	오라클에 있는 데이터를 모아서 => 윈도우 , 브라우저에 전송할 목적
  	=> 한명에 대한 데이터를 가지고 있다
  	
  	=> 컬럼명 
 
 */
@Data
public class EmpVO {

	private int empno; // 중복이 없다
	private String ename;
	private String job;
	private int mgr; // 사수번호
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;
}
