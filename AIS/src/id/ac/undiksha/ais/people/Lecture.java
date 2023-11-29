package id.ac.undiksha.ais.people;

public class Lecture extends Human{
	private String lectureId;
	private String faculty;
	private String dept;
	private String studyP;
	
	
	public Lecture() {
		this.lectureId = "Plase insert Lecture Id";
		this.faculty = "Please insert Faculty";
		this.dept = "Please insert Departement";
		this.studyP = "Please insert Study Program";
	}



	public Lecture(String name, String birthDate, boolean gender, String address, String lectureId, String faculty,
			String dept, String studyP) {
		super(name, birthDate, gender, address);
		this.lectureId = lectureId;
		this.faculty = faculty;
		this.dept = dept;
		this.studyP = studyP;
	}





	public String getLectureId() {
		return lectureId;
	}




	public void setLectureId(String lectureId) {
		this.lectureId = lectureId;
	}




	public String getFaculty() {
		return faculty;
	}




	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}




	public String getDept() {
		return dept;
	}




	public void setDept(String dept) {
		this.dept = dept;
	}




	public String getStudyP() {
		return studyP;
	}




	public void setStudyP(String studyP) {
		this.studyP = studyP;
	}




	public void printAll() {
		super.printAll();
		System.out.println(this.lectureId);
		System.out.println(this.faculty);
		System.out.println(this.dept);
		System.out.println(this.studyP);
	}

}
