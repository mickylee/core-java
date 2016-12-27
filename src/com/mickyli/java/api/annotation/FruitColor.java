package com.mickyli.java.api.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 水果颜色注解
 * @author liqian
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {

	/**
	 * 颜色枚举
	 * @author liqian
	 *
	 */
	public enum Color{RED,GREEN,BULE};
	
	/**
	 * 颜色属性
	 * @return
	 */
	Color fruitColor() default Color.BULE;
}
