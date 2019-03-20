package blackbones;

public class Cliente 
{
    private String nome, email, endereco, telefone, indicacao, cpf;
    //private Conta conta;

    public Cliente(String nome, String email, String endereco, String telefone, String indicacao, String cpf)//, Conta conta) 
    {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.indicacao = indicacao;
        this.cpf = cpf;
        //this.conta = conta;
    }

    public String getEmail() {return email;}
    public String getNome() {return nome;}
    public String getCpf() {return cpf;}
    public String getEndereco() {return endereco;}
    public String getIndicacao() {return indicacao;}
    public String getTelefone() {return telefone;}
    //public Conta getConta() {return conta;}
    
    public void setEmail(String email) {this.email = email;}
    public void setNome(String nome) {this.nome = nome;}
    public void setCpf(String cpf) {this.cpf = cpf;}
    public void setEndereco(String endereco) {this.endereco = endereco;}
    public void setIndicacao(String indicacao) {this.indicacao = indicacao;}
    public void setTelefone(String telefone) {this.telefone = telefone;}
    //public void setConta(Conta conta) {this.conta = conta;}
    
}
