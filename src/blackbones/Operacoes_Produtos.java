package blackbones;

import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            f = a.loadVendas();
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
    
    public int pegarID(String line)
    {
        String linha[] = new String[7];
        linha = line.split("-");
        String numero[] = linha[0].split(":");
        return Integer.parseInt(numero[1].trim());
    }
    
}
