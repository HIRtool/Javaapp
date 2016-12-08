
package hir;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;





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
        SlotSubmit = new javax.swing.JButton();
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
        ExamenLijst = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        VerantwoordelijkeLesgever = new javax.swing.JTextField();
        FaculteitSubmit = new javax.swing.JButton();
        OpleidingEnSemesterSubmit = new javax.swing.JButton();
        OpleidingsOnderdeelSubmit = new javax.swing.JButton();
        semester = new javax.swing.JTextField();
        SoortExamen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        slotLijst = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        lokaalLijst = new javax.swing.JList<>();
        LokaalSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Opleiding:");

        jLabel2.setText("Examens:");

        SlotSubmit.setText("Submit");
        SlotSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlotSubmitActionPerformed(evt);
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

        OpleidingsLijst.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(OpleidingsLijst);

        jLabel8.setText("Semester");

        ExamenLijst.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(ExamenLijst);

        jLabel9.setText("Soort examen: ");

        jLabel6.setText("Verantwoordelijkelesgever: ");

        VerantwoordelijkeLesgever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerantwoordelijkeLesgeverActionPerformed(evt);
            }
        });

        FaculteitSubmit.setText("submit");
        FaculteitSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FaculteitSubmitActionPerformed(evt);
            }
        });

        OpleidingEnSemesterSubmit.setText("submit");
        OpleidingEnSemesterSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpleidingEnSemesterSubmitActionPerformed(evt);
            }
        });

        OpleidingsOnderdeelSubmit.setText("submit");
        OpleidingsOnderdeelSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpleidingsOnderdeelSubmitActionPerformed(evt);
            }
        });

        semester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterActionPerformed(evt);
            }
        });

        jLabel5.setText("Slot:");

        slotLijst.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane4.setViewportView(slotLijst);

        jLabel10.setText("Lokaal");

        jScrollPane5.setViewportView(lokaalLijst);

        LokaalSubmit.setText("Submit");
        LokaalSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LokaalSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(153, 153, 153)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(182, 182, 182)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FaculteitSubmit)
                                    .addComponent(OpleidingEnSemesterSubmit)))
                            .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OpleidingsOnderdeelSubmit))
                            .addComponent(VerantwoordelijkeLesgever, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aantalInschrijvingen, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SoortExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LokaalSubmit))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(53, 53, 53)
                                    .addComponent(SlotSubmit))))))
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                                    .addComponent(OpleidingEnSemesterSubmit)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(FaculteitSubmit)))
                                .addGap(51, 51, 51)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(OpleidingsOnderdeelSubmit)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(aantalInschrijvingen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(VerantwoordelijkeLesgever, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(SoortExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(SlotSubmit)
                        .addGap(110, 110, 110)
                        .addComponent(LokaalSubmit)
                        .addGap(128, 128, 128))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SlotSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SlotSubmitActionPerformed
        try {
            Slot a = getSlot();
            int exNr = DBExamen.getExamenNr(getOpleidingsOnderdeel(), 1);
            DBExamenToegewezen.SlotToewijzen(exNr, a);
            setLokaalLijst(a.getSlotNr());
            
        } catch (DBException ex) {
            System.out.println("ERROR");
        } catch (SQLException ex) {
            System.out.println("ERROR while writing to DB");
        }
        
    }//GEN-LAST:event_SlotSubmitActionPerformed

    private void aantalInschrijvingenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aantalInschrijvingenActionPerformed
     
              
    }//GEN-LAST:event_aantalInschrijvingenActionPerformed

    private void VerantwoordelijkeLesgeverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerantwoordelijkeLesgeverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerantwoordelijkeLesgeverActionPerformed

    private void FaculteitSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FaculteitSubmitActionPerformed
     try{  String faculteit = getFaculteit();
        setOpleidingenLijst(faculteit);
     } catch(DBException e){
         System.out.println("ERROR");
     }
     
       
    }//GEN-LAST:event_FaculteitSubmitActionPerformed

    private void OpleidingEnSemesterSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpleidingEnSemesterSubmitActionPerformed
        /*try {
        String opleidingsnaam = getOpleiding();
        setSemesterLijst(opleidingsnaam);
        
        } catch(DBException e){
            System.out.println("ERROR");
        }*/
           int sem = getSemester(); 
           String opleiding = getOpleiding();
        try {
            setExamenLijst(sem, opleiding);
        } catch(DBException e){
            System.out.println("ERROR");
        }

        
        
        
    }//GEN-LAST:event_OpleidingEnSemesterSubmitActionPerformed

    private void OpleidingsOnderdeelSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpleidingsOnderdeelSubmitActionPerformed
       String opleidingsOnderdeel = getOpleidingsOnderdeel();
       Examen ex = getGeselecteerdExamen();
       String opleiding = getOpleiding();
       int sem = getSemester();
        try{ 
        setAantalStudenten();
        setVerantwoordelijkeLesgever();
        setSoortExamen();
        setSlotlijst(opleiding, sem);
       } catch (DBException e){
           System.out.println("ERROR");
       } catch (Exception ex1) {
            Logger.getLogger(ExamenGUI.class.getName()).log(Level.SEVERE, null, ex1);
        }
    }//GEN-LAST:event_OpleidingsOnderdeelSubmitActionPerformed

    private void semesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semesterActionPerformed

    private void LokaalSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LokaalSubmitActionPerformed
        Slot a;
        try {
            a = getSlot();
            int exNr = DBExamen.getExamenNr(getOpleidingsOnderdeel(), 1);
            lokalenBoeken(getLokalen(), getAantalInschrijvingen(), a.getSlotNr(), exNr);
        } catch (DBException ex) {
            Logger.getLogger(ExamenGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ExamenGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_LokaalSubmitActionPerformed
    
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
    public void setExamenLijst(int sem, String opleiding) throws DBException{
        DefaultListModel dlm3 = new DefaultListModel();
        for(Examen e: DBExamen.getExamens(DBExamen.getOngeplandeExamenNrs(sem, opleiding, 1))){
            dlm3.addElement(e);
        }
        ExamenLijst.setModel(dlm3);
    }
    public void setSlotlijst(String oplNaam, int semester) throws DBException{
        DefaultListModel dlm5 = new DefaultListModel();
        ArrayList<Slot> slots = DBSlot.loadFreeSlots(oplNaam, semester, 1);
        for(Slot a : slots){
            dlm5.addElement(a.toString());
        } 
        slotLijst.setModel(dlm5);
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
    
    public Slot getSlot() throws DBException{
        String slotString = slotLijst.getSelectedValue();
        Slot a = DBSlot.fromString(slotString);
        return a;
    }
       
    
    public String getOpleidingsOnderdeel(){
        return ExamenLijst.getSelectedValue().getOpleidingOnderdeel().getOplOndNaam();
    }
    
    public Examen getGeselecteerdExamen(){
        return ExamenLijst.getSelectedValue();
    }
    /*public void setSemester(String opleidingsonderdeel) throws DBException{
        Semester.setText(Integer.toString(DBOpleidingsOnderdeel.getSemester(opleidingsonderdeel)));
    }*/
    public void setAantalStudenten() throws DBException{
       //aantalInschrijvingen.setText(Integer.toString(DBOpleidingsOnderdeel.getAantalStudenten(opleidingsonderdeel)));
       aantalInschrijvingen.setText(Integer.toString(getGeselecteerdExamen().getAantalStudenten()));
    }
    public void setVerantwoordelijkeLesgever() throws DBException{
         //VerantwoordelijkeLesgever.setText(DBOpleidingsOnderdeel.getVerantwoordelijkeLesgever(opleidingsonderdeel));
         VerantwoordelijkeLesgever.setText(getGeselecteerdExamen().getOpleidingOnderdeel().getVerantwoordelijkeLesgever().toString());
    }
    
    public void setSoortExamen() throws DBException, Exception{
        //SoortExamen.setText(DBExamen.getSoortExamen(oplOndNaam,1));
        if(getGeselecteerdExamen() instanceof MondelingExamen){
            SoortExamen.setText("Mondeling");
        }else if(getGeselecteerdExamen() instanceof SchriftelijkExamen){
            SoortExamen.setText("Schriftelijk");
        }else{
            throw new Exception("Type van geslecteerd examen kan niet bepaald worden");
        }
    }
    
    public List<Lokaal> getLokalen(){
       return lokaalLijst.getSelectedValuesList();
    }
    
    public void setLokaalLijst(int slotNr) throws DBException{
        
        DefaultListModel dlm2 = new DefaultListModel();
        for(Lokaal lokaal : DBLokaal.laadVrijeLokalen(slotNr)){
           
            dlm2.addElement(lokaal);
        }
        lokaalLijst.setModel(dlm2);
    }
    
    public void lokalenBoeken(List<Lokaal> lokalen, int teVerdelenStudenten, int slotNr, int exNr) throws SQLException, DBException{
        int totCapGekozenLokalen = 0;
        boolean overcapaciteit = false;
        for (int i = 0 ; i < lokalen.size(); i++){
            Lokaal l = lokalen.get(i);
            totCapGekozenLokalen += l.getCapaciteit();
            if (!overcapaciteit)
                overcapaciteit = (i<lokalen.size() - 1 && totCapGekozenLokalen >= teVerdelenStudenten);
        }
        
        if (totCapGekozenLokalen < teVerdelenStudenten){
            JOptionPane.showMessageDialog(this,"Te weinig lokalen geselecteerd","Lokaaltoewijzing error",JOptionPane.ERROR_MESSAGE);
        } else if(overcapaciteit){
            JOptionPane.showMessageDialog(this,"Te veel lokalen geselecteerd","Lokaaltoewijzing error",JOptionPane.ERROR_MESSAGE);
        } else{
            for (Lokaal lok : lokalen){
                int aantalStudenten;
                if(lok.getCapaciteit()<= teVerdelenStudenten){
                    aantalStudenten = lok.getCapaciteit();
                    teVerdelenStudenten -= lok.getCapaciteit();
                } else {
                    aantalStudenten = teVerdelenStudenten;
                }
                int esNr = DBExamenSessie.exSessieAanmaken(aantalStudenten, slotNr, exNr);
                DBLokaal.LokalenBoeken(lok, esNr);
            }
            
           
        }
        
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<Examen> ExamenLijst;
    private javax.swing.JList<String> FaculteitLijst;
    private javax.swing.JButton FaculteitSubmit;
    private javax.swing.JButton LokaalSubmit;
    private javax.swing.JButton OpleidingEnSemesterSubmit;
    private javax.swing.JList<String> OpleidingsLijst;
    private javax.swing.JButton OpleidingsOnderdeelSubmit;
    private javax.swing.JButton SlotSubmit;
    private javax.swing.JTextField SoortExamen;
    private javax.swing.JTextField VerantwoordelijkeLesgever;
    private javax.swing.JTextField aantalInschrijvingen;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList<Lokaal> lokaalLijst;
    private javax.swing.JTextField semester;
    private javax.swing.JList<String> slotLijst;
    // End of variables declaration//GEN-END:variables
}


