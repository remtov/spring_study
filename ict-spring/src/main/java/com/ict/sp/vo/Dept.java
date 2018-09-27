package com.ict.sp.vo;
import java.lang.*;

public class Dept {
	
	private Integer deptno;
	private String deptname;
	private String deptloc;
	
	public Dept() {}

	@Override
	public String toString() {
		return "Dept [deptname=" + deptname + ", deptloc=" + deptloc + "]";
	}
	
	public Dept(Integer deptno, String deptname, String deptloc) {
		super();
		this.deptno = deptno;
		this.deptname = deptname;
		this.deptloc = deptloc;
	}
	

	
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getDeptloc() {
		return deptloc;
	}
	public void setDeptloc(String deptloc) {
		this.deptloc = deptloc;
	}


}
