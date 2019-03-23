package blackbones;

import java.util.ArrayList;

public class Registro
{
    private ArrayList<Cliente> registro = new ArrayList<>();
    private ArrayList<Fornecedor> fornecedores = new ArrayList<>();

    public ArrayList<Cliente> getRegistro() {return registro;}
    public ArrayList<Fornecedor> getFornecedores() {return fornecedores;}

    public void setFornecedores(ArrayList<Fornecedor> fornecedores) {this.fornecedores = fornecedores;}
    public void setRegistro(ArrayList<Cliente> registro) {this.registro = registro;}
}