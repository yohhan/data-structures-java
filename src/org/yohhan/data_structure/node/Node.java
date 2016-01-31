package org.yohhan.data_structure.node;

/**
 * @author yohhan <yaoyao0777@Gmail.com>
 * @date create：2016年1月10日 下午4:39:15
 * 
 *       链表的结点类描述
 * 
 */
public class Node {

	private Object data;
	private Node next;

	public Node() {
		this(null, null);
	}

	public Node(Object data) {
		this(data, null);
	}

	public Node(Object data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
