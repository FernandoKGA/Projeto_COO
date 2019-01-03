package Telas.split;

import javax.swing.JOptionPane;
import negocio.*;
import bancodados.Log;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import objetos.Curso;

public class CadastroUsuario extends AbstractJPanel {

    private final Background back;
    private final DefaultComboBoxModel model;

    public CadastroUsuario(Background back) {
        super();
        this.back = back;
        model = new DefaultComboBoxModel(criaStringArrayModel());  //Gera novo model
        initComponents(); //Model sera inserido via initComp
    }

    private void limpaCampos_CadUsuario() {
        TF_NomeCadUsr.setText("");
        TF_NUSPCadUsr.setText("");
        TF_EmailCadUsr.setText("");
        TF_TelfCadUsr.setText("");
        CBCursoCadUsr.setSelectedIndex(0);
        CBCargoCadUsr.setSelectedIndex(0);
    }
    
    //Cria e mantem estatico as strings
    private String[] criaStringArrayModel(){
        List<Curso> cursos = buscaCursos();
        ArrayList<String> strings = new ArrayList<>();
        String select = "Selecione";
        strings.add(select);
        for (Curso cs : cursos){
            strings.add(cs.getNome());
        }
        String[] string_array = new String[strings.size()];
        string_array = strings.toArray(string_array);
        
        return string_array;
    }

    private List<Curso> buscaCursos() {
        List<Curso> c = null;
        try {
            c = r.listaCursos();

        } catch (RegrasNegocioException e) {
            Log.gravaLog(e);
        }

        return c;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelTelaCadUsr = new javax.swing.JLabel();
        LabelNomeTelaCadUsr = new javax.swing.JLabel();
        LabelNUSPTelaCadUsr = new javax.swing.JLabel();
        LabelTelfTelaCadUsr = new javax.swing.JLabel();
        LabelEmailTelaCadUsr = new javax.swing.JLabel();
        LabelCargoTelaCadUsr = new javax.swing.JLabel();
        LabelCursoTelaCadUsr = new javax.swing.JLabel();
        CBCargoCadUsr = new javax.swing.JComboBox<>();
        CBCursoCadUsr = new javax.swing.JComboBox<>();
        TF_NomeCadUsr = new javax.swing.JTextField();
        TF_NUSPCadUsr = new javax.swing.JTextField();
        TF_TelfCadUsr = new javax.swing.JTextField();
        TF_EmailCadUsr = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        LabelTelaCadUsr.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        LabelTelaCadUsr.setForeground(new java.awt.Color(255, 0, 0));
        LabelTelaCadUsr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTelaCadUsr.setText("CADASTRO DE USUÁRIO");

        LabelNomeTelaCadUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelNomeTelaCadUsr.setText("Nome");

        LabelNUSPTelaCadUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelNUSPTelaCadUsr.setText("Número USP");

        LabelTelfTelaCadUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelTelfTelaCadUsr.setText("Telefone");

        LabelEmailTelaCadUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelEmailTelaCadUsr.setText("E-mail");

        LabelCargoTelaCadUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelCargoTelaCadUsr.setText("Cargo");

        LabelCursoTelaCadUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelCursoTelaCadUsr.setText("Curso");

        CBCargoCadUsr.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        CBCargoCadUsr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Aluno", "Coordenador", "Professor" }));

        CBCursoCadUsr.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        CBCursoCadUsr.setModel(model);
        CBCursoCadUsr.setToolTipText("");
        CBCursoCadUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCursoCadUsrActionPerformed(evt);
            }
        });

        TF_NomeCadUsr.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        TF_NomeCadUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_NomeCadUsrActionPerformed(evt);
            }
        });

        TF_NUSPCadUsr.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        TF_TelfCadUsr.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        TF_TelfCadUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_TelfCadUsrActionPerformed(evt);
            }
        });

        TF_EmailCadUsr.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jButton5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton6.setText("Cadastrar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelNomeTelaCadUsr)
                    .addComponent(LabelNUSPTelaCadUsr)
                    .addComponent(LabelTelfTelaCadUsr)
                    .addComponent(LabelEmailTelaCadUsr)
                    .addComponent(LabelCargoTelaCadUsr)
                    .addComponent(LabelCursoTelaCadUsr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TF_NomeCadUsr, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_NUSPCadUsr, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_TelfCadUsr, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CBCargoCadUsr, 0, 200, Short.MAX_VALUE)
                    .addComponent(CBCursoCadUsr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TF_EmailCadUsr))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTelaCadUsr, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(LabelTelaCadUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF_NomeCadUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNomeTelaCadUsr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_NUSPCadUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNUSPTelaCadUsr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTelfTelaCadUsr)
                    .addComponent(TF_TelfCadUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_EmailCadUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelEmailTelaCadUsr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCargoTelaCadUsr)
                    .addComponent(CBCargoCadUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCursoTelaCadUsr)
                    .addComponent(CBCursoCadUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CBCursoCadUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBCursoCadUsrActionPerformed
        //Se for falso, entra e executa a primeira insercao
        if (!this.modified) {
            List<Curso> cursos = buscaCursos();
            String select = CBCursoCadUsr.getItemAt(0);
            if (!cursos.isEmpty()) {
                
                CBCursoCadUsr.removeAllItems();
                CBCursoCadUsr.addItem(select);
                for (Curso cr : cursos) {
                    CBCursoCadUsr.addItem(cr.getNome());
                }
                this.modified = true;
            }
            else{
                CBCursoCadUsr.removeAllItems();
                CBCursoCadUsr.addItem(select);
                this.modified = true;
            }
        }
    }//GEN-LAST:event_CBCursoCadUsrActionPerformed

    private void TF_NomeCadUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_NomeCadUsrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_NomeCadUsrActionPerformed

    private void TF_TelfCadUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_TelfCadUsrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_TelfCadUsrActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        System.out.println("BotaoRetFromTelaCadastraUsuario");
        limpaCampos_CadUsuario();
        this.modified = false;
        back.habilitaTelaSelecaoCadastro();
        back.desabilitaTelaCadastroUsuario();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try {
            System.out.println("BotaoCadastrarUsuario");
            String nome = TF_NomeCadUsr.getText();
            if (!back.valida.verificaTexto(nome)) {
                JOptionPane.showMessageDialog(null, "Nome contém caracteres inválidos!");
                return;
            }

            String nUSP = TF_NUSPCadUsr.getText();
            if (!back.valida.verificaNumero(nUSP)) {
                return;
            }

            String email = TF_EmailCadUsr.getText();
            String telefone = TF_TelfCadUsr.getText();
            if (!back.valida.verificaNumero(telefone)) {
                JOptionPane.showMessageDialog(null, "Telefone inválido!\nDeve ter 10 ou 11 números.");
                return;
            } else if (telefone.length() != 10 && telefone.length() != 11) {
                JOptionPane.showMessageDialog(null, "Telefone inválido!\nVerifique se digitou o DDD.");
                return;
            }

            String curso_name = CBCursoCadUsr.getSelectedItem().toString();
            Curso curso = new Curso(curso_name);

            String cargo = CBCargoCadUsr.getSelectedItem().toString();
            if (cargo.equalsIgnoreCase("COORDENADOR")) {
                if (!r.verificaQuantCoordenador(curso)) {   //Retorna true para caso tenham dois, e assim cai no else
                    r.cadastraUsuario(nome, nUSP, email, telefone, curso, cargo);
                    JOptionPane.showMessageDialog(null, "Usuário Cadastrado com sucesso!");
                    limpaCampos_CadUsuario();
                } else {
                    JOptionPane.showMessageDialog(null, "Já existem dois "
                            + "coordenadores deste curso!");
                }
            } else {
                r.cadastraUsuario(nome, nUSP, email, telefone, curso, cargo);
                JOptionPane.showMessageDialog(null, "Usuário Cadastrado com sucesso!");
                limpaCampos_CadUsuario();
            }
        } catch (RegrasNegocioException e) {
            Log.gravaLog(e);

        }
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBCargoCadUsr;
    private javax.swing.JComboBox<String> CBCursoCadUsr;
    private javax.swing.JLabel LabelCargoTelaCadUsr;
    private javax.swing.JLabel LabelCursoTelaCadUsr;
    private javax.swing.JLabel LabelEmailTelaCadUsr;
    private javax.swing.JLabel LabelNUSPTelaCadUsr;
    private javax.swing.JLabel LabelNomeTelaCadUsr;
    private javax.swing.JLabel LabelTelaCadUsr;
    private javax.swing.JLabel LabelTelfTelaCadUsr;
    private javax.swing.JTextField TF_EmailCadUsr;
    private javax.swing.JTextField TF_NUSPCadUsr;
    private javax.swing.JTextField TF_NomeCadUsr;
    private javax.swing.JTextField TF_TelfCadUsr;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    // End of variables declaration//GEN-END:variables
}
