package br.com.cssistemas.negocio;




import javax.persistence.*;

/**
 *
 * @author peter
 */

@Entity
@Table(name = "usuario")

public class Usuario  {
    @Id
@GeneratedValue
@Column(name = "id")
private int id;
@Column(name = "nome")
private String nome;
@Column(name = "apelido")
private String apelido;
@Column(name = "email")
private String email;
@Column(name = "senha")
private String senha;
@Column(name = "confirmasenha")
private String confirmaSenha;

    public Usuario() {
    }

    public Usuario(int id, String nome, String apelido,String email, String senha, String confirmaSenha) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.email=email;
        this.senha = senha;
        this.confirmaSenha = confirmaSenha;
        
    }



public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getApelido() {
	return apelido;
}
public void setApelido(String apelido) {
	this.apelido = apelido;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getSenha() {
	return senha;
}
public void setSenha(String senha) {
	this.senha = senha;
}
public String getConfirmaSenha() {
	return confirmaSenha;
}
public void setConfirmaSenha(String confirmaSenha) {
	this.confirmaSenha = confirmaSenha;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}




}
