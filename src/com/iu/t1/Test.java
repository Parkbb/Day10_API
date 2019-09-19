package com.iu.t1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//스캐너를 사용..
		//주민등록번호 입력 991122-1234567
		
		//나이
		//계절
		//성별
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호 입력");
		String number = sc.next();
		//123456-1234567
		String year = number.substring(0, 2);
		String month = number.substring(2, 4);
		String sex = number.substring(7, 8);
		
		
		int old = 2020-(1900+Integer.parseInt(year));
		int old2 = old-100;
		int season = Integer.parseInt(month);
		int se = Integer.parseInt(sex);
		
		
		//나이출력
		if(se==1 || se==2 || se==5 || se==6) {
			System.out.println("나이 : "+old);
		}else {System.out.println("나이 : "+old2);}
		
		
		//출생계절
		if(season==12||season<3) {
			System.out.println("겨울");
		}else if(season==3 || season == 4 || season ==5){
			System.out.println("봄");
		}else if(season==6 || season==7 || season==8) {
			System.out.println("여름");
		}else {
			System.out.println("가을");
		}
		
		//성별출력구간
		if(se%2==1) {
			System.out.println("성별 : 남자");
		}else {
			System.out.println("성별 : 여자");
		}
		//old = 2019 - year;  
		//뒷자리가 1,2,5,6 이면 1900년 이후
		//뒷자리가 3,4,7,8 이면 2000년 이후
		//앞자리 앞에서 3,4번째 수 따서 03 04 05 면 봄,,,,
		//8번째 자리 찾아서 1,3,5,7 이면 남자 2,4,6,8 이면 여자
		
		//1 2 5 6 3 4 7 8
	}
}
