package blackbones;

public class Operacoes_Endereco 
{
    public void adicionar(String estado, String cidade, String bairro, String rua, int numero, int idfornecedor)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        Endereco e = new Endereco(estado, cidade, bairro, rua, numero);
        bd.CadastrarEndereco(e, idfornecedor);
        bd.FecharBanco();
        
    }
    
    public void editar(String estado, String cidade, String bairro, String rua, int numero, int idfornecedor)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        Endereco e = new Endereco(estado, cidade, bairro, rua, numero);
        bd.EditarEndereco(e, idfornecedor);
        bd.FecharBanco();
    }
    
    /*public void remover(int id)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        bd.RemoverEndereco(id);
        bd.FecharBanco();
    }*/
    
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
    
    public Endereco gerarEndereco(String s)                                   // Transform one line saved in a file in an Object of type Product 
    {
        String atributos[];
        
        atributos = cortarString(s);
        
        Endereco endereco = new Endereco(atributos[1], atributos[2], atributos[3], atributos[4], Integer.parseInt(atributos[5]));
        
        return endereco; 
    }
    
    
    
}
