package chapter4;

public class Q1 {

	public static void main(String[] args) {
//100~90점은 A, 89~80 = B, 79~70 = C, 69~60 = D, 나머지는 F
//int형 변수 score,char형 변수 grade사용할 것, if-else사용
		
		int score = 53;
		char grade;
		
		
		if(score >= 90) {
			grade = 'A';
		System.out.println(grade);
		}
		else if(score >= 80) {
			grade = 'B';
		System.out.println(grade);
		}
		else if(score >= 70) {
			grade = 'C';
		System.out.println(grade);
		}
		else if(score >= 60) {
			grade = 'D';
		System.out.println(grade);
		}
		else {
			grade = 'F';
		System.out.println(grade);
		}
	}
}

