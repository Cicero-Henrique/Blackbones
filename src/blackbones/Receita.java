package blackbones;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Receita 
{
    public boolean Verificar_Datas(String dinicial, String dfinal)
    {
        try 
        {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date data_i;
            data_i = formato.parse(dinicial);
            //System.out.println(formato.format(data_i));
            
            Date data_f;
            data_f = formato.parse(dfinal);
            //System.out.println(formato.format(data_f));
            
            if(data_f.before(data_i))
                return false;
            else
                return true;
        } 
        catch (ParseException ex) {
            Logger.getLogger(Receita.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
    
    public void main() 
    {
        Armazenamento_File a = new Armazenamento_File();
        ArrayList vendidos = new ArrayList<Produto>();
        try 
        {
            Financeiro fp = a.loadConta("pagar");
            Financeiro fr = a.loadConta("receber");
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String data_inicial = "10/03/2019", data_final = "27/12/2019";
            double despesas = 0, lucros = 0, total;
            boolean x = Verificar_Datas(data_inicial, data_final);
            
            if(x)
            {
                for(int i = 0; i < fp.getContas_pagar().size(); i++)
                {
                    if((fp.getContas_pagar().get(i).getData().after(formato.parse(data_inicial))) && 
                            (fp.getContas_pagar().get(i).getData().before(formato.parse(data_final))))
                    {
                        System.out.println(fp.getContas_pagar().get(i).getNome() + " " + fp.getContas_pagar().get(i).getTipo_pagamento()
                            + " " + fp.getContas_pagar().get(i).getValor());
                        
                        despesas = despesas + fp.getContas_pagar().get(i).getValor();
                    }
                }
                
                for(int i = 0; i < fr.getContas_receber().size(); i++)
                {    
                    if((fr.getContas_receber().get(i).getData().after(formato.parse(data_inicial))) && 
                            (fr.getContas_receber().get(i).getData().before(formato.parse(data_final))))
                    {
                        System.out.println(fr.getContas_receber().get(i).getNome() + " " + fr.getContas_receber().get(i).getTipo_pagamento()
                            + " " + fr.getContas_receber().get(i).getValor());
                        
                        lucros = lucros + fr.getContas_receber().get(i).getValor();
                    }
                }
                total = lucros -  despesas;
                System.out.println("receita total = " + total);
            }
            else
                JOptionPane.showMessageDialog(null, "Data final menor que inicial");
                
            
        } catch (IOException ex) {
            Logger.getLogger(Receita.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Receita.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        
    }
}