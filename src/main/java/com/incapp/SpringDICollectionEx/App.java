package com.incapp.SpringDICollectionEx;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//    	DI with List(Primitive Data)
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
    	JavaBook b = ctx.getBean("javabook",JavaBook.class);
    	System.out.println("----Java Book Description----");
    	System.out.println();
    	System.out.println("---------DI with List(Primitive Data)------------");
    	System.out.println(b.getName());
    	System.out.println(b.getPrice());
    	List<String> l1 = b.getAuthor();
    	for(String s:l1) {
    		System.out.println(s);
    	}
    	
//    	DI with List(Object Data)
    	JavaBook b2 = ctx.getBean("javabook2",JavaBook.class);
    	System.out.println("------DI with List(Object Data)---------");
    	System.out.println(b2.getName());
    	System.out.println(b2.getPrice());
    	List<Author> l2 = b2.getAuthor();
    	for(Author a:l2) {
    		System.out.println(a.getName()+", "+a.getAge()+", "+a.getPhone());
    	}
    	
//    	DI with Set(Primitive Data)
    	PythonBook pb = ctx.getBean("pythonbook",PythonBook.class);
    	System.out.println();
    	System.out.println("----Python Book Description----");
    	System.out.println();
    	System.out.println("---------DI with Set(Primitive Data)----------");
    	System.out.println(pb.getName());
    	System.out.println(pb.getPrice());
    	Set<String> s = pb.getAuthor();
    	for(String a:s) {
    		System.out.println(a);
    	}
    	
//    	DI with Set(Object Data)
    	PythonBook pb1 = ctx.getBean("pythonbook1",PythonBook.class);
    	System.out.println("------DI with Set(Object Data)----------");
    	System.out.println(pb1.getName());
    	System.out.println(pb1.getPrice());
    	Set<Author> s1 = pb1.getAuthor();
    	for(Author a : s1) {
    		System.out.println(a.getName()+", "+a.getAge()+", "+a.getPhone());
    	}
    	
    	
    	
//    	DI with Map(Primitive Data)
    	SpringBook sb = ctx.getBean("springbook",SpringBook.class);
    	System.out.println();
    	System.out.println("----Spring Book Description----");
    	System.out.println();
    	System.out.println("-----------DI with Map(Primitive Data)---------");
    	System.out.println(sb.getName());
    	System.out.println(sb.getPrice());
    	Map<String,String> m = sb.getAuthor();
    	System.out.println(m);   
    	
//    	DI with Map(Object Data)
    	SpringBook sb1 = ctx.getBean("springbook1",SpringBook.class);
    	System.out.println("-------DI with Map(Object Data)---------");
    	System.out.println(sb1.getName());
    	
    	System.out.println(sb1.getPrice());
    	Map<String,Author> m1 = sb1.getAuthor();
    	Set set = m1.entrySet();
    	Iterator i = set.iterator();
    	while(i.hasNext()) {
    		Entry e = (Entry)i.next();
    		Author a = (Author)e.getValue();
    		System.out.println(a.getName()+", "+a.getAge()+", "+a.getPhone());
    	}
//    	Author a1 = m1.get("a1");
//    	Author a2 = m1.get("a2");
//    	System.out.println(a1);
//    	System.out.println(a1.getName()+", "+a1.getAge()+", "+a1.getPhone());
//    	System.out.println(a2);
//    	System.out.println(a2.getName()+", "+a2.getAge()+", "+a2.getPhone());
    }
}
