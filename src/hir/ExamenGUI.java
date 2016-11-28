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
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        choice1 = new java.awt.Choice();
        jLabel2 = new javax.swing.JLabel();
        choice2 = new java.awt.Choice();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inschrijvingen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ModelTrajectjaar = new java.awt.Choice();
        label1 = new java.awt.Label();
        verantwoordelijkeLesgever = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Opleiding:");

        jLabel2.setText("Opleidingsonderdelen: ");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("SLOT TOEWIJZEN");

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

        jLabel7.setText("Faculteit");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "item 1", "item2", "item 3" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

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
                                .addComponent(jLabel4)
                                .addGap(66, 66, 66)
                                .addComponent(inschrijvingen)
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(verantwoordelijkeLesgever)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(268, 268, 268)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(choice2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(choice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(ModelTrajectjaar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGap(98, 98, 98))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ModelTrajectjaar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(choice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(verantwoordelijkeLesgever, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inschrijvingen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      ExamenGUI2 b = new  ExamenGUI2();
      b.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void inschrijvingenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inschrijvingenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inschrijvingenActionPerformed

    private void verantwoordelijkeLesgeverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verantwoordelijkeLesgeverActionPerformed
     
              
    }//GEN-LAST:event_verantwoordelijkeLesgeverActionPerformed
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
        Prof e = new Prof(15, "mark", "Vercautern");
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
    private java.awt.Choice ModelTrajectjaar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private java.awt.Choice choice1;
    private java.awt.Choice choice2;
    private javax.swing.JTextField inschrijvingen;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JTextField verantwoordelijkeLesgever;
    // End of variables declaration//GEN-END:variables
}
