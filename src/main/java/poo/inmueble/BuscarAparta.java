package poo.inmueble;

import Clasess.Apartamentos;
import poo.inmueble.Inmueble;
import poo.inmueble.ApartamentosMenu;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BuscarAparta extends javax.swing.JFrame {
    
    private DefaultTableModel tableModel;

    public BuscarAparta() {
        
        initComponents();
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id Inmobiliario", "Area(m2)", "N°Habitaciones", "N°Baños", "Tipo Apartamento" }));
        tableModel = (DefaultTableModel) jTable1.getModel();
        
    }
private void buscarApartamentos() {
        String caracteristica1 = jComboBox1.getSelectedItem().toString();
        String valor1 = jTextField1.getText();
        boolean encontrada = false;

        tableModel.setRowCount(0);

        // Iterar sobre la lista de casas
        for (Apartamentos apartamento : ApartamentosMenu.listaApartamentos) {
            // Comparar la característica y el valor con los atributos de cada casa
            switch (caracteristica1) {
                case "Id Inmobiliario":
                    if (apartamento.getInmob1().equalsIgnoreCase(valor1)) {
                        mostrarInformacion(apartamento);
                        encontrada = true;
                    }
                    break;
                case "Area(m2)":
                    if (apartamento.getArea1().equalsIgnoreCase(valor1)) {
                        mostrarInformacion(apartamento);
                        encontrada = true;
                    }
                    break;
                case "N°Habitaciones":
                    if (apartamento.getNHabi1().equalsIgnoreCase(valor1)) {
                        mostrarInformacion(apartamento);
                        encontrada = true;
                    }
                    break;
                case "N°Baños":
                    if (apartamento.getBaño1().equalsIgnoreCase(valor1)) {
                        mostrarInformacion(apartamento);
                        encontrada = true;
                    }
                    break;
                case "Tipo Apartamento":
                    if (apartamento.getTAparta().equalsIgnoreCase(valor1)) {
                        mostrarInformacion(apartamento);
                        encontrada = true;
                    }
                    break;
            }

            // Si se encontró una casa, agregar una fila a la tabla
            if (encontrada) {
                Object[] rowData = {
                    apartamento.getInmob1(),
                    apartamento.getArea1(),
                    apartamento.getDirec1(),
                    apartamento.getNHabi1(),
                    apartamento.getBaño1(),
                    apartamento.getTAparta(),
                    apartamento.getVAdmin(),
                };
                tableModel.addRow(rowData);
            }
        }

        // Mostrar mensaje si no se encontraron casas
        if (!encontrada) {
            JOptionPane.showMessageDialog(this, "No se encontraron Apartamentos con la característica seleccionada.", "Búsqueda", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void mostrarInformacion(Apartamentos apartamento) {
        Object[] rowData = {
            apartamento.getInmob1(),
            apartamento.getArea1(),
            apartamento.getDirec1(),
            apartamento.getNHabi1(),
            apartamento.getBaño1(),
            apartamento.getTAparta(),
            apartamento.getVAdmin(),
        };
        tableModel.addRow(rowData);
    }

    // Método para mostrar la información de la casa
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("¿Que caracteristica busca?");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 140, 30));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setText("Ingresa aqui la informacion segun la caracteristica");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 400, 30));

        jTextField1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 280, 30));

        jTable1.setBackground(new java.awt.Color(153, 153, 153));
        jTable1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Area", "Direccion", "N°Habitaciones", "N°Baños", "Tipo Apartamento", "Valor Admin"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 890, 300));

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        buscarApartamentos();
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
            java.util.logging.Logger.getLogger(BuscarAparta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarAparta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarAparta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarAparta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarAparta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
