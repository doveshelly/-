package com.itheima.test19;

import java.util.Scanner;

public class TestOne extends Performance{
	@Override
	public double incom(int money) {
		if (money<=1000) {
			return 0;
		} else if (money<=3500) {
			return money*0.02;
		} else if (money<=6000) {
			return money*0.05;
		} else {
			return money*0.1;
		}
		
	}
}
