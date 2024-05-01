package poo.inmueble;
import Clasess.Casas;
import poo.inmueble.Inmueble;
import poo.inmueble.CasasMenu;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Buscar extends javax.swing.JFrame {
    
    private DefaultTableModel tableModel;

    public Buscar() {
        initComponents();
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id Inmobiliario", "Area(m2)", "N°Habitaciones)", "N°Baños", "Zona" }));
        tableModel = (DefaultTableModel) jTable1.getModel();
    }

    private void buscarCasas() {
        String caracteristica = jComboBox1.getSelectedItem().toString();
        String valor = jTextField1.getText();
        boolean encontrada = false;

        tableModel.setRowCount(0);

        // Iterar sobre la lista de casas
        for (Casas casa : CasasMenu.listaCasas) {
            // Comparar la característica y el valor con los atributos de cada casa
            switch (caracteristica) {
                case "Id Inmobiliario":
                    if (casa.getInmob().equalsIgnoreCase(valor)) {
                        mostrarInformacion(casa);
                        encontrada = true;
                    }
                    break;
                case "Area(m2)":
                    if (casa.getArea().equalsIgnoreCase(valor)) {
                        mostrarInformacion(casa);
                        encontrada = true;
                    }
                    break;
                case "N°Habitaciones":
                    if (casa.getNHabi().equalsIgnoreCase(valor)) {
                        mostrarInformacion(casa);
                        encontrada = true;
                    }
                    break;
                case "N°Baños":
                    if (casa.getBaño().equalsIgnoreCase(valor)) {
                        mostrarInformacion(casa);
                        encontrada = true;
                    }
                    break;
                case "Zona":
                    if (casa.getZona().equalsIgnoreCase(valor)) {
                        mostrarInformacion(casa);
                        encontrada = true;
                    }
                    break;
            }

            // Si se encontró una casa, agregar una fila a la tabla
            if (encontrada) {
                Object[] rowData = {
                    casa.getInmob(),
                    casa.getArea(),
                    casa.getDirec(),
                    casa.getNHabi(),
                    casa.getBaño(),
                    casa.getZona(),
                    casa.getDistCM(),
                    casa.getAltitud(),
                    casa.getConj(),
                    casa.getValAdmi(),
                    casa.getAreCom()
                };
                tableModel.addRow(rowData);
            }
        }

        // Mostrar mensaje si no se encontraron casas
        if (!encontrada) {
            JOptionPane.showMessageDialog(this, "No se encontraron casas con la característica seleccionada.", "Búsqueda", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void mostrarInformacion(Casas casa) {
        JOptionPane.showMessageDialog(this,
                "Identificador Inmobiliario: " + casa.getInmob() + "\n" +
                "Area (m2): " + casa.getArea() + "\n" +
                "Dirección: " + casa.getDirec() + "\n" +
                "N° Habitaciones: " + casa.getNHabi() + "\n" +
                "N° Baños: " + casa.getBaño() + "\n" +
                "Zona: " + casa.getZona() + "\n" +
                "Distancia de cabecera municipal: " + casa.getDistCM() + "\n" +
                "Altura sobre nivel del mar: " + casa.getAltitud() + "\n" +
                "Conjunto o Independiente: " + casa.getConj() + "\n" +
                "Valor Administración: " + casa.getValAdmi() + "\n" +
                "Valor Áreas Comunes: " + casa.getAreCom(),
                "Información de la Casa", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método para mostrar la información de la casa
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 543, 140, 40));

        jTable1.setBackground(new java.awt.Color(153, 153, 153));
        jTable1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Area", "Direccion", "N°Habitaciones", "N°Baños", "Zona", "Distancia Municipal", "Altura", "Conjunto o Independiente", "Val Admin", "Val Areas Comunes"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(7).setHeaderValue("Altura");
            jTable1.getColumnModel().getColumn(8).setHeaderValue("Conjunto o Independiente");
            jTable1.getColumnModel().getColumn(9).setHeaderValue("Val Admin");
            jTable1.getColumnModel().getColumn(10).setHeaderValue("Val Areas Comunes");
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 900, 300));

        jTextField1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 280, 30));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setText("Ingresa aqui la informacion segun la caracteristica");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 400, 30));

        jComboBox1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 140, 30));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("¿Que caracteristica busca?");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setText("Buscador");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 920, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        buscarCasas();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Inmueble inmueble = new Inmueble();
        // Hacer visible el JFrame "Casas"
        inmueble.setVisible(true);
        // Cerrar el frame actual (Menu)
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


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
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
