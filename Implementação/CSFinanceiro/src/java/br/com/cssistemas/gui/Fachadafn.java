package br.com.cssistemas.gui;


import br.com.cssistemas.dados.DaoUsuario;
import br.com.cssistemas.negocio.ControladorUsuario;
import br.com.cssistemas.negocio.Usuario;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;


/**
 *
 * @author peter
 */
@ManagedBean(name = "fachada")
@RequestScoped
public class Fachadafn {

private static Fachadafn fachada;
private ControladorUsuario ctrlusuario;
private Usuario usuario;


//---------------gets e sets do usuario----------------------------------
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
//--------------fim do gets e sets do usuario----------------------------



  
    public static Fachadafn getInstancia(){
	if(fachada== null){
		fachada = new Fachadafn();
	}
	return fachada;
}
    
public Fachadafn(){
	//Fachadafn.getInstancia();
	ctrlusuario=new ControladorUsuario(new DaoUsuario());
}
//-----------CRUD CONSUMIDOR
public void inserir(Usuario usuario){
	ctrlusuario.inserir(usuario);
}

public void inativar(Boolean id){
	ctrlusuario.inativar(id);
}

public void atualizar(Usuario usuario){
	ctrlusuario.atualizar(usuario);
	
}

public  void lista(){
  ctrlusuario.lista();	
}

  
    public String Salvar(){
        FacesContext context=FacesContext.getCurrentInstance();
        String senha=this.usuario.getSenha();
        if(!senha.equals(this.usuario.getConfirmaSenha())){
  
            FacesMessage facesmessage=new FacesMessage("Senha não informada corretamente");
            context.addMessage(null, facesmessage);
            return null;//dessa forma a execuçao da pagina não cairá em outra ,mas permanecerá na mesma
        }
        
      
        return "Usuario sucesso";  
    }
//-------------------------fim crud consumidor

   
    }
