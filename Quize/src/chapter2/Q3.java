package chapter2;

public class Q3 {

	public static void main(String[] args) {

		int bNum = 10;
		double iNum = 2.0;
		
		int aNum1 = (int)bNum + (int)iNum;
		int aNum2 = (int)(bNum + iNum);
		System.out.println(aNum1);
		System.out.println(aNum2);
		
		int aNum3 = (int) ((double)bNum + (double)iNum);
		System.out.println(aNum3);
	}

}
