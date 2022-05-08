/**
 * @file LocalUser.java
 * @Create 2022年5月8日
 * @Author Frank
 * @@Description :  
 */

package tw.com.hitrust.DesignPattern.FactoryPattern;

public class LocalUser implements User {

	@Override
	public void showUserName() {
		System.out.println("我是本地端使用者");
	}

	@Override
	public String showUserFeatures() {
		return "Show local Features";
	}

}
