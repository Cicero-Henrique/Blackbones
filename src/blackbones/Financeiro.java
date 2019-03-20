package blackbones;

import java.util.ArrayList;

public class Financeiro 
{
    private ArrayList<Conta> contas_pagar = new ArrayList<>();
    private ArrayList<Conta> contas_receber = new ArrayList<>();

    public ArrayList<Conta> getContas_receber() {return contas_receber;}
    public ArrayList<Conta> getContas_pagar() {return contas_pagar;}

    public void setContas_receber(ArrayList<Conta> contas_receber) {this.contas_receber = contas_receber;}
    public void setContas_pagar(ArrayList<Conta> contas_pagar) {this.contas_pagar = contas_pagar;}
}
