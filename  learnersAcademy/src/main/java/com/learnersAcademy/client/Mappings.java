package com.learnersAcademy.client;

import java.util.List;

import org.hibernate.Session;

import com.learnersAcademy.entity.Batch;
import com.learnersAcademy.entity.Student;
import com.learnersAcademy.entity.Subject;
import com.learnersAcademy.entity.Teacher;
import com.learnersAcademy.util.HibernateUtil;

public class Mappings {

	public static void main(String[] args) {
			
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			
			
			Subject subject = new Subject("Java");
			Batch batch = new Batch(1,subject);
			Teacher teacher = new Teacher("T112","Manish",subject);
			
			Student sam = new Student("118","Sam",batch);
			
			session.save(batch);
			session.save(subject);
			session.save(teacher);
			session.save(sam);

			session.getTransaction().commit();
			
			session.close();
		}

}
