package com.shp753.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {

	@Select("select now()")
	public String getTime();
}
