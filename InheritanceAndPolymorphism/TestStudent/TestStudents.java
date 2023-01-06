package TestStudent;

public class TestStudents {

	
	public static void main(String[] args) {
		
		Student[] roster = new Student[5];
		
		roster[0] = new GraduateStudent();
		roster[1] = new UndergraduateStudent();
		roster[2] = new UndergraduateStudent();
		roster[3] = new GraduateStudent();
		roster[4] = new GraduateStudent();
		
		for (int i = 0; i < roster.length; i++) {
			roster[i].setTestScore(1, 70);
			roster[i].setTestScore(2, 70);
			roster[i].setTestScore(3, 70);			
		}
		
		for (int i = 0; i < roster.length; i++) {
			roster[i].computeCourseGrade();
		}

	}

}
