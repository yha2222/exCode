package java2nd;

import javax.swing.JOptionPane;

public class ArrayEx16 {

	public static void main(String[] args) {
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;		//����� �Է� ���� ����
		String temp = "";	//����� �Է��� ������ �ӽ� ����
		int count = 0;		//�õ�Ƚ�� ���� ���� ����
		
		do {
			count++;
			temp = JOptionPane.showInputDialog("1~100������ ���ڸ� �Է��ϼ���" + "�������� -1�� �Է��ϼ���.");
			
			//����ڰ� ��ҹ�ư�� �����ų� -1�� �Է��ϸ� do-while���� �����.
			if(temp == null ||temp.contentEquals("-1")) break;
			System.out.println("�Է°�: " + temp);
			
			//����� �Է��� ���ڿ��� �޾ƿ��� ������ int�� ��ȯ���־�� ��
			input = Integer.parseInt(temp);
	}while(true);//�����ۼ� ����XXX
		
 }
}

