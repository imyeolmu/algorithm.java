package javastudy;

public class algorithm0624 {

	public static void main(String[] args) {

		boolean[] check = new boolean[10001]; // 1���� 10000�̹Ƿ�

		for (int i = 1; i < 10001; i++) {
			int n = d(i);

			if (n < 10001) { // 10000 �� �Ѵ� ���� �ʿ䰡 ����
				check[n] = true;
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < 10001; i++) {
			if (!check[i]) { // false �� �ε����� ���
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}

	// n���� ���ڸ� ���� ���Ѵ�
	// n���� �����ؼ� n=33 d(n)= 39 d(d(n)) = 51(39+3+9)
	public static int d(int num) {

		int sum = num;

		while (num != 0) {
			// �� ���⸸ ���� �ߴ�,,, �𸣰ڴ� ��ƴ�,,
			sum = sum + (num % 10); // 1�� �ڸ����� ���ϴ½�
			num = num / 10; // 10�� �ڸ����� ���ϴ½�
		}
		return sum;
	}
}