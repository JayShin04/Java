package ex;

public class Ex01 {

	public static void main(String[] args) {
		
		// 배열
		// 1. 배열은 만들때 크기가 정해져야 한다.
		// 2. 값의 순서가 정해져 있다.
		
		
		// 시험 점수 5개 저장
		// 저장할 값들이 미리 정해진 경우
		int[] scores = {90, 95, 80, 100, 85};
		
		// 저장할 값이 정해지지 않고 공간만 확보하고 싶을 때
		int[] numbers = new int[10];
		
		System.out.println(scores[2]);
		System.out.println(scores[1]);
		
		scores[4] = 92;
		
		int index = 2;
		System.out.println(scores[index + 2]);
		
//		System.out.println(scores[6]);
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		
	}

}
