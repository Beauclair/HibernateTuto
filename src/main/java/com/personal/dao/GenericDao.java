package com.personal.dao;

import com.personal.entity.Geek;
import com.personal.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.List;

/**
 * Created by Beauclair-Papix on 7/27/2015.
 */
public class GenericDao {

    static Session session = null;
    static SessionFactory sessionFactory = null;

    static{
        try {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg");
            ServiceRegistry serviceRegistry =
                    new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Person> findPersonByFirstName(String firstName){
        session = sessionFactory.openSession();
        return session.createQuery("from Person as person where person.firstName = ?")
                .setString(0, firstName).list();
    }

    public List<Geek> findGeekByFavPogLanguage(String language){
        session = sessionFactory.openSession();
        return session.createQuery("from Geek as geek where geek.favProgLanguage = ?")
                .setString(0, language).list();
    }

    public void persist(Object object) throws Exception {

        try {
            if (session != null && session.isOpen()){
                session.close();
            }
            session = sessionFactory.openSession();
            Transaction transaction = session.getTransaction();
            transaction.begin();
            session.save(object);
            transaction.commit();
            session.close();

        } catch (Exception e) {
            if (session.getTransaction().isActive()) {
                session.getTransaction().rollback();
            }
            throw e;
        }

    }

    public void persistOrUpdate(Object object) throws Exception {
        try {
            session = sessionFactory.openSession();
            Transaction transaction = session.getTransaction();
            transaction.begin();
            session.saveOrUpdate(object);
            transaction.commit();
            session.close();

        } catch (Exception e) {
            if (session.getTransaction().isActive()) {
                session.getTransaction().rollback();
            }
            throw e;
        }
    }



}
