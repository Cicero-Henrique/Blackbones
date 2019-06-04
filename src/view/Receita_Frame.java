package view;

import controller.Banco_de_Dados;
import controller.Operacoes_Vendas;
import model.Conta;
import controller.Receita;
import controller.Validator;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import model.Produto;

/**
 *
 * @author Cícero
 */
public class Receita_Frame extends javax.swing.JFrame {

    public Receita_Frame() 
    {
        initComponents();
        receita.setEditable(false);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        data_inicial_label = new javax.swing.JLabel();
        data_inicial_text = new javax.swing.JTextField();
        data_final_label = new javax.swing.JLabel();
        data_final_text = new javax.swing.JTextField();
        confirmar_button = new javax.swing.JButton();
        voltar_button = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        receita = new javax.swing.JTextArea();
        titulo_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(206, 206, 206));

        data_inicial_label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        data_inicial_label.setText("Data Inicial: ");

        data_inicial_text.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        data_final_label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        data_final_label.setText("Data Final: ");

        data_final_text.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        confirmar_button.setBackground(new java.awt.Color(172, 172, 172));
        confirmar_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        confirmar_button.setText("Confirmar");
        confirmar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmar_buttonActionPerformed(evt);
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

        receita.setColumns(20);
        receita.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        receita.setRows(5);
        jScrollPane2.setViewportView(receita);

        titulo_label.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        titulo_label.setText("Receita");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltar_button)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(data_inicial_label)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(data_inicial_text, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(data_final_label)
                                .addGap(18, 18, 18)
                                .addComponent(data_final_text, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(confirmar_button))
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titulo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(data_final_label)
                        .addComponent(data_final_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(confirmar_button))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(data_inicial_label)
                        .addComponent(data_inicial_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(voltar_button)
                .addContainerGap(20, Short.MAX_VALUE))
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

    private void confirmar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmar_buttonActionPerformed
        receita.setEditable(true);
        receita.setText(" ");
        String data_inicial = data_inicial_text.getText();
        String data_final = data_final_text.getText();
        
        if(Validator.isValidData(data_inicial) && Validator.isValidData(data_final) &&
                Validator.sqlTest(data_inicial) && Validator.sqlTest(data_final))
            Listar(data_inicial, data_final);
        receita.setEditable(false);
    }//GEN-LAST:event_confirmar_buttonActionPerformed

    private void voltar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_buttonActionPerformed
        // TODO add your handling code here:
        dispose();
        new Estatisticas();
    }//GEN-LAST:event_voltar_buttonActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receita_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmar_button;
    private javax.swing.JLabel data_final_label;
    private javax.swing.JTextField data_final_text;
    private javax.swing.JLabel data_inicial_label;
    private javax.swing.JTextField data_inicial_text;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea receita;
    private javax.swing.JLabel titulo_label;
    private javax.swing.JButton voltar_button;
    // End of variables declaration//GEN-END:variables
    
    public void Listar(String inicio, String data_final)
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Receita r = new Receita();
        ArrayList<Conta> conta = r.pegarContasReceber(inicio, data_final);
        ArrayList<String> vendas = r.pegarVendas(inicio, data_final);
        double lucros = 0, total = 0, despesas = 0;
        
        receita.append("\t\t LUCROS \n");
        for(int i = 0; i <conta.size(); i++)
        {
            receita.append("Nome: " + conta.get(i).getNome() + "\n");
            receita.append("Método de pagamento: " + conta.get(i).getTipo_pagamento() + "\n");
            receita.append("Valor: " + conta.get(i).getValor() + "\n");
            receita.append("Data: " + formato.format(conta.get(i).getData()) + "\n\n");
            lucros = lucros + conta.get(i).getValor();
        }
        receita.append("\n");
        
        for(int i = 0; i <vendas.size(); i++)
        {
            Operacoes_Vendas ov = new Operacoes_Vendas();
            int idProduto = ov.pegarID(vendas.get(i));
            Banco_de_Dados bd = new Banco_de_Dados();
            bd.conectar("blackbones");
            Produto p = bd.PesquisarIdProduto(idProduto);
            bd.FecharBanco();
            if(p.getQtd() == -1)
            {
                receita.append("Data: " + vendas.get(i).split("-")[1] + "\n");
                receita.append("ID do Produto: " + vendas.get(i).split("-")[0] + "\n\n");
            }
            else
            {
                receita.append("Data: " + vendas.get(i).split("-")[1] + "\n");
                receita.append("Produto: " + p.getNome() + "\n\n");
            }
        }
        conta = r.pegarContasPagar(inicio, data_final);
        
        receita.append("\n\n\n\t\t PREJUÍZOS \n");
        for(int i = 0; i <conta.size(); i++)
        {
            receita.append("Nome: " + conta.get(i).getNome() + "\n");
            receita.append("Método de pagamento: " + conta.get(i).getTipo_pagamento() + "\n");
            receita.append("Valor: " + conta.get(i).getValor() + "\n");
            receita.append("Data: " + formato.format(conta.get(i).getData()) + "\n\n");
            despesas = despesas + conta.get(i).getValor();
        }
        total = lucros - despesas;
        receita.append("\n\n\n\t\t RESUMO \n");
        receita.append("DESPESAS: " + despesas + "\n");
        receita.append("LUCROS: " + lucros + "\n");
        receita.append("TOTAL: " + total + "\n");        
    }
}
