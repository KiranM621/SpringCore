package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        // created context
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        Student student = (Student)context.getBean("Student");
        System.out.println(student);
        
        Student student1 = (Student)context.getBean("Student1");
        
        System.out.println(student1);
        
        Student student2 = (Student)context.getBean("Student2");
        
        System.out.println(student2);
        
    }
}
