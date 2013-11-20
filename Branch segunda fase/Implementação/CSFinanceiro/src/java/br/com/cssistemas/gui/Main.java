/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cssistemas.gui;

import br.com.cssistemas.dados.HibernateUtil;
import br.com.cssistemas.negocio.Fachadafn;
import br.com.cssistemas.negocio.Usuario;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author peter
 */
public class Main {
    	public static void main(String[] args) {
        
            Fachadafn.getInstancia();
            Session sessao=HibernateUtil.getSessionFactory().openSession();
            Transaction t=sessao.beginTransaction();
            Usuario usuario=new Usuario();
            
            usuario.setNome(JOptionPane.showInputDialog("Nome"));
            usuario.setApelido(JOptionPane.showInputDialog("Apelido"));
            usuario.setEmail(JOptionPane.showInputDialog("Email"));
            usuario.setSenha(JOptionPane.showInputDialog("Senha"));
            usuario.setConfirmaSenha(JOptionPane.showInputDialog("confirma senha"));
            sessao.save(usuario);
            t.commit();
        
        }
}
