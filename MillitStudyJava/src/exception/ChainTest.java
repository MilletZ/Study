package exception;


public class ChainTest {
	/**
	 * test1():�׳����ȴ��ˡ��쳣
	 * test2��������test1�������񡰺ȴ��ˡ��쳣�����Ұ�װ������ʱ�쳣�������׳�
	 * main�����У�����test2���������Բ���test2���������׳����쳣
	 */
	public void test1() throws DrunkException{
		throw new DrunkException("�ȳ��𿪾ƣ�");
	}
	
	public void test2(){
		try {
			test1();
		} catch (DrunkException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			RuntimeException newExc = new RuntimeException(e);
			throw newExc;
		}
	}
	
	public static void main(String[] args){
		ChainTest t = new ChainTest();
		try {
			t.test2();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
