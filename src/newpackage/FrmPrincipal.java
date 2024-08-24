package newpackage;
// Made By Uli Delgado el 23 de junio del 2021
import javax.swing.JOptionPane;

public class FrmPrincipal extends javax.swing.JFrame {
    private final TDAListaDoble listaS = new TDAListaDoble();  
 
    public FrmPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregarFinal = new javax.swing.JButton();
        lblSalida = new javax.swing.JLabel();
        btnAgregarInicial = new javax.swing.JButton();
        btnEliminarInicio = new javax.swing.JButton();
        btnEliminarFinal = new javax.swing.JButton();
        btnCount = new javax.swing.JButton();
        lblCount = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnReverse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAgregarFinal.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        btnAgregarFinal.setText("Agregar al final");
        btnAgregarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFinalActionPerformed(evt);
            }
        });

        lblSalida.setBackground(new java.awt.Color(255, 255, 255));
        lblSalida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnAgregarInicial.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        btnAgregarInicial.setText("Agregar al inicio");
        btnAgregarInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarInicialActionPerformed(evt);
            }
        });

        btnEliminarInicio.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        btnEliminarInicio.setText("Eliminar inicial");
        btnEliminarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarInicioActionPerformed(evt);
            }
        });

        btnEliminarFinal.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        btnEliminarFinal.setText("Eliminar final");
        btnEliminarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFinalActionPerformed(evt);
            }
        });

        btnCount.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        btnCount.setText("Contar elementos");
        btnCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCountActionPerformed(evt);
            }
        });

        lblCount.setText("0");
        lblCount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnSearch.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        btnSearch.setText("Buscar elemento");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnReverse.setText("(get elementos)^-1");
        btnReverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReverseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregarInicial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregarFinal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarFinal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReverse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblCount, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregarFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregarInicial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReverse)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFinalActionPerformed
        String texto = JOptionPane.showInputDialog(this, "Escriba una cadena");
        listaS.agregarElementoFinal(texto);
        JOptionPane.showMessageDialog(this, "Elemento agregado exitosamente");
        lblSalida.setText(listaS.getElementos());
    }//GEN-LAST:event_btnAgregarFinalActionPerformed

    private void btnAgregarInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarInicialActionPerformed
        String texto = JOptionPane.showInputDialog(this, "Escriba una cadena");
        listaS.agregarElementoInicial(texto);
        JOptionPane.showMessageDialog(this, "Elemento agregado exitosamente");
        lblSalida.setText(listaS.getElementos());
    }//GEN-LAST:event_btnAgregarInicialActionPerformed

    private void btnEliminarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarInicioActionPerformed
        if(listaS.eliminarElementoInicial()) {
            JOptionPane.showMessageDialog(this, "Elemento eliminado exitosamente");
            lblSalida.setText(listaS.getElementos());
        }
        else {
            JOptionPane.showMessageDialog(this, "No había elementos");
        }
    }//GEN-LAST:event_btnEliminarInicioActionPerformed

    private void btnEliminarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFinalActionPerformed
        if(listaS.eliminarElementoFinal()) {
            JOptionPane.showMessageDialog(this, "Elemento eliminado exitosamente");
            lblSalida.setText(listaS.getElementos());
        }
        else {
            JOptionPane.showMessageDialog(this, "No había elementos");
        }
    }//GEN-LAST:event_btnEliminarFinalActionPerformed

    private void btnCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCountActionPerformed
        lblCount.setText(String.valueOf(listaS.getTotal()));
    }//GEN-LAST:event_btnCountActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String texto = JOptionPane.showInputDialog(this, "¿Qué elemento desea buscar?");
        int R = listaS.search(texto);
        if(R == -1) {
            JOptionPane.showMessageDialog(this, "Elemento inexistente");
        }
        else {
            JOptionPane.showMessageDialog(this, "Elemento encontrado en la posición: "+R);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnReverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReverseActionPerformed
        lblSalida.setText(listaS.getElementosElevadoALaMenosUno());
    }//GEN-LAST:event_btnReverseActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarFinal;
    private javax.swing.JButton btnAgregarInicial;
    private javax.swing.JButton btnCount;
    private javax.swing.JButton btnEliminarFinal;
    private javax.swing.JButton btnEliminarInicio;
    private javax.swing.JButton btnReverse;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel lblCount;
    private javax.swing.JLabel lblSalida;
    // End of variables declaration//GEN-END:variables
}
