package javastudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algorithm0610 {
	
	public static void main(String[] args) throws Exception, IOException {
		
	 BufferedReader br = null;

	 br = new BufferedReader(new InputStreamReader(System.in));
	 
	 int n =Integer.parseInt(br.readLine());
	 
	 br.close(); // �ݾ��ֱ�
	 
	 for(int i =1; i<n; i++) {
		 for(int j =1; j<=n-i; j++) {
			System.out.println(""); // ���� ����� ��� for ���� j�� n-i�� ����ŭ �ݺ����ָ� �ȴ� 
		 }
		 
		 for(int k =1; k<=i; k++) { //���� ������ i�� ����ŭ ��� for ���� �ܺ� for �� �Ʒ��� �ϳ� ��� �Ѵ�
			 System.out.println("*");
		 }
		 System.out.println();
		 
	 }
	}

}
