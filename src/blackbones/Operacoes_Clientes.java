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
    
    public void remover(int id)
    {
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        bd.RemoverCliente(id);
        bd.FecharBanco();
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
        
        atributos[1] = atributos[1].trim().split(":")[1];
        atributos[2] = atributos[2].trim().split(":")[1];
        atributos[3] = atributos[3].trim().split(":")[1];
        atributos[4] = atributos[4].trim().split(":")[1];
        atributos[5] = atributos[5].trim().split(":")[1];
        atributos[6] = atributos[6].trim().split(":")[1];
        
        System.out.println(1 + atributos[1]);
        System.out.println(2 + atributos[2]);
        System.out.println(3 + atributos[3]);
        System.out.println(4 + atributos[4]);
        System.out.println(5 + atributos[5]);
        System.out.println(6 + atributos[6]);
        
        
        Cliente cliente = new Cliente(atributos[1], atributos[2], atributos[5], atributos[3], atributos[6], atributos[4]);
        
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
