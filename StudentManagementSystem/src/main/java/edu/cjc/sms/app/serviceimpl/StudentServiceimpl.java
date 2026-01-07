package edu.cjc.sms.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cjc.sms.app.model.Student;
import edu.cjc.sms.app.repositary.StudentRepositary;
import edu.cjc.sms.app.servicei.StudentServicei;

@Service
public class StudentServiceimpl implements StudentServicei{

	@Autowired StudentRepositary sr;
	@Override
	public void saveStudentDetails(Student st) {
		sr.save(st);
		
		
	}

}
