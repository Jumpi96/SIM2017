package tp3;

import java.awt.CardLayout;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();

        cl = (CardLayout) cardPanel.getLayout();
        cl.show(cardPanel, "cartaUniforme");
        generador = new CongruencialMixto();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        panelGenerar = new javax.swing.JPanel();
        lblDistribucion = new javax.swing.JLabel();
        cmbDistribucion = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCantidad = new javax.swing.JTextPane();
        cardPanel = new javax.swing.JPanel();
        panelUniforme = new javax.swing.JPanel();
        lblIntervaloDesde = new javax.swing.JLabel();
        lblIntervaloHasta = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtIntervaloHasta = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtIntervaloDesde = new javax.swing.JTextPane();
        panelNormal = new javax.swing.JPanel();
        lblVarianza = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtVarianza = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtFrecuenciaNormal = new javax.swing.JTextPane();
        lblFrecuenciaNormal = new javax.swing.JLabel();
        panelExponencial = new javax.swing.JPanel();
        lblFrecuenciaExp = new javax.swing.JLabel();
        lblMediaExp = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtFrecuenciaExp = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtMediaExp = new javax.swing.JTextPane();
        panelPoisson = new javax.swing.JPanel();
        lblFrecuenciaPoi = new javax.swing.JLabel();
        lblMediaPoi = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtMediaPoi = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtFrecuenciaPoi = new javax.swing.JTextPane();
        btnGenerar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        lblIntervaloHasta1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblDistribucion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDistribucion.setText("Seleccione el tipo de distribución deseada:");

        cmbDistribucion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Uniforme", "Normal", "Poisson", "Exponencial Negativa" }));
        cmbDistribucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDistribucionActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Cantidad de valores a generar:");

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtCantidad);

        javax.swing.GroupLayout panelGenerarLayout = new javax.swing.GroupLayout(panelGenerar);
        panelGenerar.setLayout(panelGenerarLayout);
        panelGenerarLayout.setHorizontalGroup(
            panelGenerarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGenerarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelGenerarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDistribucion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelGenerarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbDistribucion, 0, 169, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        panelGenerarLayout.setVerticalGroup(
            panelGenerarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGenerarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGenerarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDistribucion)
                    .addComponent(cmbDistribucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelGenerarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cardPanel.setLayout(new java.awt.CardLayout());

        lblIntervaloDesde.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIntervaloDesde.setText("Ingrese el inicio del intervalo:");

        lblIntervaloHasta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIntervaloHasta.setText("Ingrese el fin del intervalo:");

        txtIntervaloHasta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIntervaloHastaKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(txtIntervaloHasta);

        txtIntervaloDesde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIntervaloDesdeKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txtIntervaloDesde);

        javax.swing.GroupLayout panelUniformeLayout = new javax.swing.GroupLayout(panelUniforme);
        panelUniforme.setLayout(panelUniformeLayout);
        panelUniformeLayout.setHorizontalGroup(
            panelUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUniformeLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(panelUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIntervaloHasta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIntervaloDesde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        panelUniformeLayout.setVerticalGroup(
            panelUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUniformeLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIntervaloDesde)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIntervaloHasta)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        cardPanel.add(panelUniforme, "cartaUniforme");

        lblVarianza.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblVarianza.setText("Ingrese la varianza:");

        txtVarianza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVarianzaKeyTyped(evt);
            }
        });
        jScrollPane6.setViewportView(txtVarianza);

        txtFrecuenciaNormal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFrecuenciaNormalKeyTyped(evt);
            }
        });
        jScrollPane7.setViewportView(txtFrecuenciaNormal);

        lblFrecuenciaNormal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFrecuenciaNormal.setText("Ingrese la frecuencia:");

        javax.swing.GroupLayout panelNormalLayout = new javax.swing.GroupLayout(panelNormal);
        panelNormal.setLayout(panelNormalLayout);
        panelNormalLayout.setHorizontalGroup(
            panelNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNormalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFrecuenciaNormal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelNormalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblVarianza, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(jScrollPane7))
                .addContainerGap())
        );
        panelNormalLayout.setVerticalGroup(
            panelNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNormalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblVarianza, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(panelNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFrecuenciaNormal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cardPanel.add(panelNormal, "cartaNormal");

        lblFrecuenciaExp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFrecuenciaExp.setText("Ingrese la frecuencia:");

        lblMediaExp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMediaExp.setText("Ingrese la Media:");

        txtFrecuenciaExp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFrecuenciaExpFocusGained(evt);
            }
        });
        txtFrecuenciaExp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFrecuenciaExpKeyTyped(evt);
            }
        });
        jScrollPane4.setViewportView(txtFrecuenciaExp);

        txtMediaExp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMediaExpFocusGained(evt);
            }
        });
        txtMediaExp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMediaExpKeyTyped(evt);
            }
        });
        jScrollPane5.setViewportView(txtMediaExp);

        javax.swing.GroupLayout panelExponencialLayout = new javax.swing.GroupLayout(panelExponencial);
        panelExponencial.setLayout(panelExponencialLayout);
        panelExponencialLayout.setHorizontalGroup(
            panelExponencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExponencialLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelExponencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFrecuenciaExp, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMediaExp, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelExponencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        panelExponencialLayout.setVerticalGroup(
            panelExponencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExponencialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelExponencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFrecuenciaExp)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelExponencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMediaExp)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cardPanel.add(panelExponencial, "cartaExponencial");

        lblFrecuenciaPoi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFrecuenciaPoi.setText("Ingrese la frecuencia:");

        lblMediaPoi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMediaPoi.setText("Ingrese la Media:");

        txtMediaPoi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMediaPoiFocusGained(evt);
            }
        });
        txtMediaPoi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMediaPoiKeyTyped(evt);
            }
        });
        jScrollPane8.setViewportView(txtMediaPoi);

        txtFrecuenciaPoi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFrecuenciaPoiFocusGained(evt);
            }
        });
        txtFrecuenciaPoi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFrecuenciaPoiKeyTyped(evt);
            }
        });
        jScrollPane9.setViewportView(txtFrecuenciaPoi);

        javax.swing.GroupLayout panelPoissonLayout = new javax.swing.GroupLayout(panelPoisson);
        panelPoisson.setLayout(panelPoissonLayout);
        panelPoissonLayout.setHorizontalGroup(
            panelPoissonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPoissonLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(panelPoissonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFrecuenciaPoi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMediaPoi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPoissonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(jScrollPane8))
                .addContainerGap())
        );
        panelPoissonLayout.setVerticalGroup(
            panelPoissonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPoissonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPoissonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFrecuenciaPoi))
                .addGap(18, 18, 18)
                .addGroup(panelPoissonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMediaPoi))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        cardPanel.add(panelPoisson, "cartaPoisson");

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        jScrollPane10.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblIntervaloHasta1.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        lblIntervaloHasta1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblIntervaloHasta1.setText("Prueba de Chi-cuadrado: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cardPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(panelGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblIntervaloHasta1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGenerar)
                            .addComponent(lblIntervaloHasta1)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbDistribucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDistribucionActionPerformed
        if (cmbDistribucion.getSelectedItem().toString().compareTo("Exponencial Negativa") == 0) {
            cl.show(cardPanel, "cartaExponencial");
        } else if (cmbDistribucion.getSelectedItem().toString().compareTo("Normal") == 0) {
            cl.show(cardPanel, "cartaNormal");
        } else if (cmbDistribucion.getSelectedItem().toString().compareTo("Uniforme") == 0) {
            cl.show(cardPanel, "cartaUniforme");
        } else if (cmbDistribucion.getSelectedItem().toString().compareTo("Poisson") == 0) {
            cl.show(cardPanel, "cartaPoisson");
        }
        limpiarCampos();
    }//GEN-LAST:event_cmbDistribucionActionPerformed

    private void limpiarCampos() {
        txtFrecuenciaExp.setText("");
        txtFrecuenciaNormal.setText("");
        txtFrecuenciaPoi.setText("");
        txtIntervaloDesde.setText("");
        txtIntervaloHasta.setText("");
        txtMediaExp.setText("");
        txtMediaPoi.setText("");
        txtVarianza.setText("");
    }

    private boolean verificar() {
        boolean retorno = false;

        if (txtCantidad.getText().compareTo("") != 0) {
            if (cmbDistribucion.getSelectedItem().toString().compareTo("Exponencial Negativa") == 0) {
                retorno = (txtFrecuenciaExp.getText().compareTo("") != 0 && txtMediaExp.getText().compareTo("") != 0);
            } else if (cmbDistribucion.getSelectedItem().toString().compareTo("Normal") == 0) {
                retorno = (txtVarianza.getText().compareTo("") != 0 && txtFrecuenciaNormal.getText().compareTo("") != 0);
            } else if (cmbDistribucion.getSelectedItem().toString().compareTo("Uniforme") == 0) {
                retorno = (txtIntervaloDesde.getText().compareTo("") != 0 && txtIntervaloHasta.getText().compareTo("") != 0);
            } else if (cmbDistribucion.getSelectedItem().toString().compareTo("Poisson") == 0) {
                retorno = (txtFrecuenciaPoi.getText().compareTo("") != 0 && txtMediaPoi.getText().compareTo("") != 0);
            }
        }

        return retorno;
    }


    private void txtFrecuenciaPoiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFrecuenciaPoiKeyTyped
        char caracter = evt.getKeyChar();

        if ((caracter < '0' || caracter > '9') && caracter != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_txtFrecuenciaPoiKeyTyped

    private void txtMediaPoiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMediaPoiKeyTyped
        char caracter = evt.getKeyChar();

        if ((caracter < '0' || caracter > '9') && caracter != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_txtMediaPoiKeyTyped

    private void txtIntervaloDesdeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIntervaloDesdeKeyTyped
        char caracter = evt.getKeyChar();

        if ((caracter < '0' || caracter > '9') && caracter != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_txtIntervaloDesdeKeyTyped

    private void txtIntervaloHastaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIntervaloHastaKeyTyped
        char caracter = evt.getKeyChar();

        if ((caracter < '0' || caracter > '9') && caracter != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_txtIntervaloHastaKeyTyped

    private void txtVarianzaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVarianzaKeyTyped
        char caracter = evt.getKeyChar();

        if ((caracter < '0' || caracter > '9') && caracter != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_txtVarianzaKeyTyped

    private void txtFrecuenciaNormalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFrecuenciaNormalKeyTyped
        char caracter = evt.getKeyChar();

        if ((caracter < '0' || caracter > '9') && caracter != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_txtFrecuenciaNormalKeyTyped

    private void txtFrecuenciaExpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFrecuenciaExpKeyTyped
        char caracter = evt.getKeyChar();

        if ((caracter < '0' || caracter > '9') && caracter != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_txtFrecuenciaExpKeyTyped

    private void txtMediaExpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMediaExpKeyTyped
        char caracter = evt.getKeyChar();

        if ((caracter < '0' || caracter > '9') && caracter != '.') {
            evt.consume();
        }

    }//GEN-LAST:event_txtMediaExpKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char caracter = evt.getKeyChar();

        if (caracter < '0' || caracter > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        if (verificar()) {
            Object array[] = generador.getNumerosExponenciales(Integer.parseInt(txtCantidad.getText()), Float.parseFloat(txtFrecuenciaExp.getText()));

            for (int i = 0; i < array.length; i++) {
                System.out.println("" + array[i]);
            }
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void txtFrecuenciaExpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFrecuenciaExpFocusGained
        txtFrecuenciaExp.setInputVerifier(new InputVerifier() {
            public boolean verify(JComponent input) {
                try {
                    if (txtFrecuenciaExp.getText().compareTo("") != 0) {
                        txtMediaExp.setText("" + (1 / Float.parseFloat(txtFrecuenciaExp.getText())));
                    } else if (txtMediaExp.getText().compareTo("") != 0) {
                        txtFrecuenciaExp.setText("" + (1 / Float.parseFloat(txtMediaExp.getText())));
                    }
                } catch (Exception e) {
                    System.out.println("" + e.getMessage());
                }
                return true;
            }
        });
    }//GEN-LAST:event_txtFrecuenciaExpFocusGained

    private void txtMediaExpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMediaExpFocusGained
        txtMediaExp.setInputVerifier(new InputVerifier() {
            public boolean verify(JComponent input) {
                try {
                    if (txtMediaExp.getText().compareTo("") != 0) {
                        txtFrecuenciaExp.setText("" + (1 / Float.parseFloat(txtMediaExp.getText())));
                    } else if (txtFrecuenciaExp.getText().compareTo("") != 0) {
                        txtMediaExp.setText("" + (1 / Float.parseFloat(txtFrecuenciaExp.getText())));
                    }
                } catch (Exception e) {
                    System.out.println("" + e.getMessage());
                }
                return true;
            }
        });
    }//GEN-LAST:event_txtMediaExpFocusGained

    private void txtFrecuenciaPoiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFrecuenciaPoiFocusGained
        txtFrecuenciaPoi.setInputVerifier(new InputVerifier() {
            public boolean verify(JComponent input) {
                try {
                    if (txtFrecuenciaPoi.getText().compareTo("") != 0) {
                        txtMediaPoi.setText("" + (1 / Float.parseFloat(txtFrecuenciaPoi.getText())));
                    } else if (txtMediaPoi.getText().compareTo("") != 0) {
                        txtFrecuenciaPoi.setText("" + (1 / Float.parseFloat(txtMediaPoi.getText())));
                    }
                } catch (Exception e) {
                    System.out.println("" + e.getMessage());
                }
                return true;
            }
        });
    }//GEN-LAST:event_txtFrecuenciaPoiFocusGained

    private void txtMediaPoiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMediaPoiFocusGained
        txtMediaPoi.setInputVerifier(new InputVerifier() {
            public boolean verify(JComponent input) {
                try {
                    if (txtMediaPoi.getText().compareTo("") != 0) {
                        txtFrecuenciaPoi.setText("" + (1 / Float.parseFloat(txtMediaPoi.getText())));
                    } else if (txtFrecuenciaPoi.getText().compareTo("") != 0) {
                        txtMediaPoi.setText("" + (1 / Float.parseFloat(txtFrecuenciaPoi.getText())));
                    }
                } catch (Exception e) {
                    System.out.println("" + e.getMessage());
                }
                return true;
            }
        });
    }//GEN-LAST:event_txtMediaPoiFocusGained

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    CardLayout cl;
    CongruencialMixto generador;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private java.awt.Canvas canvas1;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JComboBox cmbDistribucion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblDistribucion;
    private javax.swing.JLabel lblFrecuenciaExp;
    private javax.swing.JLabel lblFrecuenciaNormal;
    private javax.swing.JLabel lblFrecuenciaPoi;
    private javax.swing.JLabel lblIntervaloDesde;
    private javax.swing.JLabel lblIntervaloHasta;
    private javax.swing.JLabel lblIntervaloHasta1;
    private javax.swing.JLabel lblMediaExp;
    private javax.swing.JLabel lblMediaPoi;
    private javax.swing.JLabel lblVarianza;
    private javax.swing.JPanel panelExponencial;
    private javax.swing.JPanel panelGenerar;
    private javax.swing.JPanel panelNormal;
    private javax.swing.JPanel panelPoisson;
    private javax.swing.JPanel panelUniforme;
    private javax.swing.JTextPane txtCantidad;
    private javax.swing.JTextPane txtFrecuenciaExp;
    private javax.swing.JTextPane txtFrecuenciaNormal;
    private javax.swing.JTextPane txtFrecuenciaPoi;
    private javax.swing.JTextPane txtIntervaloDesde;
    private javax.swing.JTextPane txtIntervaloHasta;
    private javax.swing.JTextPane txtMediaExp;
    private javax.swing.JTextPane txtMediaPoi;
    private javax.swing.JTextPane txtVarianza;
    // End of variables declaration//GEN-END:variables
}
