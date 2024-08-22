/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Frame;

import Envios.Envio;
import static Frame.FrmBuscarRutas.BtnEliminarRuta;
import static Frame.FrmBuscarRutas.BtnObtenerRuta;
import static Frame.FrmMenu.jDesktopCorreo;
import Listas.ListaCliente;
import Listas.ListaEnvios;
import Listas.ListaPaquetes;
import Paquetes.EnumEstadoPaquete;
import Paquetes.Paquete;
import Personas.Cliente;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author thyfa
 */
public class FrmEnvios extends javax.swing.JInternalFrame {

    ListaEnvios Envios;
    Envio envio;
    ListaPaquetes Paquetes = ListaPaquetes.getInstance();
    ListaCliente Clientes = ListaCliente.getInstance();

    /**
     * Creates new form FrmEnvios
     */
    public FrmEnvios() {
        initComponents();
        Envios = ListaEnvios.getInstance();

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
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TxtCliente = new javax.swing.JTextField();
        TxtPaquete = new javax.swing.JTextField();
        TxtRuta = new javax.swing.JTextField();
        TxtFEnvio = new javax.swing.JTextField();
        TxtFEntrega = new javax.swing.JTextField();
        TxtCostoEnvio = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 102, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registro envios");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosPro/Envios (2).png"))); // NOI18N
        jLabel10.setText("jLabel10");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel2.setText("Cliente");

        jLabel4.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel4.setText("Paquete");

        jLabel5.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel5.setText("Ruta");

        jLabel6.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel6.setText("Fecha Envio");

        jLabel7.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel7.setText("Fecha Entrega");

        jLabel9.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel9.setText("Costo de envio");

        TxtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtClienteActionPerformed(evt);
            }
        });
        TxtCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtClienteKeyTyped(evt);
            }
        });

        TxtPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPaqueteActionPerformed(evt);
            }
        });

        TxtRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRutaActionPerformed(evt);
            }
        });

        TxtFEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFEnvioActionPerformed(evt);
            }
        });
        TxtFEnvio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtFEnvioKeyTyped(evt);
            }
        });

        TxtFEntrega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtFEntregaKeyTyped(evt);
            }
        });

        TxtCostoEnvio.setEditable(false);
        TxtCostoEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCostoEnvioActionPerformed(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosPro/agregar3.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosPro/buscar2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Lista de paquetes");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Lista de rutas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(TxtCostoEnvio, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(TxtFEntrega)
                            .addComponent(TxtFEnvio)
                            .addComponent(TxtRuta)
                            .addComponent(TxtPaquete)
                            .addComponent(TxtCliente))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jButton1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtFEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtFEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtCostoEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
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

    private void TxtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtClienteActionPerformed

    private void TxtPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPaqueteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPaqueteActionPerformed

    private void TxtRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtRutaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FrmBuscarEnvio newBuscarenvio = new FrmBuscarEnvio(null, true);
        newBuscarenvio.setLocationRelativeTo(null);
        newBuscarenvio.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Cliente cliente = Clientes.buscarCliente(Integer.parseInt(TxtCliente.getText()));
        Paquete paquete = Paquetes.buscarPaquete(Integer.parseInt(TxtPaquete.getText()));

        if (Paquetes.buscarPaquete(Integer.parseInt(TxtPaquete.getText())).getEstado() == EnumEstadoPaquete.Almacenado) {
            Paquetes.buscarPaquete(Integer.parseInt(TxtPaquete.getText())).setEstado(EnumEstadoPaquete.Despachado);
        } else {
            JOptionPane.showMessageDialog(this, "El paquete ya ha sido despachado", "Error del registro de paquete", JOptionPane.ERROR_MESSAGE);
        }

        String ruta = TxtRuta.getText();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechaEnvio = LocalDate.parse(TxtFEnvio.getText(), formatter);
        LocalDate fechaEntrega = LocalDate.parse(TxtFEntrega.getText(), formatter);
        double costoEnvio = Double.parseDouble(TxtCostoEnvio.getText());

        envio = new Envio(cliente, paquete, ruta, fechaEnvio, fechaEntrega, costoEnvio);
        Envios.agregar(envio);

// Mostrar un mensaje de confirmación con los datos del envío
        JOptionPane.showMessageDialog(this, "Envío agregado:\n"
                + "Cliente (Cédula): " + cliente.getCedula() + "\n"
                + "Paquete: " + paquete.getCodigo() + "\n"
                + "Ruta: " + ruta + "\n"
                + "Fecha de Envío: " + fechaEnvio + "\n"
                + "Fecha de Entrega: " + fechaEntrega + "\n"
                + "Costo de Envío: " + costoEnvio);

// Limpiar los campos después de agregar el envío
        TxtCliente.setText("");
        TxtPaquete.setText("");
        TxtRuta.setText("");
        TxtFEnvio.setText("");
        TxtFEntrega.setText("");
        TxtCostoEnvio.setText("");


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        FrmBuscarPaquete newBuscarPaquete = new FrmBuscarPaquete(null, true);
        newBuscarPaquete.setLocationRelativeTo(null);
        newBuscarPaquete.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        FrmBuscarRutas newBuscarRutas = new FrmBuscarRutas(null, true);
        newBuscarRutas.setLocationRelativeTo(null);
        BtnObtenerRuta.setVisible(true);
        BtnEliminarRuta.setVisible(false);
        newBuscarRutas.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TxtFEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFEnvioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFEnvioActionPerformed

    private void TxtCostoEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCostoEnvioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCostoEnvioActionPerformed

    private void TxtClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtClienteKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z')
            evt.consume();
    }//GEN-LAST:event_TxtClienteKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrmCliente registroEnvios = new FrmCliente();
        jDesktopCorreo.add(registroEnvios);
        registroEnvios.setVisible(true);

//        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TxtFEnvioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtFEnvioKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && c != '-') {
            evt.consume();
        }

    }//GEN-LAST:event_TxtFEnvioKeyTyped

    private void TxtFEntregaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtFEntregaKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && c != '-') {
            evt.consume();
        }

    }//GEN-LAST:event_TxtFEntregaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtCliente;
    public static javax.swing.JTextField TxtCostoEnvio;
    private javax.swing.JTextField TxtFEntrega;
    private javax.swing.JTextField TxtFEnvio;
    public static javax.swing.JTextField TxtPaquete;
    public static javax.swing.JTextField TxtRuta;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
