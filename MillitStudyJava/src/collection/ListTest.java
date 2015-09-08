package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/**
 * List测试
 * @author JeroZhang
 *
 */
public class ListTest {
	public List coursesToSelect;
	/**
	 * 用ArryList实现List接口
	 */
	public ListTest(){
		coursesToSelect = new ArrayList();
	}
	/**
	 * 增加元素的四种方法
	 */
	public void testAdd(){
		Course cos1 = new Course("1", "英语");
		coursesToSelect.add(cos1);
		Course temp = (Course) coursesToSelect.get(0);
		Course cos2 = new Course("2", "English");
		
		coursesToSelect.add(0, cos2);
		Course temp2 = (Course) coursesToSelect.get(0);
		System.out.println("课程已添加：id="+temp.getId()+",name="+temp.getName());
		System.out.println("课程已添加：id="+temp2.getId()+",name="+temp2.getName());
		
		Course[] course = {new Course("3","语文"),new Course("4","化学")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course)coursesToSelect.get(2);
		Course temp4 = (Course)coursesToSelect.get(3);
		System.out.println("课程已添加：id="+temp3.getId()+",name="+temp3.getName());
		System.out.println("课程已添加：id="+temp4.getId()+",name="+temp4.getName());
		
		Course[] course2 = {new Course("5","语文2"),new Course("6","化学2")};
		coursesToSelect.addAll(1, Arrays.asList(course2));
		Course temp5 = (Course)coursesToSelect.get(1);
		Course temp6 = (Course)coursesToSelect.get(2);
		System.out.println("课程已添加：id="+temp5.getId()+",name="+temp5.getName());
		System.out.println("课程已添加：id="+temp6.getId()+",name="+temp6.getName());
	}
	/**
	 * 用循环获取ArrayList内容
	 * 
	 */
	public void testGet(){
		int size = coursesToSelect.size();
		System.out.println("有如下课程待选:");
		for(int i=0;i<size;i++){
			Course cos = (Course)coursesToSelect.get(i);
			System.out.println("课程："+cos.getId()+":"+cos.getName());
		}
	}
	/**
	 * 用迭代器获取ArrayList内容
	 * 
	 */
	public void testIterator(){
		Iterator it = coursesToSelect.iterator();
		while (it.hasNext()) {
			Course cos = (Course) it.next();
			System.out.println("Course:"+cos.getId()+":"+cos.getName());
		}
	}
	/**
	 * 用foreach获取ArrayList内容
	 */
	public void testForEach(){
		for (Object cos : coursesToSelect) {
			System.out.println("Course:"+((Course) cos).getId()+":"+((Course) cos).getName());
		}
	}
	
	/**
	 * 修改List中元素
	 * @param args
	 */
	public void testModify(){
		coursesToSelect.set(4, new Course("7", "会计"));
		
	}
	
	/**
	 * 删除List中元素
	 * @param args
	 */
	public void testRemove(){
		Course cos = (Course) coursesToSelect.get(4);
		System.out.println("我是课程："+cos.getId()+":"+cos.getName()+"，我将被删除。");
		coursesToSelect.remove(cos);
		System.out.println("成功删除！");
	}
	
	/**
	 * 往list中添加奇怪东西
	 * @param args
	 */
	public void testType(){
		System.out.println("能否往list中添加一些奇怪的东西呢？");
		coursesToSelect.add("我是一个字符串");
		
	}
	public static void main(String[] args){
		ListTest lt = new ListTest();
		lt.testAdd();
		lt.testGet();
		lt.testIterator();
		lt.testModify();
		lt.testRemove();
		lt.testType();
		lt.testForEach();
	}
}
