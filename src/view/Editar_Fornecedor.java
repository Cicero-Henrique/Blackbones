/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import blackbones.Banco_de_Dados;
import blackbones.Fornecedor;
import blackbones.Operacoes_Fornecedores;
import blackbones.Registro;
import blackbones.Validator;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author Cícero
 */
public class Editar_Fornecedor extends javax.swing.JFrame 
{

    int id = -1;
    public Editar_Fornecedor() 
    {
        initComponents();
        setVisible(true);
        
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        DefaultListModel listModel = new DefaultListModel();
        listModel = bd.carregarFornecedor();
        bd.FecharBanco();
        
        id = -1;
        jList1.setModel(listModel);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        selecionar_button = new javax.swing.JButton();
        salvar_button = new javax.swing.JButton();
        limpar_button = new javax.swing.JButton();
        voltar_button = new javax.swing.JButton();
        nome_label = new javax.swing.JLabel();
        nome_text = new javax.swing.JTextField();
        email_label = new javax.swing.JLabel();
        email_text = new javax.swing.JTextField();
        telefone_label = new javax.swing.JLabel();
        telefone_text = new javax.swing.JTextField();
        tipo_label = new javax.swing.JLabel();
        tipo_text = new javax.swing.JTextField();
        cnpj_label = new javax.swing.JLabel();
        cnpj_text = new javax.swing.JTextField();
        extipo_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {"Item1"};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        selecionar_button.setText("Selecionar");
        selecionar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionar_buttonActionPerformed(evt);
            }
        });

        salvar_button.setText("Salvar");
        salvar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_buttonActionPerformed(evt);
            }
        });

        limpar_button.setText("Limpar");
        limpar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpar_buttonActionPerformed(evt);
            }
        });

        voltar_button.setText("Voltar");
        voltar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_buttonActionPerformed(evt);
            }
        });

        nome_label.setText("Nome:");

        nome_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_textActionPerformed(evt);
            }
        });

        email_label.setText("E-mail:");

        email_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_textActionPerformed(evt);
            }
        });

        telefone_label.setText("Telefone:");

        tipo_label.setText("Tipo:");

        cnpj_label.setText("CNPJ:");

        extipo_label.setText("Ex: Matéria-prima, entregas, serviços");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(salvar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(limpar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(314, 314, 314))
                            .addComponent(voltar_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(selecionar_button)
                                .addGap(55, 55, 55)))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cnpj_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tipo_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telefone_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(email_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nome_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nome_text)
                            .addComponent(email_text)
                            .addComponent(telefone_text)
                            .addComponent(tipo_text)
                            .addComponent(cnpj_text, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(extipo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(selecionar_button)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefone_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefone_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(extipo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnpj_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnpj_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(voltar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
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

    private void selecionar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionar_buttonActionPerformed

        if (!jList1.isSelectionEmpty())
        {
            Operacoes_Fornecedores of = new Operacoes_Fornecedores();
            String linha = jList1.getSelectedValue();
            id = of.pegarID(linha);
            
            Banco_de_Dados bd = new Banco_de_Dados();
            bd.conectar("blackbones");
            Fornecedor f = bd.PesquisarIdFornecedor(id);
            bd.FecharBanco();
            
            
            nome_text.setText(f.getNome());
            cnpj_text.setText(f.getCnpj());
            telefone_text.setText(f.getTelefone());
            tipo_text.setText(f.getTipo());
            email_text.setText(f.getEmail());
        }
    }//GEN-LAST:event_selecionar_buttonActionPerformed

    private void salvar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_buttonActionPerformed
        Operacoes_Fornecedores of = new Operacoes_Fornecedores();
        if(Validator.isValidFornecedor(nome_text.getText(), cnpj_text.getText(), telefone_text.getText(), email_text.getText(), tipo_text.getText()))
        {
            of.editar(id, nome_text.getText(), cnpj_text.getText(), telefone_text.getText(), email_text.getText(), tipo_text.getText());
       
            dispose();
            new Editar_Fornecedor();
        }
        
    }//GEN-LAST:event_salvar_buttonActionPerformed

    private void limpar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar_buttonActionPerformed
        nome_text.setText(" ");
        tipo_text.setText(" ");
        cnpj_text.setText(" ");
        telefone_text.setText(" ");
        email_text.setText(" ");
    }//GEN-LAST:event_limpar_buttonActionPerformed

    private void voltar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_buttonActionPerformed
        dispose();
        new Estatisticas();
    }//GEN-LAST:event_voltar_buttonActionPerformed

    private void nome_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_textActionPerformed

    private void email_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_textActionPerformed

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
            java.util.logging.Logger.getLogger(Editar_Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar_Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar_Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar_Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar_Fornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cnpj_label;
    private javax.swing.JTextField cnpj_text;
    private javax.swing.JLabel email_label;
    private javax.swing.JTextField email_text;
    private javax.swing.JLabel extipo_label;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpar_button;
    private javax.swing.JLabel nome_label;
    private javax.swing.JTextField nome_text;
    private javax.swing.JButton salvar_button;
    private javax.swing.JButton selecionar_button;
    private javax.swing.JButton selecionar_button4;
    private javax.swing.JLabel telefone_label;
    private javax.swing.JTextField telefone_text;
    private javax.swing.JLabel tipo_label;
    private javax.swing.JTextField tipo_text;
    private javax.swing.JButton voltar_button;
    // End of variables declaration//GEN-END:variables

}
