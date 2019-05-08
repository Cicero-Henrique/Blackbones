package blackbones;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Operacoes_Clientes 
{
    public void adicionar(String nome, String email, String endereco, String telefone, String indicacao, String cpf)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        Cliente c = new Cliente(nome, email, endereco, telefone, indicacao, cpf);
        bd.CadastrarCliente(c);
        bd.FecharBanco();
        
    }
    
    public void editar(int id, Registro r, String nome, String email, String endereco, String telefone, String indicacao, String cpf)
    {
        Armazenamento_File a = new Armazenamento_File();
        r.getRegistro().get(id).setNome(nome);
        r.getRegistro().get(id).setEmail(email);
        r.getRegistro().get(id).setEndereco(endereco);
        r.getRegistro().get(id).setTelefone(telefone);
        r.getRegistro().get(id).setIndicacao(indicacao);
        r.getRegistro().get(id).setCpf(cpf);
        try {
            a.salvarCliente(r);
        } catch (IOException ex) {
            Logger.getLogger(Operacoes_Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void remover(Registro r, int id)
    {
        r.getRegistro().remove(id);
    }
    
    public void listar(Registro r)
    {
        int i = 0;
        for(i = 0; i < r.getRegistro().size(); i++)
        {
            System.out.println(i +"- " + r.getRegistro().get(i).getNome() + "- " + r.getRegistro().get(i).getEmail()
                    + "- " +r.getRegistro().get(i).getEndereco() + "- " + r.getRegistro().get(i).getTelefone() 
                    + "- " +r.getRegistro().get(i).getIndicacao() + "- " + r.getRegistro().get(i).getCpf());
        }
    }
}
