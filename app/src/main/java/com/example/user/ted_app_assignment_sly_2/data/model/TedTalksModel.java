package com.example.user.ted_app_assignment_sly_2.data.model;

public class TedTalksModel {

    private static TedTalksModel objInstance;
    private TedTalksModel(){

    }

    public static TedTalksModel getObjInstance(){
        if(objInstance == null){
            objInstance = new TedTalksModel();
        }
        return objInstance;
    }



}
