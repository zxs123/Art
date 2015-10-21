package cn.instree.core.base;

import java.io.Serializable;
import java.util.List;

/**
 * Description:
 * @author shizy
 * @createDateTime 
 * @version  
 * @Company: MSD. 
 * @Copyright: Copyright (c) 2013
 */
public interface IBaseDao<T, PK extends Serializable> {
	
	/**
	 * 新增(会将序列生成的ID,注入)
	 * @param t
	 */
	void save(T t);
	
	/**
	 * 批量新增(会将序列生成的ID,注入)
	 * @param tList
	 */
	void saveOfBatch(List<T> tList);
	
	/**
	 * 根据ID进行删除
	 * @param id
	 */
	void removeById(PK id);
	
	/**
	 * 根据ids进行批量删除
	 * @param ids
	 */
	void removeOfBatch(List<PK> ids);
	
	
	void removeAll();
	
	/**
	 * 更新,字段为空，则不进行更新
	 * @param t
	 * @param 是否忽略空值,默认为true. 如为false,则会将不赋值的字段置为NULL
	 */
	void modify(T t);
	
	/**
	 * 批量更新
	 * @param tList
	 * @param 是否忽略空值,默认为true. 如为false,则会将不赋值的字段置为NULL
	 * 
	 */
	void modifyOfBatch(List<T> tList);
	
	/**
	 * 根据ID获取对象
	 * @param id
	 * @return
	 */
	T findOneById(PK id);
	
	/**
	 * 根据字段名进行查询
	 * @param columnName 字段名
	 * @param val        对应的值
	 * @param symbol     连接符号
	 */
	T findOneByColumnName(String columnName,Object val,String... symbol);
	
	/**
	 * 根据字段名进行查询
	 * @param columnName 字段名
	 * @param val        对应的值
	 * @param symbol     连接符号
	 */
	List<T> findListByColumnName(String columnName,Object val,String... symbol);
	
	/**
	 * 获取所有的对象
	 * @return
	 */
	List<T> findAll();
	
	/**
	 * 获取记录数
	 * @return
	 */
	Long findAllCount();

	/**
	 * 根据特定字段删除数据
	 * fieldName 用于当做条件的字段名称
	 * */
	void removeObjOfBatchByColumn(List<T> list,String fieldName);
	
	
	/**
	 * 根据字段名进行删除
	 * @param columnName 字段名
	 * @param val        对应的值
	 * @param symbol     连接符号
	 */
	void removeByColumnName(String columnName,Object val,String... symbol);
	
	/**
	 * 根据字段名进行删除
	 * @param columnName 字段名
	 * @param vals       对应的值
	 * @param symbol     连接符号
	 */
	void removeOfBatchByColumnName(String columnName,Object... vals);
	
	/**
	 * 是否存在
	 * @param id
	 * @return
	 */
	Boolean isExists(PK id);
	
	/**
	 * 是否存在
	 * @param columnName
	 * @param val
	 * @param symbol
	 * @return
	 */
	Boolean isExists(String columnName,Object val,String... symbol);
    
}
