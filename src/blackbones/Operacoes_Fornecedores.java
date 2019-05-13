
package blackbones;


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
        String linha[] = new String[6];
        linha = line.split("-");
        return linha = line.split("-");   
        
    }
    
    public int pegarID(String line)
    {
        String linha[] = new String[6];
        linha = line.split("-");
        String numero[] = linha[0].split(":");
        return Integer.parseInt(numero[1].trim());
    }
    
    public Fornecedor gerarFornecedor(String s)                                   // Transform one line saved in a file in an Object of type Product 
    {
        String atributos[];
        
        atributos = cortarString(s);
        
        Fornecedor fornecedor = new Fornecedor(atributos[1], atributos[2], atributos[3], atributos[4], atributos[5]);
        
        return fornecedor; 
    }
    
}
