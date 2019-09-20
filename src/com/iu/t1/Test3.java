package com.iu.t1;

public class Test3 {

	public static void main(String[] args) {
		
		double a = Math.ceil(3.001); //올림
		double b = Math.floor(3.111); //내림
		double c = Math.round(6.578); //반올림
		
		
		double d = Math.random(); // 랜덤한값 표출
		System.out.println(d);
		
		//랜덤한 0~9 사이 정수
		double e = 10*d;
		System.out.println(e);
		int f = (int)e;
		System.out.println(f);
	}

}
