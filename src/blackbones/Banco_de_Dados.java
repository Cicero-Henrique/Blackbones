package blackbones;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

public class Banco_de_Dados 
{

    private Connection connection = null;
    // manipula comandos SQL dinamicos
    private PreparedStatement ps = null;

    public void conectar(String database) 
    {
        String servidor = "jdbc:mysql://localhost:3306/" + database + "?useTimezone=true&serverTimezone=UTC";
        String usuario = "root";
        String senha = "211170";
        try {

            // Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(servidor, usuario, senha);

            if (connection != null) {
                System.out.println("Conexão feita com sucesso!");
            }

        } catch (Exception e) {
            System.out.println("Erro = " + e);
        }
    }

    public void CadastrarConta(Conta c)
    {
        String sql = "INSERT INTO conta(nome, tipo_pagamento, tipo_conta, estado, valor, data_vencimento) VALUES(?,?,?,?,?,?)";
        
        java.sql.Date data = new java.sql.Date(c.getData().getTime());
        try 
        {
            PreparedStatement stmt = connection.prepareStatement(sql);   
            
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getTipo_pagamento());
            stmt.setString(3, c.getTipo_conta());
            stmt.setString(4, c.getStatus());
            stmt.setDouble(5, c.getValor());
            stmt.setDate(6, data);
            stmt.execute(); //executa comando     
            stmt.close();
        } catch (SQLException u) {System.out.println(u);}
    }
    
    public void EditarConta(Conta c, int id)
    {
        String sql = "UPDATE conta SET nome = ?, tipo_pagamento = ?, tipo_conta = ?, estado = ?, valor = ?, data_vencimento = ? WHERE idconta = ?";
        java.sql.Date data = new java.sql.Date(c.getData().getTime());
        
        try 
        {
            ps = connection.prepareStatement(sql);
            ps.setString(1, c.getNome());
            ps.setString(2, c.getTipo_pagamento());
            ps.setString(3, c.getTipo_conta());
            ps.setString(4, c.getStatus());
            ps.setDouble(5, c.getValor());
            ps.setDate(6, data);
            ps.setInt(7, id);

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Banco_de_Dados.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public DefaultListModel carregarConta(String tipo)  
    {
        DefaultListModel<String> list = new DefaultListModel();
        String sql = "select * from conta where tipo_conta = ? order by 1";
        PreparedStatement ps;
        try 
        {
            ps = connection.prepareStatement(sql);
            ps.setString(1, tipo);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) 
            {
                int id = (rs.getInt("idconta"));
                String nome = rs.getString("nome");
                String pagamento = rs.getString("tipo_pagamento");
                String estado = rs.getString("estado");
                String valor = rs.getString("valor");
                String data = rs.getString("data_vencimento");
                String conta = ("Id: " + id+ "- Nome:" + nome + "- Pagamento:" 
                        + pagamento + "- Estado:" + estado + "- Valor: " + valor + "- Data:" + data);
                list.addElement(conta);
            }
            return list;
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Banco_de_Dados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void RemoverConta(int id)
    {
        String sql = "delete from conta where idconta = ?;";
        
        try 
        {
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.execute(); //executa comando     
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public Conta pesquisarIdConta(int id)
    {
        String sql = "select * from conta WHERE idconta = ?";
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        try 
        {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) 
            {
                Conta conta = new Conta(-1, "", formato.parse("01/01/2001"), "", "", "");
                conta.setNome(rs.getString("nome"));
                conta.setStatus(rs.getString("estado"));
                conta.setTipo_conta(rs.getString("tipo_conta"));
                conta.setTipo_pagamento(rs.getString("tipo_pagamento"));
                conta.setValor(rs.getDouble("valor"));
                conta.setData(rs.getDate("data_vencimento"));
                return conta;
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Banco_de_Dados.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Banco_de_Dados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return null;
    }
    
    public void CadastrarFornecedor(Fornecedor f)
    {
        String sql = "INSERT INTO fornecedor(nome, cnpj, telefone, email, tipo) VALUES(?,?,?,?,?)";

        try 
        {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getCnpj());
            stmt.setString(3, f.getTelefone());
            stmt.setString(4, f.getEmail());
            stmt.setString(5, f.getTipo());
            stmt.execute(); //executa comando     
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        
    }
    
    public DefaultListModel carregarFornecedor()  
    {
        DefaultListModel<String> list = new DefaultListModel();
        String sql = "select * from fornecedor order by 1";
        PreparedStatement ps;
        try 
        {
            ps = connection.prepareStatement(sql);
        
            ResultSet rs = ps.executeQuery();

            while (rs.next()) 
            {
                int id = (rs.getInt("idfornecedor"));
                String nome = rs.getString("nome");
                String cnpj = rs.getString("cnpj");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                String tipo = rs.getString("tipo");
                String fornecedor = ("Id: " + id+ "- Nome:" + nome + "- CNPJ: " + cnpj + "- Telefone:" 
                        + telefone + "- E-Mail:" + email + "- Tipo: " + tipo);
                list.addElement(fornecedor);
            }
            return list;
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Banco_de_Dados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void EditarFornecedor(Fornecedor f, int id)
    {
        String sql = "UPDATE fornecedor SET nome = ?, email = ?, telefone = ?, tipo = ?, cnpj = ? WHERE idfornecedor = ?";

        try 
        {
            ps = connection.prepareStatement(sql);
            ps.setString(1, f.getNome());
            ps.setString(2, f.getEmail());
            ps.setString(3, f.getTelefone());
            ps.setString(4, f.getTipo());
            ps.setString(5, f.getCnpj());
            ps.setInt(6, id);

            ps.executeUpdate();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Banco_de_Dados.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void RemoverFornecedor(int id)
    {
        String sql = "delete from fornecedor where idfornecedor = ?;";
        
        try 
        {
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.execute(); //executa comando     
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public Fornecedor PesquisarIdFornecedor(int id)
    {
        String sql = "select * from fornecedor WHERE idfornecedor = ?";
        Fornecedor fornecedor = new Fornecedor("", "", "", "", "");
        
        try 
        {
            ps = connection.prepareStatement(sql);
        
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) 
            {
                fornecedor.setNome(rs.getString("nome"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone(rs.getString("telefone"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setTipo(rs.getString("tipo"));
                return fornecedor;
            }
            
        } catch (SQLException ex) {
        Logger.getLogger(Banco_de_Dados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fornecedor;
    }
    
    public void CadastrarProduto(Produto p)
    {
        String sql = "INSERT INTO produto(nome, tipo, tamanho, qtd, preco_custo, preco_venda, margem_lucro) VALUES(?,?,?,?,?,?,?)";
        
        try 
        {
            PreparedStatement stmt = connection.prepareStatement(sql);   
            
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getTipo());
            stmt.setString(3, p.getTamanho());
            stmt.setInt(4, p.getQtd());
            stmt.setDouble(5, p.getPreco_custo());
            stmt.setDouble(6, p.getPreco_venda());
            stmt.setDouble(7, p.getMargem_lucro());
            stmt.execute(); //executa comando     
            stmt.close();
        } catch (SQLException u) {System.out.println(u);}
    }
    
    public DefaultListModel carregarProduto()  
    {
        DefaultListModel<String> list = new DefaultListModel();
        String sql = "select * from produto order by 1";
        PreparedStatement ps;
        try 
        {
            ps = connection.prepareStatement(sql);
        
            ResultSet rs = ps.executeQuery();

            while (rs.next()) 
            {
                int id = (rs.getInt("idproduto"));
                String nome = rs.getString("nome");
                String tipo = rs.getString("tipo");
                String tamanho = rs.getString("tamanho");
                int qtd = rs.getInt("qtd");
                double preco_custo = rs.getDouble("preco_custo");
                double preco_venda = rs.getDouble("preco_venda");
                double margem_lucro = rs.getDouble("margem_lucro");
                String produto = ("Id: " + id+ "- Nome:" + nome + "- Tipo: " + tipo + "- Tamanho:" 
                        + tamanho + "- Quantidade:" + qtd + "- Preço de Custo: " + preco_custo + "- Preço Venda:" + preco_venda
                        + "- Margem de Lucro:" + margem_lucro);
                list.addElement(produto);
            }
            return list;
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Banco_de_Dados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void EditarProduto(Produto p, int id)
    {
        String sql = "UPDATE produto SET nome = ?, tipo = ?, tamanho = ?, qtd = ?, preco_custo = ?, preco_venda = ?, margem_lucro = ? WHERE idproduto = ?";

        try 
        {
            ps = connection.prepareStatement(sql);
            ps.setString(1, p.getNome());
            ps.setString(2, p.getTipo());
            ps.setString(3, p.getTamanho());
            ps.setInt(4, p.getQtd());
            ps.setDouble(5, p.getPreco_custo());
            ps.setDouble(6, p.getPreco_venda());
            ps.setDouble(7, p.getMargem_lucro());
            ps.setInt(8, id);

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Banco_de_Dados.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void RemoverProduto(int id)
    {
        String sql = "delete from produto where idproduto = ?;";
        
        try 
        {
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.execute(); //executa comando     
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public Produto PesquisarIdProduto(int id)
    {
        String sql = "select * from produto WHERE idproduto = ?";
        Produto produto = new Produto("", "", -1, -1, -1, -1, "");
        
        try 
        {
            ps = connection.prepareStatement(sql);
        
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) 
            {
                produto.setNome(rs.getString("nome"));
                produto.setTipo(rs.getString("tipo"));
                produto.setTamanho(rs.getString("tamanho"));
                produto.setQtd(rs.getInt("qtd"));
                produto.setPreco_custo(rs.getDouble("preco_custo"));
                produto.setPreco_venda(rs.getDouble("preco_venda"));
                produto.setMargem_lucro(rs.getDouble("margem_lucro"));
                return produto;
            }
            
        } catch (SQLException ex) {
        Logger.getLogger(Banco_de_Dados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return produto;
    }
    
    public void CadastrarCliente(Cliente c)
    {
        String sql = "INSERT INTO cliente(nome, email, endereco, telefone, indicacao, cpf) VALUES(?,?,?,?,?,?)";

        try 
        {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEmail());
            stmt.setString(3, c.getEndereco());
            stmt.setString(4, c.getTelefone());
            stmt.setString(5, c.getIndicacao());
            stmt.setString(6, c.getCpf());
            stmt.execute(); //executa comando     
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        
    }
    
    public void RemoverCliente(int id)
    {
        String sql = "delete from cliente where idcliente = ?;";
        
            PreparedStatement stmt;
        try 
        {
            stmt = connection.prepareStatement(sql);
            
            stmt.setInt(1, id);
            stmt.execute(); //executa comando     
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Banco_de_Dados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public DefaultListModel carregarCliente()  
    {
        DefaultListModel<String> list = new DefaultListModel();
        String sql = "select * from cliente order by 1";
        PreparedStatement ps;
        try 
        {
            ps = connection.prepareStatement(sql);
        
            ResultSet rs = ps.executeQuery();

            while (rs.next()) 
            {
                int id = (rs.getInt("idcliente"));
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");
                String cpf = rs.getString("cpf");
                String endereco = rs.getString("endereco");
                String indicacao = rs.getString("indicacao");
                String cliente = ("Id: " + id+ "- Nome:" + nome + "- EMail: " + email + "- Telefone:" 
                        + telefone + "- CPF:" + cpf + "- Endereço: " + endereco + "- Indicação:" + indicacao);
                list.addElement(cliente);
            }
            return list;
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Banco_de_Dados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void EditarCliente(Cliente c, int id)
    {
        String sql = "UPDATE cliente SET nome = ?, email = ?, endereco = ?, telefone = ?, indicacao = ?, cpf = ? WHERE idcliente = ?";

        try 
        {
            ps = connection.prepareStatement(sql);
            ps.setString(1, c.getNome());
            ps.setString(2, c.getEmail());
            ps.setString(3, c.getEndereco());
            ps.setString(4, c.getTelefone());
            ps.setString(5, c.getIndicacao());
            ps.setString(6, c.getCpf());
            ps.setInt(7, id);

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Banco_de_Dados.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public Cliente PesquisarIdCliente(int id)
    {
        String sql = "select * from cliente WHERE idcliente = ?";
        Cliente cliente = new Cliente("", "", "", "", "", "");
        
        try 
        {
            ps = connection.prepareStatement(sql);
        
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) 
            {
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setIndicacao(rs.getString("indicacao"));
                return cliente;
            }
            
        } catch (SQLException ex) {
        Logger.getLogger(Banco_de_Dados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }
    
    
//
//    public boolean estaConectado() {
//        if (connection != null) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public void CadastrarUsuario(Usuario user) throws SQLException {
//        String sql;
//        sql = "INSERT INTO usuario (login,senha) VALUES (?,?)";
//
//        try {
//            ps = connection.prepareStatement(sql);
//            ps.setString(1, user.getLogin());
//            ps.setInt(2, user.getSenha());
//            ps.executeUpdate();
//
//            ps = connection.prepareStatement(sql);
//            ps.executeUpdate();
//
//        } catch (Exception e) {
//            System.out.println("Erro = " + e);
//        }
//
//    }
//
    public void FecharBanco()  
    {
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Banco_de_Dados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//
//    public void EditarLogin(Usuario user) throws SQLException {
//        String sql;
//        sql = "UPDATE usuario SET login = ?, senha = ? WHERE id = ?";
//
//        ps = connection.prepareStatement(sql);
//        ps.setString(1, user.getLogin());
//        ps.setInt(2, user.getSenha());
//        ps.setString(3, user.getCpf());
//
//        ps.executeUpdate();
//
//    }
//
//    public int DeleteUsuario(Usuario user) throws SQLException {
//
//        String sql;
//        sql = "DELETE FROM tabela WHERE cpf = " + user.getCpf();
//
//        PreparedStatement ps = connection.prepareStatement(sql);
//        ps.executeUpdate();
//
//        return 0;
//    }
//
//    public ArrayList<Usuario> LerBanco() throws SQLException {
//        String sql;
//        sql = "select * from usuario order by 1";
//        PreparedStatement ps = connection.prepareStatement(sql);
//        ResultSet rs = ps.executeQuery();
//        ArrayList<Usuario> lista_usuarios = new ArrayList<>();
//        Usuario user = new Usuario();
//        while (rs.next()) {
//            user.setId(rs.getInt("id"));
//            user.setLogin(rs.getString("login"));
//            user.setSenha(rs.getInt("senha"));
//            lista_usuarios.add(user);
//
//            System.out.println("Id = " + rs.getInt("id") + "; Nome: " + rs.getString("login") + ";Senha: " + rs.getInt("senha"));
//        }
//
//        rs.close();
//        ps.close();
//
//        return lista_usuarios;
//
//    
}
