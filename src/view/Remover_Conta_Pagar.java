package view;

import blackbones.Banco_de_Dados;
import blackbones.Operacoes_Contas;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class Remover_Conta_Pagar extends javax.swing.JFrame 
{
    int id = -1;

    public Remover_Conta_Pagar() 
    {
        initComponents();
        setVisible(true);
        
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        DefaultListModel listModel = bd.carregarConta("pagar");
        bd.FecharBanco();
        
        contas_list.setModel(listModel);
        id = -1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contas_list = new javax.swing.JList<>();
        voltar_button = new javax.swing.JButton();
        remover_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contas_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(contas_list);

        voltar_button.setText("Voltar");
        voltar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_buttonActionPerformed(evt);
            }
        });

        remover_button.setText("Remover");
        remover_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remover_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(858, Short.MAX_VALUE)
                .addComponent(voltar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(remover_button, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(remover_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addComponent(voltar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
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
        new Contas_Pagar();
    }//GEN-LAST:event_voltar_buttonActionPerformed

    private void remover_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remover_buttonActionPerformed
        if(!contas_list.isSelectionEmpty())
        {
            String item = contas_list.getSelectedValue();
            int x = JOptionPane.showConfirmDialog(null, "Deseja realmente deletar a conta " + item + "?");
            
            if(x == 0)
                Remover();
        }
    }//GEN-LAST:event_remover_buttonActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Remover_Conta_Pagar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> contas_list;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton remover_button;
    private javax.swing.JButton voltar_button;
    // End of variables declaration//GEN-END:variables
    
    public void Remover()
    {
        if (!contas_list.isSelectionEmpty()) 
        {
            Operacoes_Contas oc = new Operacoes_Contas();
            String linha = contas_list.getSelectedValue();
            id = oc.pegarID(linha);
                        
            oc.remover(id);
        }
        dispose();
        new Remover_Conta_Pagar();
    }
}
