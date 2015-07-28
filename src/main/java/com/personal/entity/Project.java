package com.personal.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Beauclair-Papix on 7/27/2015.
 */
public class Project {

    private Long id;
    private String title;
    private Set<Geek> geeks = new HashSet<Geek>();
    private Period period;

    public Project(){

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Set<Geek> getGeeks() {
        return geeks;
    }
    public void setGeeks(Set<Geek> geeks) {
        this.geeks = geeks;
    }

    public Period getPeriod() {
        return period;
    }
    public void setPeriod(Period period) {
        this.period = period;
    }

}
