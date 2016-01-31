package org.yohhan.data_structure.linear;

import org.yohhan.data_structure.api.MyList;
import org.yohhan.data_structure.node.Node;

/**
 * @author yohhan <yaoyao0777@Gmail.com>
 * @date create��2016��1��10�� ����4:51:58
 * 
 *       ��ͷ���ĵ�����ʵ��
 * 
 */
public class LinkList implements MyList {

	private Node head;

	public LinkList() {
		head = new Node();
	}

	public LinkList(int n, boolean order) throws Exception {
		this();
		if (order)
			createFromTail(n);
		else
			createFromHead(n);
	}

	private void createFromTail(int n) throws Exception {
		// ���ڴ��������������������

		for (int j = 0; j < n; j++)
			insert(length(), j + 1);
	}

	private void createFromHead(int n) throws Exception {
		// ���ڴ��������������������

		for (int j = 0; j < n; j++)
			insert(0, j + 1);
	}

	@Override
	public void clear() {
		head.setData(null);
		head.setNext(null);
	}

	@Override
	public boolean isEmpty() {
		return head.getNext() == null;
	}

	@Override
	public int length() {
		Node node = head.getNext();
		int length = 0;
		while (node != null) {
			node = node.getNext();
			++length;
		}
		return length;
	}

	/**
	 * ��λ��Ų����㷨
	 */
	@Override
	public Object get(int i) throws Exception {
		Node node = head.getNext();
		int j = 0;
		while (node != null && j < i) {
			node = node.getNext();
			++j;
		}
		if (j > i || node == null)
			throw new Exception("Ԫ�ز�����");
		return node.getData();
	}

	/**
	 * ��indexǰ�����½��
	 */
	@Override
	public void insert(int i, Object obj) throws Exception {
		Node node = head;
		int j = -1;
		while (node != null && j < i - 1) {
			node = node.getNext();
			++j;
		}
		if (j > i - 1 || node == null)
			throw new Exception("����λ�ò��Ϸ�");
		Node newNode = new Node(obj);
		newNode.setNext(node.getNext());
		node.setNext(newNode);
	}

	@Override
	public void remove(int i) throws Exception {
		Node node = head;
		int j = -1;
		while (node.getNext() != null && j < i - 1) { // ������Ϊ��
			node = node.getNext();
			++j;
		}
		if (j > i - 1 || node == null)
			throw new Exception("ɾ��λ�ò��Ϸ�");
		node.setNext(node.getNext().getNext());
	}

	/**
	 * ��ֵ�����㷨
	 */
	@Override
	public int indexOf(Object obj) {
		Node node = head.getNext();
		int j = 0;
		while (node != null && !node.getData().equals(obj)) {
			node = node.getNext();
			++j;
		}
		if (node != null)
			return j;
		return -1;
	}

	@Override
	public void display() {
		Node node = head.getNext();
		while (node != null) {
			System.out.print(node.getData() + "");
			node = node.getNext();
		}
		System.out.println();
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		Node node = head.getNext();
		while (node != null) {
			sb.append(node.getData().toString() + ", ");
			node = node.getNext();
		}
		sb.delete(sb.length() - 2, sb.length());
		sb.append("]");
		return sb.toString();
	}

}
