package classpart;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "�̼���");
		studentLee.address = "����� �������� ���ǵ���";
		
		Student studentKim = new Student(101, "������");
		studentKim.address = "�̱� ��ȣ��";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
	}

}
