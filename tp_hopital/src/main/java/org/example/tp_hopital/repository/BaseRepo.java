package org.example.tp_hopital.repository;

import org.example.tp_hopital.util.SessionFactorySingleton;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseRepo<T> {
    protected SessionFactory sessionFactory;
    protected Session session;

    public BaseRepo() {
        sessionFactory = SessionFactorySingleton.getSessionFactory();
    }

    public T create(T entity) {
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.saveOrUpdate(entity);
            session.getTransaction().commit();
            return entity;
        } catch (Exception exception) {
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }

    public T update(T entity) {
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(entity);
            session.getTransaction().commit();
            return entity;
        }catch (Exception exception) {
            session.getTransaction().rollback();
            return null;
        }
        finally {
            session.close();
        }
    }

    public boolean delete(T entity) {
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(entity);
            session.getTransaction().commit();
            return true;
        } catch (Exception exception) {
            session.getTransaction().rollback();
            return false;
        } finally {
            session.close();
        }
    }

    public T findById(Class<T> classe, int id) {
        session = sessionFactory.openSession();
        T entity = session.get(classe, id);
        session.close();
        return entity;
    }

    public T findByName(Class <T> classe, String lastname, String firstname) {
        session = sessionFactory.openSession();
        T entity = session.get(classe, lastname);
        session.close();
        return entity;
    }

    public List<T> findAll(Class<T> classe) {
        List<T> list = null;
        session = sessionFactory.openSession();
        String query = "from " + classe.getSimpleName();
        Query q = session.createQuery(query, classe);
        list = q.getResultList();
        session.close();
        return list;

    }
}
