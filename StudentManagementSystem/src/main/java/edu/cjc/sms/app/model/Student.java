package edu.cjc.sms.app.model;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int studentId;
	private String studentFullName;
	private String studentEmail;
	private int studentAge;
	private String studentCollegeName;
	private String batchNumber;
	private String studentCourse;
	private String batchMode;
	private String feesPaid;
	public int getStudentId() {
		return studentId;
	}
	public String getStudentFullName() {
		return studentFullName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public String getStudentCollegeName() {
		return studentCollegeName;
	}
	public String getBatchNumber() {
		return batchNumber;
	}
	public String getStudentCourse() {
		return studentCourse;
	}
	public String getBatchMode() {
		return batchMode;
	}
	public String getFeesPaid() {
		return feesPaid;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentFullName(String studentFullName) {
		this.studentFullName = studentFullName;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public void setStudentCollegeName(String studentCollegeName) {
		this.studentCollegeName = studentCollegeName;
	}
	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	public void setBatchMode(String batchMode) {
		this.batchMode = batchMode;
	}
	public void setFeesPaid(String feesPaid) {
		this.feesPaid = feesPaid;
	}
	

}
