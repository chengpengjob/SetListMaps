package com.cp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;

public class Test {

    private static String firstDay;
    private static String lastDay;

    public static void main(String[] args) {

        /*SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

        //获取前月的第一天
        Calendar cal_1=Calendar.getInstance();//获取当前日期
        cal_1.add(Calendar.MONTH, -1);
        cal_1.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
        firstDay = format.format(cal_1.getTime());
        System.out.println("-----1------firstDay:"+firstDay);
        //2019-05-01
        //获取前月的最后一天
        Calendar cale = Calendar.getInstance();
        cale.set(Calendar.DAY_OF_MONTH,0);//设置为1号,当前日期既为本月第一天
        lastDay = format.format(cale.getTime());
        System.out.println("-----2------lastDay:"+lastDay);
        //2019-05-31


        //获取当前月第一天：
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, 0);
        c.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
        String first = format.format(c.getTime());
        System.out.println("===============first:"+first);
        //2019-06-01

        //获取当前月最后一天
        Calendar ca = Calendar.getInstance();
        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
        String last = format.format(ca.getTime());
        System.out.println("===============last:"+last);
        //2019-06-30

        String statisticalcycle = (first +  "_"  +  last);
        System.out.println(statisticalcycle);*/

        HashSet<String> has = new HashSet<String>();
        has.add("3");
        has.add("2");
        has.add("1");
        has.add("2");
        System.out.println(has);


         }
}
