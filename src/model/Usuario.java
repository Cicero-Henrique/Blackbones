package model;

public class Usuario 
{
    private String usuario, senha, email;

    public Usuario(String usuario, String senha, String email) 
    {
        this.usuario = usuario;
        this.senha = senha;
        this.email = email;
    }

    public String getEmail() {return email;}
    public String getSenha() {return senha;}
    public String getUsuario() {return usuario;}

    
    public void setEmail(String email) {this.email = email;}
    public void setSenha(String senha) {this.senha = senha;}
    public void setUsuario(String usuario) {this.usuario = usuario;}
    
}
