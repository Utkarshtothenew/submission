package com.tothenew;

import java.util.*;

class Student {
    String name;
    Double score;
    Double age;

    public Student(String name, Double score, Double age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", age=" + age +
                '}';
    }
}

public class Ans6 {
    public static void main(String[] args) {
        Student student1 = new Student("Raju",98D,12D);
        Student student2 = new Student("Ramu",90D,15D);
        Student student3 = new Student("Raj",98D,20D);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.score > o2.score) {
                    return 1;
                }
                else if (o1.score < o2.score){
                    return -1;
                }
                else {
                    return o1.name.compareTo(o2.name);
                }
            }
        });

        Iterator iterator = studentList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
