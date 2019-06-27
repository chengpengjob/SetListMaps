package com.cp;

import java.util.*;

public class Testfor {

    public static void main(String[] args) {
        //遍历Arraylist
        List<String> list=new ArrayList<String>();
        for(int i =0; i<=100; i++) {
            list.add("Hello");
            list.add("World");
            list.add("HAHAHAHA");
        }

        //第一种遍历方法使用foreach遍历List
        long startTime = System.currentTimeMillis();
        for (String str : list) {            //也可以改写for(int i=0;i<list.size();i++)这种形式
            System.out.println(str);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("foreach用时："+(endTime - startTime));

        //第二种遍历，把链表变为数组相关的内容进行遍历
        String[] strArray=new String[list.size()];
        list.toArray(strArray);
        long startTime1 = System.currentTimeMillis();
        for(int i=0;i<strArray.length;i++) //这里也可以改写为  foreach(String str:strArray)这种形式
        {
            System.out.println(strArray[i]);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("链表变数组用时："+(endTime1 - startTime1));

        //第三种遍历 使用迭代器进行相关遍历

        Iterator<String> ite=list.iterator();
        long startTime2 = System.currentTimeMillis();
        while(ite.hasNext())//判断下一个元素之后有值
        {
            System.out.println(ite.next());
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("迭代器用时："+(endTime2 - startTime2));

        //遍历map
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");

        //第一种：普遍使用，二次取值
        System.out.println("通过Map.keySet遍历key和value：");
        for (String key : map.keySet()) {
            System.out.println("key= "+ key + " and value= " + map.get(key));
        }

        //第二种
        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        //第三种：推荐，尤其是容量大时
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        //第四种
        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
        for (String v : map.values()) {
            System.out.println("value= " + v);
        }
    }
}
