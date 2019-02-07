package com.angelo.echelonapp.classes;

public class User {

    private String userName;
    private String userDesc;
    private int userPic;

    public User(String userName, String userDesc, int userPic){

        this.userName = userName;
        this.userDesc = userDesc;
        this.userPic = userPic;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    public int getUserPic() {
        return userPic;
    }

    public void setUserPic(int userPic) {
        this.userPic = userPic;
    }
}
