package com.ssmlearn.model;

public class WorkInfoBean {
    /*create table C_WORK_INFO
(
  WORK_ID              numeric(16,0) not null,
  COMPANY_ID           numeric(16,0) not null,
  WORK_NAME            varchar(50) not null,
  PUBLISH_TIME         date not null,
  DEAD_LINE            date not null,
  WORK_CONTENT         varchar(255) not null,
  WORK_REQUEST         varchar(255) not null,
  PEOPLE_NUM           varchar(10) not null,
  WORK_RESULT          varchar(255) not null,
  WORK_TYPE            varchar(10) not null,
  WORK_ADDR            varchar(50) not null,
  USER_ID              numeric(16,0),
  primary key (WORK_ID)
);*/

    private String WORK_ID;
    private String COMPANY_ID;
    private String WORK_NAME;
    private String PUBLISH_TIME;
    private String DEAD_LINE;
    private String WORK_CONTENT;
    private String WORK_REQUEST;
    private String PEOPLE_NUM;
    private String WORK_RESULT;
    private String WORK_TYPE;
    private String WORK_ADDR;
    private String USER_ID;

    public String getWORK_ID() {
        return WORK_ID;
    }

    public void setWORK_ID(String WORK_ID) {
        this.WORK_ID = WORK_ID;
    }

    public String getCOMPANY_ID() {
        return COMPANY_ID;
    }

    public void setCOMPANY_ID(String COMPANY_ID) {
        this.COMPANY_ID = COMPANY_ID;
    }

    public String getWORK_NAME() {
        return WORK_NAME;
    }

    public void setWORK_NAME(String WORK_NAME) {
        this.WORK_NAME = WORK_NAME;
    }

    public String getPUBLISH_TIME() {
        return PUBLISH_TIME;
    }

    public void setPUBLISH_TIME(String PUBLISH_TIME) {
        this.PUBLISH_TIME = PUBLISH_TIME;
    }

    public String getDEAD_LINE() {
        return DEAD_LINE;
    }

    public void setDEAD_LINE(String DEAD_LINE) {
        this.DEAD_LINE = DEAD_LINE;
    }

    public String getWORK_CONTENT() {
        return WORK_CONTENT;
    }

    public void setWORK_CONTENT(String WORK_CONTENT) {
        this.WORK_CONTENT = WORK_CONTENT;
    }

    public String getWORK_REQUEST() {
        return WORK_REQUEST;
    }

    public void setWORK_REQUEST(String WORK_REQUEST) {
        this.WORK_REQUEST = WORK_REQUEST;
    }

    public String getPEOPLE_NUM() {
        return PEOPLE_NUM;
    }

    public void setPEOPLE_NUM(String PEOPLE_NUM) {
        this.PEOPLE_NUM = PEOPLE_NUM;
    }

    public String getWORK_RESULT() {
        return WORK_RESULT;
    }

    public void setWORK_RESULT(String WORK_RESULT) {
        this.WORK_RESULT = WORK_RESULT;
    }

    public String getWORK_TYPE() {
        return WORK_TYPE;
    }

    public void setWORK_TYPE(String WORK_TYPE) {
        this.WORK_TYPE = WORK_TYPE;
    }

    public String getWORK_ADDR() {
        return WORK_ADDR;
    }

    public void setWORK_ADDR(String WORK_ADDR) {
        this.WORK_ADDR = WORK_ADDR;
    }

    public String getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID;
    }
}
