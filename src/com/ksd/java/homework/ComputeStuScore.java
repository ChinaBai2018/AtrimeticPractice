package com.ksd.java.homework;

import java.util.Scanner;

public class ComputeStuScore {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String stuName;
		double score1;
		double score2;
		double score3;
		double score4;
		double score5;
		double avgClassScore;
		boolean isContinue = true;
		do{
			System.out.print("������ѧ������:");
			stuName = in.next();
			System.out.print("������ѧ����1�Ź��εĳɼ�:");
			score1 = in.nextDouble();
			System.out.print("������ѧ����2�Ź��εĳɼ�:");
			score2 = in.nextDouble();
			System.out.print("������ѧ����3�Ź��εĳɼ�:");
			score3 = in.nextDouble();
			System.out.print("������ѧ����4�Ź��εĳɼ�:");
			score4 = in.nextDouble();
			System.out.print("������ѧ����5�Ź��εĳɼ�:");
			score5 = in.nextDouble();
			avgClassScore = (score1+score2+score3+score4+score5)/5;
			System.out.print(stuName+"��ƽ������:"+avgClassScore);
			System.out.println("����������?(y/n)");
			if((in.next()).equals("n")){
				isContinue = false;
			}
		}while(isContinue);
		System.out.println("��лʹ��!");
	}
}
