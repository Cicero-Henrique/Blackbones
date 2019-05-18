package view;


import blackbones.Banco_de_Dados;
import blackbones.Cliente;
import blackbones.Operacoes_Clientes;
import blackbones.Validator;
import javax.swing.DefaultListModel;

public class Editar_Cliente extends javax.swing.JFrame 
{
    int id = -1;

    public Editar_Cliente() 
    {
        initComponents();
        setVisible(true);
        Banco_de_Dados bd = new Banco_de_Dados();
        bd.conectar("blackbones");
        DefaultListModel listModel = new DefaultListModel();
        listModel = bd.carregarCliente();
        bd.FecharBanco();
        int id = -1;
        jList1.setModel(listModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        salvar_button = new javax.swing.JButton();
        limpar_button = new javax.swing.JButton();
        voltar_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        selecionar_button = new javax.swing.JButton();
        nome_label = new javax.swing.JLabel();
        nome_text = new javax.swing.JTextField();
        email_label = new javax.swing.JLabel();
        email_text = new javax.swing.JTextField();
        endereco_label = new javax.swing.JLabel();
        endereco_text = new javax.swing.JTextField();
        telefone_label = new javax.swing.JLabel();
        telefone_text = new javax.swing.JTextField();
        indicacao_label = new javax.swing.JLabel();
        indicacao_text = new javax.swing.JTextField();
        cpf_label = new javax.swing.JLabel();
        cpf_text = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        endereco_label.setText("Endereço:");

        telefone_label.setText("Telefone:");

        indicacao_label.setText("Indicação:");

        cpf_label.setText("CPF:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cpf_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(indicacao_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(telefone_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(endereco_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(email_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nome_label, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nome_text)
                    .addComponent(email_text)
                    .addComponent(endereco_text)
                    .addComponent(telefone_text)
                    .addComponent(indicacao_text)
                    .addComponent(cpf_text, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(salvar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(limpar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(324, 324, 324))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(voltar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selecionar_button)
                        .addGap(65, 65, 65))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(selecionar_button)
                        .addGap(340, 340, 340))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nome_label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nome_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(email_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(endereco_label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endereco_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefone_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefone_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(indicacao_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(indicacao_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpf_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpf_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(voltar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            Operacoes_Clientes op = new Operacoes_Clientes();
            String linha = jList1.getSelectedValue();
            id = op.pegarID(linha);
            
            Banco_de_Dados bd = new Banco_de_Dados();
            bd.conectar("blackbones");
            Cliente c = bd.PesquisarIdCliente(id);
            bd.FecharBanco();
        
        
            nome_text.setText(c.getNome());
            indicacao_text.setText(c.getIndicacao());
            cpf_text.setText(c.getCpf());
            telefone_text.setText(c.getTelefone());
            endereco_text.setText(c.getEndereco());
            email_text.setText(c.getEmail());
        }
    }//GEN-LAST:event_selecionar_buttonActionPerformed

    private void limpar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar_buttonActionPerformed
        nome_text.setText(" ");
        indicacao_text.setText(" ");
        cpf_text.setText(" ");
        telefone_text.setText(" ");
        endereco_text.setText(" ");
        email_text.setText(" ");
    }//GEN-LAST:event_limpar_buttonActionPerformed

    private void salvar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_buttonActionPerformed
        Operacoes_Clientes oc = new Operacoes_Clientes();
        if(Validator.isValidCliente(nome_text.getText(), telefone_text.getText(), endereco_text.getText(), email_text.getText(), indicacao_text.getText(), cpf_text.getText()))
        {
            oc.editar(id, nome_text.getText(), email_text.getText(), endereco_text.getText(), telefone_text.getText(), indicacao_text.getText(), cpf_text.getText());
            dispose();
            new Editar_Cliente();
        }
        
    }//GEN-LAST:event_salvar_buttonActionPerformed

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


    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar_Cliente().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cpf_label;
    private javax.swing.JTextField cpf_text;
    private javax.swing.JLabel email_label;
    private javax.swing.JTextField email_text;
    private javax.swing.JLabel endereco_label;
    private javax.swing.JTextField endereco_text;
    private javax.swing.JLabel indicacao_label;
    private javax.swing.JTextField indicacao_text;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpar_button;
    private javax.swing.JLabel nome_label;
    private javax.swing.JTextField nome_text;
    private javax.swing.JButton salvar_button;
    private javax.swing.JButton selecionar_button;
    private javax.swing.JLabel telefone_label;
    private javax.swing.JTextField telefone_text;
    private javax.swing.JButton voltar_button;
    // End of variables declaration//GEN-END:variables
}
