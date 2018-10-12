package Jdk8test;

import com.sun.org.apache.bcel.internal.generic.NEW;
import entity.Company;
import entity.Emp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
/*
        Emp emp =null;

        List<Emp> emps =new ArrayList<>();

        emps.add(emp);

        emps.forEach(a->{
            System.out.println(a.getAge());
        });*/

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");

      /*  list.add("c");

        list.add("d");*/
        List<String> list11 = new ArrayList<>();
        list11.add("a");
        list11.add("b");

        List<String> list1 = list.stream().filter(a->!list11.contains(a)).collect(Collectors.toList());

        System.out.println(list1.size());

        List<Emp> emps = new ArrayList<>();
        emps.add(new Emp(1, "zhangsan", 15));
        emps.add(new Emp(3, "lisi", 16));
        emps.add(new Emp(2, "zhangsan", 16));
        emps.add(new Emp(4, "lisi", 15));
        emps.stream().map(Emp::getAge).forEach(a-> System.out.println(a));
       Boolean flag = emps.stream().allMatch(a->a.getAge()==15);
        System.out.println(flag);
        Boolean flag1= emps.stream().anyMatch(a->a.getAge()==15);
        System.out.println(flag1);
        List<Company> companylist =new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            Company company =new Company();
            company.setName(""+1);
            for (int j = 0; j <3 ; j++) {
              company.getEmps().add(new Emp(j, "zhangsan", 15));
            }
            companylist.add(company);

        }
        List<Company> list2 = companylist.stream().
                filter(a->a.getEmps().stream().anyMatch(b->b.getName().equals("zhangsan"))).collect(Collectors.toList());

        System.out.println(list2);
        Date date = new Date();
        Date date1 =null;

        System.out.println(date.compareTo(date1));
    }
}
