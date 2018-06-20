package com.ssmlearn.model;

public class EduExperienceBean {
    /*create table C_EDUCATIONAL_EXPERIENCE
(
  EDU_ID               numeric(16,0) not null,
  USER_ID              numeric(16,0) not null,
  START_TIME           date not null,
  EDN_TIME             date not null,
  CUR_SCHOOL           varchar(16) not null,
  CUR_GRADE            varchar(6) not null,
  DESCRIPTION          varchar(255),
  primary key (EDU_ID)
);*/

    private String EDU_ID;
    private String USER_ID;
    private String START_TIME;
    private String EDN_TIME;
    private String CUR_SCHOOL;
    private String CUR_GRADE;
    private String DESCRIPTION;

    public String getEDU_ID() {
        return EDU_ID;
    }

    public void setEDU_ID(String EDU_ID) {
        this.EDU_ID = EDU_ID;
    }

    public String getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getSTART_TIME() {
        return START_TIME;
    }

    public void setSTART_TIME(String START_TIME) {
        this.START_TIME = START_TIME;
    }

    public String getEDN_TIME() {
        return EDN_TIME;
    }

    public void setEDN_TIME(String EDN_TIME) {
        this.EDN_TIME = EDN_TIME;
    }

    public String getCUR_SCHOOL() {
        return CUR_SCHOOL;
    }

    public void setCUR_SCHOOL(String CUR_SCHOOL) {
        this.CUR_SCHOOL = CUR_SCHOOL;
    }

    public String getCUR_GRADE() {
        return CUR_GRADE;
    }

    public void setCUR_GRADE(String CUR_GRADE) {
        this.CUR_GRADE = CUR_GRADE;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
}
