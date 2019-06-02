package controller;

import model.Produto;
import javax.swing.DefaultListModel;

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
    
    public void vender(int idProduto, int qtd, Produto p)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        bd.CadastrarVenda(p, idProduto);
        
        DefaultListModel<String> listaDeVendas = bd.carregarVenda();
        String[]  infoVenda = listaDeVendas.get(listaDeVendas.size()-1).split("-");
        int idVenda = Integer.parseInt(infoVenda[0].split(":")[1].trim());
        bd.CadastrarProduto_Venda(p, idProduto, idVenda, qtd);
        
        
        if(qtd == p.getQtd())
        {
            bd.RemoverProduto(idProduto);
            bd.FecharBanco();
        }
        else
        {
            p.setQtd(p.getQtd() - qtd);
            bd.EditarProduto(p, idProduto);
            bd.FecharBanco();
        }
    }
    
    public int pegarID(String line)
    {
        String linha[] = new String[7];
        linha = line.split("-");
        String numero[] = linha[0].split(":");
        return Integer.parseInt(numero[1].trim());
    }
    
    public String[] cortarString(String line)
    {
        return line.split("-");   
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
