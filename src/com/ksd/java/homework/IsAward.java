package com.ksd.java.homework;

import java.util.Scanner;

public class IsAward {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] memberNum = new int[4];  
		int sum;
		int i = 0;
		System.out.print("��������λ��Ա����:");
		do{
			memberNum[i++] = in.nextInt();
		}while(i!=4);
		System.out.print("��Ա������:");
		for(int index:memberNum){
			System.out.print(index);
		}
		System.out.println();
		System.out.println("ǧλ��:"+memberNum[0]+"\t��λ��"+memberNum[1]+"\tʮλ��"+memberNum[2]+"\t��λ��:"+memberNum[3]);
		sum = memberNum[0]+memberNum[1]+memberNum[2]+memberNum[3];
		if(sum > 20){
			System.out.println("����Ϊ"+memberNum[0]+memberNum[1]+memberNum[2]+memberNum[3]+"�Ļ�Ա����ϲ���н��ˣ���Ʒ��Mp3");
		}
	}
}
