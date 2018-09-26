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
			System.out.print("请输入学生姓名:");
			stuName = in.next();
			System.out.print("请输入学生第1门功课的成绩:");
			score1 = in.nextDouble();
			System.out.print("请输入学生第2门功课的成绩:");
			score2 = in.nextDouble();
			System.out.print("请输入学生第3门功课的成绩:");
			score3 = in.nextDouble();
			System.out.print("请输入学生第4门功课的成绩:");
			score4 = in.nextDouble();
			System.out.print("请输入学生第5门功课的成绩:");
			score5 = in.nextDouble();
			avgClassScore = (score1+score2+score3+score4+score5)/5;
			System.out.print(stuName+"的平均分是:"+avgClassScore);
			System.out.println("继续输入吗?(y/n)");
			if((in.next()).equals("n")){
				isContinue = false;
			}
		}while(isContinue);
		System.out.println("感谢使用!");
	}
}
