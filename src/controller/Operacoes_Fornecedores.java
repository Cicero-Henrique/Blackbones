package controller;

import model.Fornecedor;
import javax.swing.DefaultListModel;


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
    
    public void remover(int id)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        bd.RemoverFornecedor(id);
        bd.FecharBanco();
    }
    
    public String[] cortarString(String line)
    {
        return line.split("-");   
    }
    
    public int pegarID(String line)
    {
        String linha[] = line.split("-");
        String numero[] = linha[0].split(":");
        return Integer.parseInt(numero[1].trim());
    }
    
    public Fornecedor gerarFornecedor(String s)                                   // Transform one line saved in a file in an Object of type Product 
    {
        String atributos[];
        
        atributos = cortarString(s);
        atributos[1] = atributos[1].trim().split(":")[1];
        atributos[2] = atributos[2].trim().split(":")[1];
        atributos[3] = atributos[3].trim().split(":")[1];
        atributos[4] = atributos[4].trim().split(":")[1];
        atributos[5] = atributos[5].trim().split(":")[1];
        Fornecedor fornecedor = new Fornecedor(atributos[1], atributos[2], atributos[3], atributos[4], atributos[5]);
        
        return fornecedor; 
    }
    
    public int ultimoID()
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        DefaultListModel<String> listaFornecedores = bd.carregarFornecedor();
        bd.FecharBanco();
        String[] ultimoFornecedor = cortarString(listaFornecedores.get(listaFornecedores.size() - 1));
        int id = Integer.parseInt(ultimoFornecedor[0].split(":")[1].trim());
        return id;
    }
    
}
