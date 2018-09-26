package com.ksd.java.homework;

import java.util.Arrays;
import java.util.Scanner;

public class StuScore {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//stuScores:数组存学生成绩
		double[] stuScores = new double[10];
		
		//findScore:所查的学生成绩
		double findScore;
		
		//isContinue:是否查到
		boolean isContinue = true;
		
		//i:stuScores的数组下标
		int i = 0;
		System.out.print("请输入十位学生的成绩:");
		
		//循环输入
		do{
			stuScores[i++] = in.nextDouble();
		}while(i!=10);
		
		do{
			System.out.print("请输入要查找的学生成绩:");
			findScore = in.nextDouble();
			
			//遍历stuScores
			for(double score:stuScores){
				
				//findScore是否存在
				if(findScore == score){
					
					//如果查找到,则isContinue = false
					isContinue =false;
					System.out.println("存在");
				}
			}
			
			if(isContinue){
				System.out.println("超出范围,请重新输入!");
			}
			
		}while(isContinue);
		
		//遍历
		System.out.print("数组中的学生成绩为:");
		for(double score:stuScores){
			System.out.print(score+"\t");
		}
		
		//换行
		System.out.println();
		
		//数组排序
		Arrays.parallelSort(stuScores);
		
		//遍历
		System.out.print("排序后的成绩为:");
		for(double score:stuScores){
			System.out.print(score+"\t");
		}
		
	}
}
