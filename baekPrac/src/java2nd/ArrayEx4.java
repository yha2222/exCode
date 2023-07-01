package java2nd;

import java.util.Arrays;

public class ArrayEx4 {

	public static void main(String[] args) {
		//배열에 임의 값 원래 값 바꿔서 값 섞기
		int[] ball = new int [45];
		for(int i =0; i <ball.length; i++) {
			ball[i] = i+1;
		}
		
		int temp = 0;
		int j = 0;
		
		for(int i = 0; i < 100; i++) {
			j = (int)(Math.random() * 45);
			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}
		
		for(int i =0; i < 6; i++) System.out.println(ball[i] + " ");
		
		//배열 복사
		int[]num = {1, 2, 3, 4, 5};
		int[]newNum = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			newNum[i] = num[i];
		}
		
		//System.arraycopy() 이용한 배열 복사
		int[] num2 = {6, 7, 8, 9, 0};
		System.arraycopy(num, 2, num2, 3, 2);
		System.out.println(Arrays.toString(num2));
	}

}
