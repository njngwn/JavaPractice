package collection.hashset;

import java.util.HashSet;

public class Student {
	String studentId;
	String studentName;

	private HashSet<Student> hashSet;

	public Student() {
		hashSet = new HashSet<Student>();
	}

	public Student(String studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	   public String toString() {
	      return getStudentId()+":"+getStudentName();
	   }
	   
	@Override
	public int hashCode() {
		return Integer.parseInt(studentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			if (this.studentId.equals(student.studentId)) {
				return true;
			} else
				return false;
		}
		return false;
	}

//	public void add(Student student) {
//		hashSet.add(student);
//	}
//	
//	public void showAllStudents() {
//		for(Student student : hashSet) {
//			System.out.println(student);
//		}
//		System.out.println();
//	}
}
