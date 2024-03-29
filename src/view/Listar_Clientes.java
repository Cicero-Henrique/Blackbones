package view;

import controller.Banco_de_Dados;
import model.Cliente;
import controller.Operacoes_Clientes;
import javax.swing.DefaultListModel;
import javax.swing.JTextArea;

public class Listar_Clientes extends javax.swing.JFrame 
{
    
    public void Listar()
    {
        Operacoes_Clientes oc = new Operacoes_Clientes();
        
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        DefaultListModel<String> listModel = bd.carregarCliente();
        bd.FecharBanco();
        
        for(int i = 0; i < listModel.size(); i++)
        {
            Cliente c = oc.gerarCliente(listModel.get(i));
            
            funcionarios_lista.append("Nome: " + c.getNome() + "\n");
            funcionarios_lista.append("CPF: " + c.getCpf()+ "\n");
            funcionarios_lista.append("E-Mail: " + c.getEmail()+ "\n");
            funcionarios_lista.append("Endereço: " + c.getEndereco()+ "\n");
            funcionarios_lista.append("Indicação: " + c.getIndicacao()+ "\n");
            funcionarios_lista.append("Telefone: " + c.getTelefone()+ "\n");
            funcionarios_lista.append(" \r\n\n\n");
            funcionarios_lista.setEditable(false);
        }
    }
    
    public Listar_Clientes() 
    {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        logo_label.setIcon(new javax.swing.ImageIcon("335x113.png"));
        JTextArea funcionarios_lista = new JTextArea();
        Listar();
        funcionarios_lista.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        funcionarios_lista = new javax.swing.JTextArea();
        voltar_button = new javax.swing.JButton();
        titulo_label = new javax.swing.JLabel();
        logo_label = new javax.swing.JLabel();
        logo_label1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(206, 206, 206));

        funcionarios_lista.setColumns(20);
        funcionarios_lista.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        funcionarios_lista.setRows(5);
        jScrollPane1.setViewportView(funcionarios_lista);

        voltar_button.setBackground(new java.awt.Color(172, 172, 172));
        voltar_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        voltar_button.setText("Voltar");
        voltar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_buttonActionPerformed(evt);
            }
        });

        titulo_label.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        titulo_label.setText("Listar Clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titulo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                        .addComponent(logo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(voltar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(270, 270, 270)
                    .addComponent(logo_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(271, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(voltar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(261, 261, 261)
                    .addComponent(logo_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(262, Short.MAX_VALUE)))
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

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listar_Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea funcionarios_lista;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo_label;
    private javax.swing.JLabel logo_label1;
    private javax.swing.JLabel titulo_label;
    private javax.swing.JButton voltar_button;
    // End of variables declaration//GEN-END:variables
}
