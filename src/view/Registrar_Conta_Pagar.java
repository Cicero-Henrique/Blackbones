package view;

import controller.Operacoes_Contas;
import controller.Validator;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Registrar_Conta_Pagar extends javax.swing.JFrame {

    public Registrar_Conta_Pagar() {
        initComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nome_label = new javax.swing.JLabel();
        nome_text = new javax.swing.JTextField();
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
        status_combo = new javax.swing.JComboBox<>();
        titulo_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(206, 206, 206));

        nome_label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nome_label.setText("Nome do Fornecedor:");

        nome_text.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        valor_label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        valor_label.setText("Valor: ");

        valor_text.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        data_label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        data_label.setText("Data de Vencimento:");

        data_text.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        pagamento_label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pagamento_label.setText("Metodo de Pagamento");

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

        status_combo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        status_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "À pagar", "Pago" }));

        titulo_label.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        titulo_label.setText("Registrar Conta a Pagar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titulo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(data_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(valor_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nome_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(pagamento_label)
                                            .addComponent(status_label, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(47, 47, 47)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nome_text)
                                            .addComponent(valor_text)
                                            .addComponent(data_text)
                                            .addComponent(pagamento_text, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(status_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(salvar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(76, 76, 76)
                                        .addComponent(limpar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(99, 99, 99)))))
                        .addGap(0, 256, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(voltar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127)
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
        nome_text.setText(" ");
        valor_text.setText(" ");
        data_text.setText(" ");
        pagamento_text.setText(" ");
    }//GEN-LAST:event_limpar_buttonActionPerformed

    private void voltar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_buttonActionPerformed
        dispose();
        new Contas_Pagar();
    }//GEN-LAST:event_voltar_buttonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Conta_Pagar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel data_label;
    private javax.swing.JTextField data_text;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpar_button;
    private javax.swing.JLabel nome_label;
    private javax.swing.JTextField nome_text;
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
        
        String tipo_conta = "pagar";
        
        if(!Validator.isValidConta(nome_text.getText(), valor_text.getText(), data_text.getText(), pagamento_text.getText()))
        {
            JOptionPane.showMessageDialog(null, "Corrija os dados informados");
            return false;
        }
        else
        {
            String nome = nome_text.getText();
            double valor = Double.parseDouble(valor_text.getText());
            String dia = ("" + data_text.getText().charAt(0) + data_text.getText().charAt(1));
            String mes = ("" + data_text.getText().charAt(3) + data_text.getText().charAt(4));
            String ano = ("" + data_text.getText().charAt(6) + data_text.getText().charAt(7) + data_text.getText().charAt(8) + data_text.getText().charAt(9));
            String pagamento = pagamento_text.getText();
            String status = status_combo.getSelectedItem().toString();
            
            try 
            {
                Date data = formato.parse(dia + "/" + mes + "/" + ano);
                op.adicionar(valor, nome, data, pagamento, tipo_conta, status, -1);
                
                dispose();
                new Registrar_Conta_Pagar();
                
                return true;
            } 
            catch (ParseException ex) {
                Logger.getLogger(Registrar_Conta_Pagar.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
        }
    }
    
}
