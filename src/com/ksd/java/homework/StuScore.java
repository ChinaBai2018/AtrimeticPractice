package com.ksd.java.homework;

import java.util.Arrays;
import java.util.Scanner;

public class StuScore {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//stuScores:�����ѧ���ɼ�
		double[] stuScores = new double[10];
		
		//findScore:�����ѧ���ɼ�
		double findScore;
		
		//isContinue:�Ƿ�鵽
		boolean isContinue = true;
		
		//i:stuScores�������±�
		int i = 0;
		System.out.print("������ʮλѧ���ĳɼ�:");
		
		//ѭ������
		do{
			stuScores[i++] = in.nextDouble();
		}while(i!=10);
		
		do{
			System.out.print("������Ҫ���ҵ�ѧ���ɼ�:");
			findScore = in.nextDouble();
			
			//����stuScores
			for(double score:stuScores){
				
				//findScore�Ƿ����
				if(findScore == score){
					
					//������ҵ�,��isContinue = false
					isContinue =false;
					System.out.println("����");
				}
			}
			
			if(isContinue){
				System.out.println("������Χ,����������!");
			}
			
		}while(isContinue);
		
		//����
		System.out.print("�����е�ѧ���ɼ�Ϊ:");
		for(double score:stuScores){
			System.out.print(score+"\t");
		}
		
		//����
		System.out.println();
		
		//��������
		Arrays.parallelSort(stuScores);
		
		//����
		System.out.print("�����ĳɼ�Ϊ:");
		for(double score:stuScores){
			System.out.print(score+"\t");
		}
		
	}
}
