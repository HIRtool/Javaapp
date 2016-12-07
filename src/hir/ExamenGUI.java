
package hir;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;





public class ExamenGUI extends javax.swing.JFrame {

    
    public ExamenGUI() {
        initComponents();
        
    }
    
    
   
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        aantalInschrijvingen = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        FaculteitLijst = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        OpleidingsLijst = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        OpleidingsonderdelenLijst = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        VerantwoordelijkeLesgever = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        semester = new javax.swing.JTextField();
        SoortExamen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        slotLijst = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Opleiding:");

        jLabel2.setText("Opleidingsonderdelen: ");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("SLOT TOEWIJZEN");

        jLabel4.setText("Aantal inschrijvingen:");

        aantalInschrijvingen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aantalInschrijvingenActionPerformed(evt);
            }
        });

        jLabel7.setText("Faculteit:");

        jScrollPane2.setViewportView(FaculteitLijst);

        jScrollPane1.setViewportView(OpleidingsLijst);

        jLabel8.setText("Semester");

        jScrollPane3.setViewportView(OpleidingsonderdelenLijst);

        jLabel9.setText("Soort examen: ");

        jLabel6.setText("Verantwoordelijkelesgever: ");

        VerantwoordelijkeLesgever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerantwoordelijkeLesgeverActionPerformed(evt);
            }
        });

        jButton2.setText("submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("submit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        semester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterActionPerformed(evt);
            }
        });

        jLabel5.setText("Slot:");

        jScrollPane4.setViewportView(slotLijst);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel3)
                .addGap(43, 552, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(aantalInschrijvingen, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VerantwoordelijkeLesgever, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton2)
                                            .addComponent(jButton3)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(jButton4))))
                            .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SoortExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(97, 97, 97)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jButton2)))
                                .addGap(51, 51, 51)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(95, 95, 95))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(121, 121, 121)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(aantalInschrijvingen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VerantwoordelijkeLesgever, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SoortExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      EXAMENGUILOKAAL a = new EXAMENGUILOKAAL();
      a.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void aantalInschrijvingenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aantalInschrijvingenActionPerformed
     
              
    }//GEN-LAST:event_aantalInschrijvingenActionPerformed

    private void VerantwoordelijkeLesgeverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerantwoordelijkeLesgeverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerantwoordelijkeLesgeverActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     try{  String faculteit = getFaculteit();
        setOpleidingenLijst(faculteit);
     } catch(DBException e){
         System.out.println("ERROR");
     }
     
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        /*try {
        String opleidingsnaam = getOpleiding();
        setSemesterLijst(opleidingsnaam);
        
        } catch(DBException e){
            System.out.println("ERROR");
        }*/
           int sem = getSemester(); 
           String opleiding = getOpleiding();
        try {
            setOpleidingsonderdelenLijst(sem, opleiding);
        } catch(DBException e){
            System.out.println("ERROR");
        }

        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       String opleidingsOnderdeel = getOpleidingsOnderdeel();
       String opleiding = getOpleiding();
       int sem = getSemester();
        try{ 
        setAantalStudenten(opleidingsOnderdeel);
        setVerantwoordelijkeLesgever(opleidingsOnderdeel);
        //setSoortExamen(opleidingsOnderdeel);
        setSlotlijst(opleiding, sem);
       } catch (DBException e){
           System.out.println("ERROR");
       }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void semesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semesterActionPerformed
    
    public void setFaculteitLijst() throws DBException{
        DefaultListModel dlm = new DefaultListModel();
        for(String a: DBFaculteit.getFaculteiten()){
            dlm.addElement(a);
        }
        FaculteitLijst.setModel(dlm);
    }
   public void setSemesterLijst(String oplNaam) throws DBException{
       DefaultListModel dlm4 = new DefaultListModel();
       for (int i = 1; i <= (DBOpleiding.getOpleidingsduur(oplNaam)*2)  ; i++) {
          
           String a = "" + i;
           dlm4.addElement(a);
           
       } 
       //modelTrajectJaarLijst.setModel(dlm4);
   } 
   
    public int getSemester(){
        return Integer.parseInt(semester.getText());
    }
    public void setOpleidingenLijst(String faculteit) throws DBException{
        DefaultListModel dlm2 = new DefaultListModel();
        for(String a: DBOpleiding.getOpleidingen(faculteit)){
            dlm2.addElement(a);
            
        }
        OpleidingsLijst.setModel(dlm2);
    }
    public String getOpleiding(){
        return OpleidingsLijst.getSelectedValue();
    }
    public void setOpleidingsonderdelenLijst(int sem, String opleiding) throws DBException{
        DefaultListModel dlm3 = new DefaultListModel();
        for(String a: DBOpleidingsOnderdeel.getOpleidingsOnderdelen(sem, opleiding)){
            dlm3.addElement(a);
        }
        OpleidingsonderdelenLijst.setModel(dlm3);
    }
    public void setSlotlijst(String OplNaam, int semester) throws DBException{
        DefaultListModel dlm5 = new DefaultListModel();
        for(Slot a : DBSlot.loadSlots()){
            if(DBExamenToegewezen.slotVrijVoorOpleiding(OplNaam, semester, a)){
                dlm5.addElement(a.toString());
            }
            
        } slotLijst.setModel(dlm5);
    }
    public int getAantalInschrijvingen(){
        return Integer.parseInt(aantalInschrijvingen.getText().trim());
    }
    
    
    public String getOpleidingsOnderdeel(Opleiding a ){
        for(Opleidingsonderdeel b : a.getOpleidingsOnderdelen()){
            return b.getOplOndNaam();
        }
        return null;
    }
    public String getFaculteit(){
      return FaculteitLijst.getSelectedValue();
    }
       
    
    public String getOpleidingsOnderdeel(){
        return OpleidingsonderdelenLijst.getSelectedValue();
                }
    /*public void setSemester(String opleidingsonderdeel) throws DBException{
        Semester.setText(Integer.toString(DBOpleidingsOnderdeel.getSemester(opleidingsonderdeel)));
    }*/
    public void setAantalStudenten(String opleidingsonderdeel) throws DBException{
       aantalInschrijvingen.setText(Integer.toString(DBOpleidingsOnderdeel.getAantalStudenten(opleidingsonderdeel)));
       
    }
    public void setVerantwoordelijkeLesgever(String opleidingsonderdeel) throws DBException{
         VerantwoordelijkeLesgever.setText(DBOpleidingsOnderdeel.getVerantwoordelijkeLesgever(opleidingsonderdeel));
    }
    
    public void setSoortExamen(String oplOndNaam) throws DBException{
        SoortExamen.setText(DBExamen.getSoortExamen(oplOndNaam));
    }
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> FaculteitLijst;
    private javax.swing.JList<String> OpleidingsLijst;
    private javax.swing.JList<String> OpleidingsonderdelenLijst;
    private javax.swing.JTextField SoortExamen;
    private javax.swing.JTextField VerantwoordelijkeLesgever;
    private javax.swing.JTextField aantalInschrijvingen;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField semester;
    private javax.swing.JList<String> slotLijst;
    // End of variables declaration//GEN-END:variables
}


