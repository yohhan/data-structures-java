package org.yohhan.data_structure.api;

/**
 * 栈的抽象数据类型描述
 * 
 * @author yohhan 
 * Create By 2016年2月1日 下午10:40:30
 */
public interface MyStack {
	public void clear();
	public boolean isEmpty();
	public int length();
	public Object peek();
	public Object pop();
	public void push(Object obj) throws Exception;
}
