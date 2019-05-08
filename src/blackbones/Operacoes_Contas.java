package blackbones;

import java.text.SimpleDateFormat;
import java.util.Date;

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
    
    public void editar(int id, Financeiro f, double valor, String nome, Date data, String tipo_pagamento, String tipo_conta, String status)
    {
        if(tipo_conta.equals("pagar"))
        {
            f.getContas_pagar().get(id).setNome(nome);
            f.getContas_pagar().get(id).setValor(valor);
            f.getContas_pagar().get(id).setData(data);
            f.getContas_pagar().get(id).setTipo_pagamento(tipo_pagamento);
            f.getContas_pagar().get(id).setTipo_conta(tipo_conta);
            f.getContas_pagar().get(id).setStatus(status);
        }
        else
        {
            f.getContas_receber().get(id).setNome(nome);
            f.getContas_receber().get(id).setValor(valor);
            f.getContas_receber().get(id).setData(data);
            f.getContas_receber().get(id).setTipo_pagamento(tipo_pagamento);
            f.getContas_receber().get(id).setTipo_conta(tipo_conta);
            f.getContas_receber().get(id).setStatus(status);
        }
    }
    
    public void remover(Financeiro f, int id, String tipo_conta)
    {
        if(tipo_conta.equals("pagar"))
        {
           f.getContas_pagar().remove(id);
        }
        else
        {
            f.getContas_receber().remove(id);
        }
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
    
    
}
