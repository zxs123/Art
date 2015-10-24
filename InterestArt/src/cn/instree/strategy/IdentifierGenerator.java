package cn.instree.strategy;

import java.io.Serializable;

import org.mybatis.spring.SqlSessionTemplate;

public interface IdentifierGenerator {

	public  Serializable generate(SqlSessionTemplate sqlSessionTemplate);
	
}
