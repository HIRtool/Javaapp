
package hirgroep11;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;





public class GuiEXAMENINPLANNEN extends javax.swing.JFrame {

    private int slotInBehandeling = 0;
    private List<ExamenSessie> examenSessiesTePlannen = new ArrayList<>();
    private int examenSessiesInBehandeling = 0;
    
    public GuiEXAMENINPLANNEN() {
        initComponents();
        OpleidingSubmit.setEnabled(false);
        ExamenSubmit.setEnabled(false);
        SlotSubmit.setEnabled(false);
        LokaalSubmit.setEnabled(false);
        SurveillantenSubmit.setEnabled(false);
        SemesterSubmit.setEnabled(false);
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
        OpleidingSubmit = new javax.swing.JButton();
        ExamenSubmit = new javax.swing.JButton();
        SoortExamen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        slotLijst = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        lokaalLijst = new javax.swing.JList<>();
        LokaalSubmit = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        aantalTeKiezenSlots = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        MaxStudentenPerSlot = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        SurveillantenList = new javax.swing.JList<>();
        SurveillantenSubmit = new javax.swing.JButton();
        ButtonKeerTerugNaarMenu = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        SemesterLijst = new javax.swing.JList<>();
        SemesterSubmit = new javax.swing.JButton();

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

        jLabel8.setText("Semester:");

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

        OpleidingSubmit.setText("submit");
        OpleidingSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpleidingSubmitActionPerformed(evt);
            }
        });

        ExamenSubmit.setText("submit");
        ExamenSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExamenSubmitActionPerformed(evt);
            }
        });

        jLabel5.setText("Slot:");

        slotLijst.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane4.setViewportView(slotLijst);

        jLabel10.setText("Lokaal:");

        jScrollPane5.setViewportView(lokaalLijst);

        LokaalSubmit.setText("Submit");
        LokaalSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LokaalSubmitActionPerformed(evt);
            }
        });

        jLabel11.setText("Aantal te kiezen slots:");

        jLabel12.setText("Max studenten per slot:");

        jLabel13.setText("Surveillanten:");

        jScrollPane6.setViewportView(SurveillantenList);

        SurveillantenSubmit.setText("Submit");
        SurveillantenSubmit.setActionCommand("");
        SurveillantenSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SurveillantenSubmitActionPerformed(evt);
            }
        });

        ButtonKeerTerugNaarMenu.setText("Keer terug naar Menu");
        ButtonKeerTerugNaarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonKeerTerugNaarMenuActionPerformed(evt);
            }
        });

        SemesterLijst.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane7.setViewportView(SemesterLijst);

        SemesterSubmit.setText("submit");
        SemesterSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemesterSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FaculteitSubmit))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(270, 270, 270)
                                        .addComponent(SemesterSubmit))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(OpleidingSubmit))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5))
                                        .addGap(5, 5, 5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SlotSubmit))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LokaalSubmit))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ExamenSubmit)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(SoortExamen)
                                            .addComponent(aantalInschrijvingen)
                                            .addComponent(VerantwoordelijkeLesgever)
                                            .addComponent(aantalTeKiezenSlots, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                            .addComponent(MaxStudentenPerSlot))))))))
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonKeerTerugNaarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SurveillantenSubmit))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FaculteitSubmit))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(OpleidingSubmit)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SemesterSubmit)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SurveillantenSubmit, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(aantalInschrijvingen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(VerantwoordelijkeLesgever, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9)
                                            .addComponent(SoortExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel11)
                                            .addComponent(aantalTeKiezenSlots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(ExamenSubmit))
                                    .addComponent(MaxStudentenPerSlot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(SlotSubmit)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(LokaalSubmit)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonKeerTerugNaarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SlotSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SlotSubmitActionPerformed
        slotInBehandeling = 0;
        try {
            List<Slot> slots = getSlots();
            int exNr = DBExamen.getExamenNr(getOpleidingsOnderdeel(), 1, getExamenNaam());
            
            if (slots.isEmpty()){
                JOptionPane.showMessageDialog(this, "Nog geen slots gekozen" , "Foute Slotkeuze", JOptionPane.WARNING_MESSAGE);
            } else if(slots.size()!=calculateAantalTeKiezenSlots()){
                JOptionPane.showMessageDialog(this, "Verkeerd aantal slots gekozen" , "Foute Slotkeuze", JOptionPane.WARNING_MESSAGE);
            } else if(!zijnSlotsAaneensluitend(slots)){
                JOptionPane.showMessageDialog(this, "Slots zijn niet aaneensluitend" , "Foute Slotkeuze", JOptionPane.WARNING_MESSAGE);
            } else {
                DBExamenToegewezen.SlotToewijzen(exNr, slots);
                setLokaalLijst(slots.get(slotInBehandeling).getSlotNr());
                LokaalSubmit.setEnabled(true);
                FaculteitSubmit.setEnabled(false);
                OpleidingSubmit.setEnabled(false);
                ExamenSubmit.setEnabled(false);
                SlotSubmit.setEnabled(false);
                SemesterSubmit.setEnabled(false);
                ButtonKeerTerugNaarMenu.setEnabled(false);
            }
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
     try{  
        setOpleidingenLijst(FaculteitLijst.getSelectedValue());
        OpleidingSubmit.setEnabled(true);
     } catch(DBException e){
         System.out.println("ERROR");
     }
     
       
    }//GEN-LAST:event_FaculteitSubmitActionPerformed

    private void OpleidingSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpleidingSubmitActionPerformed
        /*try {
        String opleidingsnaam = getOpleiding();
        setSemesterLijst(opleidingsnaam);
        
        } catch(DBException e){
            System.out.println("ERROR");
        }*/
           Opleiding opleiding = getOpleiding();
        try {
            setSemesterLijst(opleiding);
            SemesterSubmit.setEnabled(true);
        } catch(DBException e){
            System.out.println("ERROR");
        }

        
        
        
    }//GEN-LAST:event_OpleidingSubmitActionPerformed

    private void ExamenSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExamenSubmitActionPerformed
       String opleidingsOnderdeel = getOpleidingsOnderdeel();
       Examen ex = getGeselecteerdExamen();
       String opleiding = getOpleiding().getOplNaam();
       int sem = getSemester();
        try{ 
        setAantalStudenten();
        setVerantwoordelijkeLesgever();
        setSoortExamen();
        setSlotlijst(opleiding, sem);
        setAantalTeKiezenSlots();
        setMaxStudentenPerSlot();
        SlotSubmit.setEnabled(true);
       } catch (DBException e){
           System.out.println("ERROR");
       } catch (Exception ex1) {
            Logger.getLogger(GuiEXAMENINPLANNEN.class.getName()).log(Level.SEVERE, null, ex1);
        }
    }//GEN-LAST:event_ExamenSubmitActionPerformed

    private void LokaalSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LokaalSubmitActionPerformed
        try {
            List<Slot> slots = getSlots();
            int exNr = ExamenLijst.getSelectedValue().getExNr();
            if (lokalenBoeken(getLokalen(), calculateAantalStudentenExamen(), slots.get(slotInBehandeling).getSlotNr(), exNr)){
                slotInBehandeling++;

                if (slotInBehandeling < slots.size()){
                        setLokaalLijst(slots.get(slotInBehandeling).getSlotNr());
                        JOptionPane.showMessageDialog(this, "Kies het lokaal voor het " + (slotInBehandeling+1) + "e slot" , "Lokaal toewijzen", JOptionPane.PLAIN_MESSAGE);
                } else {
                    if (ExamenLijst.getSelectedValue() instanceof SchriftelijkExamen){
                        examenSessiesInBehandeling = 0;
                     JOptionPane.showMessageDialog(this, "Kies " + calculateAantalNodigeSurveillanten(examenSessiesTePlannen.get(examenSessiesInBehandeling)) + " surveillanten voor examensessie " + (examenSessiesInBehandeling+1) + ".", "surveillanten toewijzen", JOptionPane.PLAIN_MESSAGE);
                     setAssistentenLijst(examenSessiesTePlannen.get(examenSessiesInBehandeling).getSlotNr());
                     SurveillantenSubmit.setEnabled(true);
                     SlotSubmit.setEnabled(false);
                     LokaalSubmit.setEnabled(false);
                     ButtonKeerTerugNaarMenu.setEnabled(false);
                    } else {
                        // desabled weer alle knoppen en maakt de nodige lijsten weer leeg.
                        SurveillantenSubmit.setEnabled(false);
                        FaculteitSubmit.setEnabled(true);
                        OpleidingSubmit.setEnabled(true);
                        ExamenSubmit.setEnabled(true);
                        ButtonKeerTerugNaarMenu.setEnabled(true);
                        LokaalSubmit.setEnabled(false);
                        SemesterSubmit.setEnabled(true);
                        slotLijst.setModel(new DefaultListModel<Slot>());
                        lokaalLijst.setModel(new DefaultListModel<Lokaal>());
                        SurveillantenList.setModel(new DefaultListModel<Assistent>());
                        aantalInschrijvingen.setText("");
                        VerantwoordelijkeLesgever.setText("");
                        SoortExamen.setText("");
                        aantalTeKiezenSlots.setText("");
                        MaxStudentenPerSlot.setText("");
                        examenSessiesInBehandeling = 0;
                        slotInBehandeling = 0;
                        examenSessiesTePlannen.clear();
                        JOptionPane.showMessageDialog(this, "Geen Surveillanten nodig. Examen is succesvol ingepland.");
                        setExamenLijst(getSemester(), getOpleiding());
                    }
                     
                }
            }
           
        } catch (DBException ex) {
            Logger.getLogger(GuiEXAMENINPLANNEN.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GuiEXAMENINPLANNEN.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_LokaalSubmitActionPerformed

    private void SurveillantenSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SurveillantenSubmitActionPerformed
        try {
            ExamenSessie es = examenSessiesTePlannen.get(examenSessiesInBehandeling);
            List<Assistent> geselecteerdeAssistenten = SurveillantenList.getSelectedValuesList();
            if (surveillantieToewijzen(es, geselecteerdeAssistenten)){
                examenSessiesInBehandeling++;
                if(examenSessiesInBehandeling < examenSessiesTePlannen.size()){
                    setAssistentenLijst(examenSessiesTePlannen.get(examenSessiesInBehandeling).getSlotNr());
                    JOptionPane.showMessageDialog(this, "Kies " + calculateAantalNodigeSurveillanten(examenSessiesTePlannen.get(examenSessiesInBehandeling)) + " surveillanten voor examensessie " + (examenSessiesInBehandeling+1) + ".", "surveillanten toewijzen", JOptionPane.PLAIN_MESSAGE);
                }
                else {
                    examenSessiesInBehandeling = 0;
                    examenSessiesTePlannen.clear();
                    // desabled weer alle knoppen en maakt de nodige lijsten weer leeg.
                    SurveillantenSubmit.setEnabled(false);
                    FaculteitSubmit.setEnabled(true);
                    OpleidingSubmit.setEnabled(true);
                    ExamenSubmit.setEnabled(true);
                    setExamenLijst(getSemester(), getOpleiding());
                    slotLijst.setModel(new DefaultListModel<Slot>());
                    lokaalLijst.setModel(new DefaultListModel<Lokaal>());
                    SurveillantenList.setModel(new DefaultListModel<Assistent>());
                    aantalInschrijvingen.setText("");
                    VerantwoordelijkeLesgever.setText("");
                    SoortExamen.setText("");
                    aantalTeKiezenSlots.setText("");
                    MaxStudentenPerSlot.setText("");
                    ButtonKeerTerugNaarMenu.setEnabled(true);
                    JOptionPane.showMessageDialog(this, "Examen is succesvol ingepland.");
                }
            }
            
        } catch (DBException ex) {
            Logger.getLogger(GuiEXAMENINPLANNEN.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GuiEXAMENINPLANNEN.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SurveillantenSubmitActionPerformed

    private void ButtonKeerTerugNaarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonKeerTerugNaarMenuActionPerformed
        this.dispose();
    }//GEN-LAST:event_ButtonKeerTerugNaarMenuActionPerformed

    private void SemesterSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemesterSubmitActionPerformed
        int sem = getSemester(); 
           Opleiding opleiding = getOpleiding();
        try {
            setExamenLijst(sem, opleiding);
            ExamenSubmit.setEnabled(true);
        } catch(DBException e){
            System.out.println("ERROR");
        }
    }//GEN-LAST:event_SemesterSubmitActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonKeerTerugNaarMenu;
    private javax.swing.JList<Examen> ExamenLijst;
    private javax.swing.JButton ExamenSubmit;
    private javax.swing.JList<Faculteit> FaculteitLijst;
    private javax.swing.JButton FaculteitSubmit;
    private javax.swing.JButton LokaalSubmit;
    private javax.swing.JTextField MaxStudentenPerSlot;
    private javax.swing.JButton OpleidingSubmit;
    private javax.swing.JList<Opleiding> OpleidingsLijst;
    private javax.swing.JList<Integer> SemesterLijst;
    private javax.swing.JButton SemesterSubmit;
    private javax.swing.JButton SlotSubmit;
    private javax.swing.JTextField SoortExamen;
    private javax.swing.JList<Assistent> SurveillantenList;
    private javax.swing.JButton SurveillantenSubmit;
    private javax.swing.JTextField VerantwoordelijkeLesgever;
    private javax.swing.JTextField aantalInschrijvingen;
    private javax.swing.JTextField aantalTeKiezenSlots;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JList<Lokaal> lokaalLijst;
    private javax.swing.JList<Slot> slotLijst;
    // End of variables declaration//GEN-END:variables

    public void setFaculteitLijst() throws DBException{
        DefaultListModel dlm = new DefaultListModel();
        for(Faculteit f: DBFaculteit.getFaculteiten()){
            dlm.addElement(f);
        }
        FaculteitLijst.setModel(dlm);
    }
   public void setSemesterLijst(Opleiding opl) throws DBException{
       DefaultListModel semesterLijst = new DefaultListModel();
       for (int i = 1; i <= (DBOpleiding.getOpleidingsduur(opl)*2)  ; i++) {
           semesterLijst.addElement(i);
           
       } 
       SemesterLijst.setModel(semesterLijst);
   } 
   
    public int getSemester(){
        return SemesterLijst.getSelectedValue();
    }
    public void setOpleidingenLijst(Faculteit faculteit) throws DBException{
        DefaultListModel dlm2 = new DefaultListModel();
        for(Opleiding opl: DBOpleiding.getOpleidingen(faculteit)){
            dlm2.addElement(opl);
            
        }
        OpleidingsLijst.setModel(dlm2);
    }
    
    public Opleiding getOpleiding(){
        return OpleidingsLijst.getSelectedValue();
    }
    public void setExamenLijst(int sem, Opleiding opleiding) throws DBException{
        String opl = opleiding.getOplNaam();
        DefaultListModel dlm3 = new DefaultListModel();
        for(Examen e: DBExamen.getExamens(DBExamen.getOngeplandeExamenNrs(sem, opl, 1))){
            dlm3.addElement(e);
        }
        if (dlm3.isEmpty()){
            //Waarschuwingsbox als examenlijst leegt is
            JOptionPane.showMessageDialog(this,"Alle examens zijn al ingepland, kies een andere opleiding of een ander semester","Geen examens gevonden",JOptionPane.WARNING_MESSAGE);
        } else {
            ExamenLijst.setModel(dlm3);
        }
    }
    public void setSlotlijst(String oplNaam, int semester) throws DBException{
        DefaultListModel dlm5 = new DefaultListModel();
        ArrayList<Slot> slots = DBSlot.loadFreeSlots(oplNaam, semester, 1);
        for(Slot a : slots){
            dlm5.addElement(a);
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
    /*public String getFaculteit(){
      return FaculteitLijst.getSelectedValue();
    }*/
    
    public List<Slot> getSlots() throws DBException{
        return slotLijst.getSelectedValuesList();
        
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
    
    public boolean lokalenBoeken(List<Lokaal> lokalen, int teVerdelenStudenten, int slotNr, int exNr) throws SQLException, DBException{
        int totCapGekozenLokalen = 0;
        boolean overcapaciteit = false;
        boolean zelfdeStraat = true;
        String eersteStraat = lokalen.get(0).getAdres().getStraat();
        for (int i = 0 ; i < lokalen.size(); i++){
            Lokaal l = lokalen.get(i);
            totCapGekozenLokalen += l.getCapaciteit();
            if (!overcapaciteit)
                overcapaciteit = (i<lokalen.size() - 1 && totCapGekozenLokalen >= teVerdelenStudenten);
            if (!lokalen.get(i).getAdres().getStraat().equals(eersteStraat)){
                zelfdeStraat = false;
            }
        }
        if (!zelfdeStraat){
            JOptionPane.showMessageDialog(this,"Lokalen hebben niet hetzelfde adres","Lokaaltoewijzing error",JOptionPane.ERROR_MESSAGE);
        } else if(totCapGekozenLokalen < teVerdelenStudenten){
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
                examenSessiesTePlannen.add(new ExamenSessie(esNr, aantalStudenten, slotNr));
                DBLokaal.LokalenBoeken(lok, esNr);
            }
            return true;
        }
        return false;
    }
    
    private void setAantalTeKiezenSlots() {
        aantalTeKiezenSlots.setText(Integer.toString(calculateAantalTeKiezenSlots()));
    }
    
    public int calculateAantalTeKiezenSlots(){
        if (getGeselecteerdExamen() instanceof SchriftelijkExamen){
            return 1;
        } else {
            int aantalStudenten = getGeselecteerdExamen().getAantalStudenten();
            int maxAantalStudenten = ((MondelingExamen)getGeselecteerdExamen()).getMaxAantalStudenten();
            int aantalSlots = (int)Math.ceil(aantalStudenten/maxAantalStudenten);
            return aantalSlots;
        }
    }
    
    public int calculateAantalStudentenExamen(){
        if (getGeselecteerdExamen() instanceof SchriftelijkExamen){
            return getAantalInschrijvingen();
        } else {
            int maxAantalStudenten = ((MondelingExamen)getGeselecteerdExamen()).getMaxAantalStudenten();
            return maxAantalStudenten;
        }
    }

    private void setMaxStudentenPerSlot() {
        MaxStudentenPerSlot.setText(Integer.toString(calculateAantalStudentenExamen()));
    }

    private void setAssistentenLijst(int slotNr) throws DBException {
        DefaultListModel listSurveillanten = new DefaultListModel();
        for(Assistent assistent : DBAssistent.getVrijeAssistenten(slotNr)){
           listSurveillanten.addElement(assistent);
        }
        SurveillantenList.setModel(listSurveillanten);
    }

    private boolean surveillantieToewijzen(ExamenSessie es, List<Assistent> geselecteerdeAssistenten) throws DBException, SQLException {
        if (geselecteerdeAssistenten.size() == calculateAantalNodigeSurveillanten(es)){
            DBAssistent.surveillantieToewijzen(es, geselecteerdeAssistenten);
            return true;
        } else {
            JOptionPane.showMessageDialog(this,"Selecteer " + calculateAantalNodigeSurveillanten(es) + " surveillanten","Aantal surveillanten error",JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    private int calculateAantalNodigeSurveillanten(ExamenSessie es){
        double d = es.getAantalStudenten()/40.0;
        return (int)Math.ceil(d);
    }
    
    private boolean zijnSlotsAaneensluitend(List<Slot> slots) {
        if (slots != null && slots.size() > 1){
            Slot previousSlot = slots.get(0);
            
            for( int i = 1; i < slots.size(); i++){
                Slot currentSlot = slots.get(i);
                
                if(previousSlot.getMoment() == Slot.Moment.VoorMiddag){
                    if(!(currentSlot.getMoment() == Slot.Moment.NaMiddag && previousSlot.getDatum().equals(currentSlot.getDatum()))){
                        return false;
                    } 
                } else {
                    long verschil = currentSlot.getDatum().getTime() - previousSlot.getDatum().getTime();
                    long dagenVerschil = TimeUnit.DAYS.convert(verschil, TimeUnit.MILLISECONDS);
                    if(!(currentSlot.getMoment() == Slot.Moment.VoorMiddag && dagenVerschil == 1)){
                        return false;
                    }
                }
                previousSlot = currentSlot;
            }
            return true;
        } else
            return true;
        
    }

    private String getExamenNaam() {
        return ExamenLijst.getSelectedValue().getExNaam();
    }
}


