package br.com.cssistemas.dados;

import br.com.cssistemas.negocio.Usuario;
import java.util.List;



public interface InterfaceDaoUsuario {

	
	
public abstract void inserir(Usuario usuario);
	
	public abstract void atualizar(Usuario usuario);
	
	public abstract List<Usuario> listar();
	
	public abstract void inativar(boolean inativo);
	
	public abstract void consultar(boolean existe);
	
	public abstract void validar(Usuario usuario);

 

}
