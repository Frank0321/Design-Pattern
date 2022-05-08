/**
 * @file AdminUser.java
 * @Create 2022年5月8日
 * @Author Frank
 * @@Description :  
 */

package tw.com.hitrust.DesignPattern.FactoryPattern;

public class AdminUser implements User {

	@Override
	public void showUserName() {
		System.out.println("老子是超級使用者");
	}

	@Override
	public String showUserFeatures() {
		return "Show All of Features";
	}
	
	public String AdminOnlyMethod() {
		return "Admin User Only Method";
	}
}
