package com.personal.entity;

import java.util.Date;

/**
 * Created by Beauclair-Papix on 7/27/2015.
 */
public class Period {

    private Date startDate;
    private Date endDate;
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
