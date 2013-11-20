package br.com.cssistemas.negocio;


import br.com.cssistemas.dados.DaoUsuario;

public class Fachadafn {

	
private static Fachadafn fachada;
private ControladorUsuario ctrlusuario;

  
    public static Fachadafn getInstancia(){
	if(fachada== null){
		fachada = new Fachadafn();
	}
	return fachada;
}
    
private Fachadafn(){
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

public  void listar(){
  ctrlusuario.listar();	
}
//-------------------------fim crud consumidor

   
    }
