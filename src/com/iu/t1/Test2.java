package com.iu.t1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//주민등록번호입력 991222-1234567
		//9   7 	1	2	2	2	1	2	3	4	5	6	7(최종검증)
	//1. x2  x3   x4  *5  *6   *7  *8  *9  *2  *3  *4  *5 
	//2. 18 + 21 + 4 + 10 +12 + 14 +8 + 18 + 6+ 12 +20 + 30 = 173
	//3. 173 / 11 --몫 15 나머지 8
		
	//4. 11 - 나머지 (8) = 결과값 (3)
	//4-1. 결과값이 두자리라면
		//결과값 / 10 --- 나머지 결과값으로 대입
	//5. 결과값 == 검증용번호
		int check=0;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		String number = "971222-1234567";
		String num = number.substring(0, 6) + number.substring(7, 13);
		System.out.println(num);
		for(int i=0;i<num.length();i++) { //*9 다음에 *2 나오게 어떻게?
			char a = num.charAt(i);
			String b = Character.toString(a);
			if(i<8) {
			sum = Integer.parseInt(b)*(i+2);
			}else {
				sum = Integer.parseInt(b)*(i-6);
			}
			check = check + sum;
			
		}
	}
}
