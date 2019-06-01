package blackbones;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

public class Receita 
{
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    public boolean Verificar_Datas(String dinicial, String dfinal) 
    {
        try 
        {
            Date data_i = formato.parse(dinicial);
            Date data_f = formato.parse(dfinal);

            if (data_f.before(data_i)) 
                return false;
            else 
                return true;
        } catch (ParseException ex) {
            Logger.getLogger(Receita.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
    
    public ArrayList<Conta> pegarContasPagar(String data_inicial, String data_final)
    {
        Operacoes_Contas oc = new Operacoes_Contas();
        Banco_de_Dados bd = new Banco_de_Dados();
        ArrayList<Conta> list = new ArrayList();
        
        boolean x = Verificar_Datas(data_inicial, data_final);
        bd.conectar("blackbones");
        DefaultListModel<String> contasPagar = bd.carregarConta("pagar");
        bd.FecharBanco();
        
        if(x)
        {
            for (int i = 0; i < contasPagar.size(); i++)
            {
                Conta c = oc.gerarConta(contasPagar.get(i));
                if(Verificar_Datas(data_inicial, formato.format(c.getData())) && Verificar_Datas(formato.format(c.getData()), data_final))
                    list.add(c);
            }
            return list;
        }
        return list;
    }
    
    public ArrayList<Conta> pegarContasReceber(String data_inicial, String data_final)
    {
        Operacoes_Contas oc = new Operacoes_Contas();
        Banco_de_Dados bd = new Banco_de_Dados();
        ArrayList<Conta> list = new ArrayList();
        
        boolean x = Verificar_Datas(data_inicial, data_final);
        bd.conectar("blackbones");
        DefaultListModel<String> contasReceber = bd.carregarConta("receber");
        bd.FecharBanco();
        
        if(x)
        {
            for (int i = 0; i < contasReceber.size(); i++)
            {
                Conta c = oc.gerarConta(contasReceber.get(i));
                if(Verificar_Datas(data_inicial, formato.format(c.getData())) && Verificar_Datas(formato.format(c.getData()), data_final))
                    list.add(c);
            }
            return list;
        }
        return list;
    }
    
    public double lucroDeVendas(String data_inicial, String data_final)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        DefaultListModel<String> vendas = bd.carregarVenda();
        Operacoes_Vendas ov = new Operacoes_Vendas();
        
        double lucro = 0.0;
        
        for(int i = 0; i < vendas.size(); i++)
        {
            String venda = ov.gerarVenda(vendas.get(i));
            String[] aux = venda.split("-");
            String dataVenda = aux[1];
            if(Verificar_Datas(data_inicial, dataVenda) && Verificar_Datas(dataVenda, data_final))
            {
                int idVenda = Integer.parseInt(aux[0].trim());
                DefaultListModel<String> produtoVendas = bd.carregarProduto_Venda(idVenda);
                for(int j = 0; j < produtoVendas.size(); j++)
                {
                    aux = produtoVendas.get(j).split("-");
                    aux = aux[6].split(":");
                    double lucroParcial = Double.parseDouble(aux[1].trim());
                    aux = produtoVendas.get(j).split("-");
                    aux = aux[5].split(":");
                    int quantidade = Integer.parseInt(aux[1].trim());
                    lucro =  lucro + lucroParcial*quantidade;
                }
            }
        }
        bd.FecharBanco();
        return lucro;
    }
    
    public ArrayList pegarVendas(String data_inicial, String data_final)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        boolean x = Verificar_Datas(data_inicial, data_final);
        bd.conectar("blackbones");
        DefaultListModel<String> vendas = bd.carregarVenda();
        ArrayList<String> array = new ArrayList<>();
        bd.FecharBanco();
        
        if(x)
        {
            for (int i = 0; i < vendas.size(); i++) 
            {
                Operacoes_Vendas ov =  new Operacoes_Vendas();
                String v = ov.gerarVenda(vendas.get(i));
                String[] venda = v.split("-");
                if(Verificar_Datas(data_inicial, venda[1])  && Verificar_Datas(venda[1], data_final))
                    array.add(v);
            }
            return array;
        }
        return array;
    }
}