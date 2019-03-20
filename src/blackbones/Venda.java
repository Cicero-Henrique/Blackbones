package blackbones;

import java.util.ArrayList;
import java.util.Date;

public class Venda 
{
    private Date data_venda;
    private Produto produto;

    public Date getData_venda() {return data_venda;}
    public Produto getProduto() {return produto;}

    public void setProduto(Produto produto) {this.produto = produto;}
    public void setData_venda(Date data_venda) {this.data_venda = data_venda;} 
    
    
}
