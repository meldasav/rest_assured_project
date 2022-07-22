package fakeAPI;

import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;

public class ApiTesting {

    @Test
    public void api1() {
        User u = new User();
        u.name = "melda sav";
        u.userName = "melda123";
        u.password = "1234";
        String response = API.createUser("api.test.com/user/create", u);
        System.out.println(response);
      //  DB.getUsers("hello").get(0).info();//we are connecting to the database.User we created in the database now
        List<User> eu=API.getUsers("api.test.com/user/all");
        eu.get(0).info();

    }
    @Test
    public void apiGet(){
        List<User> u=API.getUsers("api.test.com/user/all");
        System.out.println(u.size());

    }
}
