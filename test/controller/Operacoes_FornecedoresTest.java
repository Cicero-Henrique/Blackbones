package controller;

import model.Fornecedor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Operacoes_FornecedoresTest 
{
    public int idTest = -1;
    
    public Operacoes_FornecedoresTest() {}
    
    @Before
    public void setUp() {}
    
    @After
    public void tearDown() {}

    /**
     * Test of adicionar method, of class Operacoes_Fornecedores.
     */
    @Test
    public void testAdicionar() 
    {
        System.out.println("adicionar");
        String nome = "";
        String cnpj = "";
        String telefone = "";
        String email = "";
        String tipo = "";
        Operacoes_Fornecedores instance = new Operacoes_Fornecedores();
        instance.adicionar(nome, cnpj, telefone, email, tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editar method, of class Operacoes_Fornecedores.
     */
    @Test
    public void testEditar() 
    {
        System.out.println("editar");
        int id = 0;
        String nome = "";
        String cnpj = "";
        String telefone = "";
        String email = "";
        String tipo = "";
        Operacoes_Fornecedores instance = new Operacoes_Fornecedores();
        instance.editar(id, nome, cnpj, telefone, email, tipo);
        fail("The test case is a prototype.");
    }
    /**
     * Test of ultimoID method, of class Operacoes_Fornecedores.
     */
    @Test
    public void testUltimoID() {
        System.out.println("ultimoID");
        Operacoes_Fornecedores instance = new Operacoes_Fornecedores();
        int expResult = 5;
        int result = instance.ultimoID();
        assertEquals(expResult, result);
        idTest = result;
    }
    /**
     * Test of remover method, of class Operacoes_Fornecedores.
     */
    @Test
    public void testRemover() 
    {
        System.out.println("remover");
        Operacoes_Fornecedores instance = new Operacoes_Fornecedores();
        instance.remover(idTest);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pegarID method, of class Operacoes_Fornecedores.
     */
    @Test
    public void testPegarID() 
    {
        System.out.println("pegarID");
        String line = "Id: " + 0 + "- Nome:" + "Teste" + "- CNPJ: " + "85207419635478" 
                + "- Telefone:" + "11111111" + "- EMail:" + "teste@" + "- Tipo: " + "serviços";
        Operacoes_Fornecedores instance = new Operacoes_Fornecedores();
        int expResult = 0;
        int result = instance.pegarID(line);
        assertEquals(expResult, result);
    }

    /**
     * Test of gerarFornecedor method, of class Operacoes_Fornecedores.
     */
    @Test
    public void testGerarFornecedor() 
    {
        System.out.println("gerarFornecedor");
        String s = "Id: " + 0 + "- Nome:" + "Teste" + "- CNPJ: " + "85207419635478" 
                + "- Telefone:" + "11111111" + "- EMail:" + "teste@" + "- Tipo: " + "serviços";
        Operacoes_Fornecedores instance = new Operacoes_Fornecedores();
        Fornecedor f = new Fornecedor("Teste", "85207419635478", "11111111", "teste@", "serviços");
        Fornecedor expResult = f;
        Fornecedor result = instance.gerarFornecedor(s);
        assertEquals(expResult.getEmail(), result.getEmail());
    }

    
    
}
