package com.ksd.java.homework;

import java.util.Scanner;

public class IsAward {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] memberNum = new int[4];  
		int sum;
		int i = 0;
		System.out.print("请输入四位会员卡号:");
		do{
			memberNum[i++] = in.nextInt();
		}while(i!=4);
		System.out.print("会员卡号是:");
		for(int index:memberNum){
			System.out.print(index);
		}
		System.out.println();
		System.out.println("千位数:"+memberNum[0]+"\t百位数"+memberNum[1]+"\t十位数"+memberNum[2]+"\t个位数:"+memberNum[3]);
		sum = memberNum[0]+memberNum[1]+memberNum[2]+memberNum[3];
		if(sum > 20){
			System.out.println("卡号为"+memberNum[0]+memberNum[1]+memberNum[2]+memberNum[3]+"的会员，恭喜你中奖了，奖品是Mp3");
		}
	}
}
