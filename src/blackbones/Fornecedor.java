package blackbones;

public class Fornecedor 
{
    private String nome, cnpj, telefone, email, tipo;
    private Endereco endereco;

    public Fornecedor(String nome, String cnpj, String telefone, String email, String tipo) 
    {
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.email = email;
        this.tipo = tipo;
    }

    public String getEmail() {return email;}
    public String getNome() {return nome;}
    public String getCnpj() {return cnpj;}
    public String getTelefone() {return telefone;}
    public String getTipo() {return tipo;}
    
    
    public void setEmail(String email) {this.email = email;}
    public void setNome(String nome) {this.nome = nome;}
    public void setCnpj(String cnpj) {this.cnpj = cnpj;}
    public void setTelefone(String telefone) {this.telefone = telefone;}
    public void setTipo(String tipo) {this.tipo = tipo;}
    
}
