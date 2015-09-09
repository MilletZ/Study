package collection;

import java.util.List;
import java.util.ArrayList;

public class TestGeneric {
	/**
	 * �����͵�List
	 * @param args
	 */
	public List<Course> courses;
	
	public TestGeneric(){
		this.courses = new ArrayList<Course>();
	}
	
	public void testAdd(){
		Course cos1 = new Course("1","����");
		Course cos2 = new Course("2","����2");
		courses.add(cos1);
		courses.add(cos2);
		/*
		 * �������Course����Ķ���
		 */
//		courses.add("a");
		
	}
	
	public void testGet(){
		for(Course cos: courses){
			System.out.println(cos.getId()+":"+cos.getName());
		}
	}
	
	/*
	 * ��ӷ�����Ԫ�ص�������Ԫ��
	 */
	public void testAddChild(){
		ChildCourse ccos = new ChildCourse("3","������");
		courses.add(ccos);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGeneric tg = new TestGeneric();
		tg.testAdd();
		tg.testAddChild();
		tg.testGet();
	}

}
