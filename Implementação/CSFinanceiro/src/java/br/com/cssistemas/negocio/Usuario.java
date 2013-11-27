package br.com.cssistemas.negocio;




import java.util.Objects;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
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

    public Usuario( String nome, String apelido,String email, String senha) {
        
        this.nome = nome;
        this.apelido = apelido;
        this.email=email;
        this.senha = senha;
        
        
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + Objects.hashCode(this.apelido);
        hash = 59 * hash + Objects.hashCode(this.email);
        hash = 59 * hash + Objects.hashCode(this.senha);
        hash = 59 * hash + Objects.hashCode(this.confirmaSenha);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.apelido, other.apelido)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.confirmaSenha, other.confirmaSenha)) {
            return false;
        }
        return true;
    }




}
