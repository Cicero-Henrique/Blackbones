
package blackbones;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Operacoes_Fornecedores 
{
    public Registro adicionar(Registro r, String nome, String cnpj, String telefone, String email, String tipo)
    {
        Fornecedor f = new Fornecedor(nome, cnpj, telefone, email, tipo);
        r.getFornecedores().add(f);
        return r;
    }
    
    public void editar(int id, Registro r, String nome, String cnpj, String telefone, String email, String tipo)
    {
        Armazenamento_File a = new Armazenamento_File();
        r.getFornecedores().get(id).setNome(nome);
        r.getFornecedores().get(id).setCnpj(cnpj);
        r.getFornecedores().get(id).setTelefone(telefone);
        r.getFornecedores().get(id).setEmail(email);
        r.getFornecedores().get(id).setTipo(tipo);
        
        try 
        {
            a.salvarCliente(r);
        } catch (IOException ex) 
        {
            Logger.getLogger(Operacoes_Fornecedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void remover(Registro r, int id)
    {
        r.getFornecedores().remove(id);
    }
    
}
