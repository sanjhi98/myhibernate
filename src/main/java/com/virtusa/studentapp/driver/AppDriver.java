package com.virtusa.studentapp.driver;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.virtusa.studentapp.model.Address;
import com.virtusa.studentapp.model.Passport;
import com.virtusa.studentapp.model.Student;
import com.virtusa.studentapp.model.Trainer;

public class AppDriver {
	public static void main(String[] args) {
		/**Student st=new Student();
		st.setStudentId(503);
		st.setStudentName("Selena");
		Address addr=new Address(22,"Park Street");
		List<Address> al=new ArrayList<Address>();
		Address addr2=new Address(24,"Elm Street");
		al.add(addr);
		al.add(addr2);
		st.setAddress(al);
		Passport p=new Passport(12545,"Selena Gomez",st);
		st.setPassport(p);
		Trainer t=new Trainer(222,"Dinesh",st);
		Trainer t2=new Trainer(223,"Ron");
		Trainer t3=new Trainer(224,"Harry");
		List<Trainer> l=new ArrayList<Trainer>();
		l.add(t);l.add(t2);l.add(t3);
		st.setTrainer(l);
		*/
		Student s=new Student();
		s.setStudentId(111);
		s.setStudentName("Trina");
		Address addr=new Address(22,"Park Street");
		List<Address> al=new ArrayList<Address>();
		Address addr2=new Address(24,"Elm Street");
		al.add(addr);
		al.add(addr2);
		s.setAddress(al);
		Passport p=new Passport(12545,"Selena Gomez",s);
		s.setPassport(p);
		Student s2=new Student();
		s2.setStudentId(112);
		s2.setStudentName("Tarak");
		s2.setAddress(al);
		Passport p2=new Passport(12532,"Tim Mcgrew",s2);
		s2.setPassport(p2);
		Student s3=new Student();
		s3.setStudentId(113);
		s3.setStudentName("Tish");
		s3.setAddress(al);
		Passport p3=new Passport(13345,"Charlie Puth",s3);
		s3.setPassport(p3);
		List<Student> st=new ArrayList<Student>();
		st.add(s);st.add(s2);st.add(s3);
		
		
		
		Trainer t=new Trainer(50,"Dinesh",st);
		/*t.setTrainerId(50);
		t.setTrainerName("Dinesh");
		t.setStudent(st);*/
		Trainer t2=new Trainer(55,"Rajesh",st);
		/*t2.setTrainerId(55);
		t2.setTrainerName("Rajesh");
		t2.setStudent(st);*/
		List<Trainer> tr=new ArrayList<Trainer>();
		tr.add(t);tr.add(t2);
		
		
		
		//Session session=new Configuration().configure().buildSessionFactory().openSession();
		Session session=new Configuration().addAnnotatedClass(Student.class).configure().buildSessionFactory().openSession();
		session.beginTransaction();
		session.save(s);
		session.save(s2);
		session.save(s3);
		session.save(p);
		session.save(t);
		session.save(t2);
		session.getTransaction().commit();
		session.close();
		
	}
}
