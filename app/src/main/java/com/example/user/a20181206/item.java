package com.example.user.a20181206;

public class item {
    int image;
    String  name;
    String phone;

    public item(int i, String n, String p){

        image = i;
        name = n;
        phone = p;
    };

    public void setImage(int i){
        image = i;
    }

    public void setName(String n) {
        name = n;
    }

    public void setPhone(String p) {
        phone = p;
    }

    public int getImage(){
        return  image;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
