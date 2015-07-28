package com.personal.entity;


import java.util.Date;

/**
 * Created by Beauclair-Papix on 7/26/2015.
 */
public class IdCard {

    private Long id;
    private String idNumber;
    private Date issueDate;
    private boolean valid;

    public IdCard(){

    }

    public IdCard(String idNumber, Date issueDate, boolean valid) {
        this.idNumber = idNumber;
        this.issueDate = issueDate;
        this.valid = valid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
}
