package javastudy;


import java.util.Scanner;

public class algorithm0611 {
	

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
	 
			int N = in.nextInt();
			int X = in.nextInt();
			int arr[] = new int[N];
	        
			for (int i = 0; i < N; i++) {
				arr[i] = in.nextInt(); // arr�� �ִ� �迭�� ���� 
			}
	 
			in.close();
	        
			for (int i = 0; i < N; i++) {
				if (arr[i] < X) { //arr�� �ִ� �迭�� ������ x�� ���Ͽ� ����Ѵ� 
					System.out.print(arr[i] + " ");
				}
			}
		}
	}
