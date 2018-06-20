package com.ssmlearn.model;

public class UserRegisterBean {

/*create table C_USER_REGISTER
(
  USER_ID              numeric(16,0) not null,
  USER_NAME            varchar(8) not null,
  PASSWORD             varchar(16) not null,
  TELPHONE             numeric(11,0) UNIQUE not null,
  SECRET_KEY           varchar(255),
  INVITE_CODE          varchar(16),
  primary key (USER_ID)
);*/


    private String USER_ID;
    private String USER_NAME;
    private String PASSWORD;
    private String TELPHONE;
    private String SECRET_KEY;
    private String INVITE_CODE;

    public String getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getTELPHONE() {
        return TELPHONE;
    }

    public void setTELPHONE(String TELPHONE) {
        this.TELPHONE = TELPHONE;
    }

    public String getSECRET_KEY() {
        return SECRET_KEY;
    }

    public void setSECRET_KEY(String SECRET_KEY) {
        this.SECRET_KEY = SECRET_KEY;
    }

    public String getINVITE_CODE() {
        return INVITE_CODE;
    }

    public void setINVITE_CODE(String INVITE_CODE) {
        this.INVITE_CODE = INVITE_CODE;
    }
}
