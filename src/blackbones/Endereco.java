package blackbones;

public class Endereco 
{
    private String estado, cidade, bairro, rua;
    private int numero;

    public Endereco(String estado, String cidade, String bairro, String rua, int numero) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    public String getBairro() {return bairro;}
    public String getCidade() {return cidade;}
    public String getEstado() {return estado;}
    public int getNumero() {return numero;}
    public String getRua() {return rua;}

    public void setBairro(String bairro) {this.bairro = bairro;}
    public void setCidade(String cidade) {this.cidade = cidade;}
    public void setEstado(String estado) {this.estado = estado;}
    public void setNumero(int numero) {this.numero = numero;}
    public void setRua(String rua) {this.rua = rua;}
       
}
