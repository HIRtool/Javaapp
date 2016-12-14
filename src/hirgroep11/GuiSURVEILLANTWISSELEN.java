/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hirgroep11;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author matthieu
 */
public class GuiSURVEILLANTWISSELEN extends javax.swing.JFrame {

    /**
     * Creates new form ExamenGUI2
     */
    public GuiSURVEILLANTWISSELEN() {
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

        choice1 = new java.awt.Choice();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ButtonGekozenExamenSessie = new javax.swing.JButton();
        SurveillantenLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        examenSessies = new javax.swing.JList<>();
        submitGekozenSurveillant = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        SurveillantenLijst = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        VrijeSurveillantenLijst = new javax.swing.JList<>();
        ButtonWissel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("SURVEILLANTEN WISSELEN");

        jLabel3.setText("Uw examensessies:");

        ButtonGekozenExamenSessie.setText("Submit");
        ButtonGekozenExamenSessie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGekozenExamenSessieActionPerformed(evt);
            }
        });

        SurveillantenLabel.setText("Kies surveillant:");

        examenSessies.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(examenSessies);

        submitGekozenSurveillant.setText("submit");
        submitGekozenSurveillant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitGekozenSurveillantActionPerformed(evt);
            }
        });

        SurveillantenLijst.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(SurveillantenLijst);

        jLabel1.setText("Nieuwe surveillant:");

        VrijeSurveillantenLijst.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(VrijeSurveillantenLijst);

        ButtonWissel.setText("Wissel");
        ButtonWissel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonWisselActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SurveillantenLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(submitGekozenSurveillant))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonGekozenExamenSessie)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonWissel)
                .addGap(224, 224, 224))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(SurveillantenLabel)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(submitGekozenSurveillant))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ButtonGekozenExamenSessie, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(ButtonWissel)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonGekozenExamenSessieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGekozenExamenSessieActionPerformed
        try {
            setAssistentenLijst();
        } catch (DBException ex) {
            Logger.getLogger(GuiSURVEILLANTWISSELEN.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonGekozenExamenSessieActionPerformed

    private void submitGekozenSurveillantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitGekozenSurveillantActionPerformed
        try {
            geefExamensessiesWeer();
        } catch (DBException ex) {
            Logger.getLogger(GuiSURVEILLANTWISSELEN.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_submitGekozenSurveillantActionPerformed

    private void ButtonWisselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonWisselActionPerformed
        int a = JOptionPane.showConfirmDialog(this,"Is deze assistent hiermee akkoord?","Surveillantie wisselen", JOptionPane.YES_NO_OPTION);
            if(a == JOptionPane.YES_OPTION){
                try {
                    surveillantiesWisselen();
                    JOptionPane.showMessageDialog(this, "Surveillanten succesvol gewisseld" , "Surveillantie wisselen", JOptionPane.PLAIN_MESSAGE);
                    this.dispose();
                } catch (DBException ex) {
                    Logger.getLogger(GuiSURVEILLANTWISSELEN.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                Logger.getLogger(GuiSURVEILLANTWISSELEN.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            } else {
                JOptionPane.showMessageDialog(this, "Kies een andere surveillant." , "Surveillant is niet akkoord", JOptionPane.WARNING_MESSAGE);
            }
    }//GEN-LAST:event_ButtonWisselActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonGekozenExamenSessie;
    private javax.swing.JButton ButtonWissel;
    private javax.swing.JLabel SurveillantenLabel;
    private javax.swing.JList<Assistent> SurveillantenLijst;
    private javax.swing.JList<Assistent> VrijeSurveillantenLijst;
    private java.awt.Choice choice1;
    private javax.swing.JList<ExamenSessie> examenSessies;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton submitGekozenSurveillant;
    // End of variables declaration//GEN-END:variables

    /*public int getAssistentNummer(){
        return Integer.parseInt(assistenNummer.getText());
    }*/
    
    public void geefExamensessiesWeer() throws DBException{
        DefaultListModel alleExamenSessies = new DefaultListModel();
        for (ExamenSessie s: DBAssistent.getExamensessies(SurveillantenLijst.getSelectedValue())){
            alleExamenSessies.addElement(s);
        }
        examenSessies.setModel(alleExamenSessies);
    }
       /* for (int i = 0; i < DBAssistent.getAssistent(getAssistentNummer()).getToegewezenSessies().size(); i++) {
            
           alleExamenSessies.add(DBAssistent.getAssistent(getAssistentNummer()).getToegewezenSessies().get(i).getSlot().toString());
            
        }
        return alleExamenSessies;
        }*/
    
    /*public void setExamenSessies() throws DBException{
        DefaultListModel dlm = new DefaultListModel();
        for(ExamenSessie a : geefExamensessiesWeer()){
            dlm.addElement(a);
        }
        examenSessies.setModel(dlm);
    }*/
    /*public ExamenSessie getTeWisselenExamenSessie() throws DBException{
        String a= examenSessies.getSelectedValue();
        for(Assistent b: DBAssistent.getAssistenten()){
            for(ExamenSessie c : b.getToegewezenSessies()){
                if(c.toString().equals(a)){
                    return c;
    }
            }
        }
        return null;
    }*/
    public ExamenSessie getTeWisselenExamenSessie(){
       return examenSessies.getSelectedValue();
        
    }

    public void setSurveillantenLijst() throws DBException{
        DefaultListModel surveillantenLijst = new DefaultListModel();
        for(Assistent a: DBAssistent.getBezetteAssistenten()){
            surveillantenLijst.addElement(a);
        }
        SurveillantenLijst.setModel(surveillantenLijst);
    }
    
    private void setAssistentenLijst() throws DBException {
        DefaultListModel listSurveillanten = new DefaultListModel();
        int slotNr = examenSessies.getSelectedValue().getSlotNr();
        for(Assistent assistent : DBAssistent.getVrijeAssistenten(slotNr)){
           listSurveillanten.addElement(assistent);
        }
        VrijeSurveillantenLijst.setModel(listSurveillanten);
    }

    private void surveillantiesWisselen() throws DBException, SQLException {
        ExamenSessie es = examenSessies.getSelectedValue();
        Assistent aWeg = SurveillantenLijst.getSelectedValue();
        Assistent aNieuw = VrijeSurveillantenLijst.getSelectedValue();
        DBAssistent.surveillantieWisselen(es, aWeg, aNieuw);
    }

    
}