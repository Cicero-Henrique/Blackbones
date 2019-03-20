package blackbones;

import java.util.Scanner;

public class Menu_Clientes 
{

    public int Opcoes() 
    {
        Scanner s = new Scanner(System.in);
        int i = 0;
        while ((i < 1) || (i > 5)) 
        {
            System.out.println("MENU");
            System.out.println("1- Cadastrar um novo funcionario");
            System.out.println("2- Editar registro de algum funcionario");
            System.out.println("3- Lista de funcionarios");
            System.out.println("4- Demitir funcionarios");
            System.out.println("5- Sair");
            System.out.println("Digite o numero da operacao");
            i = s.nextInt();
        }
        return i;
    }

    public Registro Cadastrar(Registro r)
    {
        //ARRUMAR
        return r;
    }
    

    public Registro Editar(Registro r) 
    {
        Scanner s = new Scanner(System.in);
        Operacoes_Clientes of = new Operacoes_Clientes();
        if (r.getRegistro().isEmpty()) 
            System.out.println("Nenhum funcionario cadastrado");
        else 
        {
            int id = -1;
            while (id < 0 || id > r.getRegistro().size()) 
            {
                System.out.println("Digite o id do funcionario a ser editado: ");
                id = s.nextInt();
            }
            String nome, email, senha, data_nascimento, salario, cargo;
            System.out.println("Digite o nome do funcionario: ");
            nome = s.nextLine();
            System.out.print("Digite o cargo do novo funcionario: ");
            cargo = s.nextLine();
            System.out.println("Digite o salario do funcionario: ");
            salario = s.nextLine();
            System.out.println("Digite a data de nascimento: ");
            data_nascimento = s.nextLine();
            System.out.println("Digite o email: ");
            email = s.nextLine();
            System.out.println("Digite a senha: ");
            senha = s.nextLine();

            of.editar(id, r, nome, email, senha, data_nascimento, salario, cargo);
        }
        return r;
    }

    public int Demitir(Registro r) 
    {
        Scanner s = new Scanner(System.in);
        int id = -1;
        while (id < 0 || id > r.getRegistro().size()) 
        {
            System.out.println("Digite o id do funcionario para deletar: ");
            id = s.nextInt();
        }
        return id;
    }

    public void Menu() 
    {
        Scanner s = new Scanner(System.in);
        Operacoes_Clientes of = new Operacoes_Clientes();
        Registro r = new Registro();
        int op = 0;
        while (op != 5) 
        {
            op = Opcoes();
            switch (op) 
            {
                case 1:
                    r = Cadastrar(r);
                    break;

                case 2:
                    of.listar(r);
                    r = Editar(r);
                    break;

                case 3:
                    if (r.getRegistro().isEmpty()) 
                        System.out.println("Nenhum funcionario cadastrado");
                    else 
                        of.listar(r);
                    break;

                case 4:
                    if (r.getRegistro().isEmpty()) 
                        System.out.println("Nenhum funcionario cadastrado");
                    else 
                    {
                        of.listar(r);
                        int id = Demitir(r);
                        of.remover(r, id);
                        of.listar(r);
                    }
                    break;

                case 5:
                    System.out.println("Até mais!!!");
                    break;
            }
        }
    }
}
