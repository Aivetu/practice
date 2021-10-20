package com.exercise.arrayList;

import java.util.ArrayList;

public class MainArray {
    public static void main(String[] args) {


       User user1 = new User();
       User user2 = new User();
       User user3 = new User();
       User user4 = new User();

       user1.setDetails("Adekunle","Ciroma",19);
       user2.setDetails("Eniola","Promise",14);
       user3.setDetails("Leo","Victor",27);
       user4.setDetails("Bisi","Ola",49);

        ArrayList<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        for (User x: userList){
            System.out.println(x.getRegisteredUsers());
        }

    }
}
