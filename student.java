package com.motivity2;

public class student2 {
	private int studentId;
	private String studentSurName;
	private String studentName;
	private String studentClg;
	public student2() {
		
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + "studentSurName="+studentSurName+", studentName=" + studentName + ", studentClg=" + studentClg
				+ "]";
	}
	public String getStudentSurName() {
		return studentSurName;
	}

	public void setStudentSurName(String studentSurName) {
		this.studentSurName = studentSurName;
	}

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}	
	public String getStudentName() {
		return studentName;
	}
	public String getStudentClg() {
		return studentClg;
	}
	public void setStudentClg(String studentClg) {
		this.studentClg = studentClg;
	}

}
