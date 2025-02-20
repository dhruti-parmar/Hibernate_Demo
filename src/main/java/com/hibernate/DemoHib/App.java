package com.hibernate.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Laptop;
import com.hibernate.model.Student;

/**
 * Hello world!
 *
 */

public class App
{
    public static void main(String[] args )
    {
//        User user = new User();
//        UserName uname = new UserName();
//        uname.setFname("Hemu");
//        uname.setLname("Rathod");
//        uname.setMname("Kishorbhai");
//
//        user.setId(102);
//        user.setName(uname);
//        user.setAge(21);
//
//        Configuration cfg = new Configuration();
//        cfg.configure().addAnnotatedClass(User.class);
//
//        SessionFactory sf = cfg.buildSessionFactory();
//
//        Session session = sf.openSession();
//
//        Transaction tx = session.beginTransaction();
//
//        session.persist(user);
//
//        user = session.get(User.class, 101);
//
//        tx.commit();
//
//        System.out.println(user);

    	Laptop laptop = new Laptop();
    	laptop.setId(101);
    	laptop.setLname("Dell");

    	Student stud = new Student();
    	stud.setName("Dhruti");
    	stud.setRollno(1);
    	stud.setMarks(90);
    	stud.getLaptop().add(laptop);

    	laptop.getStudent().add(stud);

    	Configuration cfg = new Configuration();
    	cfg.configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session session = sf.openSession();

    	session.beginTransaction();

    	session.persist(laptop);
    	session.persist(stud);

      	session.getTransaction().commit();
    }
}
