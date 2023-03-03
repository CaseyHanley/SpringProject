package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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

        AnnotationConfigApplicationContext  context2 = new AnnotationConfigApplicationContext(SpringConfig.class);

        student student2 = context.getBean("student", student.class);


        student student1 = (student) context.getBean("student");

        System.out.println(student1);
        System.out.println(student2);



    }
}
