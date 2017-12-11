package com.team11.personalfood.Models;

import java.util.Date;

/**
 * Created by andong-won on 2017. 12. 11..
 */

public class JoinData {
    final String userID;
    final String password;
    final String name;
    final String birth;
    final String type;

    public JoinData(String userID, String password, String name , String birth, String type) {
        this.userID =userID;
        this.password = password;
        this.name= name;
        this.birth = birth;
        this.type = type;
    }
}