package algorithm.java;

import java.util.Scanner; 
//����: ���� 1330�� 
public class algorithm0320 {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	//Scanner ��ü ����-in,input,sc,scan�� ��ü�� ��
	//system.in�� ������(����ڷκ��� �Է¹ޱ� ���� ��Ʈ��)
	
	int A = in.nextInt();
	int B = in.nextInt();
	//Scanner�� �Է� �޼ҵ� int �� �Է� �� ����
	in.close();
	
	if(A>B) System.out.println(">");
	else if(A<B) System.out.println("<");
	else System.out.println("==");
}
	
}

 /*  Scanner Ŭ���� Ư¡
  *  �⺻���� ������ Ÿ�Ե��� Scanner�� �޼ҵ带 ����Ͽ� �Է�
  *  Scanner�� ���� util��Ű���� ����� Scanner Ŭ������ ȣ��-lang��Ű���� �ƴϸ� import�� ���� ȣ��
  *  ����(����) �� ����(�� �ٲ�)�� �������� �д´�
*/