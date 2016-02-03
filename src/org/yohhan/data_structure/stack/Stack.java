package org.yohhan.data_structure.stack;

import org.yohhan.data_structure.api.MyStack;

/**
 * 顺序栈的类描述
 * 
 * @author yohhan
 * Create By 2016年2月1日 下午10:52:59
 */
public class Stack implements MyStack{

	private Object[] stackElems;
	private int top; // 栈为空时，top = 0
	
	public Stack(int maxSize) {
		top = 0;
		stackElems = new Object[maxSize];
	}
	
	@Override
	public void clear() {
		top = 0;
	}

	@Override
	public boolean isEmpty() {
		return top==0;
	}

	@Override
	public int length() {
		return top;
	}

	@Override
	public Object peek() {
		if(!isEmpty())
			return stackElems[top-1];
		return null;
	}

	@Override
	public Object pop() {
		if(!isEmpty())
			return stackElems[--top];
		return null;
	}

	@Override
	public void push(Object obj) throws Exception {
		if(top==stackElems.length)
			throw new Exception("栈已满");
		stackElems[top++] = obj;
	}

}
