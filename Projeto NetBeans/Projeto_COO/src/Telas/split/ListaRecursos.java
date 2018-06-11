/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.split;

/**
 *
 * @author Denise
 */
public class ListaRecursos extends javax.swing.JPanel {

    /**
     * Creates new form ListaRecursos
     */
    public ListaRecursos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelNomeTelaListRec = new javax.swing.JLabel();
        BotaoRetFromTelaListRec = new javax.swing.JButton();
        BotaoListaRecursos = new javax.swing.JButton();
        ScrolListaRecursos = new javax.swing.JScrollPane();
        TabelaListaRec = new javax.swing.JTable();

        LabelNomeTelaListRec.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        LabelNomeTelaListRec.setForeground(new java.awt.Color(250, 0, 0));
        LabelNomeTelaListRec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNomeTelaListRec.setText("LISTA DE RECURSOS");

        BotaoRetFromTelaListRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoRetFromTelaListRec.setText("Voltar");
        BotaoRetFromTelaListRec.setMaximumSize(new java.awt.Dimension(113, 27));
        BotaoRetFromTelaListRec.setMinimumSize(new java.awt.Dimension(113, 27));
        BotaoRetFromTelaListRec.setPreferredSize(new java.awt.Dimension(113, 27));
        BotaoRetFromTelaListRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRetFromTelaListRecActionPerformed(evt);
            }
        });

        BotaoListaRecursos.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoListaRecursos.setText("Listar");
        BotaoListaRecursos.setMaximumSize(new java.awt.Dimension(113, 27));
        BotaoListaRecursos.setMinimumSize(new java.awt.Dimension(113, 27));
        BotaoListaRecursos.setPreferredSize(new java.awt.Dimension(113, 27));
        BotaoListaRecursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoListaRecursosActionPerformed(evt);
            }
        });

        TabelaListaRec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Prédio", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrolListaRecursos.setViewportView(TabelaListaRec);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelNomeTelaListRec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(BotaoRetFromTelaListRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                        .addComponent(BotaoListaRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ScrolListaRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelNomeTelaListRec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrolListaRecursos, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoRetFromTelaListRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoListaRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoRetFromTelaListRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRetFromTelaListRecActionPerformed
        // TODO add your handling code here:
        desabilitaTelaListaRecursos();
        habilitaTelaListaSelecao();
    }//GEN-LAST:event_BotaoRetFromTelaListRecActionPerformed

    private void BotaoListaRecursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoListaRecursosActionPerformed
        listaRecursos();
    }//GEN-LAST:event_BotaoListaRecursosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoListaRecursos;
    private javax.swing.JButton BotaoRetFromTelaListRec;
    private javax.swing.JLabel LabelNomeTelaListRec;
    private javax.swing.JScrollPane ScrolListaRecursos;
    private javax.swing.JTable TabelaListaRec;
    // End of variables declaration//GEN-END:variables
}
