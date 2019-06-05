
package view;

import controller.Banco_de_Dados;
import controller.Operacoes_Produtos;
import model.Produto;
import controller.Validator;
import javax.swing.DefaultListModel;

public class Editar_Produto extends javax.swing.JFrame 
{

    int id = -1;
    public Editar_Produto() 
    {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        logo_label.setIcon(new javax.swing.ImageIcon("335x113.png"));
        
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        DefaultListModel listModel = new DefaultListModel();
        listModel = bd.carregarProduto();
        bd.FecharBanco();
        
        id = -1;
        jList1.setModel(listModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        salvar_button = new javax.swing.JButton();
        limpar_button = new javax.swing.JButton();
        voltar_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        selecionar_button = new javax.swing.JButton();
        nome_label = new javax.swing.JLabel();
        nome_text = new javax.swing.JTextField();
        tipo_label = new javax.swing.JLabel();
        tipo_text = new javax.swing.JTextField();
        custo_label = new javax.swing.JLabel();
        custo_text = new javax.swing.JTextField();
        venda_label = new javax.swing.JLabel();
        venda_text = new javax.swing.JTextField();
        qtd_label = new javax.swing.JLabel();
        qtd_text = new javax.swing.JTextField();
        tamanhos_lable = new javax.swing.JLabel();
        tamanho_pp = new javax.swing.JCheckBox();
        tamanho_p = new javax.swing.JCheckBox();
        tamanho_m = new javax.swing.JCheckBox();
        tamanho_g = new javax.swing.JCheckBox();
        tamanho_gg = new javax.swing.JCheckBox();
        tamanho_ggg = new javax.swing.JCheckBox();
        titulo_label = new javax.swing.JLabel();
        logo_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(206, 206, 206));

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

        jList1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }

            /*String[] strings = Listar();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }*/
        });
        jList1.setSelectionBackground(new java.awt.Color(255, 51, 51));
        jScrollPane1.setViewportView(jList1);

        selecionar_button.setBackground(new java.awt.Color(172, 172, 172));
        selecionar_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        selecionar_button.setText("Selecionar");
        selecionar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionar_buttonActionPerformed(evt);
            }
        });

        nome_label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nome_label.setText("Nome:");

        nome_text.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tipo_label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tipo_label.setText("Tipo:");

        tipo_text.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        custo_label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        custo_label.setText("Preço de Custo:");

        custo_text.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        venda_label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        venda_label.setText("Preço de Venda:");

        venda_text.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        qtd_label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        qtd_label.setText("Quantidade:");

        qtd_text.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tamanhos_lable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tamanhos_lable.setText("Tamanhos:");

        tamanho_pp.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tamanho_pp.setText("PP");

        tamanho_p.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tamanho_p.setText("P");

        tamanho_m.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tamanho_m.setText("M");

        tamanho_g.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tamanho_g.setText("G");

        tamanho_gg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tamanho_gg.setText("GG");

        tamanho_ggg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tamanho_ggg.setText("GGG");

        titulo_label.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        titulo_label.setText("Editar Produto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(voltar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(salvar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)
                        .addComponent(limpar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(349, 349, 349))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(selecionar_button))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tamanhos_lable)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(custo_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tipo_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nome_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(venda_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(qtd_label, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nome_text)
                                    .addComponent(tipo_text)
                                    .addComponent(custo_text)
                                    .addComponent(venda_text)
                                    .addComponent(qtd_text, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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
                        .addComponent(tamanho_ggg)
                        .addGap(282, 282, 282)))
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(selecionar_button)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tamanho_ggg)
                    .addComponent(tamanho_gg)
                    .addComponent(tamanho_g)
                    .addComponent(tamanho_m)
                    .addComponent(tamanho_p)
                    .addComponent(tamanho_pp))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(voltar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salvar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(limpar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))))
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
            Operacoes_Produtos op = new Operacoes_Produtos();
            String linha = jList1.getSelectedValue();
            id = op.pegarID(linha);

            Banco_de_Dados bd = new Banco_de_Dados();
            bd.conectar("blackbones");
            Produto p = bd.PesquisarIdProduto(id);
            bd.FecharBanco();

            nome_text.setText(p.getNome());
            tipo_text.setText(p.getTipo());
            custo_text.setText(Double.toString(p.getPreco_custo()));
            venda_text.setText(Double.toString(p.getPreco_venda()));
            qtd_text.setText(Integer.toString(p.getQtd()));
            getTamanhos(p.getTamanho());
        }
    }//GEN-LAST:event_selecionar_buttonActionPerformed

    private void voltar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_buttonActionPerformed
        // TODO add your handling code here:
        dispose();
        new Estatisticas();
    }//GEN-LAST:event_voltar_buttonActionPerformed

    private void limpar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar_buttonActionPerformed
        nome_text.setText(" ");
        tipo_text.setText(" ");
        custo_text.setText(" ");
        venda_text.setText(" ");
        qtd_text.setText(" ");
    }//GEN-LAST:event_limpar_buttonActionPerformed

    private void salvar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_buttonActionPerformed
        Operacoes_Produtos op = new Operacoes_Produtos();

        if(Validator.isValidProduct(nome_text.getText(), tipo_text.getText(), custo_text.getText(), venda_text.getText(), qtd_text.getText()))
        {
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
            tamanho = "Nenhum tamanho selecionado";
            op.editar(id, nome_text.getText(), tipo_text.getText(), custo, venda, margem, qtd, tamanho);

            dispose();
            new Editar_Produto();
        }

    }//GEN-LAST:event_salvar_buttonActionPerformed


    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                new Editar_Produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel custo_label;
    private javax.swing.JTextField custo_text;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpar_button;
    private javax.swing.JLabel logo_label;
    private javax.swing.JLabel nome_label;
    private javax.swing.JTextField nome_text;
    private javax.swing.JLabel qtd_label;
    private javax.swing.JTextField qtd_text;
    private javax.swing.JButton salvar_button;
    private javax.swing.JButton selecionar_button;
    private javax.swing.JCheckBox tamanho_g;
    private javax.swing.JCheckBox tamanho_gg;
    private javax.swing.JCheckBox tamanho_ggg;
    private javax.swing.JCheckBox tamanho_m;
    private javax.swing.JCheckBox tamanho_p;
    private javax.swing.JCheckBox tamanho_pp;
    private javax.swing.JLabel tamanhos_lable;
    private javax.swing.JLabel tipo_label;
    private javax.swing.JTextField tipo_text;
    private javax.swing.JLabel titulo_label;
    private javax.swing.JLabel venda_label;
    private javax.swing.JTextField venda_text;
    private javax.swing.JButton voltar_button;
    // End of variables declaration//GEN-END:variables
        
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
    
    public void getTamanhos(String tamanho)
    {
        String tamanhos[] = new String[6];
        tamanhos = tamanho.trim().split("/");
        for(int i = 0; i < tamanhos.length; i++)
        {
            if(tamanhos[i].equals("PP"))
                tamanho_pp.setSelected(true);
            if(tamanhos[i].equals("P"))
                tamanho_p.setSelected(true);
            if(tamanhos[i].equals("M"))
                tamanho_m.setSelected(true);
            if(tamanhos[i].equals("G"))
                tamanho_g.setSelected(true);
            if(tamanhos[i].equals("GG"))
                tamanho_gg.setSelected(true);
            if(tamanhos[i].equals("GGG"))
                tamanho_ggg.setSelected(true);
        }
        
    }
}
