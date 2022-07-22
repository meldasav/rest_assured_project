package fakeAPI;

import java.util.List;

public class API {
    //User creation API
    //We use HTTP POST method to achieve
    //Requirements
    //1 url+resource 2.request body
    //USER must have named ,username ,password

    //create a method to create an API . Response will be String
    public static String createUser(String url, User user) {
        String expectedURL = "api.test.com/user/create";
        if (!url.equals(expectedURL)) {
            return "404 - RESOURCE NOT FOUND";
            //if url wrong you got 404
        }
        //we need to validate request body
        if (user.name == null || user.userName == null || user.password == null) {
            return "400 -Bad request";
            //if username ,password not provided you got 400 bad request
        }
        //we need to add this user to our database
        DB.getUsers("hello321").add(user);
        return "201-User Created";


        //API 2
        //GET HTTP method
        //resource /user/all

    }

    public static List<User> getUsers(String url) {
        String expectedUrl = "api.test.com/user/all";
        if (!url.equals(expectedUrl)) {
            System.out.println("404 NOT FOUND");
            return null;
        }
        System.out.println("200 OK");
        return DB.getUsers("hello321");
    }
}
