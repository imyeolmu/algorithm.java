package javastudy;

import java.util.Scanner;

public class algorithm0616 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int[] A = new int[9];
		int size = A.length;
		int max = 0;
		int cnt = 0;

		for (int i = 0; i < 9; i++) {
			A[i] = in.nextInt(); // �迭A�� �Է¹��� ���� �־��ֱ�
		}
		for (int i = 0; i < 9; i++) { // ���� �迭�� ���� max���� ����Ŭ ���� ����Ѵ�
			if (A[i] > max) {
				max = A[i];
				cnt = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(cnt);
	}
}
