package com.upchiapas.jasai.models;

import java.util.ArrayList;

public class ValidateUser {
    public ArrayList<User>users=new ArrayList<>();

    public ValidateUser(){
        users.add(new User("DavidR", "Villo", "2905"));
    }
    public ValidateUser(ArrayList arrayList) {
    }
    public boolean auntenticarUser(String username, String password){
        boolean status= false;
        User user= findUser(username);
        if( user != null && user.getPassword().equals(password))
                    status=true;
        return status;
        }
    private User findUser(String username){
        User user = null;
        boolean status = false;
        int index = 0;
        while (!status && index<users.size()){
            if (users.get(index).getUsername().equals(username)){
                user=users.get(index);
            }
            index++;
        }
        return user;
    }
}
