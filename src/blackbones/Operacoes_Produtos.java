package blackbones;

import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    public void vender(Estoque e, int id, int qtd)
    {
        try 
        {
            Armazenamento_File a = new Armazenamento_File();
            Financeiro f = new Financeiro();
            Venda v = new Venda();
            Date d = new Date();

            //adicionar ao histórico de vendas
            v.setProduto(e.getProdutos().get(id));
            v.setData_venda(d);
            f.getVendidos().add(v);
            a.salvarVendas(f);
            
            //reduzir do estoque
            int nova_qtd = e.getProdutos().get(id).getQtd() - qtd;
            if(nova_qtd > 0)
            {
                e.getProdutos().get(id).setQtd(e.getProdutos().get(id).getQtd() - qtd);
                System.out.println(e.getProdutos().get(id).getQtd());
            }
            else
                e.getProdutos().remove(id);
            
            System.out.println("VENDIDOS");
            for(int i = 0; i < f.getVendidos().size(); i++)
                System.out.println(f.getVendidos().get(i).getProduto().getNome());
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Operacoes_Produtos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void listar(Estoque a)
    {
        int i = 0;
        for(i = 0; i < a.getProdutos().size(); i++)
        {
            System.out.println(i + "-" + a.getProdutos().get(i).getNome() + " - " + a.getProdutos().get(i).getTipo() +
                    " - Margem:" + a.getProdutos().get(i).getMargem_lucro());
        }
    }
}
