package com.ssmlearn.model;

public class WorkExperienceBean {
/*create table C_WORK_EXPERIENCE
(
  WORK_ID              numeric(16,0) not null,
  USER_ID              numeric(16,0) not null,
  WORK_TYPE            varchar(6) not null,
  WORK_DESCRIPTION     varchar(255) not null,
  WORK_LENGTH          varchar(16) not null,
  primary key (WORK_ID)
);*/

    private String WORK_ID;
    private String USER_ID;
    private String WORK_TYPE;
    private String WORK_DESCRIPTION;
    private String WORK_LENGTH;

    public String getWORK_ID() {
        return WORK_ID;
    }

    public void setWORK_ID(String WORK_ID) {
        this.WORK_ID = WORK_ID;
    }

    public String getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getWORK_TYPE() {
        return WORK_TYPE;
    }

    public void setWORK_TYPE(String WORK_TYPE) {
        this.WORK_TYPE = WORK_TYPE;
    }

    public String getWORK_DESCRIPTION() {
        return WORK_DESCRIPTION;
    }

    public void setWORK_DESCRIPTION(String WORK_DESCRIPTION) {
        this.WORK_DESCRIPTION = WORK_DESCRIPTION;
    }

    public String getWORK_LENGTH() {
        return WORK_LENGTH;
    }

    public void setWORK_LENGTH(String WORK_LENGTH) {
        this.WORK_LENGTH = WORK_LENGTH;
    }
}
