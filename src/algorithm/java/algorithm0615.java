package javastudy;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class algorithm0615 {
	
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	int N = in.nextInt();
	int[] A = new int[N];
	int size = A.length;
	
	 for (int i=0; i<N; i++ ) {
		 A[i]= in.nextInt(); //�迭A�� �Է¹��� ���� �־��ֱ�
	 }
	 in.close();
		Arrays.sort(A);//Arrays.sort ������������ �������ִ� �޼ҵ� ù���� �޼ҵ�� �ּڰ� �ִ��� ������
		 System.out.println(A[0]+" "+ A[N-1]);
		 
		 

	 
	
	
	}
}