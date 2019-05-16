package blackbones;

public class Operacoes_Produtos 
{
    public void adicionar_produto(String nome, String tipo, double preco_custo, double preco_venda, double margem_lucro, int qtd, String tamanho)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        Produto p = new Produto(nome, tipo, preco_custo, preco_venda, margem_lucro, qtd, tamanho);
        bd.CadastrarProduto(p);
        bd.FecharBanco();
    }
    
    public void editar(int id, String nome, String tipo, double custo, double venda, double margem, int qtd, String tamanho)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        Produto p = new Produto(nome, tipo, custo, venda, margem, qtd, tamanho);
        bd.EditarProduto(p, id);
        bd.FecharBanco();
    }
    
    public void vender(int id, int qtd, Produto p)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        bd.CadastrarVenda(p, id);
        
        if(qtd == p.getQtd())
        {
            bd.RemoverProduto(id);
            bd.FecharBanco();
        }
        else
        {
            p.setQtd(p.getQtd() - qtd);
            bd.EditarProduto(p, id);
            bd.FecharBanco();
        }
    }
    
    /*public void listar(Estoque a)
    {
        int i = 0;
        for(i = 0; i < a.getProdutos().size(); i++)
        {
            System.out.println(i + "-" + a.getProdutos().get(i).getNome() + " - " + a.getProdutos().get(i).getTipo() +
                    " - Margem:" + a.getProdutos().get(i).getMargem_lucro());
        }
    }*/
    
    public int pegarID(String line)
    {
        String linha[] = new String[7];
        linha = line.split("-");
        String numero[] = linha[0].split(":");
        return Integer.parseInt(numero[1].trim());
    }
    
    public String[] cortarString(String line)
    {
        String linha[] = new String[7];
        linha = line.split("-");
        return linha = line.split("-");   
        
    }
    
    public Produto gerarProduto(String s)                                   // Transform one line saved in a file in an Object of type Product 
    {
        String atributos[];
        
        atributos = cortarString(s);
        atributos[0] = atributos[0].split(":")[1];
        atributos[1] = atributos[1].split(":")[1];
        atributos[2] = atributos[2].split(":")[1];
        atributos[3] = atributos[3].split(":")[1];
        atributos[4] = atributos[4].split(":")[1];
        atributos[5] = atributos[5].split(":")[1];
        atributos[6] = atributos[6].split(":")[1];
        atributos[7] = atributos[7].split(":")[1];
        
        Produto produto = new Produto(atributos[1], atributos[2], Double.parseDouble(atributos[5]), Double.parseDouble(atributos[6]), Double.parseDouble(atributos[7]), 
                Integer.parseInt(atributos[4]), atributos[3]);
        
        return produto; 
    }
    
}
