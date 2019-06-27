package com.cp;


import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {

        HashMap<Integer, User> users = new HashMap<Integer, User>();
        users.put(1, new User("张三", 25));
        users.put(3, new User("李四", 22));
        users.put(2, new User("王五", 28));

        System.out.println(users);
        HashMap<Integer, User> sortHashMap = sortHashMap(users);
        System.out.println(sortHashMap);
    }

        public static HashMap<Integer,User> sortHashMap( HashMap<Integer,User> map){

            //首先拿到Map的键值对集合
            Set<Map.Entry<Integer,User>> entrySet = map.entrySet();

            //将set集合转化为List集合，为了使用工具类的排序方法
            List<Map.Entry<Integer,User>> list = new ArrayList<Map.Entry<Integer,User>>(entrySet);

            //使用Collections集合工具类对list进行排序，排序规则使用匿名内部类来实现
           Collections.sort(list,new Comparator<Map.Entry<Integer,User>>(){

                @Override
                public int compare(Map.Entry<Integer,User> o1, Map.Entry<Integer,User> o2){
                    //对age的倒序进行排
                    return o2.getValue().getAge()-o1.getValue().getAge();
                }
            });

          //java8新特性：Lambad表达式
           /*Collections.sort(list,
                  (Map.Entry<Integer,User> o1, Map.Entry<Integer,User> o2) ->o2.getValue().getAge().compareTo(o1.getValue().getAge()));

            list .sort((Map.Entry<Integer,User> o1, Map.Entry<Integer,User> o2) ->o2.getValue().getAge().compareTo(o1.getValue().getAge()));*/


            //创建一个新的有序的HashMap子类的集合
            LinkedHashMap<Integer,User> linkedHashMap = new LinkedHashMap<Integer, User>();
            //将List中的数据存储到LinkedHashMap中
            for(Map.Entry<Integer,User> entry : list){
                linkedHashMap.put(entry.getKey(),entry.getValue());
            }
            return linkedHashMap;
        }
}
