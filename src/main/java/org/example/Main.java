package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Transaction tx=null;
        try{

            Configuration cf=new Configuration();
            Properties ps=new Properties();
            ps.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
            ps.put(Environment.URL,"jdbc:mysql://localhost:3306/hibernate");
            ps.put(Environment.USER,"root");
            ps.put(Environment.PASS,"kondalu309");
            ps.put(Environment.DIALECT,"org.hibernate.dialect.MySQL8Dialect");
            ps.put(Environment.CURRENT_SESSION_CONTEXT_CLASS,"thread");
            ps.put(Environment.SHOW_SQL,"true");
            ps.put(Environment.HBM2DDL_AUTO,"update");
            cf.setProperties(ps);
            cf.setProperties(ps);
            cf.addAnnotatedClass(Courses.class);
            cf.addAnnotatedClass(Student.class);
            StandardServiceRegistryBuilder standardServiceRegistryBuilder=new StandardServiceRegistryBuilder();
            ServiceRegistry serviceRegistry=standardServiceRegistryBuilder.applySettings(cf.getProperties()).build();
            SessionFactory sessionFactory=cf.buildSessionFactory(serviceRegistry);
            Session session=sessionFactory.openSession();
            tx=session.beginTransaction();


//            Student student=new Student("kondalu","kondalu309@gmail.com",7731898177d);
//            session.save(student);
//            Student student1=new Student("kondal","kondalu309@gmail.com",7731898177d);
//            session.save(student1);
//            Student student2=new Student("konda","kondalu309@gmail.com",7731898177d);
//            session.save(student2);
//            Student student=session.load(Student.class,1);
//            System.out.println(student);
//            Courses courses=new Courses("Java",2000);
//            session.save(courses);
//            Courses courses1=new Courses("python",3000);
//            session.save(courses1);
//            Courses courses2=new Courses("c++",400);
//            session.save(courses2);
//            Set<Courses> coursesSet=new HashSet<>();
//            coursesSet.add(courses);
//            coursesSet.add(courses1);
//            coursesSet.add(courses2);
            //student.setCourses(coursesSet);
//            Courses courses=session.load(Courses.class,1);
//            System.out.println(courses);
//            Student s1=new Student("kondal","ok@mail",35353553d);
//            session.save(s1);
//            Student s2=new Student("konda","ok@mail",35353553d);
//            session.save(s2);
//            Student s3=new Student("hello","ok@mail",35353553d);
//            session.save(s3);
//            Set<Student> studentSet=new HashSet<>();
//            studentSet.add(s1);
//            studentSet.add(s2);
//            studentSet.add(s3);
//            courses.setStudents(studentSet);
//            Courses c1=session.load(Courses.class,4);
//            Set<Student> s1=c1.getStudents();
//            System.out.println(s1);

           // Student s3=session.load(Student.class,2);
            //session.delete(s3);






            tx.commit();
            session.close();

        }
        catch (Exception ex)
        {
            tx.rollback();
            ex.printStackTrace();

        }


    }
}