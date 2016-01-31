package org.yohhan.data_structure.linear;

import org.yohhan.data_structure.api.MyList;

/**
 * @author yohhan <yaoyao0777@Gmail.com>
 * @date create：2016年1月10日 下午4:09:15
 * 
 *       线性表的顺序存储实现
 */
public class SqList implements MyList {

	private Object[] listElem; // 数组作为线性表的存储空间
	private int curLen; // 线性表的当前长度

	public SqList(int maxSize) {
		curLen = 0;
		listElem = new Object[maxSize];
	}

	@Override
	public void clear() {
		curLen = 0;
	}

	@Override
	public boolean isEmpty() {
		return curLen == 0;
	}

	@Override
	public int length() {
		return curLen;
	}

	@Override
	public Object get(int i) throws Exception {
		if (i < 0 || i > curLen - 1)
			throw new Exception("元素不存在");
		return listElem[i];
	}

	@Override
	public void insert(int i, Object obj) throws Exception {
		if (curLen == listElem.length)
			throw new Exception("存储空间已满");
		if (i < 0 || i > curLen)
			throw new Exception("插入位置不合法");
		for (int j = curLen; j > i; j--)
			listElem[j] = listElem[j - 1];
		listElem[i] = obj;
		++curLen;
	}

	@Override
	public void remove(int i) throws Exception {
		if (i < 0 || i > curLen - 1)
			throw new Exception("删除位置不合法");
		for (int j = i; j < curLen; j++)
			listElem[j] = listElem[j + 1];
		--curLen;
	}

	@Override
	public int indexOf(Object obj) {
		int j = 0;
		while (j < curLen && !listElem[j].equals(obj))
			j++;
		if (j < curLen)
			return j;
		return -1;
	}

	@Override
	public void display() {
		for (int j = 0; j < curLen; j++)
			System.out.print(listElem[j] + ", ");
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (Object obj : listElem) {
			if (null != obj)
				sb.append(obj.toString() + ", ");
		}
		sb.delete(sb.length() - 2, sb.length());
		sb.append("]");
		return sb.toString();
	}

}
