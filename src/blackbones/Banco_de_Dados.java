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

    public void Inserir() 
    {

        String sql = "INSERT INTO cliente(nome, sexo, email, cpf, telefone, endereco) VALUES(?,?,?,?,?,?)";
        String nome = "Cícero";
        String email = "cicero@hotmail.com";
        String telefone = "000";
        String cpf = "0123";
        String endereco = "Tiradentes-Baependi-Minas Gerais";
        String sexo = "M";
        try 
        {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, nome);
            stmt.setString(2, sexo);
            stmt.setString(3, email);
            stmt.setString(4, cpf);
            stmt.setString(5, telefone);
            stmt.setString(6, endereco);
            stmt.execute(); //executa comando     
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    

    public void CadastrarConta(Conta c)
    {
        String sql = "INSERT INTO conta(nome, tipo_pagamento, tipo_conta, estado, valor, data) VALUES(?,?,?,?,?,?)";
        
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
                String cliente = (id+ "-" + nome + "-" + email + "-" + telefone + "-" + cpf + "-" + endereco + "-" + indicacao);
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
        String sql = "UPDATE cliente SET nome = ?, email = ?, endereco = ?, telefone = ?, indicacao = ?, cpf = ? WHERE id = ?";

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
    
    public Cliente PesquisarId(int id)
    {
        String sql = "select * from cliente WHERE id = ?";
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
