package blackbones;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Receita {

    public boolean Verificar_Datas(String dinicial, String dfinal) {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date data_i;
            data_i = formato.parse(dinicial);
            //System.out.println(formato.format(data_i));

            Date data_f;
            data_f = formato.parse(dfinal);
            //System.out.println(formato.format(data_f));

            if (data_f.before(data_i)) {
                return false;
            } else {
                return true;
            }
        } catch (ParseException ex) {
            Logger.getLogger(Receita.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    /*public DefaultListModel main(String data_inicial, String data_final) 
    {
        Armazenamento_File a = new Armazenamento_File();
        ArrayList<Produto> vendidos = new ArrayList<>();

        try 
        {
            Financeiro fp = a.loadConta("pagar");
            Financeiro fr = a.loadConta("receber");
            Financeiro v = a.loadVendas();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String elemento;
            double despesas = 0, lucros = 0, total;
            boolean x = Verificar_Datas(data_inicial, data_final);
            DefaultListModel<String> list = new DefaultListModel();
            String[] strings = null;

            if (x) 
            {
                for (int i = 0; i < fp.getContas_pagar().size(); i++) 
                {
                    if ((fp.getContas_pagar().get(i).getData().after(formato.parse(data_inicial)))
                            && (fp.getContas_pagar().get(i).getData().before(formato.parse(data_final)))) 
                    {
                        elemento = ( "- " + fp.getContas_pagar().get(i).getNome() + " " + fp.getContas_pagar().get(i).getTipo_pagamento()
                                + " " + fp.getContas_pagar().get(i).getValor());
                        list.addElement(elemento);

                        despesas = despesas + fp.getContas_pagar().get(i).getValor();
                    }
                }

                for (int i = 0; i < fr.getContas_receber().size(); i++) 
                {
                    if ((fr.getContas_receber().get(i).getData().after(formato.parse(data_inicial)))
                            && (fr.getContas_receber().get(i).getData().before(formato.parse(data_final)))) 
                    {
                        elemento = ("+ " + fr.getContas_receber().get(i).getNome() + " " + fr.getContas_receber().get(i).getTipo_pagamento()
                                + " " + fr.getContas_receber().get(i).getValor());
                        list.addElement(elemento);
                        
                        lucros = lucros + fr.getContas_receber().get(i).getValor();
                    }
                }

                for (int i = 0; i < v.getVendidos().size(); i++) {
                    if ((v.getVendidos().get(i).getData_venda().after(formato.parse(data_inicial)))
                            && (v.getVendidos().get(i).getData_venda().before(formato.parse(data_final)))) {
                        elemento = ("+ " + v.getVendidos().get(i).getProduto().getNome()
                                + " " + v.getVendidos().get(i).getProduto().getTipo() + " " + v.getVendidos().get(i).getProduto().getQtd()
                                + " " + formato.format(v.getVendidos().get(i).getData_venda())
                                + " " + v.getVendidos().get(i).getProduto().getPreco_venda());
                        
                        list.addElement(elemento);
                        lucros = lucros + v.getVendidos().get(i).getProduto().getPreco_venda();
                    }
                }

                total = lucros - despesas;
                
                list.addElement(Double.toString(total));
                return list;

            } else {
                JOptionPane.showMessageDialog(null, "Data final menor que inicial");
            }

        } catch (IOException ex) {
            Logger.getLogger(Receita.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Receita.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }*/
}
