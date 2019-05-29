package blackbones;

import javax.swing.DefaultListModel;
import view.Estatisticas;
import view.Login;

public class BlackBones 
{
    public static void main(String[] args) 
    {
        
        Estatisticas e = new Estatisticas();
        e.setVisible(true);
        /*Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        DefaultListModel<String> produtoVendas = bd.carregarProduto_Venda(2);
        bd.FecharBanco();
        for(int i = 0; i <produtoVendas.size(); i++)
            System.out.println(produtoVendas.get(i));*/
        
    }
}