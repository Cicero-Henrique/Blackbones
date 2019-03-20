package view;

import blackbones.Armazenamento_File;
import blackbones.Estoque;
import blackbones.Operacoes_Produtos;
import blackbones.Validator;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Registrar_Produto extends javax.swing.JFrame {

    public Registrar_Produto() {
        initComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nome_label = new javax.swing.JLabel();
        tipo_label = new javax.swing.JLabel();
        custo_label = new javax.swing.JLabel();
        venda_label = new javax.swing.JLabel();
        nome_text = new javax.swing.JTextField();
        tipo_text = new javax.swing.JTextField();
        custo_text = new javax.swing.JTextField();
        venda_text = new javax.swing.JTextField();
        salvar_button = new javax.swing.JButton();
        limpar_button = new javax.swing.JButton();
        voltar_button = new javax.swing.JButton();
        qtd_label = new javax.swing.JLabel();
        qtd_text = new javax.swing.JTextField();
        tamanhos_lable = new javax.swing.JLabel();
        tamanho_pp = new javax.swing.JCheckBox();
        tamanho_p = new javax.swing.JCheckBox();
        tamanho_m = new javax.swing.JCheckBox();
        tamanho_g = new javax.swing.JCheckBox();
        tamanho_gg = new javax.swing.JCheckBox();
        tamanho_ggg = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nome_label.setText("Nome:");

        tipo_label.setText("Tipo:");

        custo_label.setText("Preço de Custo:");

        venda_label.setText("Preço de Venda:");

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

        qtd_label.setText("Quantidade:");

        tamanhos_lable.setText("Tamanhos:");

        tamanho_pp.setText("PP");
        tamanho_pp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanho_ppActionPerformed(evt);
            }
        });

        tamanho_p.setText("P");

        tamanho_m.setText("M");

        tamanho_g.setText("G");

        tamanho_gg.setText("GG");

        tamanho_ggg.setText("GGG");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(salvar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(limpar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tamanhos_lable)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(custo_label, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(tipo_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nome_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(venda_label, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                    .addComponent(qtd_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nome_text)
                                    .addComponent(tipo_text)
                                    .addComponent(custo_text)
                                    .addComponent(venda_text, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(qtd_text)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(tamanho_pp)
                        .addGap(18, 18, 18)
                        .addComponent(tamanho_p)
                        .addGap(18, 18, 18)
                        .addComponent(tamanho_m)
                        .addGap(18, 18, 18)
                        .addComponent(tamanho_g)
                        .addGap(18, 18, 18)
                        .addComponent(tamanho_gg)
                        .addGap(18, 18, 18)
                        .addComponent(tamanho_ggg)))
                .addContainerGap(336, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custo_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(venda_label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(venda_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtd_label)
                    .addComponent(qtd_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tamanhos_lable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tamanho_pp)
                    .addComponent(tamanho_p)
                    .addComponent(tamanho_m)
                    .addComponent(tamanho_g)
                    .addComponent(tamanho_gg)
                    .addComponent(tamanho_ggg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(voltar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
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
        try 
        {
            if(Dados() == false)
                JOptionPane.showMessageDialog(null, "Algum dado não foi digitado corretamente", "Dados incorretos", JOptionPane.ERROR_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "As informações foram salvas corretamente.", "Dados salvos", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_salvar_buttonActionPerformed

    private void limpar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar_buttonActionPerformed
        // TODO add your handling code here:
        nome_text.setText(" ");
        tipo_text.setText(" ");
        custo_text.setText(" ");
        venda_text.setText(" ");
        qtd_text.setText(" ");
    }//GEN-LAST:event_limpar_buttonActionPerformed

    private void voltar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_buttonActionPerformed
        dispose();
        new Estatisticas();
    }//GEN-LAST:event_voltar_buttonActionPerformed

    private void tamanho_ppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanho_ppActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tamanho_ppActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel custo_label;
    private javax.swing.JTextField custo_text;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpar_button;
    private javax.swing.JLabel nome_label;
    private javax.swing.JTextField nome_text;
    private javax.swing.JLabel qtd_label;
    private javax.swing.JTextField qtd_text;
    private javax.swing.JButton salvar_button;
    private javax.swing.JCheckBox tamanho_g;
    private javax.swing.JCheckBox tamanho_gg;
    private javax.swing.JCheckBox tamanho_ggg;
    private javax.swing.JCheckBox tamanho_m;
    private javax.swing.JCheckBox tamanho_p;
    private javax.swing.JCheckBox tamanho_pp;
    private javax.swing.JLabel tamanhos_lable;
    private javax.swing.JLabel tipo_label;
    private javax.swing.JTextField tipo_text;
    private javax.swing.JLabel venda_label;
    private javax.swing.JTextField venda_text;
    private javax.swing.JButton voltar_button;
    // End of variables declaration//GEN-END:variables

    public boolean Dados() throws IOException
    {
        Operacoes_Produtos op = new Operacoes_Produtos();
        Estoque e = new Estoque();
        
        String nome = nome_text.getText();
        String tipo = tipo_text.getText();        
        
        if(!Validator.isValidProduct(nome, tipo, custo_text.getText(), venda_text.getText(), qtd_text.getText()))
        {
            JOptionPane.showMessageDialog(null, "Corrija os dados informados");
            return false;
        }
        else
        {            
            Armazenamento_File a = new Armazenamento_File();
            
            Double custo = Double.parseDouble(custo_text.getText());
            Double venda = Double.parseDouble(venda_text.getText());
            int qtd = Integer.parseInt(qtd_text.getText());
            double receita = venda * qtd;
            double margem = (receita - custo)/receita;
            String[] tamanhos = Tamanhos();
            String tamanho = "";
            
            for(int i = 0; i <= 5; i++)
            {
                if(tamanhos[i] != null)
                    tamanho = (tamanho + "/" + tamanhos[i]);
            }
            if(tamanho.equals(""))
                tamanho = "-Nenhum tamanho selecionado";
            
            e = a.loadProduto();
            op.adicionar_produto(e, nome, tipo, custo, venda, margem, qtd, tamanho);
            a.salvarProduto(e);
            
            return true;
        }
    }
    
    public String[] Tamanhos()
    {
        String[] selecionados = new String[6];
        int i = 0;
        if(tamanho_pp.isSelected())
        {
            selecionados[i] = "PP";
            i++;
        }
        if(tamanho_p.isSelected())
        {
            selecionados[i] = "P";
            i++;
        }
        if(tamanho_m.isSelected())
        {
            selecionados[i] = "M";
            i++;
        }
        if(tamanho_g.isSelected())
        {
            selecionados[i] = "G";
            i++;
        }
        if(tamanho_gg.isSelected())
        {
            selecionados[i] = "GG";
            i++;
        }
        if(tamanho_ggg.isSelected())
        {
            selecionados[i] = "GGG";
            i++;
        }
        return selecionados;
    }
    

}
