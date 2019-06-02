package view;

import controller.Banco_de_Dados;
import model.Conta;
import controller.Operacoes_Contas;
import java.text.SimpleDateFormat;
import javax.swing.DefaultListModel;

/**
 *
 * @author Cícero
 */
public class Contas extends javax.swing.JFrame 
{


    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    public Contas() {
        initComponents();
        setVisible(true);
        Listar_Pagar();
        Listar_Receber();
        pagar_text.setEditable(false);
        receber_text.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        receber_text = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        pagar_text = new javax.swing.JTextArea();
        pagar_label = new javax.swing.JLabel();
        voltar_button = new javax.swing.JButton();
        pagar_button = new javax.swing.JButton();
        receber_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        receber_text.setColumns(20);
        receber_text.setRows(5);
        jScrollPane1.setViewportView(receber_text);

        pagar_text.setColumns(20);
        pagar_text.setRows(5);
        jScrollPane2.setViewportView(pagar_text);

        pagar_label.setText("Contas");

        voltar_button.setText("Voltar");
        voltar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_buttonActionPerformed(evt);
            }
        });

        pagar_button.setText("Contas a Pagar");
        pagar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagar_buttonActionPerformed(evt);
            }
        });

        receber_button.setText("Contas a Receber");
        receber_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receber_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(pagar_label)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(voltar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(receber_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(pagar_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pagar_label)
                        .addGap(18, 18, 18)
                        .addComponent(pagar_button)
                        .addGap(18, 18, 18)
                        .addComponent(receber_button))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(voltar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void voltar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_buttonActionPerformed
        dispose();
        new Estatisticas();
    }//GEN-LAST:event_voltar_buttonActionPerformed

    private void pagar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagar_buttonActionPerformed
        dispose();
        new Contas_Pagar();
    }//GEN-LAST:event_pagar_buttonActionPerformed

    private void receber_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receber_buttonActionPerformed
        dispose();
        new Contas_Receber();
    }//GEN-LAST:event_receber_buttonActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Contas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton pagar_button;
    private javax.swing.JLabel pagar_label;
    private javax.swing.JTextArea pagar_text;
    private javax.swing.JButton receber_button;
    private javax.swing.JTextArea receber_text;
    private javax.swing.JButton voltar_button;
    // End of variables declaration//GEN-END:variables
    public void Listar_Pagar()
    {
        pagar_text.setEditable(rootPaneCheckingEnabled);
        Operacoes_Contas oc = new Operacoes_Contas();
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        DefaultListModel<String> listModel  = bd.carregarConta("pagar");
        bd.FecharBanco();
        
        for(int i = 0; i < listModel.size(); i++)
        {
            Conta c = oc.gerarConta(listModel.get(i));
            pagar_text.append("Nome: " + c.getNome() + "\n");
            pagar_text.append("Valor: " + c.getValor()+ "\n");
            pagar_text.append("Data: " + formato.format(c.getData()) + "\n");
            pagar_text.append("Tipo de pagamento: " + c.getTipo_pagamento() + "\n");
            pagar_text.append("Status: " + c.getStatus()+ "\n");
            pagar_text.append(" \r\n\n\n");
            pagar_text.setEditable(false);
        }
    }

    public void Listar_Receber()
    {
        Operacoes_Contas oc = new Operacoes_Contas();
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        DefaultListModel<String> listModel  = bd.carregarConta("receber");
        bd.FecharBanco();
        pagar_text.setEditable(true);
        
        for(int i = 0; i < listModel.size(); i++)
        {
            Conta c = oc.gerarConta(listModel.get(i));
            
            receber_text.append("Nome: " + c.getNome() + "\n");
            receber_text.append("Valor: " + c.getValor()+ "\n");
            receber_text.append("Data: " + formato.format(c.getData()) + "\n");
            receber_text.append("Tipo de pagamento: " + c.getTipo_pagamento() + "\n");
            receber_text.append("Status: " + c.getStatus()+ "\n");
            receber_text.append(" \r\n\n\n");
            receber_text.setEditable(false);
        }
    }








}
