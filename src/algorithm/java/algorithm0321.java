package algorithm.java;

import java.util.Scanner;
//���� 2573�� ����
public class algorithm0321 {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int A = in.nextInt();
	
	in.close();
	
	
    if(A%4==0) {
    	//4�� ��� �ϰ��
    	if(A%400==0) System.out.println("1");
    	//4�� ��� �̸鼭 400�� ��� �� ���
    	else if(A%100==0) System.out.println("0");
    	//4�� ��� �̸� �� 100�� ��� �� ���
    	else System.out.println("1");
    	//4�� ��� �� ���
    }
    else System.out.println("0");
    //4�� ����� �ƴ� ��� 
    }
    	
    }


	/*����: 4�� ����� �������� 1�� ����ϳ� 100�� ����� ��� ������ �ƴ϶�
	 * 0�� �����ؾ��Ѵ�
	 * 4�� ������� ���� �ľ�,400���� ������ ����������.100���� ������������ Ȯ��
	 * ���� �����ڸ� ��ø���� Ǯ ���� ����
	 * System.out.println(A%400==0)?(A%400==0)?"1");:(A%100==0)?"0";"1"):"0");
	 */
	