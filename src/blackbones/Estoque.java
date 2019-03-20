package blackbones;

import java.util.ArrayList;

public class Estoque 
{
    private ArrayList<Produto> produtos = new ArrayList<>();

    public ArrayList<Produto> getProdutos() {return produtos;}
    public void setProdutos(ArrayList<Produto> produtos) {this.produtos = produtos;}
}
