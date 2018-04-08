package Jdk8test;

import entity.Emp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

        List<Emp> emps = new ArrayList<>();
        emps.add(new Emp(1, "zhangsan", 15));
        emps.add(new Emp(3, "lisi", 16));
        emps.add(new Emp(2, "zhangsan", 16));
        emps.add(new Emp(4, "lisi", 15));


        List<Integer> ids = emps.stream().map(Emp::getId).collect(Collectors.toList());
        List<String> names = emps.stream().map(Emp::getName).collect(Collectors.toList());
        ids.forEach(e -> System.out.println(e));
        names.forEach(n -> System.out.println(n));

        System.out.println("--------------------------------------------");

        //filter 筛选list 中的值
        List<Emp> list = emps.stream()
                .filter(emp -> emp.getAge() == 16)
                .collect(Collectors.toList());

        System.out.println(list);
        //多个条件的筛选方式
        List<Emp> emps1 = emps.stream()
                .filter(emp -> emp.getAge() == 15)
                .filter(emp -> emp.getName().equals("lisi"))
                .collect(Collectors.toList());

        System.out.println(emps1);
        //循环一个list
        emps.stream().forEach(emp -> System.out.println(emp));


        // peek 对每个元素执行操作并返回一个新的 Stream
        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

        //reduce 的用例
        // 字符串连接，concat = "ABCD"
        String concat = Stream.of("A", "B", "C", "D").reduce("", String::concat);
// 求最小值，minValue = -3.0
        double minValue = Stream.of(-1.5, 1.0, -3.0, -2.0).reduce(Double.MAX_VALUE, Double::min);
// 求和，sumValue = 10, 有起始值
        int sumValue = Stream.of(1, 2, 3, 4).reduce(0, Integer::sum);
// 求和，sumValue = 10, 无起始值
        sumValue = Stream.of(1, 2, 3, 4).reduce(Integer::sum).get();
// 过滤，字符串连接，concat = "ace"
        concat = Stream.of("a", "B", "c", "D", "e", "F").
                filter(x -> x.compareTo("Z") > 0).
                reduce("", String::concat);
        //sorted 进行排序 limit 取前n个 skip扔掉前n个元素
        System.out.println("sorted 进行排序 limit 取前n个 skip 取后n个");
        emps.stream().sorted((e1, e2) -> e1.getId().compareTo(e2.getId()))
                .limit(3)
                .skip(1)
                .forEach(emp -> System.out.println(emp));
        //max ,min 取最大值 最小值 返回
        System.out.println("max ,min 取最大值 最小值 返回");
        System.out.println(emps.stream().max(Comparator.comparing(Emp::getId)).orElseThrow(RuntimeException::new));

        Arrays.asList("a1", "a2", "a3")
                .stream()
                .map(String::toUpperCase)
                .findFirst()
                .ifPresent(System.out::println);

    }


}
