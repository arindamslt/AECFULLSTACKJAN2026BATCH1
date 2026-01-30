package com.arindam.client;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.arindam.entity.Adhar;
import com.arindam.entity.Candidate;
import com.arindam.entity.Employee;
import com.arindam.entity.Job;
import com.arindam.entity.Student;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EntityManagerFactory emf=Persistence.createEntityManagerFactory("AppDB");//READING THE PERSISTANCE XML FILE
EntityManager em=emf.createEntityManager();//insert update delete create operation
EntityTransaction tx=null;
tx=em.getTransaction();
tx.begin();
//Student sd1=new Student("1","ARUP","CSE");
//em.persist(sd1);//TABLE CREATED DATA INSERTED
/*Employee e1=new Employee();
Employee e2=new Employee();
e1.setEname("ROBIN");
e1.setJob("MANAGER");
e1.setJoindt(new Date());
e1.setWorkhr(new Date());
e1.setSal(65000.00);
e2.setEname("ALOKE");
e2.setJob("MANAGER");
e2.setJoindt(new Date());
e2.setWorkhr(new Date());
e2.setSal(75000.00);
em.persist(e1);
em.persist(e2);*/
/*Adhar ah1=new Adhar("AH656565","SUMAN");
Adhar ah2=new Adhar("AH8686688","AYAN");
Candidate cd1=new Candidate("C1","KOLKATA",ah1);
Candidate cd2=new Candidate("C2","DELHI",ah2);
em.persist(ah1);
em.persist(ah2);
em.persist(cd1);
em.persist(cd2);*/
System.out.println("INSERTION OF DATA INTO TABLE=====");
Job job1=new Job("J1","ANALYST","PYTHON");
Job job2=new Job("J2","FULLSTACK","SPRINGBOOT");
//em.persist(job1);
//em.persist(job2);
System.out.println("FETCHING DATA USING HQL====");
String hql="from Job";
String jpql="select j from Job j";
//Query query=em.createQuery(hql);
Query query=em.createQuery(jpql);
List<Job> jlist=query.getResultList();
jlist.stream().forEach(System.out::println);
/*System.out.println("DELETE DATA USING JPQL======");
Job jb=em.find(Job.class,"J1");
if(jb!=null)
{
	em.remove(jb);
}
Query query1=em.createQuery(jpql);
List<Job> jlist1=query.getResultList();
jlist1.stream().forEach(System.out::println);*/
System.out.println("UPDATE DATA USING JPQL======");
Job jb=em.find(Job.class,"J2");
if(jb!=null)
{
	jb.setJobnm("AI");
	jb.setDomain("SPRINGAI");
	em.merge(jb);//update
}
Query query1=em.createQuery(jpql);
List<Job> jlist1=query.getResultList();
jlist1.stream().forEach(System.out::println);
tx.commit();
emf.close();

	}

}
