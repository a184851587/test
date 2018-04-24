package Jdk8test;

import entity.Emp;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {

        Emp emp =null;

        List<Emp> emps =new ArrayList<>();

        emps.add(emp);

        emps.forEach(a->{
            System.out.println(a.getAge());
        });
    }
}
