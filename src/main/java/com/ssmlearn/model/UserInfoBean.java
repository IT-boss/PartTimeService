package com.ssmlearn.model;

public class UserInfoBean {

    /* create table C_USER_INFO
            (
                    INFO_ID              numeric(16,0) not null,
    USER_ID              numeric(16,0) not null,
    GENDER               varchar(6),
    BIRTHDAY             date,
    HEIGHT               numeric(3,1),
    WEIGHT               numeric(3,1),
    SCHOOL               varchar(16),
    RECORD               varchar(6),
    EMAIL                varchar(30),
    SCORE                numeric(3,0),
    MY_CODE              varchar(11),
    primary key (INFO_ID)
);*/

    private String INFO_ID;
    private String  USER_ID;
    private String  GENDER;
    private String  BIRTHDAY;
    private String  HEIGHT;
    private String  WEIGHT;
    private String  SCHOOL;
    private String  RECORD;
    private String  EMAIL;
    private String  SCORE;
    private String  MY_CODE;

    public String getINFO_ID() {
        return INFO_ID;
    }

    public void setINFO_ID(String INFO_ID) {
        this.INFO_ID = INFO_ID;
    }

    public String getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getGENDER() {
        return GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public String getBIRTHDAY() {
        return BIRTHDAY;
    }

    public void setBIRTHDAY(String BIRTHDAY) {
        this.BIRTHDAY = BIRTHDAY;
    }

    public String getHEIGHT() {
        return HEIGHT;
    }

    public void setHEIGHT(String HEIGHT) {
        this.HEIGHT = HEIGHT;
    }

    public String getWEIGHT() {
        return WEIGHT;
    }

    public void setWEIGHT(String WEIGHT) {
        this.WEIGHT = WEIGHT;
    }

    public String getSCHOOL() {
        return SCHOOL;
    }

    public void setSCHOOL(String SCHOOL) {
        this.SCHOOL = SCHOOL;
    }

    public String getRECORD() {
        return RECORD;
    }

    public void setRECORD(String RECORD) {
        this.RECORD = RECORD;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getSCORE() {
        return SCORE;
    }

    public void setSCORE(String SCORE) {
        this.SCORE = SCORE;
    }

    public String getMY_CODE() {
        return MY_CODE;
    }

    public void setMY_CODE(String MY_CODE) {
        this.MY_CODE = MY_CODE;
    }
}
