package javastudy;

public class algorithm0623 {

	long sum(int[] a) {
		long hap = 0; // ���� �ʱ�ȭ �κп��� int�� �ְԵǸ� ���� ���� ����ǳ�
		for (int i = 0; i < a.length; i++) // return�� �ް� �Ǹ�
			// �迭�� ũ�Ⱑ 3,000,000�̰� �迭�� �� ������ �ִ�ũ��� 1,000,000�̱� ������ �Ѵ°�� long���� ����
			hap += a[i];

		return hap;
	}

}
// Ŭ���� test��� �ߴµ� �̰� public class Test�� �ϸ�ǰ�
//		long N[] = new long[in.next()]; // long������ ���������
//		int sum = 0;
//			sum += N[i];
//		for (int i = 0; i <= N.length; i++) {
//			 
