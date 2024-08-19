/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frame;

import javax.swing.JFrame;

/**
 *
 * @author thyfa
 */
public class FrmMenu extends javax.swing.JFrame {
 
    public FrmMenu() {
        
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnAdministrarEmpleados = new javax.swing.JButton();
        btnGestionarClientes = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnAdministrarPaquetes = new javax.swing.JButton();
        btnGestionarRutas = new javax.swing.JButton();
        btnGestionarEnvios = new javax.swing.JButton();
        btnGestionarDestinos = new javax.swing.JButton();
        jDesktopCorreo = new javax.swing.JDesktopPane();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setBackground(new java.awt.Color(204, 0, 255));
        setExtendedState(6);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(204, 51, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(599, 599));

        jToolBar1.setBackground(new java.awt.Color(204, 204, 255));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnAdministrarEmpleados.setBackground(new java.awt.Color(204, 204, 255));
        btnAdministrarEmpleados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAdministrarEmpleados.setText("Gestion Empleados");
        btnAdministrarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministrarEmpleadosActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAdministrarEmpleados);

        btnGestionarClientes.setBackground(new java.awt.Color(204, 204, 255));
        btnGestionarClientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGestionarClientes.setText("Gestionar Clientes");
        btnGestionarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarClientesActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGestionarClientes);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Agregar Remitente");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        btnAdministrarPaquetes.setBackground(new java.awt.Color(204, 204, 255));
        btnAdministrarPaquetes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAdministrarPaquetes.setText("Gestion Paquetes");
        btnAdministrarPaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministrarPaquetesActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAdministrarPaquetes);

        btnGestionarRutas.setBackground(new java.awt.Color(204, 204, 255));
        btnGestionarRutas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGestionarRutas.setText("Gestionar Rutas");
        btnGestionarRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarRutasActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGestionarRutas);

        btnGestionarEnvios.setBackground(new java.awt.Color(204, 204, 255));
        btnGestionarEnvios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGestionarEnvios.setText("Gestionar Envios");
        btnGestionarEnvios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarEnviosActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGestionarEnvios);

        btnGestionarDestinos.setBackground(new java.awt.Color(204, 204, 255));
        btnGestionarDestinos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGestionarDestinos.setText("Gestionar Destinos");
        btnGestionarDestinos.setFocusable(false);
        btnGestionarDestinos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGestionarDestinos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGestionarDestinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarDestinosActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGestionarDestinos);

        jDesktopCorreo.setForeground(new java.awt.Color(204, 102, 255));

        javax.swing.GroupLayout jDesktopCorreoLayout = new javax.swing.GroupLayout(jDesktopCorreo);
        jDesktopCorreo.setLayout(jDesktopCorreoLayout);
        jDesktopCorreoLayout.setHorizontalGroup(
            jDesktopCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopCorreoLayout.setVerticalGroup(
            jDesktopCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopCorreo)
                .addContainerGap())
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1121, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jDesktopCorreo)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionarRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarRutasActionPerformed
        FrmRutas newFrmRutas= new FrmRutas();
        newFrmRutas.setVisible(true);
        this.jDesktopCorreo.add(newFrmRutas);
    }//GEN-LAST:event_btnGestionarRutasActionPerformed

    private void btnGestionarEnviosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarEnviosActionPerformed
        FrmEnvios newFrmEnvios= new FrmEnvios();
        newFrmEnvios.setVisible(true);
        this.jDesktopCorreo.add(newFrmEnvios);
    }//GEN-LAST:event_btnGestionarEnviosActionPerformed

    private void btnAdministrarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministrarEmpleadosActionPerformed
        FrmEmpleado newFrmEmpleado= new FrmEmpleado();
        newFrmEmpleado.setVisible(true);
        this.jDesktopCorreo.add(newFrmEmpleado);
    }//GEN-LAST:event_btnAdministrarEmpleadosActionPerformed

    private void btnAdministrarPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministrarPaquetesActionPerformed
        FrmPaquete newFrmPaquete= new FrmPaquete();
        newFrmPaquete.setVisible(true);
        this.jDesktopCorreo.add(newFrmPaquete);
    }//GEN-LAST:event_btnAdministrarPaquetesActionPerformed

    private void btnGestionarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarClientesActionPerformed
        FrmCliente newframeCliente= new FrmCliente();
        newframeCliente.setVisible(true);
        this.jDesktopCorreo.add(newframeCliente);
    }//GEN-LAST:event_btnGestionarClientesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       FrmRemitente newFrmRemitente= new FrmRemitente();
       newFrmRemitente.setVisible(true);
       this.jDesktopCorreo.add(newFrmRemitente);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGestionarDestinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarDestinosActionPerformed
        FrmDestinos newFrmDestino = new FrmDestinos();
        newFrmDestino.setVisible(true);
        this.jDesktopCorreo.add(newFrmDestino);
    }//GEN-LAST:event_btnGestionarDestinosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministrarEmpleados;
    private javax.swing.JButton btnAdministrarPaquetes;
    private javax.swing.JButton btnGestionarClientes;
    private javax.swing.JButton btnGestionarDestinos;
    private javax.swing.JButton btnGestionarEnvios;
    private javax.swing.JButton btnGestionarRutas;
    private javax.swing.JButton jButton1;
    public javax.swing.JDesktopPane jDesktopCorreo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
