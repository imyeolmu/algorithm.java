package javastudy;


import java.util.Scanner;

public class algorithm0614 {
	

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
	 
			
			int N = in.nextInt();
			
			int num = N;
			int cnt = 0;
		
				while(true) {
//					int a = (num/10); 2
//					int b = (num%10); 6
//					int c=(a+b)%10;  8  �Ʒ��� ���� �� ���� �ִ�
			
					num=num%10*10+(num/10+num%10)%10;
					//6�� 10�� �����ְ� 60 (%10*10) 8��(num/10+num%10)%10
					cnt++;
					if(N==num) break;
				}
				System.out.println(cnt); //����Ŭ�� ������ ���    	
				
				in.close();
					
					
					
			}
			
			
			

}

    
//���� 26�̸� 2�� 6�� ���� �����Ѵ� 20���� 2�� ������� 26�� 10���� 
//���� ���� �ǰ� 6�� ������� 26�� 10���� ���� ������(b)�� �ȴ�
//2�� 6�� ���ϰ� ���� �������� �ش��ϴ� ���̴�(c)

			

	