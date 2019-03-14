package Jdk8test;

import entity.Emp;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class test {
    public static void main(String[] args) {
/*
        Emp emp =null;

        List<Emp> emps =new ArrayList<>();

        emps.add(emp);

        emps.forEach(a -> {
            System.out.println(a.getAge());
        });*/

       /* System.out.println(new BigDecimal(String.valueOf(2.6E+10)).toPlainString());
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH,2);

        c.add(Calendar.DAY_OF_MONTH,30);
        System.out.println(c.getTime());*/

       /*BigDecimal bigDecimal = null;
        try {
            System.out.println(bigDecimal.toPlainString());
        }catch (Exception e){
            e.printStackTrace();
        }


        System.out.println(2131321321);


        StringBuffer str = new StringBuffer("43,25,361,782,9222,222,333,444,");
        if (',' == str.charAt(str.length() - 1))
            str = str.deleteCharAt(str.length() - 1);

        str.delete(str.lastIndexOf(","),str.length());

        System.out.println(str);*/


        String abc = "Mozilla/5.0 (Linux; Android 9; CLT-AL00 Build/HUAWEICLT-AL00; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/66.0.3359.126 MQQBrowser/6.2 TBS/044428 Mobile Safari/537.36 MMWEBID/8392 MicroMessenger/6.7.3.1360(0x260703F2) NetType/WIFI Language/zh_CN Process/tools";

        abc=abc.toLowerCase();

        System.out.println(abc.indexOf("android"));

    }



}
