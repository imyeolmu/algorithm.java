package javastudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algorithm0618 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[10]; // 0���� 9���� üũ�� ���� 10�� int �迭�� ����

		int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		// val�� readline ���� ���� ���� ���ؼ� �����Ѵ� int �� string ���� ��ȯ
		String str = String.valueOf(val);

		for (int i = 0; i < str.length(); i++) {// for���� �̿��ؼ� ���ڰ��� �����Ѵ�
			arr[(str.charAt(i) - 48)]++; // index���� 1���� ��Ų��
		}

		for (int v : arr) { // �迭 ���ҿ� ����� ��� ���� ����ϱ�
			System.out.println(v);
		}

	}
}
