package blackbones;

public class Produto 
{
    private String nome, tipo, tamanho;
    private int qtd;
    private double preco_custo, preco_venda, margem_lucro; 

    public Produto(String nome, String tipo, double custo, double venda, double margem, int qtd, String tamanho)
    {
        this.nome = nome;
        this.tipo = tipo;
        this.preco_custo = custo;
        this.preco_venda = venda;
        this.margem_lucro = margem;
        this.qtd = qtd;
        this.tamanho = tamanho;
    }

    public String getNome() {return nome;}
    public String getTipo() {return tipo;}
    public double getMargem_lucro() {return margem_lucro;}
    public double getPreco_custo() {return preco_custo;}
    public double getPreco_venda() {return preco_venda;}
    public int getQtd() {return qtd;}
    public String getTamanho() {return tamanho;}
        
    public void setMargem_lucro(double margem_lucro) {this.margem_lucro = margem_lucro;}
    public void setPreco_custo(double preco_custo) {this.preco_custo = preco_custo;}
    public void setPreco_venda(double preco_venda) {this.preco_venda = preco_venda;}
    public void setNome(String nome) { this.nome = nome;}
    public void setTipo(String tipo) {this.tipo = tipo;}
    public void setQtd(int qtd) {this.qtd = qtd;}
    public void setTamanho(String tamanho) {this.tamanho = tamanho;}
    
}
