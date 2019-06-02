package blackbones;

public class Operacoes_Vendas 
{
    public int pegarID(String line)
    {
        String linha[] = line.split("-");
        String numero[] = linha[0].split(":");
        return Integer.parseInt(numero[1].trim());
    }
    
    public String[] cortarString(String line)
    {
        String linha[] = line.split("-");
        return linha;   
    }
    
    public String gerarVenda(String s)                                   // Transform one line saved in a file in an Object of type Product 
    {
        String atributos[];
        
        atributos = cortarString(s);
        atributos[0] = atributos[0].split(":")[1].trim();
        String ano = atributos[1].split(":")[1].trim();
        String mes = atributos[2];
        String dia = atributos[3];
        atributos[4] = atributos[4].split(":")[1].trim();
        String data = dia+"/"+mes+"/"+ano;
        
        String venda = atributos[0] + "-" + data + "-" + atributos[4]; 
        
        return venda; 
    }
    
    public double gerarLucro(String s)                                   // Transform one line saved in a file in an Object of type Product 
    {
        String atributos[];
        
        atributos = cortarString(s);
        Double lucro = Double.parseDouble(atributos[5].split(":")[1].trim());        
        return lucro; 
    }
}
