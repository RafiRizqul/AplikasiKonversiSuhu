
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class KonversiSuhuFrame extends javax.swing.JFrame {

    /**
     * Creates new form KonversiSuhuFrame
     */
    public KonversiSuhuFrame() {
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
        inputTextField = new javax.swing.JTextField();
        skalaAwalComboBox = new javax.swing.JComboBox<>();
        konversiButton = new javax.swing.JButton();
        hasilLabel = new javax.swing.JLabel();
        skalaTujuanComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        rbtnCtoF = new javax.swing.JRadioButton();
        rbtnFtoC = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inputTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputTextFieldKeyTyped(evt);
            }
        });

        skalaAwalComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Fahrenheit", "Reamur", "Kelvin", " " }));

        konversiButton.setText("Konversi");
        konversiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konversiButtonActionPerformed(evt);
            }
        });

        hasilLabel.setText("Konversi Suhu");

        skalaTujuanComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fahrenheit", "Celcius", "Reamur", "Kelvin", " " }));
        skalaTujuanComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skalaTujuanComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Konversi ke");

        rbtnCtoF.setText("jRadioButton1");
        rbtnCtoF.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnCtoFItemStateChanged(evt);
            }
        });
        rbtnCtoF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCtoFActionPerformed(evt);
            }
        });

        rbtnFtoC.setText("jRadioButton2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(hasilLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(konversiButton)
                        .addGap(145, 145, 145))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(skalaAwalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1))
                            .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbtnCtoF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtnFtoC))
                            .addComponent(skalaTujuanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtnCtoF)
                        .addComponent(rbtnFtoC)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skalaAwalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(skalaTujuanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(konversiButton)
                    .addComponent(hasilLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void konversiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konversiButtonActionPerformed
try {
        double inputSuhu = Double.parseDouble(inputTextField.getText());
        String skalaAwal = (String) skalaAwalComboBox.getSelectedItem();
        String skalaTujuan = (String) skalaTujuanComboBox.getSelectedItem();
        double hasil = 0;

        if ("Celcius".equals(skalaAwal) && "Fahrenheit".equals(skalaTujuan)) {
                hasil = (inputSuhu * 9/5) + 32;
            } else if ("Celcius".equals(skalaAwal) && "Kelvin".equals(skalaTujuan)) {
                hasil = inputSuhu + 273.15;
            } else if ("Celcius".equals(skalaAwal) && "Reamur".equals(skalaTujuan)) {
                hasil = inputSuhu * 4/5;
            } else if ("Fahrenheit".equals(skalaAwal) && "Celcius".equals(skalaTujuan)) {
                hasil = (inputSuhu - 32) * 5/9;
            } else if ("Fahrenheit".equals(skalaAwal) && "Kelvin".equals(skalaTujuan)) {
                hasil = (inputSuhu - 32) * 5/9 + 273.15;
            } else if ("Fahrenheit".equals(skalaAwal) && "Reamur".equals(skalaTujuan)) {
                hasil = (inputSuhu - 32) * 4/9;
            } else if ("Kelvin".equals(skalaAwal) && "Celcius".equals(skalaTujuan)) {
                hasil = inputSuhu - 273.15;
            } else if ("Kelvin".equals(skalaAwal) && "Fahrenheit".equals(skalaTujuan)) {
                hasil = (inputSuhu - 273.15) * 9/5 + 32;
            } else if ("Kelvin".equals(skalaAwal) && "Reamur".equals(skalaTujuan)) {
                hasil = (inputSuhu - 273.15) * 4/5;
            } else if ("Reamur".equals(skalaAwal) && "Celcius".equals(skalaTujuan)) {
                hasil = inputSuhu * 5/4;
            } else if ("Reamur".equals(skalaAwal) && "Fahrenheit".equals(skalaTujuan)) {
                hasil = (inputSuhu * 9/4) + 32;
            } else if ("Reamur".equals(skalaAwal) && "Kelvin".equals(skalaTujuan)) {
                hasil = (inputSuhu * 5/4) + 273.15;
            } else {
                hasil = inputSuhu; // Jika skala awal dan tujuan sama
            }
        // Tambahkan rumus konversi lain sesuai skala yang dipilih

        hasilLabel.setText("Hasil: " + hasil + " " + skalaTujuan);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
    }        // TODO add your handling code here:
    }//GEN-LAST:event_konversiButtonActionPerformed

    private void inputTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputTextFieldKeyTyped
char c = evt.getKeyChar();
    if (!Character.isDigit(c) && c != '.') {
        evt.consume(); // Membatasi input hanya untuk angka dan titik desimal
    }        // TODO add your handling code here:
    }//GEN-LAST:event_inputTextFieldKeyTyped

    private void skalaTujuanComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skalaTujuanComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_skalaTujuanComboBoxActionPerformed

    private void rbtnCtoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCtoFActionPerformed
 public void itemStateChanged(java.awt.event.ItemEvent evt) {
        if (rbtnCtoF.isSelected()) {
            skalaAwalComboBox.setSelectedItem("Celcius");
            skalaTujuanComboBox.setSelectedItem("Fahrenheit");
        }
    }        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnCtoFActionPerformed

    private void rbtnCtoFItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnCtoFItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnCtoFItemStateChanged

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
            java.util.logging.Logger.getLogger(KonversiSuhuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hasilLabel;
    private javax.swing.JTextField inputTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton konversiButton;
    private javax.swing.JRadioButton rbtnCtoF;
    private javax.swing.JRadioButton rbtnFtoC;
    private javax.swing.JComboBox<String> skalaAwalComboBox;
    private javax.swing.JComboBox<String> skalaTujuanComboBox;
    // End of variables declaration//GEN-END:variables
}
