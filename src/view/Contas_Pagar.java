package view;

import controller.Banco_de_Dados;
import model.Conta;
import controller.Operacoes_Contas;
import java.text.SimpleDateFormat;
import javax.swing.DefaultListModel;
import javax.swing.JTextArea;

public class Contas_Pagar extends javax.swing.JFrame {

    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    public Contas_Pagar() 
    {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        logo_label.setIcon(new javax.swing.ImageIcon("335x113.png"));
        JTextArea contas_list = new JTextArea();
        Listar();
        contas_list.setEditable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        editar_button = new javax.swing.JButton();
        adicionar_button = new javax.swing.JButton();
        remover_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        contas_list = new javax.swing.JTextArea();
        voltar_button = new javax.swing.JButton();
        titulo_label = new javax.swing.JLabel();
        logo_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(206, 206, 206));

        editar_button.setBackground(new java.awt.Color(172, 172, 172));
        editar_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        editar_button.setText("Editar");
        editar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_buttonActionPerformed(evt);
            }
        });

        adicionar_button.setBackground(new java.awt.Color(172, 172, 172));
        adicionar_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        adicionar_button.setText("Adicionar");
        adicionar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionar_buttonActionPerformed(evt);
            }
        });

        remover_button.setBackground(new java.awt.Color(172, 172, 172));
        remover_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        remover_button.setText("Remover");
        remover_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remover_buttonActionPerformed(evt);
            }
        });

        contas_list.setColumns(20);
        contas_list.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        contas_list.setRows(5);
        contas_list.setSelectionColor(new java.awt.Color(255, 51, 51));
        jScrollPane1.setViewportView(contas_list);

        voltar_button.setBackground(new java.awt.Color(172, 172, 172));
        voltar_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        voltar_button.setText("Voltar");
        voltar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_buttonActionPerformed(evt);
            }
        });

        titulo_label.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        titulo_label.setText("Contas a Pagar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(titulo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adicionar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(remover_button, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 45, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(adicionar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(remover_button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionar_buttonActionPerformed
        dispose();
        new Registrar_Conta_Pagar();
    }//GEN-LAST:event_adicionar_buttonActionPerformed

    private void editar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_buttonActionPerformed
        dispose();
        new Editar_Conta_Pagar();
    }//GEN-LAST:event_editar_buttonActionPerformed

    private void remover_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remover_buttonActionPerformed
        dispose();
        new Remover_Conta_Pagar();
    }//GEN-LAST:event_remover_buttonActionPerformed

    private void voltar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_buttonActionPerformed
        dispose();
        new Contas();
    }//GEN-LAST:event_voltar_buttonActionPerformed


    public static void main(String args[]) 
    {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contas_Pagar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionar_button;
    private javax.swing.JTextArea contas_list;
    private javax.swing.JButton editar_button;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo_label;
    private javax.swing.JButton remover_button;
    private javax.swing.JLabel titulo_label;
    private javax.swing.JButton voltar_button;
    // End of variables declaration//GEN-END:variables

    public void Listar()
    {
        Operacoes_Contas oc = new Operacoes_Contas();
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        DefaultListModel<String> listModel  = bd.carregarConta("pagar");
        bd.FecharBanco();
        for(int i = 0; i < listModel.size(); i++)
        {
            Conta c = oc.gerarConta(listModel.get(i));
              
            contas_list.append("Nome: " + c.getNome() + "\n");
            contas_list.append("Valor: " + c.getValor()+ "\n");
            contas_list.append("Data: " + formato.format(c.getData()) + "\n");
            contas_list.append("Tipo de pagamento: " + c.getTipo_pagamento() + "\n");
            contas_list.append("Status: " + c.getStatus()+ "\n");
            contas_list.append(" \r\n\n\n");
            contas_list.setEditable(false);
        }
    }



}
