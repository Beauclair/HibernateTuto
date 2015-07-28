package com.personal.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Beauclair-Papix on 7/25/2015.
 */
public class Geek extends Person {

    private String favProgLanguage;
    private Set<Project> projects = new HashSet<Project>();

    public Geek() {

    }

    public String getFavProgLanguage() {
        return favProgLanguage;
    }

    public void setFavProgLanguage(String favProgLanguage) {
        this.favProgLanguage = favProgLanguage;
    }

    public Set<Project> getProjects() {
        return projects;
    }
    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    public Geek(String firstN, String lastN, String favProgLanguage) {
        super();
        setFirstName(firstN);
        setLastName(lastN);
        this.favProgLanguage = favProgLanguage;
    }

}
