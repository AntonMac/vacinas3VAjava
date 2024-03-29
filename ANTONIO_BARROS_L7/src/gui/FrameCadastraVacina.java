/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.util.Iterator;
import javax.swing.JOptionPane;
import negocio.SistemaVacinas;
import negocio.Vacina;
import negocio.VacinaJaExisteException;
import static util.Util.convertData;
import static util.Util.verificaData;
import static util.Util.verificaDouble;

/**
 *
 * @author anton
 */
public class FrameCadastraVacina extends javax.swing.JFrame {
    
    
    
    static SistemaVacinas sistema = SistemaVacinas.getInstance();

    /**
     * Creates new form FrameCadastraVacina
     */
    public FrameCadastraVacina() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextVacinaNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextVacinaValidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextVacinaPreco = new javax.swing.JTextField();
        jButtonCadastraVacina = new javax.swing.JButton();
        jButtonListaVacinas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Nome:");

        jTextVacinaNome.setText("(Texto)");
        jTextVacinaNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextVacinaNomeFocusGained(evt);
            }
        });
        jTextVacinaNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextVacinaNomeMouseClicked(evt);
            }
        });

        jLabel2.setText("Validade:");

        jTextVacinaValidade.setText("(dd/MM/aaaa)");
        jTextVacinaValidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextVacinaValidadeFocusGained(evt);
            }
        });
        jTextVacinaValidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextVacinaValidadeMouseClicked(evt);
            }
        });
        jTextVacinaValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextVacinaValidadeActionPerformed(evt);
            }
        });

        jLabel3.setText("Preço:");

        jTextVacinaPreco.setText("(0.0)");
        jTextVacinaPreco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextVacinaPrecoFocusGained(evt);
            }
        });
        jTextVacinaPreco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextVacinaPrecoMouseClicked(evt);
            }
        });

        jButtonCadastraVacina.setText("Cadastra Vacina");
        jButtonCadastraVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastraVacinaActionPerformed(evt);
            }
        });

        jButtonListaVacinas.setText("Lista Vacinas");
        jButtonListaVacinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaVacinasActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(0, 204, 51));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel4.setText("Cadastro de Vacinas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonCadastraVacina, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(jButtonListaVacinas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextVacinaNome)
                            .addComponent(jTextVacinaValidade, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(jTextVacinaPreco))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextVacinaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextVacinaValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextVacinaPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(jButtonCadastraVacina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonListaVacinas)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextVacinaNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextVacinaNomeMouseClicked
        // TODO add your handling code here:
        jTextVacinaNome.setText(null);
    }//GEN-LAST:event_jTextVacinaNomeMouseClicked

    private void jTextVacinaValidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextVacinaValidadeMouseClicked
        // TODO add your handling code here:
        jTextVacinaValidade.setText(null);
    }//GEN-LAST:event_jTextVacinaValidadeMouseClicked

    private void jTextVacinaPrecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextVacinaPrecoMouseClicked
        // TODO add your handling code here:
        jTextVacinaPreco.setText(null);
    }//GEN-LAST:event_jTextVacinaPrecoMouseClicked

    private void jButtonCadastraVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastraVacinaActionPerformed
        // TODO add your handling code here:
        String vNome = jTextVacinaNome.getText();
        String vValidade = jTextVacinaValidade.getText();
        String vPreco = jTextVacinaPreco.getText();
        try{
            if(vNome.isBlank()||vValidade.isBlank()||vPreco.isBlank()){
                throw new CampoVazioException();
            }
            if(!verificaData(vValidade)){
                throw new FormatoDataInvalidoException();
            }
            if(!verificaDouble(vPreco)){
                throw new NaoPodeSerConvertido();
            }
            
            sistema.cadastraVacina(new Vacina(vNome,convertData(vValidade),Double.parseDouble(vPreco)));
            JOptionPane.showMessageDialog(rootPane, "Vacina Cadastrada com Sucesso!");
            jTextVacinaNome.setText(null);
            jTextVacinaValidade.setText(null);
            jTextVacinaPreco.setText(null);
            
        }catch(CampoVazioException | FormatoDataInvalidoException | NaoPodeSerConvertido | VacinaJaExisteException ex){
            
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            
        }
    }//GEN-LAST:event_jButtonCadastraVacinaActionPerformed

    private void jButtonListaVacinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListaVacinasActionPerformed
        // TODO add your handling code here:
      
        for (Iterator<Vacina> i = sistema.todasVacinas(); i.hasNext(); ){ 
            //System.out.println(i.next());
            jTextArea1.append(i.next().toString()+"\n");
        }
    }//GEN-LAST:event_jButtonListaVacinasActionPerformed

    private void jTextVacinaNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextVacinaNomeFocusGained
        // TODO add your handling code here:
        //jTextVacinaNome.setText(null);
    }//GEN-LAST:event_jTextVacinaNomeFocusGained

    private void jTextVacinaValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextVacinaValidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextVacinaValidadeActionPerformed

    private void jTextVacinaValidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextVacinaValidadeFocusGained
        // TODO add your handling code here:
        jTextVacinaValidade.setText(null);
    }//GEN-LAST:event_jTextVacinaValidadeFocusGained

    private void jTextVacinaPrecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextVacinaPrecoFocusGained
        // TODO add your handling code here:
        jTextVacinaPreco.setText(null);
    }//GEN-LAST:event_jTextVacinaPrecoFocusGained

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
            java.util.logging.Logger.getLogger(FrameCadastraVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCadastraVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCadastraVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCadastraVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCadastraVacina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastraVacina;
    private javax.swing.JButton jButtonListaVacinas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextVacinaNome;
    private javax.swing.JTextField jTextVacinaPreco;
    private javax.swing.JTextField jTextVacinaValidade;
    // End of variables declaration//GEN-END:variables
}
