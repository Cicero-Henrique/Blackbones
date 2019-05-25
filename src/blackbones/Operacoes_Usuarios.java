package blackbones;

import javax.swing.JOptionPane;

public class Operacoes_Usuarios 
{
    public void adicionar(String login, String email, String senha)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        Usuario u = new Usuario(login, email, senha);
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
        Usuario u = new Usuario(login, email, senha);   //Cria um novo usuário com os novos dados
        Usuario aux = bd.PesquisarUsuario(login);       //Verifica se já existe algum usuário com esse login (Não podem haver usuários com logins iguais)
        
        if(aux.getUsuario().equals(login))
            JOptionPane.showMessageDialog(null, "Usuário já existente.");
        else
            bd.EditarUsuario(u, loginAntigo);           //Se não houver usuários com logins repetidos
        bd.FecharBanco();
        
    }
    
    public void remover(String login)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        Usuario aux = bd.PesquisarUsuario(login);
        if(aux.getUsuario().equals(login))
            JOptionPane.showMessageDialog(null, "Usuário já inexistente.");
        else
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
                return true;
        }
        bd.FecharBanco();
        return false;
    }
    
    
}
