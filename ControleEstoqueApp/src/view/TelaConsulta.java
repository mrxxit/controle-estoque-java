package view;

import javax.swing.table.DefaultTableModel;
import model.ProdutoDAO;
import javax.swing.JOptionPane;
import model.Produto;
import java.util.List;

public class TelaConsulta extends javax.swing.JFrame {

    public TelaConsulta() {
        initComponents();
        carregarTabela();
    }
    
    private void carregarTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tabelaProdutos.getModel();
        modelo.setRowCount(0); // Limpa tabela

        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> lista = dao.listarTodos();

        for (Produto p : lista) {
            modelo.addRow(new Object[]{
                p.getNome(),
                p.getDescricao(),
                p.getQuantidade()
            });
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBusca = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        TelaPrincipal = new javax.swing.JButton();
        TelaMovimentacao = new javax.swing.JButton();
        TelaCadastro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(tabelaProdutos);

        btnEditar.setBackground(new java.awt.Color(0, 102, 204));
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");

        btnExcluir.setBackground(new java.awt.Color(255, 51, 51));
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnVoltar.setText("Cancelar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(0, 102, 204));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(31, 41, 55));
        jPanel1.setPreferredSize(new java.awt.Dimension(187, 354));

        TelaPrincipal.setBackground(new java.awt.Color(31, 41, 55));
        TelaPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TelaPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        TelaPrincipal.setText("Inicio");
        TelaPrincipal.setPreferredSize(new java.awt.Dimension(72, 32));
        TelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelaPrincipalActionPerformed(evt);
            }
        });

        TelaMovimentacao.setBackground(new java.awt.Color(31, 41, 55));
        TelaMovimentacao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TelaMovimentacao.setForeground(new java.awt.Color(255, 255, 255));
        TelaMovimentacao.setText("Movimentação");
        TelaMovimentacao.setPreferredSize(new java.awt.Dimension(72, 32));
        TelaMovimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelaMovimentacaoActionPerformed(evt);
            }
        });

        TelaCadastro.setBackground(new java.awt.Color(31, 41, 55));
        TelaCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TelaCadastro.setForeground(new java.awt.Color(255, 255, 255));
        TelaCadastro.setText("Cadastrar");
        TelaCadastro.setPreferredSize(new java.awt.Dimension(72, 32));
        TelaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelaCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TelaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelaMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(TelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TelaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TelaMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        jLabel1.setText("Buscar por nome:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnEditar)
                            .addGap(30, 30, 30)
                            .addComponent(btnExcluir)
                            .addGap(26, 26, 26)
                            .addComponent(btnVoltar)))
                    .addComponent(jLabel1))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar))
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String busca = txtBusca.getText().toLowerCase();
        DefaultTableModel modelo = (DefaultTableModel) tabelaProdutos.getModel();
        modelo.setRowCount(0);

        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> lista = dao.buscarTodosPorNome(busca); // ✅ usa o novo método

        for (Produto p : lista) {
            modelo.addRow(new Object[]{
                p.getNome(),
                p.getDescricao(),
                p.getQuantidade()
            });
        }

        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum produto encontrado.");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tabelaProdutos.getSelectedRow();
        if (linha >= 0) {
            String nome = (String) tabelaProdutos.getValueAt(linha, 0);

            ProdutoDAO dao = new ProdutoDAO();
            Produto produto = dao.buscarPorNome(nome); // busca 1 produto

            if (produto != null) {
                dao.excluir(produto.getId()); // exclui pelo ID
                carregarTabela(); // atualiza a tabela
                JOptionPane.showMessageDialog(this, "Produto excluído com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Produto não encontrado.");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Selecione um produto para excluir.");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new TelaPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void TelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelaPrincipalActionPerformed
        new TelaPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_TelaPrincipalActionPerformed

    private void TelaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelaCadastroActionPerformed
        new TelaCadastro().setVisible(true);
        dispose();
    }//GEN-LAST:event_TelaCadastroActionPerformed

    private void TelaMovimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelaMovimentacaoActionPerformed
        new TelaMovimentacao().setVisible(true);
        dispose();
    }//GEN-LAST:event_TelaMovimentacaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TelaCadastro;
    private javax.swing.JButton TelaMovimentacao;
    private javax.swing.JButton TelaPrincipal;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
