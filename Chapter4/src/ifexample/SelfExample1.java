package ifexample;

public class SelfExample1 {

	public static void main(String[] args) {
		{
		int score = 90; 
		
		char grade = (score >= 90) ? 'A' : 'B';
		System.out.println(grade);
		}
		{
		int score = 85; 
		
		String grade = (score >= 90) ? "A" : "B";
		System.out.println(grade);
		}
	}

}
