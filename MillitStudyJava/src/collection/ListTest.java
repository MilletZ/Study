package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ListTest {
	public List coursesToSelect;
	
	public ListTest(){
		coursesToSelect = new ArrayList();
	}
	
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
	
	public static void main(String[] args){
		ListTest lt = new ListTest();
		lt.testAdd();
	}
}
