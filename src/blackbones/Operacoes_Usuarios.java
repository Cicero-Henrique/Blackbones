package blackbones;

import javax.swing.JOptionPane;

public class Operacoes_Usuarios 
{
    public void adicionar(String usuario, String email, String senha)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        Usuario u = new Usuario(usuario, email, senha);
        if(bd.PesquisarUsuario(usuario) == null)
            JOptionPane.showMessageDialog(null, "Usuário já existente.");
        else
            bd.CadastrarUsuario(u);
        bd.FecharBanco();
        
    }
    
    public void editar(int id, String usuario, String email, String senha)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        Usuario u = new Usuario(usuario, email, senha);
        if(bd.PesquisarUsuario(usuario) == null)
            JOptionPane.showMessageDialog(null, "Usuário já existente.");
        else
            bd.EditarUsuario(u, usuario);
        bd.FecharBanco();
        
    }
    
    public void remover(String usuario)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        if(bd.PesquisarUsuario(usuario) == null)
            JOptionPane.showMessageDialog(null, "Usuário já inexistente.");
        else
            bd.RemoverUsuario(usuario);
        bd.FecharBanco();
    }
    
    public boolean login(String usuario, String senha)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        Usuario u = bd.PesquisarUsuario(usuario);
        if(u == null)
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
