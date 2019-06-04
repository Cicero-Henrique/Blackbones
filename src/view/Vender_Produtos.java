package view;

import controller.Banco_de_Dados;
import controller.Operacoes_Produtos;
import model.Produto;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Vender_Produtos extends javax.swing.JFrame 
{
    int id = -1;
    DefaultListModel<String> vender = new DefaultListModel();
    ArrayList<Produto> produtos = new ArrayList<>();
    
    public Vender_Produtos() 
    {
        initComponents();
        setVisible(true);
        
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        DefaultListModel listModel = bd.carregarProduto();
        bd.FecharBanco();
        
        produtos_list.setModel(listModel);
        vender_list.setModel(vender);
        id = -1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        produtos_list = new javax.swing.JList<>();
        vender_button = new javax.swing.JButton();
        voltar_button = new javax.swing.JButton();
        quantidade_label = new javax.swing.JLabel();
        qtd_text = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        vender_list = new javax.swing.JList<>();
        selecionar_button = new javax.swing.JButton();
        remover_button = new javax.swing.JButton();
        titulo_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(206, 206, 206));

        produtos_list.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        produtos_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(produtos_list);

        vender_button.setBackground(new java.awt.Color(172, 172, 172));
        vender_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        vender_button.setText("Vender");
        vender_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vender_buttonActionPerformed(evt);
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

        quantidade_label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        quantidade_label.setText("Quantidade: ");

        qtd_text.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        qtd_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtd_textActionPerformed(evt);
            }
        });

        vender_list.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        vender_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(vender_list);

        selecionar_button.setBackground(new java.awt.Color(172, 172, 172));
        selecionar_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        selecionar_button.setText("Selecionar");
        selecionar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionar_buttonActionPerformed(evt);
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

        titulo_label.setBackground(new java.awt.Color(206, 206, 206));
        titulo_label.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        titulo_label.setText("Vender Produto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(vender_button, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(499, 499, 499))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(409, 409, 409)
                .addComponent(quantidade_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(qtd_text, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(selecionar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(remover_button)
                .addGap(115, 115, 115))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quantidade_label)
                        .addComponent(qtd_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(selecionar_button)
                    .addComponent(remover_button))
                .addGap(35, 35, 35)
                .addComponent(vender_button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(voltar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vender_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vender_buttonActionPerformed
        if(!produtos_list.isSelectionEmpty())
        {
            if(qtd_text.getText().length() == 0)
            {
                JOptionPane.showMessageDialog(null, "Insira a quantidade a ser removida");
            }
            else
            {
                String item = produtos_list.getSelectedValue();
                int x = JOptionPane.showConfirmDialog(null, "Deseja realmente remover " + item + "?");

                if(x == 0)
                    Remover();
                
            }
        }
    }//GEN-LAST:event_vender_buttonActionPerformed

    private void voltar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_buttonActionPerformed
        dispose();
        new Estatisticas();
    }//GEN-LAST:event_voltar_buttonActionPerformed

    private void qtd_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtd_textActionPerformed

    }//GEN-LAST:event_qtd_textActionPerformed

    private void selecionar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionar_buttonActionPerformed
        if(!produtos_list.isSelectionEmpty())
        {
            if(qtd_text.getText().length() == 0)
            {
                JOptionPane.showMessageDialog(null, "Insira a quantidade a ser vendida");
            }
            else
            {
                try
                {
                    int qtdInserida = Integer.parseInt(qtd_text.getText().trim());
                    int qtdTemporaria = qtdInserida + somaQuantidades();
                    
                    if(!VerificaEstoque(produtos_list.getSelectedValue(), qtdTemporaria) || qtdInserida == 0)
                        JOptionPane.showMessageDialog(null, "Quantidade indisponível no estoque!");
                    else
                    {
                        String[] produto = produtos_list.getSelectedValue().split("-");
                        String item = produto[0] + "-" + produto[1] + "-" + produto[2] + "-" + qtdInserida;
                        vender.addElement(item);
                        vender_list.setModel(vender);
                        qtd_text.setText(" ");
                        
                    }
                }
                catch(NumberFormatException u)
                {
                    JOptionPane.showMessageDialog(null, "Valor incorreto");
                }
            }
        }
    }//GEN-LAST:event_selecionar_buttonActionPerformed

    private void remover_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remover_buttonActionPerformed
        if(!vender_list.isSelectionEmpty())
        {
            vender.remove(vender_list.getSelectedIndex());
            vender_list.setModel(vender);
            qtd_text.setText(" ");
        }
    }//GEN-LAST:event_remover_buttonActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new Vender_Produtos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> produtos_list;
    private javax.swing.JTextField qtd_text;
    private javax.swing.JLabel quantidade_label;
    private javax.swing.JButton remover_button;
    private javax.swing.JButton selecionar_button;
    private javax.swing.JLabel titulo_label;
    private javax.swing.JButton vender_button;
    private javax.swing.JList<String> vender_list;
    private javax.swing.JButton voltar_button;
    // End of variables declaration//GEN-END:variables
    public void Remover() 
    {
        if (!vender.isEmpty()) 
        {
            Operacoes_Produtos op = new Operacoes_Produtos();
            
            for(int i = 0; i < vender.size(); i++)
            {
                String[] linha = vender.get(i).split("-");
                int qtd = Integer.parseInt(linha[3]);
                id = Integer.parseInt(linha[0].trim().split(":")[1].trim());
                Banco_de_Dados bd = new Banco_de_Dados();
                bd.conectar("blackbones");
                Produto produto = bd.PesquisarIdProduto(id);
                op.vender(id, qtd, produto);
            }
        }
        
        dispose();
        new Vender_Produtos();
    }

    public boolean temEmEstoque(int vendida, int estoque)
    {
        if(vendida <= estoque)
            return true;
        return false;
    }
    
    public boolean VerificaEstoque(String elemento, int qtd)
    {
        Operacoes_Produtos op = new Operacoes_Produtos();
        Produto estoque = op.gerarProduto(elemento);
        if(temEmEstoque(qtd, estoque.getQtd()))
                return true;
        return false;
    }
    
    public int somaQuantidades()
    {
        int aux = 0;
        if(vender.size() > 0)
        {
            for(int i  = 0; i < vender.size(); i++)
            {
                String[] produtoVender = vender.get(i).split("-");
                String[] produtoSelecionado = produtos_list.getSelectedValue().split("-");
                int idSelecionado = Integer.parseInt(produtoSelecionado[0].split(":")[1].trim());
                int idVender = Integer.parseInt(produtoVender[0].split(":")[1].trim());
                int quantidadeTemp = Integer.parseInt(produtoVender[3]);
                
                if(idVender == idSelecionado)
                    aux  = aux + quantidadeTemp;
            }
        }
        return aux;
    }
    
}
