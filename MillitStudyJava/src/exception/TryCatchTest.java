package exception;

public class TryCatchTest {
	
	public static void main(String[] args){
		System.out.println("test()执行完毕，返回：" + new TryCatchTest().test());
		System.out.println("test2()执行完毕，返回：" + new TryCatchTest().test2());
		System.out.println("test3()执行完毕，返回：" + new TryCatchTest().test3());
	}
	
	/**
	 * divider(除数);
	 * result(结果);
	 * try-catch捕获while循环
	 * 每次循环，divider减一,result=result+100/divider
	 * 如果捕获异常，打印输出：抛出异常了！，返回-1
	 * 否则返回result
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
			System.out.println("抛出异常了！！！");
			e.printStackTrace();
			return -1;
		}
	}
	
	/**
	 * divider(除数);
	 * result(结果);
	 * try-catch捕获while循环
	 * 每次循环，divider减一,result=result+100/divider
	 * 如果捕获异常，打印输出：抛出异常了！，返回result=999;
	 * 否则返回result
	 * finally:打印输出“这是finally！！！哈哈！！”，同时打印输出result的值
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
			System.out.println("抛出异常了！！！");
			e.printStackTrace();
			return result = 999;
		} finally {
			System.out.println("这是finally!!!哈哈!!!");
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
			System.out.println("抛出异常了！！！");
			e.printStackTrace();
		} finally {
			System.out.println("这是finally!!!哈哈!!!");
			System.out.println("result="+result);
		}
		
		return 1000;
	}
}
