package br.com.cssistemas.dados;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peter
 */
import org.hibernate.Session;
public class ConectaHibernateMysql {
    
    public ConectaHibernateMysql(){
     Session sessao=null;
     sessao=HibernateUtil.getSessionFactory().openSession();
     System.out.println("Conexão Realizada!");
    
    sessao.close();

}
}