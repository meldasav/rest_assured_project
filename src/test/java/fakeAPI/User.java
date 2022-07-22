package fakeAPI;

public class User {
    String name;
    String userName;
    int age;
    String address;
    String password;
    public void info(){
        System.out.println("Name " + this.name);
        System.out.println("UserName " + this.userName);
        System.out.println("Password " + this.password);
        System.out.println("address " + address);
        System.out.println("Age " + age);
    }


}
