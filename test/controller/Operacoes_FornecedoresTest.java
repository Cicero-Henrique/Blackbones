package controller;

import model.Fornecedor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Operacoes_FornecedoresTest 
{
    
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
        //fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of remover method, of class Operacoes_Fornecedores.
     */
    @Test
    public void testRemover() 
    {
        System.out.println("remover");
        int id = 0;
        Operacoes_Fornecedores instance = new Operacoes_Fornecedores();
        instance.remover(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pegarID method, of class Operacoes_Fornecedores.
     */
    @Test
    public void testPegarID() 
    {
        System.out.println("pegarID");
        String line = "";
        Operacoes_Fornecedores instance = new Operacoes_Fornecedores();
        int expResult = 0;
        int result = instance.pegarID(line);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of gerarFornecedor method, of class Operacoes_Fornecedores.
     */
    @Test
    public void testGerarFornecedor() 
    {
        System.out.println("gerarFornecedor");
        String s = "";
        Operacoes_Fornecedores instance = new Operacoes_Fornecedores();
        Fornecedor expResult = null;
        Fornecedor result = instance.gerarFornecedor(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ultimoID method, of class Operacoes_Fornecedores.
     */
    @Test
    public void testUltimoID() {
        System.out.println("ultimoID");
        Operacoes_Fornecedores instance = new Operacoes_Fornecedores();
        int expResult = 0;
        int result = instance.ultimoID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
