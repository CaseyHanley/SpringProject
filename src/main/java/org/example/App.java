package org.example;

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

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        student student1 = (student) context.getBean("student");

        System.out.println(student1);


    }
}
