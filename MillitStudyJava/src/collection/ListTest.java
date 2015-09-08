package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/**
 * List����
 * @author JeroZhang
 *
 */
public class ListTest {
	public List coursesToSelect;
	/**
	 * ��ArryListʵ��List�ӿ�
	 */
	public ListTest(){
		coursesToSelect = new ArrayList();
	}
	/**
	 * ����Ԫ�ص����ַ���
	 */
	public void testAdd(){
		Course cos1 = new Course("1", "Ӣ��");
		coursesToSelect.add(cos1);
		Course temp = (Course) coursesToSelect.get(0);
		Course cos2 = new Course("2", "English");
		
		coursesToSelect.add(0, cos2);
		Course temp2 = (Course) coursesToSelect.get(0);
		System.out.println("�γ�����ӣ�id="+temp.getId()+",name="+temp.getName());
		System.out.println("�γ�����ӣ�id="+temp2.getId()+",name="+temp2.getName());
		
		Course[] course = {new Course("3","����"),new Course("4","��ѧ")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course)coursesToSelect.get(2);
		Course temp4 = (Course)coursesToSelect.get(3);
		System.out.println("�γ�����ӣ�id="+temp3.getId()+",name="+temp3.getName());
		System.out.println("�γ�����ӣ�id="+temp4.getId()+",name="+temp4.getName());
		
		Course[] course2 = {new Course("5","����2"),new Course("6","��ѧ2")};
		coursesToSelect.addAll(1, Arrays.asList(course2));
		Course temp5 = (Course)coursesToSelect.get(1);
		Course temp6 = (Course)coursesToSelect.get(2);
		System.out.println("�γ�����ӣ�id="+temp5.getId()+",name="+temp5.getName());
		System.out.println("�γ�����ӣ�id="+temp6.getId()+",name="+temp6.getName());
	}
	/**
	 * ��ѭ����ȡArrayList����
	 * 
	 */
	public void testGet(){
		int size = coursesToSelect.size();
		System.out.println("�����¿γ̴�ѡ:");
		for(int i=0;i<size;i++){
			Course cos = (Course)coursesToSelect.get(i);
			System.out.println("�γ̣�"+cos.getId()+":"+cos.getName());
		}
	}
	/**
	 * �õ�������ȡArrayList����
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
	 * ��foreach��ȡArrayList����
	 */
	public void testForEach(){
		for (Object cos : coursesToSelect) {
			System.out.println("Course:"+((Course) cos).getId()+":"+((Course) cos).getName());
		}
	}
	
	/**
	 * �޸�List��Ԫ��
	 * @param args
	 */
	public void testModify(){
		coursesToSelect.set(4, new Course("7", "���"));
		
	}
	
	/**
	 * ɾ��List��Ԫ��
	 * @param args
	 */
	public void testRemove(){
		Course cos = (Course) coursesToSelect.get(4);
		System.out.println("���ǿγ̣�"+cos.getId()+":"+cos.getName()+"���ҽ���ɾ����");
		coursesToSelect.remove(cos);
		System.out.println("�ɹ�ɾ����");
	}
	
	/**
	 * ��list�������ֶ���
	 * @param args
	 */
	public void testType(){
		System.out.println("�ܷ���list�����һЩ��ֵĶ����أ�");
		coursesToSelect.add("����һ���ַ���");
		
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
