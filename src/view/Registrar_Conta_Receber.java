package view;

import controller.Banco_de_Dados;
import model.Cliente;
import controller.Operacoes_Clientes;
import controller.Operacoes_Contas;
import controller.Validator;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Cícero
 */
public class Registrar_Conta_Receber extends javax.swing.JFrame 
{
    ArrayList<String> clientes = new ArrayList<>();
    public Registrar_Conta_Receber() 
    {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        logo_label.setIcon(new javax.swing.ImageIcon("335x113.png"));
        carregar_comboBox();
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nome_label = new javax.swing.JLabel();
        valor_label = new javax.swing.JLabel();
        valor_text = new javax.swing.JTextField();
        data_label = new javax.swing.JLabel();
        data_text = new javax.swing.JTextField();
        pagamento_label = new javax.swing.JLabel();
        pagamento_text = new javax.swing.JTextField();
        status_label = new javax.swing.JLabel();
        salvar_button = new javax.swing.JButton();
        limpar_button = new javax.swing.JButton();
        voltar_button = new javax.swing.JButton();
        cliente_combo = new javax.swing.JComboBox<>();
        status_combo = new javax.swing.JComboBox<>();
        titulo_label = new javax.swing.JLabel();
        logo_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(206, 206, 206));

        nome_label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nome_label.setText("Nome do Cliente:");

        valor_label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        valor_label.setText("Valor: ");

        valor_text.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        data_label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        data_label.setText("Data de Vencimento:");

        data_text.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        pagamento_label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pagamento_label.setText("Método de Pagamento:");

        pagamento_text.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        status_label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        status_label.setText("Status:");

        salvar_button.setBackground(new java.awt.Color(172, 172, 172));
        salvar_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        salvar_button.setText("Salvar");
        salvar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_buttonActionPerformed(evt);
            }
        });

        limpar_button.setBackground(new java.awt.Color(172, 172, 172));
        limpar_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        limpar_button.setText("Limpar");
        limpar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpar_buttonActionPerformed(evt);
            }
        });

        voltar_button.setBackground(new java.awt.Color(172, 172, 172));
        voltar_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        voltar_button.setText("Voltar");
        voltar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_buttonActionPerformed(evt);
            }
        });

        cliente_combo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cliente_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliente_comboActionPerformed(evt);
            }
        });

        status_combo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        status_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "À pagar", "Pago" }));

        titulo_label.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        titulo_label.setText("Adicionar Conta a Receber");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(data_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valor_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nome_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pagamento_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(status_label, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(valor_text)
                            .addComponent(data_text)
                            .addComponent(pagamento_text, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cliente_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(status_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(158, 158, 158))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(voltar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(salvar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(limpar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titulo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo_label)
                    .addComponent(logo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cliente_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valor_label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valor_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data_label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(data_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pagamento_label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pagamento_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(status_label)
                    .addComponent(status_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addComponent(voltar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_buttonActionPerformed
        
            if(Dados() == false)
            JOptionPane.showMessageDialog(null, "Algum dado não foi digitado corretamente", "Dados incorretos", JOptionPane.ERROR_MESSAGE);
            else
            JOptionPane.showMessageDialog(null, "As informações foram salvas corretamente.", "Dados salvos", JOptionPane.WARNING_MESSAGE);
        
    }//GEN-LAST:event_salvar_buttonActionPerformed

    private void limpar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar_buttonActionPerformed
        // TODO add your handling code here:
        
        valor_text.setText(" ");
        data_text.setText(" ");
        pagamento_text.setText(" ");
    }//GEN-LAST:event_limpar_buttonActionPerformed

    private void voltar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_buttonActionPerformed
        dispose();
        new Contas_Receber();
    }//GEN-LAST:event_voltar_buttonActionPerformed

    private void cliente_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliente_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cliente_comboActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registrar_Conta_Receber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_Conta_Receber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_Conta_Receber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_Conta_Receber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Conta_Receber().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cliente_combo;
    private javax.swing.JLabel data_label;
    private javax.swing.JTextField data_text;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpar_button;
    private javax.swing.JLabel logo_label;
    private javax.swing.JLabel nome_label;
    private javax.swing.JLabel pagamento_label;
    private javax.swing.JTextField pagamento_text;
    private javax.swing.JButton salvar_button;
    private javax.swing.JComboBox<String> status_combo;
    private javax.swing.JLabel status_label;
    private javax.swing.JLabel titulo_label;
    private javax.swing.JLabel valor_label;
    private javax.swing.JTextField valor_text;
    private javax.swing.JButton voltar_button;
    // End of variables declaration//GEN-END:variables

    public boolean Dados()
    {
        Operacoes_Contas op = new Operacoes_Contas();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        String tipo_conta = "receber";
        String nome = cliente_combo.getSelectedItem().toString();
        
        if(!Validator.isValidConta(nome, valor_text.getText(), data_text.getText(), pagamento_text.getText()))
        {
            JOptionPane.showMessageDialog(null, "Corrija os dados informados");
            return false;
        }
        else
        {
            //String nome = nome_text.getText();
            String cliente = cliente_combo.getSelectedItem().toString();
            int id_cliente = gerarId(cliente);
            
            double valor = Double.parseDouble(valor_text.getText());
            String dia = ("" + data_text.getText().charAt(0) + data_text.getText().charAt(1));
            String mes = ("" + data_text.getText().charAt(3) + data_text.getText().charAt(4));
            String ano = ("" + data_text.getText().charAt(6) + data_text.getText().charAt(7) + data_text.getText().charAt(8) + data_text.getText().charAt(9));
            String pagamento = pagamento_text.getText();
            String status = status_combo.getSelectedItem().toString();
            try 
            {
                Date data = formato.parse(dia + "/" + mes + "/" + ano);
                op.adicionar(valor, nome, data, pagamento, tipo_conta, status, id_cliente);
                return true;
            } 
            catch (ParseException ex) {Logger.getLogger(Registrar_Conta_Receber.class.getName()).log(Level.SEVERE, null, ex);}
            
            return false;
        }
    }
    
    public void carregar_comboBox()
    {
        Operacoes_Clientes oc = new Operacoes_Clientes();
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        DefaultListModel<String> list = bd.carregarCliente();
        bd.FecharBanco();
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        for(int i  = 0; i < list.size(); i++)
        {
            Cliente c = oc.gerarCliente(list.get(i));
            listaClientes.add(c);
            clientes.add(oc.pegarID(list.get(i)) + "-" + c.getNome());
        }
        
        if(listaClientes.size() > 0)
        {
            for(int i =0; i < listaClientes.size(); i++)
                cliente_combo.addItem(listaClientes.get(i).getNome());
        }
        else
            cliente_combo.addItem("Nenhum cliente cadastrado");
    }
    
    public int gerarId(String nome)
    {
        int aux = -1;
        for(int i = 0; i < clientes.size(); i++)
        {
            String[] linha = clientes.get(i).split("-");
            if(linha[1].equals(nome))
                return Integer.parseInt(linha[0].trim());
        }        
        return aux;
    }
    

}
