package br.com.cssistemas.dados;



import org.hibernate.Session;
import br.com.cssistemas.negocio.Usuario;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Transaction;

/**
 *
 * @author peter
 */

  public class DaoUsuario implements InterfaceDaoUsuario {
 
	private Session session;
                
        
	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}
        
        

	
	@Override
	public void inserir(Usuario usuario) {
		// TODO Auto-generated method stub
		this.session.save(usuario);
              
            }
                
	
	

	@Override
	public void atualizar(Usuario usuario) {
		// TODO Auto-generated method stub
		this.session.update(usuario);
	}

    /**
     *
     *
     * @return
     */
    @Override    
    public List<Usuario> lista() {
        
        try{
         session=HibernateUtil.getSessionFactory().openSession();
            Transaction transacao=session.beginTransaction();
           Query query=session.createQuery("from Usuario");
              List<Usuario> resultado=query.list();
            transacao.commit();
            return resultado;
           // return this.session.createCriteria(Usuario.class).list();
        }
       catch (HibernateException e) {
           System.out.println("Nãoo foi possível selecionar contatos.Erro:"+ e.getMessage());
           throw new HibernateException(e);
            }
        finally{
            try{
            //  session.close();
            }
            catch (HibernateException e){
                System.out.println("Erro ao fechar a operação de consulta "+ e.getMessage());
            }
        }  
    }

    @Override
    public void inativar(boolean inativo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void consultar(boolean existe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void validar(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
 
    
    
}

	


