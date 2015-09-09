package collection;

import java.util.List;
import java.util.ArrayList;

public class TestGeneric {
	/**
	 * 带泛型的List
	 * @param args
	 */
	public List<Course> courses;
	
	public TestGeneric(){
		this.courses = new ArrayList<Course>();
	}
	
	public void testAdd(){
		Course cos1 = new Course("1","语文");
		Course cos2 = new Course("2","语文2");
		courses.add(cos1);
		courses.add(cos2);
		/*
		 * 不能添加Course以外的东西
		 */
//		courses.add("a");
		
	}
	
	public void testGet(){
		for(Course cos: courses){
			System.out.println(cos.getId()+":"+cos.getName());
		}
	}
	
	/*
	 * 添加泛型中元素的子类型元素
	 */
	public void testAddChild(){
		ChildCourse ccos = new ChildCourse("3","子类型");
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
