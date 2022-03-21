package com.motivity2;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


	public class MainMethod 
	{
	    public static void main( String[] args )
	    {
	         
	    	 ApplicationContext context=new ClassPathXmlApplicationContext("spring.cfg.xml");
		        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
		        
		        Scanner sc=new Scanner(System.in);
		        System.out.println("1:Insert 2:Delete 3:Update 4:Exit");
		  
		        do {
		        	 int n=sc.nextInt();
		        switch(n) {
		        case 1:String query1="insert into student(studentId,studentSurName,studentName,studentClg) value(?,?,?,?)";
		        System.out.println("Enter s_id,s_sur_name, s_name, s_clg_name to be inserted: ");
		        int id=sc.nextInt();
		        String ssname=sc.next();
		        String sname=sc.next();
		        String s_clg_name=sc.nextLine();
		        int result1=template.update(query1,id,ssname,sname,s_clg_name);
		        System.out.println(result1+" Record has been inserted");
		        break;
		        //delete
		        case 2:String query2="delete from student where studentId=?";
		        System.out.println("Enter s_id to be deleted: ");
		        int id1=sc.nextInt();
		        int result2=template.update(query2,id1);
		        System.out.println(result2+" Record/Record's has been deleted");
		        break;
		        case 3:
		        System.out.println("Enter s_id to which you need to update");
		        int id2=sc.nextInt();
		        System.out.println("a.StudentSurName b.StudentName c.StudentClgName");
		        char ch=sc.next().charAt(0);
		        switch(ch) {
		        case 'a':
		        String query3="update student set studentSurName=? where studentId=?";
		        System.out.println("Enter the studentSurName to which the name is to be updated");
		        String s4=sc.next();
		        int result4=template.update(query3,s4,id2);
		        System.out.println(result4+" Records has been updated");
		        break;
		        case 'b': 
		        String query4="update student set studentName=? where studentId=?";
		        System.out.println("Enter the studentName to which the address is to be updated");
		        String s5=sc.next();
		        int result5=template.update(query4,s5,id2);
		        System.out.println(result5+" Records has been updated");
		        break;
		        case 'c': 
			        String query5="update student set studentClg=? where studentId=?";
			        System.out.println("Enter the studentClg to which the address is to be updated");
			        String s6=sc.next();
			        int result6=template.update(query5,s6,id2);
			        System.out.println(result6+" Records has been updated");
			        break;
		        }
		        break;
		        case 4:java.lang.System.exit(0);
		        case 5: 
		        }
		        } while(true);
		       }   
		     }
