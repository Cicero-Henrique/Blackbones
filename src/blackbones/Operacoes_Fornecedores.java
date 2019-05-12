
package blackbones;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Operacoes_Fornecedores 
{
    public void adicionar(String nome, String cnpj, String telefone, String email, String tipo)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        Fornecedor f = new Fornecedor(nome, cnpj, telefone, email, tipo);
        bd.CadastrarFornecedor(f);
        bd.FecharBanco();
        
    }
    
    public void editar(int id, String nome, String cnpj, String telefone, String email, String tipo)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        Fornecedor f = new Fornecedor(nome, cnpj, telefone, email, tipo);
        bd.EditarFornecedor(f, id);
        bd.FecharBanco();
    }
    
    public void remover(Registro r, int id)
    {
        r.getFornecedores().remove(id);
    }
    
    public int pegarID(String line)
    {
        String linha[] = new String[6];
        linha = line.split("-");
        String numero[] = linha[0].split(":");
        return Integer.parseInt(numero[1].trim());
    }
    
}
