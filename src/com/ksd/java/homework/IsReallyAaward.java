package com.ksd.java.homework;

import java.util.Scanner;

public class IsReallyAaward {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int memberNum;
		int memberCopy;
		int one,two,three,four,sum;
		System.out.print("请输入4位会员卡号:");
		memberNum = in.nextInt();
		memberCopy = memberNum;
		System.out.println("会员卡号是:"+memberNum);
		four = memberNum % 10;
		memberNum /= 10;
		three = memberNum % 10;
		memberNum /= 10;
		two = memberNum % 10;
		memberNum /= 10;
		one = memberNum % 10;
		sum = one + two + three + four;
		System.out.println("千位数:"+one+"\t百位数"+two+"\t十位数"+three+"\t个位数:"+four);
		System.out.println("会员卡号各位数之和是:"+sum);
		if(sum > 20){
			System.out.println("卡号为"+memberCopy+"的会员,恭喜你中奖了,奖品为Mp3");
		}
	}
}
