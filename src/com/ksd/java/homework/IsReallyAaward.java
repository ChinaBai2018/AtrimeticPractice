package com.ksd.java.homework;

import java.util.Scanner;

public class IsReallyAaward {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int memberNum;
		int memberCopy;
		int one,two,three,four,sum;
		System.out.print("������4λ��Ա����:");
		memberNum = in.nextInt();
		memberCopy = memberNum;
		System.out.println("��Ա������:"+memberNum);
		four = memberNum % 10;
		memberNum /= 10;
		three = memberNum % 10;
		memberNum /= 10;
		two = memberNum % 10;
		memberNum /= 10;
		one = memberNum % 10;
		sum = one + two + three + four;
		System.out.println("ǧλ��:"+one+"\t��λ��"+two+"\tʮλ��"+three+"\t��λ��:"+four);
		System.out.println("��Ա���Ÿ�λ��֮����:"+sum);
		if(sum > 20){
			System.out.println("����Ϊ"+memberCopy+"�Ļ�Ա,��ϲ���н���,��ƷΪMp3");
		}
	}
}
