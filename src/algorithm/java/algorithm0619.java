package javastudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algorithm0619 {

	public static void main(String[] args) throws IOException {

		// �迭 �̿��ؼ� Ǯ���ϱ�
		// 42�� ������ �� �������� �� �� �ִ� ���� 0~41�̴�
		// ���̰� 42�� boolean�迭�� �����Ѵ�-> boolean �迭�� ����Ʈ���� false�̴�
		boolean arr[] = new boolean[42];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i <= 10; i++) {
			arr[Integer.parseInt(br.readLine()) % 42] = true;// ������ ���� �ε����� ���������� �ٲ��� �Է��� ����Ǹ� true���� �迭������ ������ �����ش�

		}
		int count = 0;
		for (boolean value : arr) {
			if (value) { // value�� true�̸�
				count++;

			}

		}

		System.out.println(count);

	}
}

/*
 * hashset�� ����Ҽ��� �ִ� // hashset�� ó�� ��ü�� �����ҋ� hashset Integer������ �����߱⶧���� int��
 * Integer������ ��ü�� �־���Ѵ� �ߺ��Ǵ� ���� �������� true �ߺ��Ǿ� ������ �ȵǸ� false �ߺ�����Ұ��� ���������� �����Ƿ�
 * ���Ľÿ��� ����Ʈ�� ��ȯ�Ŀ� �����ؾ��Ѵ�
 *
 * HashSet<Integer> h =new HashSet<Integer>(); for (int i =0; i<10; i++){
 * h.add(in.nextInt()%42); } in.close(); System.out.print(h.size());// size
 * ����Ǿ��ִ� ������ ����
 * 
 */
