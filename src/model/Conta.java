package model;

import java.util.Date;

public class Conta 
{   
    private double valor;
    private String nome, tipo_pagamento, tipo_conta, status;
    private Date data;

    public Conta(double valor, String nome, Date data, String tipo_pagamento, String tipo_conta, String status) 
    {
        this.valor = valor;
        this.nome = nome;
        this.data = data;
        this.tipo_pagamento = tipo_pagamento;
        this.tipo_conta = tipo_conta;
        this.status = status;
    }
    
    public Date getData() {return data;}
    public String getNome() {return nome;}
    public String getTipo_pagamento() {return tipo_pagamento;}
    public double getValor() {return valor;}
    public String getTipo_conta() {return tipo_conta;}
    public String getStatus() {return status;}
    

    public void setData(Date data) {this.data = data;}
    public void setNome(String nome) {this.nome = nome;}
    public void setTipo_pagamento(String tipo_pagamento) {this.tipo_pagamento = tipo_pagamento;}
    public void setValor(double valor) {this.valor = valor;}    
    public void setTipo_conta(String tipo_conta) {this.tipo_conta = tipo_conta;}
    public void setStatus(String status) {this.status = status;}
       
}
