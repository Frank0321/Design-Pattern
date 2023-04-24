/**
 * @Description : Strategy main
 * @ClassName : StrategyApplication.java
 * @Copyright : Copyright (c) 2023 
 * @ModifyHistory : 
 *  v1.00, 2023/04/24, frankchang
 *   1) First Release.
 */

package tw.com.hitrust.DesignPattern.StrategyPattern;

public class StrategyApplication {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		
		StrategyClass strategy = new StrategyClass(new AddCalculateImpl());
		System.out.println("add strategy : " + strategy.cal(a, b));
		
		strategy = new StrategyClass(new SubtractCalculateImpl());
		System.out.println("subtract strategy : " + strategy.cal(a, b));
	}

}
