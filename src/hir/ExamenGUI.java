/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hir;

import java.util.HashSet;

/**
 *
 * @author matthieu
 */
public class ExamenGUI extends javax.swing.JFrame {

    private HashSet<Opleiding> opleidingen;
    public ExamenGUI() {
        initComponents();
        this.opleidingen = new HashSet<>();
    }
    public void addOpleidingsOnderdeel(Opleiding b, Opleidingsonderdeel a){
       b.addOpleidingsOnderdeel(a);
       choice2.addItem(a.getOplOndNaam());
    }
    public void OpleidingToevoegen(Opleiding a ){
        opleidingen.add(a);
        choice1.addItem(a.getOplNaam());
    }
    
    public HashSet<Opleiding> getOpleidingen() {
        return opleidingen;
    }

    public void setOpleidingen(HashSet<Opleiding> opleidingen) {
        this.opleidingen = opleidingen;
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        choice1 = new java.awt.Choice();
        jLabel2 = new javax.swing.JLabel();
        choice2 = new java.awt.Choice();
        jButton1 = new javax.swing.JButton();
        EersteSemester = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        inschrijvingen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ModelTrajectjaar = new java.awt.Choice();
        label1 = new java.awt.Label();
        verantwoordelijkeLesgever = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Opleiding:");

        jLabel2.setText("Opleidingsonderdelen: ");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(EersteSemester);
        EersteSemester.setText("1ste semester");
        EersteSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EersteSemesterActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("2de semester");

        jLabel3.setText("EXAMENSESSIE");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Jaarvak");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Aantal inschrijvingen:");

        inschrijvingen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inschrijvingenActionPerformed(evt);
            }
        });

        jLabel5.setText("Modeltrajectjaar:");

        label1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        label1.setText("Verantwoordelijke lesgever");

        verantwoordelijkeLesgever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verantwoordelijkeLesgeverActionPerformed(evt);
            }
        });

        jLabel6.setText("Examenkans: ");

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("1ste");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("jRadioButton4");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(85, 85, 85)
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addComponent(jRadioButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(66, 66, 66)
                                .addComponent(inschrijvingen)
                                .addGap(44, 44, 44))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EersteSemester)
                                .addGap(38, 38, 38)
                                .addComponent(jRadioButton3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(choice2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(choice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ModelTrajectjaar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(verantwoordelijkeLesgever))
                                .addGap(98, 98, 98))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButton1)
                            .addComponent(jButton1))))
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(ModelTrajectjaar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(choice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addComponent(verantwoordelijkeLesgever, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inschrijvingen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton4))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EersteSemester)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton1))
                .addGap(21, 21, 21)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      ExamenGUI2 b = new  ExamenGUI2();
      b.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void EersteSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EersteSemesterActionPerformed
      
    }//GEN-LAST:event_EersteSemesterActionPerformed

    private void inschrijvingenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inschrijvingenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inschrijvingenActionPerformed

    private void verantwoordelijkeLesgeverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verantwoordelijkeLesgeverActionPerformed
     
              
    }//GEN-LAST:event_verantwoordelijkeLesgeverActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed
    public void GeefProfWeer(){
        
        
    } 
    
    public int getAantalInschrijvingen(){
        return (new Integer(inschrijvingen.getText().trim()).intValue());
    }
    public static void main(String args[]) {
         ExamenGUI c = new ExamenGUI();
        Opleiding a = new Opleiding("economie", 15, 2);
        Opleiding b = new Opleiding("wiskunde", 30, 5);
         c.OpleidingToevoegen(a);
        c.OpleidingToevoegen(b);
        Prof e = new Prof(15, "mark");
        Opleidingsonderdeel d = new Opleidingsonderdeel("wiskunde1", 2, 2, 2, e);
        Opleidingsonderdeel f = new Opleidingsonderdeel("wiskunde3", 2, 2, 2, e);
        Opleidingsonderdeel g = new Opleidingsonderdeel("chemie1", 2, 2, 2, e);
        Opleidingsonderdeel h = new Opleidingsonderdeel("chemie2", 2, 2, 2, e);
        c.addOpleidingsOnderdeel(a, d);
        c.addOpleidingsOnderdeel(a, f);
        c.addOpleidingsOnderdeel(b, g);
        c.addOpleidingsOnderdeel(b, h);
        
        
       
       
        
        
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamenGUI().setVisible(true);
            }
        });
    }
    public String getOpleidingsOnderdeel(Opleiding a ){
        for(Opleidingsonderdeel b : a.getOpleidingsOnderdelen()){
            return b.getOplOndNaam();
        }
        return null;
    }
    
    
    public void GeefOpleidingsonderdelen(){
        for(Opleiding a: getOpleidingen()){
            if(choice1.getSelectedItem().equals(a.getOplNaam())){
                choice2.addItem(getOpleidingsOnderdeel(a));
                
            }
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton EersteSemester;
    private java.awt.Choice ModelTrajectjaar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private java.awt.Choice choice1;
    private java.awt.Choice choice2;
    private javax.swing.JTextField inschrijvingen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private java.awt.Label label1;
    private javax.swing.JTextField verantwoordelijkeLesgever;
    // End of variables declaration//GEN-END:variables
}
