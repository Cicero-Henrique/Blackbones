package blackbones;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Armazenamento_File
{   
    public String[] cortarString(String line, int tipo)
    {
        if(tipo == 0)
        {
            String linha[] = new String[6];
            linha = line.split("-");
            return linha = line.split("-");   
        }
        else
        {
            if(tipo == 1)
            {
                String linha[] = new String[7];
                linha = line.split("-");
                return linha = line.split("-");
            }
            else
            {
                if(tipo == 2)
                {
                    String linha[] = new String[6];
                    linha = line.split("-");
                    return linha = line.split("-");
                }
                else
                {
                    if(tipo == 3)
                    {
                        String linha[] = new String[4];
                        linha = line.split("-");
                        return linha = line.split("-");
                    }
                    else
                    {
                        if(tipo == 4)
                        {
                            String linha[] = new String[7];
                            linha = line.split("-");
                            return linha = line.split("-");
                        }
                    }
                }
            }
        }
        String s[] = null;
        return s;
    }
    
    public DefaultListModel loadListModel(String tipo)
    {
        DefaultListModel<String> list = new DefaultListModel();
        String[] strings = null;
        if(tipo.equals("cliente"))
        {
            try 
            {
                InputStream is;
                is = new FileInputStream("Registro.txt");
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                String s  = br.readLine();
                while(s != null)
                {
                    list.addElement(s);
                    s  = br.readLine();
                }
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Armazenamento_File.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            if(tipo.equals("fornecedor"))
            {
                try 
                {
                    InputStream is;
                    is = new FileInputStream("Fornecedores.txt");
                    InputStreamReader isr = new InputStreamReader(is);
                    BufferedReader br = new BufferedReader(isr);
                    String s  = br.readLine();
                    while(s != null)
                    {
                        list.addElement(s);
                        s  = br.readLine();
                    }
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(Armazenamento_File.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
            {
                if(tipo.equals("produto"))
                {
                    try 
                    {
                        InputStream is;
                        is = new FileInputStream("Estoque.txt");
                        InputStreamReader isr = new InputStreamReader(is);
                        BufferedReader br = new BufferedReader(isr);
                        String s  = br.readLine();
                        while(s != null)
                        {
                            list.addElement(s);
                            s  = br.readLine();
                        }
                        br.close();
                    } catch (IOException ex) {
                        Logger.getLogger(Armazenamento_File.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else
                {
                    if(tipo.equals("pagar"))
                    {
                        try 
                        {
                            InputStream is;
                            is = new FileInputStream("contaspagar.txt");
                            InputStreamReader isr = new InputStreamReader(is);
                            BufferedReader br = new BufferedReader(isr);
                            String s  = br.readLine();
                            while(s != null)
                            {
                                list.addElement(s);
                                s  = br.readLine();
                            }
                            br.close();
                        } 
                        catch (IOException ex) {
                            Logger.getLogger(Armazenamento_File.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else
                    {
                        try 
                        {
                            InputStream is;
                            is = new FileInputStream("contasreceber.txt");
                            InputStreamReader isr = new InputStreamReader(is);
                            BufferedReader br = new BufferedReader(isr);
                            String s  = br.readLine();
                            while(s != null)
                            {
                                list.addElement(s);
                                s  = br.readLine();
                            }
                            br.close();
                        } 
                        catch (IOException ex) {
                            Logger.getLogger(Armazenamento_File.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        }
        return list;
    }
    
    
    /* ARMAZENAR CLIENTES*/
    
    public Cliente gerarCliente(String s)                                   // Transform one line saved in a file in an Object of type Product 
    {
        String atributos[];
        
        atributos = cortarString(s, 0);
        
        Cliente cliente = new Cliente(atributos[0], atributos[1], atributos[2], atributos[3], atributos[4], atributos[5]);
        
        return cliente; 
    }
    
    public Registro loadCliente() throws FileNotFoundException, IOException
    {
        Registro r = new Registro();
        InputStream is = new FileInputStream("Registro.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String s  = br.readLine();
        
        while(s != null)
        {
            Cliente c = gerarCliente(s);
            r.getRegistro().add(c);
            s  = br.readLine();
        }
        br.close();
        
        return r;
    }
    
    public void salvarCliente(Registro r) throws FileNotFoundException, IOException 
    {
        OutputStream os = new FileOutputStream("Registro.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        for(int i = 0; i < r.getRegistro().size(); i++)
        {
            bw.write(r.getRegistro().get(i).getNome() + "-" + r.getRegistro().get(i).getEmail() + "-" + r.getRegistro().get(i).getEndereco()
                    + "-" + r.getRegistro().get(i).getTelefone() + "-" + r.getRegistro().get(i).getIndicacao() 
                    + "-" + r.getRegistro().get(i).getCpf() + " \r\n");
        }
        bw.close();
        
        JOptionPane.showMessageDialog(null, "CLIENTE SALVO");
    }
    
    
    /*ARMAZENAR CONTAS*/
    
    public void salvarConta(Financeiro f, String tipo) throws FileNotFoundException, IOException 
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        if(tipo.equals("pagar"))
        {
            OutputStream os = new FileOutputStream("contaspagar.txt");
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            for(int i = 0; i < f.getContas_pagar().size(); i++)
            {
                bw.write(f.getContas_pagar().get(i).getValor() + "-" + f.getContas_pagar().get(i).getNome() + "-" + 
                        formato.format(f.getContas_pagar().get(i).getData()) + "-" + f.getContas_pagar().get(i).getTipo_pagamento() +
                        "-" + f.getContas_pagar().get(i).getStatus() + " \r\n");
            }
            bw.close();

            JOptionPane.showMessageDialog(null, "CONTA A PAGAR SALVA");
        }
        else
        {
            OutputStream os = new FileOutputStream("contasreceber.txt");
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            for(int i = 0; i < f.getContas_receber().size(); i++)
            {
                bw.write(f.getContas_receber().get(i).getValor() + "-" +f.getContas_receber().get(i).getNome() + "-" + 
                        formato.format(f.getContas_receber().get(i).getData()) + "-" + f.getContas_receber().get(i).getTipo_pagamento() +
                        "-" + f.getContas_receber().get(i).getStatus() + " \r\n");
            }
            bw.close();

            JOptionPane.showMessageDialog(null, "CONTA A RECEBER SALVA");
        }
    }
    
    public Conta gerarConta(String s, String tipo)                                   // Transform one line saved in a file in an Object of type Product 
    {
        String atributos[];
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data;
        
        atributos = cortarString(s, 1);
        try 
        {
            data = formato.parse(atributos[2]);
            if(tipo.equals("pagar"))
            {
                Conta conta = new Conta(Double.parseDouble(atributos[0]), atributos[1], data, atributos[3], "pagar", atributos[4]);
                return conta;
            }
            else
            {
                Conta conta = new Conta(Double.parseDouble(atributos[0].trim()), atributos[1], data, atributos[3], "receber", atributos[4]);
                return conta;
            }
        } 
        catch (ParseException ex) 
        {
            Logger.getLogger(Armazenamento_File.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Financeiro loadConta(String tipo) throws FileNotFoundException, IOException
    {
        Financeiro f = new Financeiro();
        if(tipo.equals("pagar"))
        {
            InputStream is = new FileInputStream("contaspagar.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String s  = br.readLine();

            while(s != null)
            {
                Conta c = gerarConta(s, "pagar");
                f.getContas_pagar().add(c);
                s  = br.readLine();
            }
            br.close();
        }
        else
        {
            InputStream is = new FileInputStream("contasreceber.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String s  = br.readLine();
            while(s != null)
            {
                Conta c = gerarConta(s, "receber");
                f.getContas_receber().add(c);
                s  = br.readLine();
            }
            br.close();
        }
        
        return f;
    }
    
    
    /*ARMAZENAR PRODUTOS*/
    
    public Produto gerarProduto(String s)                                   // Transform one line saved in a file in an Object of type Product 
    {
        String atributos[];
        
        atributos = cortarString(s, 2);
        Produto produto = new Produto(atributos[0], atributos[1], Double.parseDouble(atributos[2]), Double.parseDouble(atributos[3]), 
                Double.parseDouble(atributos[4]), Integer.parseInt(atributos[5].trim()), atributos[6]);
        
        return produto; 
    }
    
    public Estoque loadProduto() throws FileNotFoundException, IOException
    {
        Estoque e = new Estoque();
        InputStream is = new FileInputStream("Estoque.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String s  = br.readLine();
        
        while(s != null)
        {
            Produto p = gerarProduto(s);
            e.getProdutos().add(p);
            s  = br.readLine();
        }
        br.close();
        
        return e;
    }
    
    public void salvarProduto(Estoque e) throws FileNotFoundException, IOException 
    {
        OutputStream os = new FileOutputStream("Estoque.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        for(int i = 0; i < e.getProdutos().size(); i++)
        {
            bw.write(e.getProdutos().get(i).getNome() + "-" + e.getProdutos().get(i).getTipo() + "-" + e.getProdutos().get(i).getPreco_custo()
                    + "-" + e.getProdutos().get(i).getPreco_venda() + "-" + e.getProdutos().get(i).getMargem_lucro() + "-" + e.getProdutos().get(i).getQtd() 
                    + "-" + e.getProdutos().get(i).getTamanho() + " \r\n");
        }
        bw.close();
        
        JOptionPane.showMessageDialog(null, "PRODUTO SALVO");
    }
    
    
    /*ARMAZENAR VENDAS*/
    
    public void salvarVendas(Financeiro f) throws FileNotFoundException, IOException
    {
        OutputStream os = new FileOutputStream("Vendidos.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        
        for(int i = 0; i < f.getVendidos().size(); i++)
        {
            bw.write(f.getVendidos().get(i).getProduto().getNome() + "-" + f.getVendidos().get(i).getProduto().getTipo() 
                    + "-" + f.getVendidos().get(i).getProduto().getPreco_custo() + "-" + f.getVendidos().get(i).getProduto().getPreco_venda() 
                    + "-" + f.getVendidos().get(i).getProduto().getMargem_lucro() + "-" + f.getVendidos().get(i).getProduto().getQtd() 
                    + "-" + f.getVendidos().get(i).getProduto().getTamanho() + "-" + formato.format(f.getVendidos().get(i).getData_venda()).trim()
                    + " \r\n");
        }
        bw.close();

    }
    
    public Financeiro loadVendas() throws FileNotFoundException, IOException
    {
        Financeiro f = new Financeiro();
        InputStream is = new FileInputStream("Vendidos.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String s  = br.readLine();
        
        while(s != null)
        {
            Venda v = gerarVenda(s);
            f.getVendidos().add(v);
            s  = br.readLine();
        }
        br.close();
        
        return f;
    }
    
    public Venda gerarVenda(String s)                                   // Transform one line saved in a file in an Object of type Product 
    {
        String atributos[];
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data;
        try 
        {
            atributos = cortarString(s, 4);
            Produto p = new Produto(atributos[0], atributos[1], Double.parseDouble(atributos[2]), Double.parseDouble(atributos[3]),
                    Double.parseDouble(atributos[4]), Integer.parseInt(atributos[5].trim()), atributos[6]);
            Venda v = new Venda();
            v.setProduto(p);
            data = formato.parse(atributos[7].trim());
            v.setData_venda(data);
            return v;
        
        } catch (ParseException ex) {
            Logger.getLogger(Armazenamento_File.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    
    /*ARMAZENAR FORNECEDORES*/
    
    public void salvarFornecedor(Registro r) throws FileNotFoundException, IOException
    {
        OutputStream os = new FileOutputStream("Fornecedores.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        for(int i = 0; i < r.getFornecedores().size(); i++)
        {
            bw.write(r.getFornecedores().get(i).getNome() + "-" + r.getFornecedores().get(i).getCnpj() + "-" + r.getFornecedores().get(i).getTelefone()
                    + "-" + r.getFornecedores().get(i).getEmail() + "-" + r.getFornecedores().get(i).getTipo() + " \r\n");
        }
        bw.close();
        
        JOptionPane.showMessageDialog(null, "FORNECEDOR SALVO");
    }
    
    public Registro loadFornecedor() throws FileNotFoundException, IOException
    {
        Registro r = new Registro();
        InputStream is = new FileInputStream("Fornecedores.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String s  = br.readLine();
        
        while(s != null)
        {
            Fornecedor f = gerarFornecedor(s);
            r.getFornecedores().add(f);
            s  = br.readLine();
        }
        br.close();
        
        return r;
    }
    
    public Fornecedor gerarFornecedor(String s)                                 // Transform one line saved in a file in an Object of type Product 
    {
        String atributos[];
        
        atributos = cortarString(s, 3);
        
        Fornecedor fornecedor = new Fornecedor(atributos[0], atributos[1], atributos[2], atributos[3], atributos[4]);
        
        return fornecedor; 
    }
}
