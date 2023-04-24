/**
 * @Description : 實作 Calculate
 * @ClassName : AddCalculateImpl.java
 * @Copyright : Copyright (c) 2023 
 * @ModifyHistory : 
 *  v1.00, 2023/04/24, frankchang
 *   1) First Release.
 */

package tw.com.hitrust.DesignPattern.StrategyPattern;

public class AddCalculateImpl implements ICalculate{

	@Override
	public int calculate(int a, int b) {
		return a+ b;
	}

}
