package blackbones;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Validator 
{
    public static boolean isValidProduct(String nome, String tipo, String custo, String venda, String qtd) 
    {
        if (!isValidNome(nome)) {
            JOptionPane.showMessageDialog(null, "O nome do produto nao pode ter mais que 50 caracteres e nao deve ter caracteres especiais.",
                    "Erro no nome", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!isValidNome(tipo)) {
            JOptionPane.showMessageDialog(null, "O tipo do produto nao pode ter mais que 50 caracteres e nao deve ter caracteres especiais.",
                    "Erro no tipo", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!isValidCusto(custo)) {
            JOptionPane.showMessageDialog(null, "O preço de custo só pode conter números e uma vírgula",
                    "Erro no preço de custo", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!isValidVenda(venda)) {
            JOptionPane.showMessageDialog(null, "O preço de venda só pode conter números e uma vírgula",
                    "Erro no preço de venda", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!isValidQuantidade(qtd)){
            JOptionPane.showMessageDialog(null, "A quantidade deve possuir apenas números inteiros",
                    "Erro na quantidade de produtos", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public static boolean isValidCliente(String nome, String telefone, String endereco, String email, String indicacao, String cpf)
    {
        if (!isValidNome(nome)) {
            JOptionPane.showMessageDialog(null, "O nome do produto nao pode ter mais que 50 caracteres e nao deve ter caracteres especiais.",
                    "Erro no nome", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!isValidTelefone(telefone)) {
            JOptionPane.showMessageDialog(null, "O telefone nao pode ter mais que 20 caracteres e nao deve ter caracteres especiais ou letras.",
                    "Erro no telefone", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!isValidEndereco(endereco)) {
            JOptionPane.showMessageDialog(null, "O endereço não pode conter mais do que 60 caracteres",
                    "Erro no endereço", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(null, "O email deve conter pelo menos um @",
                    "Erro no email", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!isValidIndicacao(indicacao)) {
            JOptionPane.showMessageDialog(null, "A indicação só pode conter letras.",
                    "Erro na indicação", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!isValidCpf(cpf)) 
	{
            JOptionPane.showMessageDialog(null, "O CPF deve conter 11 dígitos.",
		"Erro no CPF", JOptionPane.ERROR_MESSAGE);
            return false;
	}
        return true;
    }
    
    public static boolean isValidFornecedor(String nome, String cnpj, String telefone, String email, String tipo)
    {
        if (!isValidNome(nome)) {
            JOptionPane.showMessageDialog(null, "O nome do fornecedor nao pode ter mais que 50 caracteres e nao deve ter caracteres especiais.",
                    "Erro no nome", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!isValidCnpj(cnpj)) 
	{
            JOptionPane.showMessageDialog(null, "O CNPJ deve conter 14 dígitos.",
		"Erro no CNPJ", JOptionPane.ERROR_MESSAGE);
            return false;
	}
        if (!isValidTelefone(telefone)) {
            JOptionPane.showMessageDialog(null, "O telefone nao pode ter mais que 20 caracteres e nao deve ter caracteres especiais ou letras.",
                    "Erro no telefone", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(null, "O email deve conter pelo menos um @",
                    "Erro no email", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!isValidCargo(tipo)) {
            JOptionPane.showMessageDialog(null, "O cargo não pode ter mais do que 20 caracteres.",
                    "Erro na indicação", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public static boolean isValidConta(String nome, String valor, String data, String pagamento)
    {
        if (!isValidNome(nome)) {
            JOptionPane.showMessageDialog(null, "O nome do produto nao pode ter mais que 50 caracteres e nao deve ter caracteres especiais.",
                    "Erro no nome", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (!isValidCusto(valor)) {
            JOptionPane.showMessageDialog(null, "O valor da conta só pode conter números e uma vírgula.",
                    "Erro no valor da conta", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (!isValidPagamento(pagamento)) {
            JOptionPane.showMessageDialog(null, "O tipo de pagamento nao pode ter mais que 15 caracteres e nao deve conter caracteres especiais.",
                    "Erro no pagamento", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        /*if (!isValidStatus(status)) {
            JOptionPane.showMessageDialog(null, "O status da conta nao pode ter mais que 10 caracteres e nao deve ter caracteres especiais.",
                    "Erro no status da conta", JOptionPane.ERROR_MESSAGE);
            return false;
        }*/
        
        if (!isValidData(data)) {
            JOptionPane.showMessageDialog(null, "A data deve seguir o padrão DD/MM/AAAA.",
                    "Erro na data", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public static boolean isValidData(String data)
    {
        if (data.length() == 0 || data.length() > 10) {
            return false;
        }
        
        
        /* COLOCAR TRY CATCH*/
        
        
        int dia = Integer.parseInt("" + data.charAt(0) + data.charAt(1));
        char barra1 = data.charAt(2);
        int mes = Integer.parseInt("" + data.charAt(3) + data.charAt(4));
        char barra2 = data.charAt(5);
        int ano = Integer.parseInt("" + data.charAt(6) + data.charAt(7) + data.charAt(8) + data.charAt(9));
        
        if((barra1 != '/') && (barra2 != '/'))
            return false;
        
        if((mes == 2) && (dia > 29))
            return false;
        
        if((dia <= 0 || dia > 31) || (mes <= 0 || mes > 12) || (ano <= 1950 || ano > 2030))
                return false;
        
        return true;
    }
    
    public static boolean isValidPagamento( String pagamento)
    {
        if (pagamento.length() == 0 || pagamento.length() > 15) {
            return false;
        }
        return !hasSpecialCharacters(pagamento) && !hasDigits(pagamento);
    }
    
    public static boolean isValidStatus(String status)
    {
        if (status.length() == 0 || status.length() > 10) {
            return false;
        }
        return !hasSpecialCharacters(status) && !hasDigits(status);
    }
    
    public static boolean isValidSenha(String senha) {
        Pattern letrasMinusculas = Pattern.compile("[a-z]");
        Pattern letrasMaiusculas = Pattern.compile("[A-Z]");
        return (letrasMaiusculas.matcher(senha).find() && letrasMinusculas.matcher(senha).find() && hasDigits(senha));
    }

    public static boolean isValidNome(String nome) {
        if (nome.length() == 0 || nome.length() > 50 || nome.equals("Nenhum cliente cadastrado")) {
            return false;
        }
        return !hasSpecialCharacters(nome);
    }
    
    public static boolean isValidCargo(String cargo) {
        if (cargo.length() == 0 || cargo.length() > 20) {
            return false;
        }
        return !hasSpecialCharacters(cargo);
    }
    
    public static boolean isValidEndereco(String endereco) {
        if (endereco.length() > 60) {
            return false;
        }
        return true;
    }
    
    public static boolean isValidSalario(String salario) {
        if (salario.length() == 0 || salario.length() > 9) {
            return false;
        }
        return (!hasSpecialCharacters(salario) && !hasLetters(salario));
    }

    public static boolean isValidCnpj(String cnpj) {
        if (cnpj.length() != 14) {
            return false;
        }
        return (!hasLetters(cnpj) && !hasSpecialCharacters(cnpj));
    }
    
    public static boolean isValidCpf(String cpf) {
        if (cpf.length() != 11) {
            return false;
        }        
        return (!hasLetters(cpf) && !hasSpecialCharacters(cpf));
    }

    public static boolean isValidTelefone(String telefone) {
        if (telefone.length() > 20 || hasLetters(telefone) || hasSpecialCharacters(telefone)) {
            return false;
        }
        return (!hasLetters(telefone) && !hasSpecialCharacters(telefone));
    }
    
    public static boolean isValidCusto(String custo) {
        return (!hasLetters(custo) && !hasSpecialCharacters(custo));
    }
    public static boolean isValidVenda(String venda) {
        return (!hasLetters(venda) && !hasSpecialCharacters(venda));
    }
    public static boolean isValidQuantidade(String qtd){
        return(!hasLetters(qtd) && !isNotInt(qtd));
    }

    public static boolean isValidEmail(String email) {
        Pattern regex = Pattern.compile("[@]");
        return (email.length() < 50 && regex.matcher(email).find());
    }

    public static boolean isValidRua(String rua) {
        if (rua.length() == 0 || rua.length() > 50) {
            return false;
        }
        return !hasSpecialCharacters(rua);
    }

    public static boolean isValidComplemento(String complemento) {
        if (complemento.length() > 50) {
            return false;
        }
        return !hasSpecialCharacters(complemento);
    }

    public static boolean isValidCidade(String cidade) {
        if (cidade.length() == 0 || cidade.length() > 50) {
            return false;
        }
        return (!hasDigits(cidade) && !hasSpecialCharacters(cidade));
    }

    public static boolean isValidCep(int cep) {
        return ((new Integer(cep)).toString().length() == 8);
    }
    public static boolean isValidIndicacao(String indicacao){
        return(!hasDigits(indicacao) && !hasSpecialCharacters(indicacao));
    }
    private static boolean hasLetters(String s) {
        Pattern regex = Pattern.compile("[a-zA-Z]");
        return regex.matcher(s).find();
    }

    private static boolean hasSpecialCharacters(String s) {
        Pattern regex = Pattern.compile("[$&+,:;=?@#|]");
        return regex.matcher(s).find();
    }
    
    private static boolean isNotInt(String s) {
        Pattern regex = Pattern.compile("[$&+,:;=?@#|.]");
        return regex.matcher(s).find();
    }
    private static boolean hasDigits(String s) {
        Pattern regex = Pattern.compile("[0-9]");
        return regex.matcher(s).find();
    }
}
