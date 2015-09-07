package exception;

public class TryCatchTest {
	
	public static void main(String[] args){
		System.out.println("test()ִ����ϣ����أ�" + new TryCatchTest().test());
		System.out.println("test2()ִ����ϣ����أ�" + new TryCatchTest().test2());
		System.out.println("test3()ִ����ϣ����أ�" + new TryCatchTest().test3());
	}
	
	/**
	 * divider(����);
	 * result(���);
	 * try-catch����whileѭ��
	 * ÿ��ѭ����divider��һ,result=result+100/divider
	 * ��������쳣����ӡ������׳��쳣�ˣ�������-1
	 * ���򷵻�result
	 */
	public int test(){
		int divider = 10;
		int result = 0;
		
		try {
			while (divider>-1) {
				result=result+100/divider;
				divider--;
			}
			
			return result;
		} catch (Exception e) {
			System.out.println("�׳��쳣�ˣ�����");
			e.printStackTrace();
			return -1;
		}
	}
	
	/**
	 * divider(����);
	 * result(���);
	 * try-catch����whileѭ��
	 * ÿ��ѭ����divider��һ,result=result+100/divider
	 * ��������쳣����ӡ������׳��쳣�ˣ�������result=999;
	 * ���򷵻�result
	 * finally:��ӡ���������finally������������������ͬʱ��ӡ���result��ֵ
	 */
	public int test2(){
		int divider = 10;
		int result = 0;
		
		try {
			while (divider>-1) {
				result=result+100/divider;
				divider--;
			}
			
			return result;
		} catch (Exception e) {
			System.out.println("�׳��쳣�ˣ�����");
			e.printStackTrace();
			return result = 999;
		} finally {
			System.out.println("����finally!!!����!!!");
			System.out.println("result="+result);
		}
	}
	
	public int test3(){
		int divider = 10;
		int result = 0;
		
		try {
			while (divider>-1) {
				result=result+100/divider;
				divider--;
			}
			
			return result;
		} catch (Exception e) {
			System.out.println("�׳��쳣�ˣ�����");
			e.printStackTrace();
		} finally {
			System.out.println("����finally!!!����!!!");
			System.out.println("result="+result);
		}
		
		return 1000;
	}
}
