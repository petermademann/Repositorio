    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cssistemas.dados;

import org.hibernate.HibernateException;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;



/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author peter
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory =buildSessionFactory();
     private static  SessionFactory buildSessionFactory(){
     try{
         Configuration cfg=new Configuration();
         cfg.configure("hibernate.cfg.xml");
         return cfg.buildSessionFactory();
     }
     catch(HibernateException erro){
         System.out.println("A criação inicial do SessionFactory Falhou. Erro"+ erro);
        throw new ExceptionInInitializerError(erro);
     }
     }
 public static SessionFactory getSessionFactory(){
        return sessionFactory;
 }   
    
}
