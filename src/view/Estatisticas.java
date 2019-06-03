package view;
import model.Conta;
import controller.Receita;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Estatisticas extends javax.swing.JFrame {

    public Estatisticas() 
    {
        initComponents();
        setVisible(true);
        criarGrafico();
        grafico_label.setIcon(new javax.swing.ImageIcon("Grafico_Normal.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        adicionarproduto_button = new javax.swing.JButton();
        estoque_button = new javax.swing.JButton();
        editarproduto_button = new javax.swing.JButton();
        vender_button = new javax.swing.JButton();
        adicionarfuncionario_button = new javax.swing.JButton();
        editarfuncionario_button = new javax.swing.JButton();
        listar_button = new javax.swing.JButton();
        demitir_button = new javax.swing.JButton();
        produtos_label = new javax.swing.JLabel();
        clientes_label = new javax.swing.JLabel();
        contas_button = new javax.swing.JButton();
        fornecedores_label = new javax.swing.JLabel();
        adicionarfornecedor_button = new javax.swing.JButton();
        editarfornecedor_button = new javax.swing.JButton();
        listarfornecedor_button = new javax.swing.JButton();
        remover_fornecedor_button = new javax.swing.JButton();
        receita_button = new javax.swing.JButton();
        grafico_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(206, 206, 206));

        adicionarproduto_button.setBackground(new java.awt.Color(172, 172, 172));
        adicionarproduto_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        adicionarproduto_button.setText("Adicionar novo");
        adicionarproduto_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarproduto_buttonActionPerformed(evt);
            }
        });

        estoque_button.setBackground(new java.awt.Color(172, 172, 172));
        estoque_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        estoque_button.setText("Estoque");
        estoque_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estoque_buttonActionPerformed(evt);
            }
        });

        editarproduto_button.setBackground(new java.awt.Color(172, 172, 172));
        editarproduto_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        editarproduto_button.setText("Editar");
        editarproduto_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarproduto_buttonActionPerformed(evt);
            }
        });

        vender_button.setBackground(new java.awt.Color(172, 172, 172));
        vender_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        vender_button.setText("Vender");
        vender_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vender_buttonActionPerformed(evt);
            }
        });

        adicionarfuncionario_button.setBackground(new java.awt.Color(172, 172, 172));
        adicionarfuncionario_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        adicionarfuncionario_button.setText("Adicionar");
        adicionarfuncionario_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarfuncionario_buttonActionPerformed(evt);
            }
        });

        editarfuncionario_button.setBackground(new java.awt.Color(172, 172, 172));
        editarfuncionario_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        editarfuncionario_button.setText("Editar");
        editarfuncionario_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarfuncionario_buttonActionPerformed(evt);
            }
        });

        listar_button.setBackground(new java.awt.Color(172, 172, 172));
        listar_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        listar_button.setText("Listar");
        listar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listar_buttonActionPerformed(evt);
            }
        });

        demitir_button.setBackground(new java.awt.Color(172, 172, 172));
        demitir_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        demitir_button.setText("Remover");
        demitir_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demitir_buttonActionPerformed(evt);
            }
        });

        produtos_label.setText("Produtos");

        clientes_label.setText("Clientes");

        contas_button.setBackground(new java.awt.Color(172, 172, 172));
        contas_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        contas_button.setText("Contas");
        contas_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contas_buttonActionPerformed(evt);
            }
        });

        fornecedores_label.setText("Fornecedores");

        adicionarfornecedor_button.setBackground(new java.awt.Color(172, 172, 172));
        adicionarfornecedor_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        adicionarfornecedor_button.setText("Adicionar");
        adicionarfornecedor_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarfornecedor_buttonActionPerformed(evt);
            }
        });

        editarfornecedor_button.setBackground(new java.awt.Color(172, 172, 172));
        editarfornecedor_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        editarfornecedor_button.setText("Editar");
        editarfornecedor_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarfornecedor_buttonActionPerformed(evt);
            }
        });

        listarfornecedor_button.setBackground(new java.awt.Color(172, 172, 172));
        listarfornecedor_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        listarfornecedor_button.setText("Listar");
        listarfornecedor_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarfornecedor_buttonActionPerformed(evt);
            }
        });

        remover_fornecedor_button.setBackground(new java.awt.Color(172, 172, 172));
        remover_fornecedor_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        remover_fornecedor_button.setText("Remover");
        remover_fornecedor_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remover_fornecedor_buttonActionPerformed(evt);
            }
        });

        receita_button.setBackground(new java.awt.Color(172, 172, 172));
        receita_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        receita_button.setText("Receita");
        receita_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receita_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(contas_button, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(223, 223, 223)
                        .addComponent(receita_button, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(grafico_label, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(168, 168, 168)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(remover_fornecedor_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listarfornecedor_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fornecedores_label)
                    .addComponent(clientes_label)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(demitir_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listar_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editarfuncionario_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adicionarfuncionario_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vender_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editarproduto_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(estoque_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adicionarproduto_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(produtos_label, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(adicionarfornecedor_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editarfornecedor_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(produtos_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(receita_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(7, 7, 7)))
                        .addComponent(adicionarproduto_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editarproduto_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(estoque_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vender_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(clientes_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(adicionarfuncionario_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editarfuncionario_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(listar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(demitir_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(fornecedores_label)
                        .addGap(18, 18, 18)
                        .addComponent(adicionarfornecedor_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editarfornecedor_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(listarfornecedor_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(remover_fornecedor_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(contas_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(grafico_label, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
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

    private void adicionarproduto_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarproduto_buttonActionPerformed
        dispose();
        new Registrar_Produto();
    }//GEN-LAST:event_adicionarproduto_buttonActionPerformed

    private void estoque_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estoque_buttonActionPerformed
        dispose();
        new Listar_Produtos();
    }//GEN-LAST:event_estoque_buttonActionPerformed

    private void editarproduto_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarproduto_buttonActionPerformed
        dispose();
        new Editar_Produto();
    }//GEN-LAST:event_editarproduto_buttonActionPerformed

    private void vender_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vender_buttonActionPerformed
        dispose();
        new Vender_Produtos();
    }//GEN-LAST:event_vender_buttonActionPerformed

    private void adicionarfuncionario_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarfuncionario_buttonActionPerformed
        dispose();
        new Registrar_Cliente();
    }//GEN-LAST:event_adicionarfuncionario_buttonActionPerformed

    private void editarfuncionario_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarfuncionario_buttonActionPerformed
        dispose();
            new Editar_Cliente();
      
    }//GEN-LAST:event_editarfuncionario_buttonActionPerformed

    private void listar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listar_buttonActionPerformed
        dispose();
        new Listar_Clientes();
    }//GEN-LAST:event_listar_buttonActionPerformed

    private void demitir_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demitir_buttonActionPerformed
        dispose();
        new Remover_Cliente();
    }//GEN-LAST:event_demitir_buttonActionPerformed

    private void contas_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contas_buttonActionPerformed
        dispose();
        new Contas();
    }//GEN-LAST:event_contas_buttonActionPerformed

    private void adicionarfornecedor_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarfornecedor_buttonActionPerformed
        dispose();
        new Registrar_Fornecedor();
    }//GEN-LAST:event_adicionarfornecedor_buttonActionPerformed

    private void editarfornecedor_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarfornecedor_buttonActionPerformed
        dispose();
        new Editar_Fornecedor();
    }//GEN-LAST:event_editarfornecedor_buttonActionPerformed

    private void listarfornecedor_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarfornecedor_buttonActionPerformed
        dispose();
        new Listar_Fornecedores();
    }//GEN-LAST:event_listarfornecedor_buttonActionPerformed

    private void remover_fornecedor_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remover_fornecedor_buttonActionPerformed
        dispose();
        new Remover_Fornecedor();
    }//GEN-LAST:event_remover_fornecedor_buttonActionPerformed

    private void receita_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receita_buttonActionPerformed
        dispose();
        new Receita_Frame();
    }//GEN-LAST:event_receita_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Estatisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estatisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estatisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estatisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estatisticas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarfornecedor_button;
    private javax.swing.JButton adicionarfuncionario_button;
    private javax.swing.JButton adicionarproduto_button;
    private javax.swing.JLabel clientes_label;
    private javax.swing.JButton contas_button;
    private javax.swing.JButton demitir_button;
    private javax.swing.JButton editarfornecedor_button;
    private javax.swing.JButton editarfuncionario_button;
    private javax.swing.JButton editarproduto_button;
    private javax.swing.JButton estoque_button;
    private javax.swing.JLabel fornecedores_label;
    private javax.swing.JLabel grafico_label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listar_button;
    private javax.swing.JButton listarfornecedor_button;
    private javax.swing.JLabel produtos_label;
    private javax.swing.JButton receita_button;
    private javax.swing.JButton remover_fornecedor_button;
    private javax.swing.JButton vender_button;
    // End of variables declaration//GEN-END:variables

    public void criarGrafico()
    {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        java.time.LocalDate data = LocalDate.now();
        String dataInicial = acrescentaMes(data.toString());
        dataInicial =  reduzMeses(dataInicial);
        
        for(int i = 0; i < 6; i++)
        {
            String dataFinal = acrescentaMes(dataInicial);
            String[] aux  = dataFinal.split("-");
            String mes = aux[1];
            dataset.addValue(calcularLucro(inverterData(dataInicial), inverterData(dataFinal)), "Máximo",java.time.Month.of(Integer.parseInt(mes)));
            dataInicial = dataFinal;            
        }

        JFreeChart criaGrafico = ChartFactory.createLineChart("Lucro bruto nos últimos cinco meses", "Mês", "Valor", 
                dataset, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot plot = criaGrafico.getCategoryPlot();
        plot.setBackgroundPaint(Color.WHITE);
        LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
        renderer.setBaseShapesVisible(true);
        renderer.setSeriesPaint(0, Color.RED);
        DecimalFormat format = new DecimalFormat("#0.##");
        renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator("{2}", format));
        renderer.setBaseItemLabelsVisible(true);
        
        try 
        {
            OutputStream png = new FileOutputStream("Grafico_Normal.png");
            ChartUtilities.writeChartAsPNG(png, criaGrafico, 550, 450);
            png.close();
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(Estatisticas.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Estatisticas.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public double calcularLucro(String data_inicial, String data_final)
    {
        Receita r = new Receita();
        
        double lucros = 0, total = 0, despesas = 0;
        data_inicial = data_inicial.replace("-", "/");
        data_final = data_final.replace("-", "/");
        
        ArrayList<Conta> conta = r.pegarContasReceber(data_inicial, data_final);
        
        for(int i = 0; i < conta.size(); i++)
            lucros = lucros + conta.get(i).getValor();
        r.lucroDeVendas(data_inicial, data_final);
        lucros = lucros + r.lucroDeVendas(data_inicial, data_final);
        
        /*          FALTA SOMAR O LUCRO COM AS VENDAS*/
        
        
        
        
        conta = r.pegarContasPagar(data_inicial, data_final);
        
        for(int i = 0; i <conta.size(); i++)
            despesas = despesas + conta.get(i).getValor();
        
        total = lucros - despesas;
        return total;
    
    }
    public String reduzMeses(String dataReduzida)
    {
        String[] aux = dataReduzida.split("-");
        LocalDate data = LocalDate.of(Integer.parseInt(aux[0]), Integer.parseInt(aux[1]), Integer.parseInt(aux[2]));
        data  = data.minusMonths(6);
        dataReduzida = data.getYear()+"-"+data.getMonth().getValue()+"-"+data.getDayOfMonth();
        return dataReduzida;
    }
    
    public String acrescentaMes(String dataAumentada)
    {
        String[] aux = dataAumentada.split("-");
        LocalDate data = LocalDate.of(Integer.parseInt(aux[0]), Integer.parseInt(aux[1]), Integer.parseInt(aux[2]));
        data = data.plusMonths(1);
        dataAumentada = data.getYear()+"-"+data.getMonth().getValue()+"-"+data.getDayOfMonth();
        return dataAumentada;
    }
    
    public String inverterData(String data)
    {
        String[] aux = data.split("-");
        data = aux[2]+"-"+aux[1]+"-"+aux[0];
        return data;
    }
}
