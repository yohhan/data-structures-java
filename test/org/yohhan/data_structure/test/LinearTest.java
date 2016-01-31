package org.yohhan.data_structure.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.yohhan.data_structure.linear.LinkList;
import org.yohhan.data_structure.linear.SqList;

/**
 * @author yohhan <yaoyao0777@Gmail.com>
 * @date create：2016年1月10日 下午4:25:12
 * 
 *       线性表单元测试类
 *
 */
public class LinearTest {

	@Test
	public void sqListTest() throws Exception {
		SqList sqList = new SqList(10);
		for (int i = 0; i < 5; i++)
			sqList.insert(i, i + 1);
		System.out.println(sqList);
		assertTrue(sqList.toString().equals("[1, 2, 3, 4, 5]"));
		assertTrue(sqList.length() == 5);
		assertTrue(sqList.indexOf(2) == 1);
		assertTrue(sqList.get(0).equals(1));
		sqList.remove(1);
		assertTrue(sqList.length() == 4);
		assertTrue(sqList.indexOf(1) == 0);
	}

	@Test
	public void linkListTest() throws Exception {
		LinkList linkList = new LinkList(5, true);
		System.out.println(linkList);
		assertTrue(new LinkList(5, false).toString().equals("[5, 4, 3, 2, 1]"));
		assertTrue(linkList.toString().equals("[1, 2, 3, 4, 5]"));
		assertTrue(linkList.length() == 5);
		assertTrue(linkList.indexOf(2) == 1);
		assertTrue(linkList.get(0).equals(1));
		linkList.remove(1);
		assertTrue(linkList.length() == 4);
		assertTrue(linkList.indexOf(1) == 0);

	}

}
