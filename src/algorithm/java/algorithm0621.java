package javastudy;

import java.io.IOException;
import java.util.Scanner;

public class algorithm0621 {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in); /// 

		/*
		 * �迭���� ��� �迭���� �Է� �Էµȹ迭���� �� �迭���� �Է°��� o�̸� 1�� ����:2�� �ƴϸ� 0�� +1�� �ȴ� �迭���� x �� 0��
		 * 
		 */

		String[] arr = new String[in.nextInt()]; // N��ŭ �Է¹ޱ�... ?

		// n����ŭ �迭�� �Է¹޴°Ÿ� �ؾ��ϴ°�....?
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.next();// �ٽ� �޾ƾ��ϴµ�... �迭��

		}
		in.close(); // �ϴ� �迭 �ޱ�

		// ���� �迭�� ������
		for (int i = 0; i < arr.length; i++) { // �迭�� ���̸�ŭ �ݺ����� ������ �Ǵµ�

			int cnt = 0; // ���� Ƚ��
			int sum = 0;// �����ջ�

			for (int j = 0; j < arr[i].length(); j++) { // ���� i�� �迭��ŭ �ݺ����� ������

				if (arr[i].charAt(j) == 'O') { // O�̸� �������� �ջ��Ѵ�

					cnt++;
				}

				else {
					cnt = 0; // o�� �ƴϸ� cnt�� 0�̴�
				}
				sum += cnt;
			}

			System.out.println(sum);
		}
	}
}