package blackbones;

import java.util.Scanner;

public class Menu_Produtos 
{

    public int Opcoes() 
    {
        Scanner s = new Scanner(System.in);
        int i = 0;
        while ((i < 1) || (i > 5)) 
        {
            System.out.println("MENU");
            System.out.println("1- Criar produto");
            System.out.println("2- Editar produto");
            System.out.println("3- Listar estoque");
            System.out.println("4- Realizar venda");
            System.out.println("5- Sair");
            System.out.println("Digite o numero da operacao");
            i = s.nextInt();
        }
        return i;
    }

    public Estoque Adicionar(Estoque e) 
    {
        Scanner s = new Scanner(System.in);
        String nome, tipo;
        int qtd = 0;
        float custo, venda, margem;
        System.out.println("Digite o nome do produto: ");
        s.next();
        nome = s.nextLine();
        System.out.print("Digite o tipo do produto: ");
        s.next();
        tipo = s.nextLine();
        System.out.println("Digite o preco de custo: ");
        custo = s.nextFloat();
        System.out.println("Digite o preco de venda: ");
        venda = s.nextFloat();
        String tamanho = "";

        margem = ((custo - venda) / venda) * 100;

        Produto p = new Produto(nome, tipo, custo, venda, margem, qtd, tamanho);
        e.getProdutos().add(p);
        return e;
    }

    public Estoque Editar(Estoque e) 
    {
        String nome, tipo;
        int qtd;
        float custo, venda, margem;
        Scanner s = new Scanner(System.in);
        Operacoes_Produtos o = new Operacoes_Produtos();
        if (e.getProdutos().isEmpty()) 
        {
            System.out.println("Nenhum produto no estoque");
        } else 
        {
            int id = -1;
            while (id < 0 || id > e.getProdutos().size()) 
            {
                System.out.println("Digite o id do produto a ser editado: ");
                id = s.nextInt();
            }
            System.out.println("Digite o nome do produto: ");
            s.next();
            nome = s.nextLine();
            System.out.print("Digite o tipo do produto: ");
            s.next();
            tipo = s.nextLine();
            System.out.println("Digite o preco de custo: ");
            custo = s.nextFloat();
            System.out.println("Digite o preco de venda: ");
            venda = s.nextFloat();
            System.out.println("Digite o a quantidade: ");
            qtd = s.nextInt();
            String tamanho = "";

            margem = ((custo - venda) / venda) * 100;
            o.editar(e, id, nome, tipo, custo, venda, margem, qtd, tamanho);
        }
        return e;
    }

    public int Vender(Estoque e) 
    {
        Scanner s = new Scanner(System.in);
        int id = -1;
        while (id < 0 || id > e.getProdutos().size()) 
        {
            System.out.println("Digite o id do produto a ser deletado: ");
            id = s.nextInt();
        }
        return id;
    }

    public void Main() 
    {
        Scanner s = new Scanner(System.in);
        Operacoes_Produtos o = new Operacoes_Produtos();
        Estoque estoque = new Estoque();
        int op = 0;
        while (op != 5) 
        {
            op = Opcoes();
            switch (op) 
            {
                case 1:
                    estoque = Adicionar(estoque);
                    break;

                case 2:
                    o.listar(estoque);
                    estoque = Editar(estoque);
                    break;

                case 3:
                    if (estoque.getProdutos().isEmpty()) 
                        System.out.println("Nenhum produto no estoque");
                    else 
                        o.listar(estoque);
                    
                    break;

                case 4:
                    if (estoque.getProdutos().isEmpty()) 
                        System.out.println("Nenhum produto no estoque");
                    else 
                    {
                        o.listar(estoque);
                        int id = Vender(estoque);
                        o.vender(estoque, id, 0);
                        o.listar(estoque);
                    }
                    break;

                case 5:
                    System.out.println("Até mais!!!");
                    break;
            }
        }
    }
}
