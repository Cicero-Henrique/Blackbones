package blackbones;

public class Fornecedor 
{
    private String nome, apelido, rg, telefone, email, tipo;

    public Fornecedor(String nome, String apelido, String rg, String telefone, String email, String tipo) 
    {
        this.nome = nome;
        this.apelido = apelido;
        this.rg = rg;
        this.telefone = telefone;
        this.email = email;
        this.tipo = tipo;
    }

    public String getApelido() {return apelido;}
    public String getEmail() {return email;}
    public String getNome() {return nome;}
    public String getRg() {return rg;}
    public String getTelefone() {return telefone;}
    public String getTipo() {return tipo;}
    
    public void setApelido(String apelido) {this.apelido = apelido;}
    public void setEmail(String email) {this.email = email;}
    public void setNome(String nome) {this.nome = nome;}
    public void setRg(String rg) {this.rg = rg;}
    public void setTelefone(String telefone) {this.telefone = telefone;}
    public void setTipo(String tipo) {this.tipo = tipo;}
}
