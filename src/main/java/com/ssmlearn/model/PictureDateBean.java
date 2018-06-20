package com.ssmlearn.model;

public class PictureDateBean {
    /*create table C_PICTURE_DATE
(
  PHOTO_ID             numeric(16,0) not null,
  COMPANY_ID           numeric(16,0),
  PHOTO_DESCRIPTION    varchar(255) not null,
  PHOTO_LINK           varchar(255) not null,
  USER_ID              numeric(16,0),
  primary key (PHOTO_ID)
);*/

    private String PHOTO_ID;
    private String COMPANY_ID;
    private String PHOTO_DESCRIPTION;
    private String PHOTO_LINK;
    private String USER_ID;

    public String getPHOTO_ID() {
        return PHOTO_ID;
    }

    public void setPHOTO_ID(String PHOTO_ID) {
        this.PHOTO_ID = PHOTO_ID;
    }

    public String getCOMPANY_ID() {
        return COMPANY_ID;
    }

    public void setCOMPANY_ID(String COMPANY_ID) {
        this.COMPANY_ID = COMPANY_ID;
    }

    public String getPHOTO_DESCRIPTION() {
        return PHOTO_DESCRIPTION;
    }

    public void setPHOTO_DESCRIPTION(String PHOTO_DESCRIPTION) {
        this.PHOTO_DESCRIPTION = PHOTO_DESCRIPTION;
    }

    public String getPHOTO_LINK() {
        return PHOTO_LINK;
    }

    public void setPHOTO_LINK(String PHOTO_LINK) {
        this.PHOTO_LINK = PHOTO_LINK;
    }

    public String getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID;
    }
}
