package javastudy;

import java.io.IOException;
import java.util.Scanner;

public class algorithm0627 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		// ���ڷ� �޾Ƽ�

		int N = sc.nextInt();
		// ���� ���� ���ٰ� �ؼ� trim�� ��� ������� �װſ� ��Ŀ���� ������ �־�
		// ������ ����� �ľ� ����
//		char ch.trim() = (char).N;

		String a = sc.next();
		sc.close();

		int sum = 0;

		for (int i = 0; i < N; i++) {

			sum += a.charAt(i) - '0'; // ù���� ���Һ��� �ݺ����� ���� ������ ������ �������� ���Ѵ�
			// charAt�� �ڹ��� �ε��� ���� �������� ������ ���ڿ��� �ϳ��� �����´�-> char->int�� ��ȯ�ҋ� �ƽ�Ű �ڵ尪�� �����´�
			// charAt�� �ƽ�Ű�ڵ� ���� ��ȯ�ϹǷ� �ݵ�� -48,-0�� ����� �츮�� �Է� ���� ���� �״�� ��밡���ϴ�
		}

		System.out.println(sum);

	}
}
