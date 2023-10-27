package crud_seminario1_ddsi;

import java.sql.Connection;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class TABLAS extends javax.swing.JFrame {
    
    Conexion con = Conexion.getInstance();

    public TABLAS() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Tablas");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        volver_btn = new javax.swing.JButton();
        borrar_tablas_btn = new javax.swing.JButton();
        crear_tablas_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        volver_btn.setBackground(new java.awt.Color(153, 153, 153));
        volver_btn.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        volver_btn.setText("Volver");
        volver_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver_btnActionPerformed(evt);
            }
        });

        borrar_tablas_btn.setBackground(new java.awt.Color(153, 153, 153));
        borrar_tablas_btn.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        borrar_tablas_btn.setText("Borrar tablas");
        borrar_tablas_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar_tablas_btnActionPerformed(evt);
            }
        });

        crear_tablas_btn.setBackground(new java.awt.Color(153, 153, 153));
        crear_tablas_btn.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        crear_tablas_btn.setText("Crear tablas");
        crear_tablas_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_tablas_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(857, Short.MAX_VALUE)
                .addComponent(volver_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(crear_tablas_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(borrar_tablas_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(borrar_tablas_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(crear_tablas_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 465, Short.MAX_VALUE)
                .addComponent(volver_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
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

    private void volver_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver_btnActionPerformed
        CRUD crud = new CRUD();
        crud.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volver_btnActionPerformed

    private void borrar_tablas_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar_tablas_btnActionPerformed
        
        try {
            
            Connection conexion = con.conectar();
            Statement borracion = conexion.createStatement();   
            borracion.executeUpdate("DROP TABLE Detalle_Pedido");
            borracion.executeUpdate("DROP TABLE Stock");
            borracion.executeUpdate("DROP TABLE Pedido");
            JOptionPane.showMessageDialog(null, "Las tablas Stock, Pedido y Detalle_pedido han sido eliminadas correctamente.");
           
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, "Error al eliminar las tablas, es posible que ya estén eliminadas o no existan : " + ex);   
        }
        
        con.cierreConexion();
    }//GEN-LAST:event_borrar_tablas_btnActionPerformed

    private void crear_tablas_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_tablas_btnActionPerformed
      
        try {
            
            Connection conexion = con.conectar();
            Statement statement = conexion.createStatement();
            statement.executeUpdate("CREATE TABLE Stock(Cproducto NUMBER NOT NULL PRIMARY KEY, Cantidad NUMBER NOT NULL)");
            statement.executeUpdate("CREATE TABLE Pedido(Cpedido NUMBER NOT NULL PRIMARY KEY, Ccliente NUMBER NOT NULL, Fecha_pedido DATE NOT NULL)");
            statement.executeUpdate("CREATE TABLE Detalle_pedido(Cpedido NUMBER NOT NULL, Cproducto NUMBER NOT NULL, Cantidad NUMBER NOT NULL, PRIMARY KEY(Cpedido, Cproducto), FOREIGN KEY(Cpedido) REFERENCES Pedido(Cpedido), FOREIGN KEY(Cproducto) REFERENCES Stock(Cproducto))");
            JOptionPane.showMessageDialog(null, "Las tablas Stock, Pedido y Detalle_pedido han sido creadas correctamente.");
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al crear las tablas, es posible que ya existan : " + ex);       
        }
        
        con.cierreConexion();

    }//GEN-LAST:event_crear_tablas_btnActionPerformed

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
            java.util.logging.Logger.getLogger(TABLAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TABLAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TABLAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TABLAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TABLAS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar_tablas_btn;
    private javax.swing.JButton crear_tablas_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton volver_btn;
    // End of variables declaration//GEN-END:variables
}
