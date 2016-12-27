package com.mickyli.java.api.annotation;

import com.mickyli.java.api.annotation.FruitColor.Color;

/**
 * 注解的使用
 * @author liqian
 *
 */
public class Apple {

	@FruitName("Apple")
    private String appleName;
    
    @FruitColor(fruitColor=Color.RED)
    private String appleColor;
    
    @FruitProvider(id=1,name="烟台红富士",address="山东烟台栖霞市")
    private String appleProvider;

	public String getAppleName() {
		return appleName;
	}

	public void setAppleName(String appleName) {
		this.appleName = appleName;
	}

	public String getAppleColor() {
		return appleColor;
	}

	public void setAppleColor(String appleColor) {
		this.appleColor = appleColor;
	}

	public String getAppleProvider() {
		return appleProvider;
	}

	public void setAppleProvider(String appleProvider) {
		this.appleProvider = appleProvider;
	}
    
    
}
