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

        validoM = false;
        validoSemilla = false;
        validoA = false;
        validoC = false;
        validoCantB = false;
        validoCantC = false;

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
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblIntervalosB = new javax.swing.JLabel();
        txtCantidadNumerosB = new javax.swing.JTextField();
        cmbIntervalosB = new javax.swing.JComboBox();
        btnGenerarB = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        listNumerosB = new javax.swing.JList();
        graficoB = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblIntervalosC = new javax.swing.JLabel();
        txtCantidadNumerosC = new javax.swing.JTextField();
        cmbIntervalosC = new javax.swing.JComboBox();
        btnGenerarC = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listNumerosC = new javax.swing.JList();
        graficoC = new javax.swing.JLabel();

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
                        .addContainerGap(188, Short.MAX_VALUE)
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblA))
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

        lblIntervalosB.setText("Cantidad de Intervalos: ");

        txtCantidadNumerosB.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtCantidadNumerosB.setText("Cantidad de Números Aleatorios a generar");
        txtCantidadNumerosB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCantidadNumerosBFocusGained(evt);
            }
        });
        txtCantidadNumerosB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadNumerosBKeyTyped(evt);
            }
        });

        cmbIntervalosB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5", "10", "15", "20" }));

        btnGenerarB.setText("Generar");
        btnGenerarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarBActionPerformed(evt);
            }
        });

        jScrollPane5.setViewportView(listNumerosB);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGenerarB)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(lblIntervalosB, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cmbIntervalosB, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtCantidadNumerosB, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(graficoB, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(graficoB, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIntervalosB)
                            .addComponent(cmbIntervalosB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtCantidadNumerosB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGenerarB)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(696, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 17, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel4)
                .addContainerGap(216, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Programa B", jPanel1);

        lblIntervalosC.setText("Cantidad de Intervalos: ");

        txtCantidadNumerosC.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtCantidadNumerosC.setText("Cantidad de Números Aleatorios a generar");
        txtCantidadNumerosC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCantidadNumerosCFocusGained(evt);
            }
        });
        txtCantidadNumerosC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadNumerosCKeyTyped(evt);
            }
        });

        cmbIntervalosC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5", "10", "15", "20" }));

        btnGenerarC.setText("Generar");
        btnGenerarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarCActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(listNumerosC);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGenerarC)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(lblIntervalosC, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cmbIntervalosC, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtCantidadNumerosC, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(graficoC, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(graficoC, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIntervalosC)
                            .addComponent(cmbIntervalosC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtCantidadNumerosC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGenerarC)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Programa C", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                if (cmbMetodo.getSelectedItem().toString().compareToIgnoreCase("congruencial mixto") == 0) {
                    congruencial = new CongruencialMixto();
                } else if (cmbMetodo.getSelectedItem().toString().compareToIgnoreCase("congruencial multiplicativo") == 0) {
                    congruencial = new CongruencialMultiplicativo();
                }

                if (!chkOptima.isSelected() && validarCampos()) {
                    congruencial.setSeed(Integer.parseInt(txtSemilla.getText()));
                    congruencial.setM(Integer.parseInt(txtM.getText()));
                    congruencial.setA(Integer.parseInt(txtA.getText()));
                    congruencial.setC(Integer.parseInt(txtC.getText()));
                }

                DefaultListModel listaNumeros = new DefaultListModel();
                Object[][] array = congruencial.getNumeros(20);

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

                jTabbedPane1.setEnabled(true);
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
        Object[][] array = congruencial.getNumeros(listNumeros.getModel().getSize() + 1);

        for (int i = 0; i < array[1].length; i++) {
            listaNumeros.addElement((int) ((double) array[1][i] * 10000));
        }
        listNumeros.setModel(listaNumeros);
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
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

        jTabbedPane1.setEnabled(false);
        btnReiniciar.setEnabled(false);
        btnSiguiente.setEnabled(false);

    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void txtCantidadNumerosCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadNumerosCKeyTyped
        char caracter = evt.getKeyChar();

        if ((caracter < '0') || (caracter > '9')) {
            evt.consume();
            if (txtCantidadNumerosC.getText().compareTo("") == 0) {
                validoCantC = false;
            }
        } else {
            validoCantC = true;
        }
    }//GEN-LAST:event_txtCantidadNumerosCKeyTyped

    private void txtCantidadNumerosCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantidadNumerosCFocusGained
        if (!validoCantC) {
            txtCantidadNumerosC.setText("");
        }

        txtCantidadNumerosC.setInputVerifier(new InputVerifier() {
            public boolean verify(JComponent input) {
                JTextField tf = (JTextField) input;
                String cadena = tf.getText();
                if (cadena.compareTo("") == 0) {
                    txtCantidadNumerosC.setText("Cantidad de Números Aleatorios a generar");
                }
                return true;
            }
        });
    }//GEN-LAST:event_txtCantidadNumerosCFocusGained

    private void txtCantidadNumerosBFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantidadNumerosBFocusGained
        if (!validoCantB) {
            txtCantidadNumerosB.setText("");
        }

        txtCantidadNumerosB.setInputVerifier(new InputVerifier() {
            public boolean verify(JComponent input) {
                JTextField tf = (JTextField) input;
                String cadena = tf.getText();
                if (cadena.compareTo("") == 0) {
                    txtCantidadNumerosB.setText("Cantidad de Números Aleatorios a generar");
                }
                return true;
            }
        });
    }//GEN-LAST:event_txtCantidadNumerosBFocusGained

    private void txtCantidadNumerosBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadNumerosBKeyTyped
        char caracter = evt.getKeyChar();

        if ((caracter < '0') || (caracter > '9')) {
            evt.consume();
            if (txtCantidadNumerosB.getText().compareTo("") == 0) {
                validoCantB = false;
            }
        } else {
            validoCantB = true;
        }
    }//GEN-LAST:event_txtCantidadNumerosBKeyTyped

    private void btnGenerarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarBActionPerformed
        if (validoCantB) {
            DefaultListModel listaNumeros = new DefaultListModel();
            int cantidadIntervalos = Integer.parseInt(cmbIntervalosB.getSelectedItem().toString());
            String etiquetas[] = new String[cantidadIntervalos + 1];
            float intervalos[] = new float[cantidadIntervalos + 1];
            int valores[] = new int[cantidadIntervalos + 1];

            for (int i = 0; i <= cantidadIntervalos; i++) {
                valores[i] = 0;
            }

            for (int i = 0; i <= cantidadIntervalos; i++) {
                etiquetas[i] = "" + ((float) 1 / cantidadIntervalos) * (i) + " - " + ((float) 1 / cantidadIntervalos) * (i + 1);
            }

            for (int i = 0; i <= cantidadIntervalos; i++) {
                intervalos[i] = ((float) 1 / cantidadIntervalos) * (i);
            }

            for (Object etiqueta : etiquetas) {
                System.out.println("" + etiqueta.toString());
            }

            for (int i = 0; i < Integer.parseInt(txtCantidadNumerosB.getText()); i++) {
                int a = (int) (Math.random() * 10000);
                float b = (float) a / 10000;
                listaNumeros.addElement(b);

                for (int j = 0; j < etiquetas.length; j++) {
                    if (b >= intervalos[j] && b < intervalos[j + 1]) {
                        valores[j] = valores[j] + 1;
                    }
                }
            }

            listNumerosB.setModel(listaNumeros);

            GraficoBarra2 graficoBarra = new GraficoBarra2(etiquetas, valores);

            try {
                graficoBarra.graficar();

            } catch (Exception exc) {

            }

        }
    }//GEN-LAST:event_btnGenerarBActionPerformed

    private void btnGenerarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarCActionPerformed
        if (validoCantC) {
            DefaultListModel listaNumeros = new DefaultListModel();
            Object[][] array = congruencial.getNumeros(Integer.parseInt(txtCantidadNumerosC.getText()));

            int cantidadIntervalos = Integer.parseInt(cmbIntervalosC.getSelectedItem().toString());
            String etiquetas[] = new String[cantidadIntervalos + 1];
            float intervalos[] = new float[cantidadIntervalos + 1];
            int valores[] = new int[cantidadIntervalos + 1];

            for (int i = 0; i <= cantidadIntervalos; i++) {
                valores[i] = 0;
            }

            for (int i = 0; i <= cantidadIntervalos; i++) {
                etiquetas[i] = "" + ((float) 1 / cantidadIntervalos) * (i) + " - " + ((float) 1 / cantidadIntervalos) * (i + 1);
            }

            for (int i = 0; i <= cantidadIntervalos; i++) {
                intervalos[i] = ((float) 1 / cantidadIntervalos) * (i);
            }

            for (Object etiqueta : etiquetas) {
                System.out.println("" + etiqueta.toString());
            }

            for (int i = 0; i < array[1].length; i++) {
                int a = (int) ((double) array[1][i] * 10000);
                float b = (float) a / 10000;
                listaNumeros.addElement(b);

                for (int j = 0; j < etiquetas.length; j++) {
                    if (b >= intervalos[j] && b < intervalos[j + 1]) {
                        valores[j] = valores[j] + 1;
                    }
                }

            }

            listNumerosC.setModel(listaNumeros);

            GraficoBarra2 graficoBarra = new GraficoBarra2(etiquetas, valores);

            try {
                graficoBarra.graficar();

            } catch (Exception exc) {
                System.out.println("mal");
            }
        }
    }//GEN-LAST:event_btnGenerarCActionPerformed

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

    private Congruencial congruencial;

    private boolean validoM;
    private boolean validoSemilla;
    private boolean validoA;
    private boolean validoC;
    private boolean validoCantB;
    private boolean validoCantC;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnGenerarB;
    private javax.swing.JButton btnGenerarC;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JCheckBox chkOptima;
    private javax.swing.JComboBox cmbIntervalosB;
    private javax.swing.JComboBox cmbIntervalosC;
    private javax.swing.JComboBox<String> cmbMetodo;
    private javax.swing.JLabel graficoB;
    private javax.swing.JLabel graficoC;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblIntervalosB;
    private javax.swing.JLabel lblIntervalosC;
    private javax.swing.JLabel lblM;
    private javax.swing.JLabel lblMetodo;
    private javax.swing.JLabel lblSemilla;
    private javax.swing.JList listNumeros;
    private javax.swing.JList listNumerosB;
    private javax.swing.JList listNumerosC;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtCantidadNumerosB;
    private javax.swing.JTextField txtCantidadNumerosC;
    private javax.swing.JTextField txtM;
    private javax.swing.JTextField txtSemilla;
    // End of variables declaration//GEN-END:variables
}
