package blackbones;

import model.Conta;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Operacoes_Contas 
{
    public void adicionar(double valor, String nome, Date data, String tipo_pagamento, String tipo_conta, String status, int id_cliente)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        Conta c = new Conta(valor, nome, data, tipo_pagamento, tipo_conta, status);
        if(tipo_conta.equals("pagar"))
            bd.CadastrarConta(c, -1);
        else
            bd.CadastrarConta(c, id_cliente);            
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
    
    public String[] cortarString(String line)
    {
        return line.split("-");   
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
            
        } catch (ParseException ex) 
        {
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
