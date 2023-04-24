/**
 * @Description : 策略模式定義的方法
 * @ClassName : StrategyClass.java
 * @Copyright : Copyright (c) 2023 
 * @ModifyHistory : 
 *  v1.00, 2023/04/24, frankchang
 *   1) First Release.
 */

package tw.com.hitrust.DesignPattern.StrategyPattern;

public class StrategyClass {
	
	private ICalculate iCalculate;
	
	public StrategyClass(ICalculate iCalculate) {
		this.iCalculate = iCalculate;
	}

	public int cal(int a, int b) {
		return iCalculate.calculate(a, b);
	}
}
