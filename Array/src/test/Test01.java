package test;

public class Test01 {

	public static void main(String[] args) {
		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
//		1. 배열 값 접근
//		배열의 4번째 값을 6으로 바꾸세요.
		numbers[3] = 6;
		
//		2. 배열 출력
//		배열에 값을 순서대로 출력하세요.
//		출력 예시
//
//		3 8 9 6 2 1 7 5
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
//		3. 배열 출력
//		배열에 값을 반대 순서(역순)로 출력하세요.
//		출력 예시
//
//		5 7 1 2 6 9 8 3 
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
//		4. 배열 출력
//		배열에 짝수번째 위치에 있는 값들을 출력 하세요.
//		출력 예시
//
//		8 6 1 5 
		for (int i = 0; i < numbers.length; i++) {
			if (i % 2 == 1) {
				System.out.print(numbers[i] + " ");
			}
		}
		System.out.println();
		
//		5. index
//		배열에 값들 중 2가 저장된 index를 출력하세요.
//		출력 예시
//
//		2가 저장된 index : 4
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 2) {
				System.out.println("2가 저장된 index : " + i);
			}
		}
		
//		6. 최대값
//		배열에 값들 중 가장 큰 값을 출력 하세요
//		출력 예시
//
//		가장 큰 값 : 9
		int maximum = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (maximum < numbers[i]) {
				maximum = numbers[i];
			}
		}
		System.out.println("가장 큰 값 : " + maximum);
		
//		7. 최소값 index
//		배열에 값들 중 가장 작은 수가 저장된 index를 출력하세요.
//		출력 예시
//
//		최소값의 index : 5
		int minimumIndex = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[minimumIndex] > numbers[i]) {
				minimumIndex = i;
			}
		}
		System.out.println("최소값의 index : " + minimumIndex);
		
//		8. 합계
//		배열에 모든 수의 합을 출력 하세요
//		출력 예시
//
//		값의 합 : 41
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("값의 합 : " + sum);
	}

}
