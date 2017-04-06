package tp1;

import javax.swing.DefaultListModel;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.ListModel;
import sun.swing.SwingAccessor;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();

        congruencialMixto = new CongruencialMixto();

        validoM = false;
        validoSemilla = false;
        validoA = false;
        validoC = false;
        btnReiniciar.setEnabled(false);
        btnSiguiente.setEnabled(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtSemilla = new javax.swing.JTextField();
        txtM = new javax.swing.JTextField();
        txtA = new javax.swing.JTextField();
        txtC = new javax.swing.JTextField();
        cmbMetodo = new javax.swing.JComboBox<String>();
        lblSemilla = new javax.swing.JLabel();
        lblMetodo = new javax.swing.JLabel();
        lblM = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        chkOptima = new javax.swing.JCheckBox();
        btnSiguiente = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        listNumeros = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setEnabled(false);

        txtSemilla.setText("Ingrese la Semilla");
        txtSemilla.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSemillaFocusGained(evt);
            }
        });
        txtSemilla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSemillaKeyTyped(evt);
            }
        });

        txtM.setText("Ingrese la constante m");
        txtM.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMFocusGained(evt);
            }
        });
        txtM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMKeyTyped(evt);
            }
        });

        txtA.setText("Ingrese la constante a");
        txtA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAFocusGained(evt);
            }
        });
        txtA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAKeyTyped(evt);
            }
        });

        txtC.setText("Ingrese la constante c");
        txtC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCFocusGained(evt);
            }
        });
        txtC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCKeyTyped(evt);
            }
        });

        cmbMetodo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Congruencial Mixto", "Congruencial Multiplicativo" }));

        lblSemilla.setText("Ingrese la Semilla:");

        lblMetodo.setText("Método a Utilizar:");

        lblM.setText("Ingrese la constante m:");

        lblA.setText("Ingrese la constante a:");

        lblC.setText("Ingrese la constante c:");

        chkOptima.setText("Generar con Configuración óptima");
        chkOptima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOptimaActionPerformed(evt);
            }
        });

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMetodo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSemilla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(16, 16, 16)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSemilla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(txtM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(txtA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(txtC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(cmbMetodo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(135, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkOptima, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btnReiniciar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSiguiente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMetodo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSemilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSemilla))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblM))
                        .addGap(18, 18, 18)
                        .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblA, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblC))
                .addGap(18, 18, 18)
                .addComponent(chkOptima)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguiente)
                    .addComponent(btnGenerar)
                    .addComponent(btnReiniciar))
                .addGap(101, 101, 101))
        );

        jScrollPane4.setViewportView(listNumeros);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Programa A", jPanel2);

        jLabel1.setText("IMAGEN");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Números"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Programa B", jPanel1);

        jLabel2.setText("IMAGEN");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Números"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Programa C", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="CONTROL DE TEXT FIELDS">   
    private void txtSemillaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSemillaFocusGained
        if (!validoSemilla) {
            txtSemilla.setText("");
        }

        txtSemilla.setInputVerifier(new InputVerifier() {
            public boolean verify(JComponent input) {
                JTextField tf = (JTextField) input;
                String cadena = tf.getText();
                if (cadena.compareTo("") == 0) {
                    txtSemilla.setText("Ingrese Semilla");
                }
                return true;
            }
        });
    }//GEN-LAST:event_txtSemillaFocusGained

    private void txtSemillaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSemillaKeyTyped
        char caracter = evt.getKeyChar();

        if ((caracter < '0') || (caracter > '9')) {
            evt.consume();
            if (txtSemilla.getText().compareTo("") == 0) {
                validoSemilla = false;
            }
        } else {
            validoSemilla = true;
        }

    }//GEN-LAST:event_txtSemillaKeyTyped

    private void txtMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMKeyTyped
        char caracter = evt.getKeyChar();

        if ((caracter < '0') || (caracter > '9')) {
            evt.consume();
            if (txtM.getText().compareTo("") == 0) {
                validoM = false;
            }
        } else {
            validoM = true;
        }
    }//GEN-LAST:event_txtMKeyTyped

    private void txtAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAKeyTyped
        char caracter = evt.getKeyChar();

        if ((caracter < '0') || (caracter > '9')) {
            evt.consume();
            if (txtA.getText().compareTo("") == 0) {
                validoA = false;
            }
        } else {
            validoA = true;
        }
    }//GEN-LAST:event_txtAKeyTyped

    private void txtCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCKeyTyped
        char caracter = evt.getKeyChar();

        if ((caracter < '0') || (caracter > '9')) {
            evt.consume();
            if (txtC.getText().compareTo("") == 0) {
                validoC = false;
            }
        } else {
            validoC = true;
        }
    }//GEN-LAST:event_txtCKeyTyped

    private void txtMFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMFocusGained
        if (!validoM) {
            txtM.setText("");
        }

        txtM.setInputVerifier(new InputVerifier() {
            public boolean verify(JComponent input) {
                JTextField tf = (JTextField) input;
                String cadena = tf.getText();
                if (cadena.compareTo("") == 0) {
                    txtM.setText("Ingrese la constante m");
                }
                return true;
            }
        });
    }//GEN-LAST:event_txtMFocusGained

    private void txtAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAFocusGained
        if (!validoA) {
            txtA.setText("");
        }

        txtA.setInputVerifier(new InputVerifier() {
            public boolean verify(JComponent input) {
                JTextField tf = (JTextField) input;
                String cadena = tf.getText();
                if (cadena.compareTo("") == 0) {
                    txtA.setText("Ingrese la constante a");
                }
                return true;
            }
        });
    }//GEN-LAST:event_txtAFocusGained

    private void txtCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCFocusGained
        if (!validoC) {
            txtC.setText("");
        }

        txtC.setInputVerifier(new InputVerifier() {
            public boolean verify(JComponent input) {
                JTextField tf = (JTextField) input;
                String cadena = tf.getText();
                if (cadena.compareTo("") == 0) {
                    txtC.setText("Ingrese la constante c");
                }
                return true;
            }
        });
    }//GEN-LAST:event_txtCFocusGained

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed

        try {
            if (!chkOptima.isSelected() && !validarCampos()) {

            } else {
                if (!chkOptima.isSelected() && validarCampos()) {
                    congruencialMixto.setSeed(Integer.parseInt(txtSemilla.getText()));
                    congruencialMixto.setM(Integer.parseInt(txtM.getText()));
                    congruencialMixto.setA(Integer.parseInt(txtA.getText()));
                    congruencialMixto.setC(Integer.parseInt(txtC.getText()));
                }

                DefaultListModel listaNumeros = new DefaultListModel();
                Object[][] array = congruencialMixto.getNumeros(20);

                for (int i = 0; i < array[1].length; i++) {
                    listaNumeros.addElement((int) ((double) array[1][i] * 10000));
                }
                
                listNumeros.setModel(listaNumeros);
                btnGenerar.setEnabled(false);
                txtSemilla.setEnabled(false);
                txtM.setEnabled(false);
                txtC.setEnabled(false);
                txtA.setEnabled(false);
                cmbMetodo.setEnabled(false);
                chkOptima.setEnabled(false);

                btnReiniciar.setEnabled(true);
                btnSiguiente.setEnabled(true);
            }

        } catch (Error er) {

        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void chkOptimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOptimaActionPerformed
        if (chkOptima.isSelected()) {
            txtSemilla.setText("Ingrese Semilla");
            txtM.setText("Ingrese la constante m");
            txtA.setText("Ingrese la constante a");
            txtC.setText("Ingrese la constante c");

            txtSemilla.setEnabled(false);
            txtM.setEnabled(false);
            txtA.setEnabled(false);
            txtC.setEnabled(false);

            validoM = false;
            validoSemilla = false;
            validoA = false;
            validoC = false;

        } else {
            txtSemilla.setEnabled(true);
            txtM.setEnabled(true);
            txtA.setEnabled(true);
            txtC.setEnabled(true);
        }
    }//GEN-LAST:event_chkOptimaActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        DefaultListModel listaNumeros = new DefaultListModel();
        Object[][] array = congruencialMixto.getNumeros(listNumeros.getModel().getSize() + 1);

        for (int i = 0; i < array[1].length; i++) {
            listaNumeros.addElement((int) ((double) array[1][i] * 10000));
        }
        listNumeros.setModel(listaNumeros);
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        congruencialMixto = new CongruencialMixto();
        
        validoM = false;
        validoSemilla = false;
        validoA = false;
        validoC = false;

        txtSemilla.setText("Ingrese Semilla");
        txtM.setText("Ingrese la constante m");
        txtA.setText("Ingrese la constante a");
        txtC.setText("Ingrese la constante c");

        listNumeros.setModel(new DefaultListModel());
        btnGenerar.setEnabled(true);
        txtSemilla.setEnabled(true);
        txtM.setEnabled(true);
        txtC.setEnabled(true);
        txtA.setEnabled(true);
        cmbMetodo.setEnabled(true);
        chkOptima.setEnabled(true);
        chkOptima.setSelected(false);
        
        
        btnReiniciar.setEnabled(false);
        btnSiguiente.setEnabled(false);

    }//GEN-LAST:event_btnReiniciarActionPerformed

    private boolean validarCampos() {
        return (validoSemilla && validoM && validoA && validoC);
    }

    // </editor-fold> 
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    private CongruencialMixto congruencialMixto;

    private boolean validoM;
    private boolean validoSemilla;
    private boolean validoA;
    private boolean validoC;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JCheckBox chkOptima;
    private javax.swing.JComboBox<String> cmbMetodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblM;
    private javax.swing.JLabel lblMetodo;
    private javax.swing.JLabel lblSemilla;
    private javax.swing.JList listNumeros;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtM;
    private javax.swing.JTextField txtSemilla;
    // End of variables declaration//GEN-END:variables
}
