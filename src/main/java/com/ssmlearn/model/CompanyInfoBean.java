package com.ssmlearn.model;

public class CompanyInfoBean {
    /*create table C_COMPANY_INFO
(
  COMPANY_ID           numeric(16,0) not null,
  COMPANY_NAME         varchar(50) not null,
  COMPANY_TYPE         varchar(16) not null,
  PEOPLE_NUM           varchar(16) not null,
  COMPANY_             varchar(16) not null,
  CONFIRM              bool not null,
  COMPANY_ADDR         varchar(255) not null,
  USER_ID              numeric(16,0),
  COMPANY_CODE         numeric(6,0),
  primary key (COMPANY_ID)
);*/

    private String COMPANY_ID;
    private String COMPANY_NAME;
    private String COMPANY_TYPE;
    private String PEOPLE_NUM;
    private String COMPANY_;
    private boolean CONFIRM;
    private String COMPANY_ADDR;
    private String USER_ID;
    private String COMPANY_CODE;

    public String getCOMPANY_ID() {
        return COMPANY_ID;
    }

    public void setCOMPANY_ID(String COMPANY_ID) {
        this.COMPANY_ID = COMPANY_ID;
    }

    public String getCOMPANY_NAME() {
        return COMPANY_NAME;
    }

    public void setCOMPANY_NAME(String COMPANY_NAME) {
        this.COMPANY_NAME = COMPANY_NAME;
    }

    public String getCOMPANY_TYPE() {
        return COMPANY_TYPE;
    }

    public void setCOMPANY_TYPE(String COMPANY_TYPE) {
        this.COMPANY_TYPE = COMPANY_TYPE;
    }

    public String getPEOPLE_NUM() {
        return PEOPLE_NUM;
    }

    public void setPEOPLE_NUM(String PEOPLE_NUM) {
        this.PEOPLE_NUM = PEOPLE_NUM;
    }

    public String getCOMPANY_() {
        return COMPANY_;
    }

    public void setCOMPANY_(String COMPANY_) {
        this.COMPANY_ = COMPANY_;
    }

    public boolean isCONFIRM() {
        return CONFIRM;
    }

    public void setCONFIRM(boolean CONFIRM) {
        this.CONFIRM = CONFIRM;
    }

    public String getCOMPANY_ADDR() {
        return COMPANY_ADDR;
    }

    public void setCOMPANY_ADDR(String COMPANY_ADDR) {
        this.COMPANY_ADDR = COMPANY_ADDR;
    }

    public String getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getCOMPANY_CODE() {
        return COMPANY_CODE;
    }

    public void setCOMPANY_CODE(String COMPANY_CODE) {
        this.COMPANY_CODE = COMPANY_CODE;
    }
}
