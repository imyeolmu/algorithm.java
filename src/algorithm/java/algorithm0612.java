package javastudy;


import java.util.Scanner;

public class algorithm0612 {
	

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
	 
			while(true) { // ���ѷ��� ���� ���ص� 
			
			int A = in.nextInt();
			int B = in.nextInt();//�׽�Ʈ ���̽��� �Է¹ް� 
	  
			if(A==0 && B==0) { // A�� B�� 0�� ��� &&�� ���� break�� �ݺ����� ����������
				in.close();
				break; 
			}
			
			System.out.println(A+B);
			}
		}
	
	}
