package test;

import java.util.Random;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
//		1. 위치 변경 (swap)
//		두 개의 index를 입력 받아서, 해당하는 index의 값을 서로 교체 해서 배열을 출력하세요.
		int[] numbers = {3, 5, 2, 10, 39};
//		입력 예시
//
//		두 개의 index를 입력 하세요 : 2 4
//		출력 예시
//
//		3 5 39 10 2 
		Scanner scan = new Scanner(System.in);
		System.out.print("두 개의 index를 입력하세요 : ");
		int index1 = scan.nextInt();
		int index2 = scan.nextInt();
		if (index1 < 0 || index1 > 5 || index2 < 0 || index2 > 5) {
			System.out.println("ERROR!!");
		}
		else {
			int tempValue = numbers[index1];
			numbers[index1] = numbers[index2];
			numbers[index2] = tempValue;
			for (int i = 0; i < numbers.length; i++) {
				System.out.print(numbers[i] + " ");
			}
			System.out.println();
		}
		
//		2. 셔플
//		1 ~ 10 까지 차례로 저장된 배열을 만들고, 순서를 뒤 섞어서 그 결과를 출력 하세요.
//		힌트
//		rand.nextInt() 함수를 이용해서, 0번째 index의 값과 rand.nextInt() 번째 index의 값의 서로 교체 하면 된다.
//
//		Random rand = new Random();
//
//		for (int i = 0; i < 100; i++) {
//		    int randomNumber = rand.nextInt(10);
//		    // swap 구현
//		}
//		출력 예시
//
//		4 5 7 8 9 1 3 6 2 10
		int[] numberList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Random rand = new Random();
		for (int i = 0; i < 100; i++) {
			int randomNumber = rand.nextInt(10);
			int tempValue = numberList[0];
			numberList[0] = numberList[randomNumber];
			numberList[randomNumber] = tempValue;
		}
		//출력
		for (int i = 0; i < numberList.length; i++) {
			System.out.print(numberList[i] + " ");
		}
		System.out.println();
		
//		3. 없는 수 찾기
//		아래 배열에 1 ~ 9 의 숫자들이 들어있는데 하나의 수가 빠져 있다.
//		빠진 수를 찾아서 출력하세요.
		int[] numbers2 = {4, 6, 3, 8, 2, 9, 1, 5};
//
//		출력 예시
//
//		없는 수는 7 입니다 
		int noNumber = 0;
		for (int findNumber = 1; findNumber <= 9; findNumber++) {
			for (int i = 0; i < numbers2.length; i++) {
				if (numbers2[i] == findNumber) {
					noNumber = numbers2[i];
					break;
				}
			}
			if (noNumber != findNumber) { 
				// 위의 for문을 한바퀴 다 돌았을 때, 
				// 같은 숫자일때 업데이트 되는 noNumber의 숫자가
				// 찾고자하는 숫자랑 같지 않을때
				// for문 종료 (없는숫자)
				noNumber = findNumber; //없는 숫자 업데이트
				break;
			}
		}
		System.out.println("없는 수는 " + noNumber + " 입니다");
//		4. 빈도수 구하기
//		1 ~ 5 범위 안에 숫자가 배열에 중복되어 저장 되어 있다.
//		1 ~ 5 까지의 숫자가 각각 몇 개씩 저장 되어 있는지 출력 하세요.
		int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
//
//		출력 예시
//
//		1 : 2
//		2 : 3
//		3 : 3
//		4 : 1
//		5 : 1
		int[] numberCount = new int[5];
		for (int i = 0; i < numbers3.length; i++) {
			numberCount[numbers3[i]-1]++;
		}
		for (int i = 0; i < numberCount.length; i++) {
			System.out.println(i+1 + " : " + numberCount[i]);
		}
		
	}

}
