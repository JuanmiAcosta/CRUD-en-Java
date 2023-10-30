package crud_seminario1_ddsi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TABLAS extends javax.swing.JFrame {

    Conexion con = Conexion.getInstance();

    public TABLAS() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Tablas");
        refrescar_stock_table();
        refrescar_pedido_table();
        refrescar_detalle_pedido_table();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        volver_btn = new javax.swing.JButton();
        borrar_tablas_btn = new javax.swing.JButton();
        crear_tablas_btn = new javax.swing.JButton();
        insertar_btn = new javax.swing.JButton();
        eliminar_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        stock_table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        pedido_table = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        detalle_pedido_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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

        insertar_btn.setBackground(new java.awt.Color(153, 153, 153));
        insertar_btn.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        insertar_btn.setText("Insertar tuplas");
        insertar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertar_btnActionPerformed(evt);
            }
        });

        eliminar_btn.setBackground(new java.awt.Color(153, 153, 153));
        eliminar_btn.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        eliminar_btn.setText("Eliminar tuplas");
        eliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_btnActionPerformed(evt);
            }
        });

        stock_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cproducto", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(stock_table);

        pedido_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cpedido", "Ccliente", "Fecha_pedido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(pedido_table);

        detalle_pedido_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cpedido", "Cproducto", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(detalle_pedido_table);

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Detalle_Pedido");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Stock");

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Pedido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eliminar_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(crear_tablas_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(borrar_tablas_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(insertar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(212, 212, 212)
                                .addComponent(jLabel1)
                                .addGap(77, 77, 77))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volver_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(borrar_tablas_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(crear_tablas_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(insertar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eliminar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 26, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
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

    private void refrescar_stock_table() {

        // Obtener la conexión a la base de datos
        Connection conexion = con.conectar();

        stock_table.removeAll();

        String consulta = "SELECT * FROM Stock";
        try {

            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(consulta);

            // Crear un modelo de datos
            DefaultTableModel modelo = new DefaultTableModel(
                    null,
                    new String[]{"Cproducto", "Cantidad"}
            );

            while (rs.next()) {
                Object[] fila = new Object[]{
                    rs.getInt("Cproducto"),
                    rs.getInt("Cantidad")
                };
                modelo.addRow(fila);
            }

            stock_table.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar tabla stock : " + ex);

        }

        con.cierreConexion();
    }

    private void refrescar_pedido_table() {

        // Obtener la conexión a la base de datos
        Connection conexion = con.conectar();

        pedido_table.removeAll();

        String consulta = "SELECT * FROM Pedido";
        try {
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(consulta);

            // Crear un modelo de datos
            DefaultTableModel modelo = new DefaultTableModel(
                    null,
                    new String[]{"Cpedido", "Ccliente", "Fecha_pedido"}
            );

            while (rs.next()) {
                Object[] fila = new Object[]{
                    rs.getInt("Cpedido"),
                    rs.getInt("Ccliente"),
                    rs.getDate("Fecha_pedido")
                };
                modelo.addRow(fila);
            }

            pedido_table.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar tabla pedido : " + ex);

        }

        con.cierreConexion();
    }

    private void refrescar_detalle_pedido_table() {

        // Obtener la conexión a la base de datos
        Connection conexion = con.conectar();

        detalle_pedido_table.removeAll();

        String consulta = "SELECT * FROM detalle_pedido";
        try {
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(consulta);

            // Crear un modelo de datos
            DefaultTableModel modelo = new DefaultTableModel(
                    null,
                    new String[]{"Cpedido", "Cproducto", "Cantidad"}
            );

            while (rs.next()) {
                Object[] fila = new Object[]{
                    rs.getInt("Cpedido"),
                    rs.getInt("Cproducto"),
                    rs.getInt("Cantidad")
                };
                modelo.addRow(fila);
            }

            detalle_pedido_table.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar tabla detalle_pedido : " + ex);

        }

        con.cierreConexion();
    }


    private void volver_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver_btnActionPerformed
        CRUD crud = new CRUD();
        crud.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volver_btnActionPerformed

    private void borrar_tablas_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar_tablas_btnActionPerformed
        Connection conexion = con.conectar();
        try {

            Statement borracion = conexion.createStatement();
            borracion.executeUpdate("DROP TABLE Detalle_Pedido");
            borracion.executeUpdate("DROP TABLE Stock");
            borracion.executeUpdate("DROP TABLE Pedido");
            JOptionPane.showMessageDialog(null, "Las tablas Stock, Pedido y Detalle_pedido han sido eliminadas correctamente.");
            borracion.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar las tablas, es posible que ya estén eliminadas o no existan : " + ex);
        }

        con.cierreConexion();
        refrescar_stock_table();
    }//GEN-LAST:event_borrar_tablas_btnActionPerformed

    private void crear_tablas_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_tablas_btnActionPerformed
        Connection conexion = con.conectar();
        try {

            Statement statement = conexion.createStatement();
            statement.executeUpdate("CREATE TABLE Stock(Cproducto NUMBER NOT NULL PRIMARY KEY, Cantidad NUMBER NOT NULL)");
            statement.executeUpdate("CREATE TABLE Pedido(Cpedido NUMBER NOT NULL PRIMARY KEY, Ccliente NUMBER NOT NULL, Fecha_pedido DATE NOT NULL)");
            statement.executeUpdate("CREATE TABLE Detalle_pedido(Cpedido NUMBER NOT NULL, Cproducto NUMBER NOT NULL, Cantidad NUMBER NOT NULL, PRIMARY KEY(Cpedido, Cproducto), FOREIGN KEY(Cpedido) REFERENCES Pedido(Cpedido), FOREIGN KEY(Cproducto) REFERENCES Stock(Cproducto))");
            JOptionPane.showMessageDialog(null, "Las tablas Stock, Pedido y Detalle_pedido han sido creadas correctamente.");
            statement.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al crear las tablas, es posible que ya existan : " + ex);
        }

        con.cierreConexion();
        refrescar_stock_table();
    }//GEN-LAST:event_crear_tablas_btnActionPerformed

    private void insertar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertar_btnActionPerformed
        Connection conexion = con.conectar();
        try {

            Statement statement = conexion.createStatement();

            statement.executeUpdate("INSERT INTO Stock (Cproducto, Cantidad) VALUES (1, 100)");
            statement.executeUpdate("INSERT INTO Stock (Cproducto, Cantidad) VALUES (2, 50)");
            statement.executeUpdate("INSERT INTO Stock (Cproducto, Cantidad) VALUES (3, 25)");
            statement.executeUpdate("INSERT INTO Stock (Cproducto, Cantidad) VALUES (4, 10)");
            statement.executeUpdate("INSERT INTO Stock (Cproducto, Cantidad) VALUES (5, 5)");
            statement.executeUpdate("INSERT INTO Stock (Cproducto, Cantidad) VALUES (6, 1000)");
            statement.executeUpdate("INSERT INTO Stock (Cproducto, Cantidad) VALUES (7, 500)");
            statement.executeUpdate("INSERT INTO Stock (Cproducto, Cantidad) VALUES (8, 250)");
            statement.executeUpdate("INSERT INTO Stock (Cproducto, Cantidad) VALUES (9, 100)");
            statement.executeUpdate("INSERT INTO Stock (Cproducto, Cantidad) VALUES (10, 50)");

            statement.close();
            conexion.commit();
            JOptionPane.showMessageDialog(null, "Las tuplas han sido creadas correctamente.");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar las tuplas, seguramente ya existan : " + ex);
        }
        con.cierreConexion();
        refrescar_stock_table();
    }//GEN-LAST:event_insertar_btnActionPerformed

    private void eliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_btnActionPerformed
        Connection conexion = con.conectar();
        try {
            Statement statement = conexion.createStatement();

            statement.executeUpdate("DELETE FROM Stock WHERE Cproducto IN (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)");

            statement.close();
            conexion.commit();

            JOptionPane.showMessageDialog(null, "Las tuplas han sido borradas correctamente.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al borrar las tuplas: " + ex);
        }
        con.cierreConexion();
        refrescar_stock_table();
    }//GEN-LAST:event_eliminar_btnActionPerformed

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
    private javax.swing.JTable detalle_pedido_table;
    private javax.swing.JButton eliminar_btn;
    private javax.swing.JButton insertar_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable pedido_table;
    private javax.swing.JTable stock_table;
    private javax.swing.JButton volver_btn;
    // End of variables declaration//GEN-END:variables
}
