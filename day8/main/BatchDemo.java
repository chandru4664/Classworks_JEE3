package com.htc.day8.main;

import java.util.ArrayList;
import java.util.List;

import com.htc.day8.DAO.StudentDAO;
import com.htc.day8.DAO.StudentDAOImpl;
import com.htc.day8.entity.Student;

public class BatchDemo {
public static void main(String[] args) {
	List<Student> stuList=new ArrayList<Student>();
	stuList.add(new Student("s10446","Martin","Android"));
	stuList.add(new Student("s10478","Sasha","oracle"));
	stuList.add(new Student("s10490","smith","AWS"));
	StudentDAO dao=new StudentDAOImpl();
	dao.storeStudents(stuList);
}
}
