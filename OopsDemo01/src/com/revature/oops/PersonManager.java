package com.revature.oops;

public class PersonManager {
    public static void main(String[] args) {

        Person []person=new Person[10];
        person[0]=new Person();
        person[0].setName("Jasdhir");
        person[0].setAge(42);

        System.out.println(person[0]);

       /* Person p1=new Person();
        p1.setName("Jasdhir");
        p1.setAge(42);
        System.out.println("Name : "+p1.getName()+", Age : "+p1.getAge());
        System.out.println("Number of Person Created :: "+Person.getPersonCount());

        Person p2=new Person("Sumanta",21);
        System.out.println("Name : "+p2.getName()+", Age : "+p2.getAge());
        System.out.println("Number of Person Created :: "+Person.getPersonCount());*/

    }
}
