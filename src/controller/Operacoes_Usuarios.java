package controller;

import model.Usuario;
import javax.swing.JOptionPane;

public class Operacoes_Usuarios 
{
    public void adicionar(String login, String email, String senha)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        Usuario u = new Usuario(login, senha, email);
        Usuario aux = bd.PesquisarUsuario(login);
        if(aux.getUsuario().equals(login))
            JOptionPane.showMessageDialog(null, "Usuário já existente.");
        else
            bd.CadastrarUsuario(u);
        bd.FecharBanco();
        
    }
    
    public void editar(String loginAntigo, String login, String email, String senha)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        Usuario u = new Usuario(login, senha, email);

        bd.EditarUsuario(u, loginAntigo);
        bd.FecharBanco();
        
    }
    
    public void remover(String login)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        bd.RemoverUsuario(login);
        bd.FecharBanco();
    }
    
    public boolean login(String usuario, String senha)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        Usuario u = bd.PesquisarUsuario(usuario);
        if(u.getUsuario().equals("0"))
            JOptionPane.showMessageDialog(null, "Usuário já inexistente.");
        else
        {
            if(senha.equals(u.getSenha()))
            {
                bd.FecharBanco();
                return true;
            }
        }
        bd.FecharBanco();
        return false;
    }
}
