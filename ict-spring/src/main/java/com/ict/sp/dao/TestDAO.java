package com.ict.sp.dao;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ict.sp.vo.Dept;

@Repository
public class TestDAO {

	@Autowired
	private SqlSessionTemplate sst;// 여기까지 공통으로 뽑아낼수있다.

	public List<Dept> getList() {
		Dept d = new Dept();
		d.setDeptno(10);
		d.setDeptname("ACCOUNTING");
		// int deptNo = 10;
		return sst.selectList("DEPT.selectDept", d);
		// 네임스페이스와 아이디만알면 수 많은것들이 생략된다.

	}
}
