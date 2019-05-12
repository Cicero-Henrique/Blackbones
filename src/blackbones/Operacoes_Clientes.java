package blackbones;



public class Operacoes_Clientes 
{
    public void adicionar(String nome, String email, String endereco, String telefone, String indicacao, String cpf)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        Cliente c = new Cliente(nome, email, endereco, telefone, indicacao, cpf);
        bd.CadastrarCliente(c);
        bd.FecharBanco();
        
    }
    
    public void editar(int id, String nome, String email, String endereco, String telefone, String indicacao, String cpf)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        Cliente c = new Cliente(nome, email, endereco, telefone, indicacao, cpf);
        bd.EditarCliente(c, id);
        bd.FecharBanco();
        
    }
    
    public void remover(Registro r, int id)
    {
        r.getRegistro().remove(id);
    }
    
    public void listar(Registro r)
    {
        int i = 0;
        for(i = 0; i < r.getRegistro().size(); i++)
        {
            System.out.println(i +"- " + r.getRegistro().get(i).getNome() + "- " + r.getRegistro().get(i).getEmail()
                    + "- " +r.getRegistro().get(i).getEndereco() + "- " + r.getRegistro().get(i).getTelefone() 
                    + "- " +r.getRegistro().get(i).getIndicacao() + "- " + r.getRegistro().get(i).getCpf());
        }
    }
    
    public String[] cortarString(String line)
    {
        String linha[] = new String[6];
        linha = line.split("-");
        return linha = line.split("-");   
        
    }
    
    public Cliente gerarCliente(String s)                                   // Transform one line saved in a file in an Object of type Product 
    {
        String atributos[];
        
        atributos = cortarString(s);
        
        Cliente cliente = new Cliente(atributos[1], atributos[2], atributos[3], atributos[4], atributos[5], atributos[6]);
        
        return cliente; 
    }
    
    public int pegarID(String line)
    {
        String linha[] = new String[6];
        linha = line.split("-");
        String numero[] = linha[0].split(":");
        return Integer.parseInt(numero[1].trim());
    }
}
