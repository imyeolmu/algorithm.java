package javastudy;

import java.io.IOException;
import java.util.Scanner;

public class algorithm0622 {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		// n����ŭ �迭�� �Է¹޴°Ÿ� �ؾ��ϴ°�....? �׽�Ʈ���̽��� �迭�� ���� �޴´�
		int A = in.nextInt(); // �׽�Ʈ ���̽� �� �Է¹ޱ�
		// �� �迭�� ���� �޾Ƽ� ù���� �ε�����ŭ�� �迭�� �� ������ �ϴ°ǰ�?
		// ���� �迭�� ������
		// �迭�� ���̸�ŭ �ݺ����� ������ �Ǵµ� ù���� �ε����� ����ŭ �������� �𸣰���

		for (int i = 0; i < A; i++) {
			int[] N = new int[in.nextInt()];// �л��� �Է¹ޱ�
			int sum = 0;
			int avg = 0;
			int standard_cnt = 0;// ����̻��� �л���
			float statand_avg = 0; // ��� ���� ���� ���� �л��� ����

			for (int j = 0; j < N.length; j++) {
				N[j] = in.nextInt();
				{ // N�迭�� ���̸�ŭ �ݺ����� ������ N�迭�� �����Ѵ�
					sum += N[j];// �л����� ������ sum ������ �����Ѵ�
				}
				avg = sum / (N.length);

				for (int k = 0; k < N.length; k++)
					// ������.�л����� ����Ͽ� ��������� avg�� �����Ѵ�
					if (N[k] > avg) {
						standard_cnt++; // ��� �������� ����(�ʰ�) �л� ���� standard_cnt ������ ����
					}
			}

			float standard_avg = (float) standard_cnt / N.length * 100;// �Ҽ��� �¤��ڸ����� ����ؾ��ϹǷ� �л���(standard_cnt)�� �Ǽ������� ��ȯ
																		// �ϰ�
			// ��� �������� ���� �л� ��/���л����� ����ϰ� 100�� �����ָ� ��ճѴ� �л��� ������ �˾Ƴ����ִ�
			System.out.println(String.format("%.3f", standard_avg) + "%");
			// ���� ���������� String.format�� ����Ͽ� �Ҽ��� 3�ڸ����� ǥ���Ѵ�
		}
	}
}