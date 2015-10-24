package cn.instree.core.base;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang.StringUtils;

public abstract class BaseService<T, PK extends Serializable> implements IBaseService<T, PK> {

	protected IBaseDao<T, PK> baseDao;
	
	
	public void setBaseDao(IBaseDao<T, PK> baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public void save(T t) {
		try{
			baseDao.save(t);
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("保存出错" + t.toString());
		}
		
	}

	@Override
	public void saveOfBatch(List<T> tList) {
		try {
			baseDao.saveOfBatch(tList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("保存出错" + tList.toString());
		}
	}

	@Override
	public void removeById(PK id) {
		baseDao.removeById(id);
	}

	@Override
	public void removeOfBatch(List<PK> ids) {
		baseDao.removeOfBatch(ids);
	}

	@Override
	public void modify(T t) {
		baseDao.modify(t);
	}

	@Override
	public void modifyOfBatch(List<T> tList) {
		baseDao.modifyOfBatch(tList);
	}

	@Override
	public T findOneById(PK id) {
		if (id == null) {
			return null;
		}
		T result = baseDao.findOneById(id);
		return result;
	}

	@Override
	public T findOneByColumnName(String columnName, Object val, String... symbol) {
		if (StringUtils.isEmpty(columnName) || null == val) {
			return null;
		}
		T result = baseDao.findOneByColumnName(columnName, val, symbol);
		return result;
	}

	@Override
	public List<T> findListByColumnName(String columnName, Object val, String... symbol) {
		if (StringUtils.isEmpty(columnName) || null == val) {
			return null;
		}
		List<T> result = baseDao.findListByColumnName(columnName, val, symbol);
		return result;
	}

	@Override
	public List<T> findAll() {
		List<T> result = baseDao.findAll();
		return result;
	}

	@Override
	public Long findAllCount() {
		Long result = baseDao.findAllCount();
		return result;
	}

	@Override
	public void removeObjOfBatchByColumn(List<T> list, String fieldName) {
		baseDao.removeObjOfBatchByColumn(list, fieldName);
	}

	@Override
	public void removeByColumnName(String columnName, Object val, String... symbol) {
		baseDao.removeByColumnName(columnName, val, symbol);
	}

}
