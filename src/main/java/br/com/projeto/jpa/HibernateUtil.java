package br.com.projeto.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

    public static EntityManagerFactory entityManagerFactory = null;

    static {
        init();
    }

    private static void init(){
        try {
            if (entityManagerFactory == null) {
                entityManagerFactory = Persistence.createEntityManagerFactory("project-jpa-hibernate");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
