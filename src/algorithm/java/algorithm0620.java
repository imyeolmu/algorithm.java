package javastudy;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class algorithm0620 {

	public static void main(String[] args) throws IOException {

		Scanner N = new Scanner(System.in); /// �߿� ���������� �ֱ� ������ int�� �ƴ� double���� ����Ѵ� - �ڵ�����ȯ�� �Ǹ鼭 �ڷ����� ū������ ��ȯ�Ѵ�

		int[] arr = new int[N.nextInt()];// �迭�� �Է¹������� ���ȿ� nextInt�� ���ش�

		for (int i = 0; i < arr.length; i++) { // �迭�� ������ arr�� �ٽ� ��´�
			arr[i] = N.nextInt();

		}
		N.close();

		int sum = 0;
		Arrays.sort(arr);// ���Ҹ� �޾Ƽ� �����Ѵ�- �ִ��� �迭�� �����������̴�

		for (int i = 0; i < arr.length; i++) {
			sum += ((arr[i] / arr[arr.length - 1]) * 100);

		}
		System.out.println(sum / arr.length);
	}
}