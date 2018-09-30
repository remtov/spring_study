package com.ict.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
//맵퍼는 작성후 root-context.xml에 추가설정이 필요하다

	@Select("SELECT sysdate FROM dual")
	public String getTime();

	public String getTime2();

}
