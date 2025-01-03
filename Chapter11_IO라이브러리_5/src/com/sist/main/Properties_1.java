package com.sist.main;

import java.util.*;

public class Properties_1 {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		List<Emp> list=dao.empListData();
		for(Emp e:list) {
			System.out.println(e.getEmpno()+" "+e.getEname()+" "+e.getJob());
		}
		
		
	}
}
