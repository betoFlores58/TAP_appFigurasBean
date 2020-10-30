/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itl.beans;

import javax.swing.JOptionPane;
import mx.edu.itl.prismas.PrismaRectangular;

/**
 *
 * @author geras
 */

public class JPrismaRectangularBean extends javax.swing.JPanel implements IPrismaRectangular{

    /**
     * Creates new form JPrismaRectangularBean
     */
    PrismaRectangular prisma = new PrismaRectangular();
    public JPrismaRectangularBean() {
        initComponents();
        jtxtLargo.setText ( "" + prisma.getL() );
        jtxtAncho.setText ( "" + prisma.getA() );
        jtxtAltura.setText( "" + prisma.getH() );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public JPrismaRectangularBean( double l, double a, double h ){
        this();
        prisma = new PrismaRectangular( l, a, h );
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpopPR = new javax.swing.JPopupMenu();
        jmniResetearValores = new javax.swing.JMenuItem();
        jmniAcercaDe = new javax.swing.JMenuItem();
        jlblImagenPR = new javax.swing.JLabel();
        jlblLargo = new javax.swing.JLabel();
        jtxtLargo = new javax.swing.JTextField();
        lblAncho = new javax.swing.JLabel();
        jtxtAncho = new javax.swing.JTextField();
        jlblAltura = new javax.swing.JLabel();
        jtxtAltura = new javax.swing.JTextField();

        jmniResetearValores.setText("Resetear valores");
        jmniResetearValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniResetearValoresActionPerformed(evt);
            }
        });
        jpopPR.add(jmniResetearValores);

        jmniAcercaDe.setText("Acerca de...");
        jmniAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniAcercaDeActionPerformed(evt);
            }
        });
        jpopPR.add(jmniAcercaDe);

        setComponentPopupMenu(jpopPR);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jlblImagenPR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/itl/iconos/PrismaRectangular.png"))); // NOI18N

        jlblLargo.setText("Largo:");

        jtxtLargo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtLargoFocusLost(evt);
            }
        });

        lblAncho.setText("Ancho:");

        jtxtAncho.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtAnchoFocusLost(evt);
            }
        });

        jlblAltura.setText("Altura:");

        jtxtAltura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtAlturaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlblImagenPR)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblLargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtLargo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlblAltura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAncho)
                        .addGap(9, 9, 9)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtxtAncho, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(jtxtAltura))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblLargo)
                    .addComponent(jtxtLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblImagenPR)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAncho)
                            .addComponent(jtxtAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblAltura)
                            .addComponent(jtxtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtLargoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtLargoFocusLost
        try{
            double l = Double.parseDouble( jtxtLargo.getText() );
            prisma.setL( l );
        }
        catch( Exception e ){
            JOptionPane.showMessageDialog(this, "El largo no es un valor numérico.");
            jtxtLargo.requestFocus();
        }
    }//GEN-LAST:event_jtxtLargoFocusLost

    private void jtxtAnchoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtAnchoFocusLost
        try{
            double a = Double.parseDouble( jtxtAncho.getText() );
            prisma.setA( a );
        }
        catch( Exception e ){
            JOptionPane.showMessageDialog(this, "El ancho no es un valor numérico.");
            jtxtAncho.requestFocus();
        }
    }//GEN-LAST:event_jtxtAnchoFocusLost

    private void jtxtAlturaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtAlturaFocusLost
        try{
            double h = Double.parseDouble( jtxtAltura.getText() );
            prisma.setH( h );
        }
        catch( Exception e ){
            JOptionPane.showMessageDialog(this, "La altura no es un valor numérico.");
            jtxtAltura.requestFocus();
        }
    }//GEN-LAST:event_jtxtAlturaFocusLost

    private void jmniResetearValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniResetearValoresActionPerformed
        this.setLargo ( 0.0 );
        this.setAncho ( 0.0 );
        this.setAltura( 0.0 );
    }//GEN-LAST:event_jmniResetearValoresActionPerformed

    private void jmniAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniAcercaDeActionPerformed
        JOptionPane.showMessageDialog ( 
            this,
            "JPrismaRectangularBean v1.0     \n\n"  +
            "Autores:\n\n"                   + 
            "Patricia García Almanza   "  +
            " (17130028) \n"               +
            "Juan Gerardo Gacrcía Valenzuela " +
            "(17130029) \n" +
            "Alberto Villarreal Flores " +
            "(16130067) \n\n\n"       +
            "(C) Derechos reservados 2019",
            "Acerca de",
            JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_jmniAcercaDeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlblAltura;
    private javax.swing.JLabel jlblImagenPR;
    private javax.swing.JLabel jlblLargo;
    private javax.swing.JMenuItem jmniAcercaDe;
    private javax.swing.JMenuItem jmniResetearValores;
    private javax.swing.JPopupMenu jpopPR;
    private javax.swing.JTextField jtxtAltura;
    private javax.swing.JTextField jtxtAncho;
    private javax.swing.JTextField jtxtLargo;
    private javax.swing.JLabel lblAncho;
    // End of variables declaration//GEN-END:variables

    @Override
    public double areaBase() {
        return prisma.areaBase();
    }

    @Override
    public double areaLateral() {
        return prisma.areaLateral();
    }

    @Override
    public double areaTotal() {
        return prisma.areaTotal();
    }

    @Override
    public double volumen() {
        return prisma.volumen();
    }

    @Override
    public void setLargo( double l ) {
        jtxtLargo.setText( "" + l );
        prisma.setL( l );
    }

    @Override
    public void setAncho( double a ) {
        jtxtAncho.setText( "" + a );
        prisma.setA( a );
    }

    @Override
    public void setAltura(double h) {
        jtxtAltura.setText( "" + h );
        prisma.setH( h );
    }

    @Override
    public double getLargo() {
        return prisma.getL();
    }

    @Override
    public double getAncho() {
        return prisma.getA();
    }

    @Override
    public double getAltura() {
        return prisma.getH();
    }
}