package blackbones;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Operacoes_Contas 
{
    public void adicionar(double valor, String nome, Date data, String tipo_pagamento, String tipo_conta, String status)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        Conta c = new Conta(valor, nome, data, tipo_pagamento, tipo_conta, status);
        bd.CadastrarConta(c);
        bd.FecharBanco();

    }
    
    public void editar(int id, double valor, String nome, Date data, String tipo_pagamento, String tipo_conta, String status)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        Conta c = new Conta(valor, nome, data, tipo_pagamento, tipo_conta, status);
        bd.EditarConta(c, id);
        bd.FecharBanco();
    }
    
    public void remover(int id)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        bd.RemoverConta(id);
        bd.FecharBanco();
    }
    
    public void listar(Financeiro f, String tipo_conta)
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        int i = 0;
        if(tipo_conta.equals("pagar"))
        {
            for(i = 0; i < f.getContas_pagar().size(); i++)
            {
                System.out.println(i +"- " + f.getContas_pagar().get(i).getNome() + "- " + formato.format(f.getContas_pagar().get(i).getData())
                        + "- " +f.getContas_pagar().get(i).getTipo_pagamento() + "- " + f.getContas_pagar().get(i).getStatus());
            }
        }
        else
        {
            for(i = 0; i < f.getContas_pagar().size(); i++)
            {
                System.out.println(i +"- " + f.getContas_receber().get(i).getNome() + "- " + formato.format(f.getContas_receber().get(i).getData())
                        + "- " +f.getContas_receber().get(i).getTipo_pagamento() + "- " + f.getContas_receber().get(i).getStatus());
            }
        }
    }
    
    
    public String[] cortarString(String line)
    {
        String linha[] = new String[7];
        linha = line.split("-");
        return linha = line.split("-");   
        
    }
    
    public Conta gerarConta(String s)                                   // Transform one line saved in a file in an Object of type Product 
    {
        
        try 
        {
            String atributos[] = cortarString(s);
            
            String ano = atributos[5].split(":")[1].trim();
            String mes = atributos[6].trim();
            String dia = atributos[7].trim();
        
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date data = formato.parse(dia+"/"+mes+"/"+ano);
            
            Conta conta = new Conta(Double.parseDouble(atributos[4].split(":")[1]), atributos[1].split(":")[1], data, atributos[2].split(":")[1], 
                    atributos[5].split(":")[1], atributos[3].split(":")[1]);
            return conta;
            
        } catch (ParseException ex) {
            Logger.getLogger(Operacoes_Contas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null; 
    }
    
    public int pegarID(String line)
    {
        String linha[] = new String[6];
        linha = line.split("-");
        String numero[] = linha[0].split(":");
        
        return Integer.parseInt(numero[1].trim());
    }
    
}
