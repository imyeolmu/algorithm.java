package javastudy;

import java.util.Scanner;

public class algorithm0617 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int value = (in.nextInt() * in.nextInt() * in.nextInt()); // �Է°� ���ÿ� �����༭ value�� ����
		String str = Integer.toString(value);// int���� string ������ ��ȯ
		in.close();

		for (int i = 0; i < 10; i++) { // �ݺ�
			int count = 0; // ���� 0���� �ʱ�ȭ
			for (int j = 0; j < str.length(); j++) {// ����for��
				if ((str.charAt(j) - '0') == i) {
					count++;
				}

			}
			System.out.println(count);
		}

	}
}