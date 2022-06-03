package tw.com.hitrust.DesignPattern.SingletonPattern;

public class SingletonClass {

	//建立本身自己的物件(不允許外界使用)
	private static SingletonClass instance = new SingletonClass();
	
	//此物件無法用 new 產生實體
	private SingletonClass() {
		
	}
	
	//只能使用 getInstance
	public static SingletonClass getInstance() {
		return instance;
	}
	
}
