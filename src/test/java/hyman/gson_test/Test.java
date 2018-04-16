package hyman.gson_test;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import hyman.gson.analysis.GsonDataAnalysis;
import hyman.gson.analysis.User;

public class Test {
	public static void main(String[] args) {
        String sTotalString = "{\"list\": [" +
                "{\"id\":\"1\",\"name\":\"Tom\",\"age\":\"12\"}," +
                "{\"id\":\"2\",\"name\":\"Marry\",\"age\":\"18\"}" +
            "]}";
        Gson gson = new Gson();
        GsonDataAnalysis gda = gson.fromJson(
                sTotalString, GsonDataAnalysis.class);
        for(int i = 0; i < gda.getList().size(); i ++) {
            System.out.print("ID: " + gda.getList().get(i).getId() + " ");
            System.out.print("Name: " + gda.getList().get(i).getName() + " ");
            System.out.println("age: " + gda.getList().get(i).getAge());
        }
        
        User user = new User();
        user.setAge(11);
        user.setName("hyman1");
        user.setSex("m");
        User user2 = new User();
        user2.setAge(22);
        user2.setName("hyman2");
        user2.setSex("m");
        User user3 = new User();
        user3.setAge(33);
        user3.setName("hyman3");
        user3.setSex("m");
        List<User> list = new ArrayList<>(); 
        list.add(user);
        list.add(user2);
        list.add(user3);
        
        System.out.println(gson.toJson(list));
	}
}
