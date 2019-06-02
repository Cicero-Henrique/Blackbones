package model;

public class Cliente 
{
    private String nome, email, telefone, endereco, indicacao, cpf;

    public Cliente(String nome, String email, String endereco, String telefone, String indicacao, String cpf) 
    {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.indicacao = indicacao;
        this.cpf = cpf;     
    }

    public String getEmail() {return email;}
    public String getNome() {return nome;}
    public String getCpf() {return cpf;}
    public String getIndicacao() {return indicacao;}
    public String getTelefone() {return telefone;}
    public String getEndereco() {return endereco;}
    
    
    public void setEmail(String email) {this.email = email;}
    public void setNome(String nome) {this.nome = nome;}
    public void setCpf(String cpf) {this.cpf = cpf;}
    public void setIndicacao(String indicacao) {this.indicacao = indicacao;}
    public void setTelefone(String telefone) {this.telefone = telefone;}
    public void setEndereco(String endereco) {this.endereco = endereco;}
    
}
