package java2nd;

import javax.swing.JOptionPane;

public class ArrayEx16 {

	public static void main(String[] args) {
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;		//사용자 입력 저장 공간
		String temp = "";	//사용자 입력을 저장할 임시 공간
		int count = 0;		//시도횟수 세기 위한 공간
		
		do {
			count++;
			temp = JOptionPane.showInputDialog("1~100사이의 숫자를 입력하세요" + "끝내려면 -1을 입력하세요.");
			
			//사용자가 취소버튼을 누르거나 -1을 입력하면 do-while문을 벗어난다.
			if(temp == null ||temp.contentEquals("-1")) break;
			System.out.println("입력값: " + temp);
			
			//사용자 입력을 문자열로 받아오기 때문에 int로 변환해주어야 함
			input = Integer.parseInt(temp);
	}while(true);//임의작성 실행XXX
		
 }
}

