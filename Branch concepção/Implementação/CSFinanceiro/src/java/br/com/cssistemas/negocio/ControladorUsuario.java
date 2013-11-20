package br.com.cssistemas.negocio;

import br.com.cssistemas.dados.InterfaceDaoUsuario;



public class ControladorUsuario {
	
	private InterfaceDaoUsuario daousuario;
	
	public ControladorUsuario(InterfaceDaoUsuario daousuario) {
		this.daousuario = daousuario;
	}

	
	//==================  CRUD  ===================	
			public void inserir(Usuario usuario){
			daousuario.inserir(usuario);
		}
		
		public void atualizar(Usuario usuario){
			daousuario.atualizar(usuario);
		}
		
		public void inativar(Boolean id){
			daousuario.inativar(id);
		}
		
		public void listar(){
                    daousuario.listar();
		
			
		}
		
	//====================REGRA DE NEGOCIOS ===========================

}
