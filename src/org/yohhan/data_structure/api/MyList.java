package org.yohhan.data_structure.api;

/**
 * @author yohhan <yaoyao0777@Gmail.com>
 * @date create：2016年1月10日 下午4:05:35
 *
 *       线性表的抽象数据类型
 * 
 */
public interface MyList {
	public void clear();

	public boolean isEmpty();

	public int length();

	public Object get(int i) throws Exception;

	public void insert(int i, Object obj) throws Exception;

	public void remove(int i) throws Exception;

	public int indexOf(Object obj);

	public void display();
}
