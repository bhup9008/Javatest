package com.java.capgemin.pr.factory;

public class AuthFactory {


    public static AuthentionServer getAuthServerIns(String authprovider){
        if (authprovider.equals("Apple"))
            return new AppleAuth();
        else
            if(authprovider.equals("face"))
                return new FaceBookAuth();
            return null;
    }



}
