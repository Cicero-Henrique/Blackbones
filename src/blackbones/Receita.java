package blackbones;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Receita {

    public boolean Verificar_Datas(String dinicial, String dfinal) {
        try 
        {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date data_i;
            data_i = formato.parse(dinicial);

            Date data_f;
            data_f = formato.parse(dfinal);

            if (data_f.before(data_i)) 
                return false;
            else 
                return true;
            
        } catch (ParseException ex) {
            Logger.getLogger(Receita.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public DefaultListModel main(String data_inicial, String data_final) 
    {

        
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String elemento;
            double despesas = 0, lucros = 0, total;
            boolean x = Verificar_Datas(data_inicial, data_final);
            DefaultListModel<String> list = new DefaultListModel();
            String[] strings = null;

            if (x) 
            {
                Operacoes_Contas oc = new Operacoes_Contas();
                Banco_de_Dados bd = new Banco_de_Dados();
                bd.conectar("blackbones");
                DefaultListModel<String> contasPagar = bd.carregarConta("pagar");
                DefaultListModel<String> contasReceber = bd.carregarConta("receber");
                DefaultListModel<String> vendas = bd.carregarVenda();
                
                for (int i = 0; i < contasPagar.size(); i++) 
                {
                    Conta c = oc.gerarConta(contasPagar.get(i));
                    if(Verificar_Datas(data_inicial, formato.format(c.getData())) && Verificar_Datas(formato.format(c.getData()), data_final))
                        list.addElement(contasPagar.get(i));
                }
                
                for (int i = 0; i < contasReceber.size(); i++) 
                {
                    Conta c = oc.gerarConta(contasPagar.get(i));
                    if(Verificar_Datas(data_inicial, formato.format(c.getData())) && Verificar_Datas(formato.format(c.getData()), data_final))
                        list.addElement(contasPagar.get(i));
                }
                
                for (int i = 0; i < vendas.size(); i++) 
                {
                    Operacoes_Vendas ov =  new Operacoes_Vendas();
                    String v = ov.gerarVenda(vendas.get(i));
                    String[] venda = v.split("-");
                    if(Verificar_Datas(data_inicial, venda[0])  && Verificar_Datas(venda[0], data_final))
                        list.addElement(vendas.get(i));
                }
                bd.FecharBanco();

                total = lucros - despesas;
                
                list.addElement(Double.toString(total));
                return list;
            } 
            else 
                JOptionPane.showMessageDialog(null, "Data final menor que inicial");
            
        return null;
    }
}
