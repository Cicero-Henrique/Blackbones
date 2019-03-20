package blackbones;

public class Operacoes_Produtos 
{
    public Estoque adicionar_produto(Estoque a, String nome, String tipo, double preco_custo, double preco_venda, double margem_lucro, int qtd, String tamanho)
    {
        Produto p = new Produto(nome, tipo, preco_custo, preco_venda, margem_lucro, qtd, tamanho);
        a.getProdutos().add(p);
        return a;
    }
    
    public Estoque editar(Estoque a, int id, String nome, String tipo, double custo, double venda, double margem, int qtd, String tamanho)
    {
        a.getProdutos().get(id).setNome(nome);
        a.getProdutos().get(id).setTipo(tipo);
        a.getProdutos().get(id).setPreco_custo(custo);
        a.getProdutos().get(id).setPreco_venda(venda);
        a.getProdutos().get(id).setMargem_lucro(margem);
        a.getProdutos().get(id).setQtd(qtd);
        a.getProdutos().get(id).setTamanho(tamanho);
        return a;
    }
    
    public void vender(Estoque a, int id, int qtd)
    {
        a.getProdutos().get(id).setQtd(a.getProdutos().get(id).getQtd() - qtd);
        double receita  = a.getProdutos().get(id).getPreco_venda() * qtd;
        
        a.getProdutos().remove(id);
        //somar os lucros e fazer as contas
    }
    
    public void listar(Estoque a)
    {
        int i = 0;
        for(i = 0; i < a.getProdutos().size(); i++)
        {
            System.out.println(i + "-" + a.getProdutos().get(i).getNome() + " - " + a.getProdutos().get(i).getTipo() + " - Margem:" + a.getProdutos().get(i).getMargem_lucro());
        }
    }
}
