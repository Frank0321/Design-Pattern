package tw.com.hitrust.DesignPattern.SingletonPattern;

public class SingletonApplication {
	
	public static void main(String[] args) {
		
		System.out.println("start Singleton Pattern");
		
		SingletonClass singletonClass1 = SingletonClass.getInstance();
		SingletonClass singletonClass2 = SingletonClass.getInstance();
		
		System.out.println(String.format("singletonClass1:%d", singletonClass1.hashCode()));
		System.out.println(String.format("singletonClass2:%d", singletonClass2.hashCode()));

		
		
		NewClass newClass1 = new NewClass();
		NewClass newClass2 = new NewClass();
		
		System.out.println(String.format("newClass1:%d", newClass1.hashCode()));
		System.out.println(String.format("newClass2:%d", newClass2.hashCode()));
	}

}
