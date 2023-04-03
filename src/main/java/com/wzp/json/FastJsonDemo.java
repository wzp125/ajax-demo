package com.wzp.json;

import com.alibaba.fastjson.JSON;
import com.wzp.pojo.User;

public class FastJsonDemo {
    public static void main(String[] args) {
        //1.java对象装换为json
        User user=new User();
        user.setId(1);
        user.setUsername("zhangsan");
        user.setPassword("123");

        Object jsonStr = JSON.toJSONString(user);
        System.out.println(jsonStr);//{"password":"123","id":1,"username":"zhangsan"}

        //2.json转换为java
        User user1=JSON.parseObject("{\"password\":\"123\",\"id\":1,\"username\":\"zhangsan\"}",User.class);
        System.out.println(user1);//User{id=1, username='zhangsan', password='123'}
    }
}
