package com.personal.client;

import com.personal.dao.GenericDao;
import com.personal.entity.*;

import java.util.Date;
import java.util.List;

/**
 * Created by Beauclair-Papix on 7/23/2015.
 */
public class Main {

    public static void main(String[] args) {
        try {
            Main main = new Main();
            main.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run() throws Exception {
        GenericDao genericDao = new GenericDao();
        Person person = buildPerson("Beauclair", "NANFACK");
        genericDao.persist(person);

        genericDao.persist(buildGeek("Alan", "Park", "Java"));
        genericDao.persist(buildGeek("Henri", "Omer", "C#"));
        genericDao.persist(buildGeek("Christian", "Cup", "Java"));

        IdCard idCard = buildIdCard("45896325", new Date(), true);
        genericDao.persist(idCard);
        person.setIdCard(idCard);
        genericDao.persistOrUpdate(person);

       for (Person prson : genericDao.findPersonByFirstName("Beauclair")) {
            Phone phone = new Phone();
            phone.setNumber("+1 510 458 6268");
            phone.setPerson(prson);
            prson.getPhones().add(phone);
            genericDao.persist(phone);

        }

        List<Geek> resultList = genericDao.findGeekByFavPogLanguage("Java");
        Project project = new Project();
        project.setTitle("Java Project");
        Period period = new Period();
        period.setStartDate(new Date());
        project.setPeriod(period);

        for (Geek geek : resultList) {
            project.getGeeks().add(geek);
            geek.getProjects().add(project);
        }
        genericDao.persist(project);

    }

    private Person buildPerson(String firstN, String lastN){
        Person person = new Person(firstN, lastN);
        return person;
    }

    private Geek buildGeek(String firstN, String lastN, String favProgLanguage){
        Geek geek = new Geek(firstN, lastN, favProgLanguage);
        return geek;
    }

    private IdCard buildIdCard(String num, Date issueDate, boolean valid){
        IdCard idCard = new IdCard(num, issueDate, valid);
        return idCard;
    }

}
