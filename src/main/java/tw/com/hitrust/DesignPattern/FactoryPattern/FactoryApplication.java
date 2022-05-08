/**
 * @file FactoryApplication.java
 * @Create 2022年5月8日
 * @Author Frank
 * @@Description :  
 */

package tw.com.hitrust.DesignPattern.FactoryPattern;

public class FactoryApplication {
	
	public static void main(String[] args) {
		
		System.out.println("start Factory Pattern");
		
		User localUser = new LocalUser();
		User adminUser = new AdminUser();
		
		localUser.showUserName();
		adminUser.showUserName();
		
		//adminUser.AdminOnlyMethod();
	}

}
