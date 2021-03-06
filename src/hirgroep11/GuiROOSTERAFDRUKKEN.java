/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hirgroep11;

import com.mindfusion.common.DateTime;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author matthieu
 */
public class GuiROOSTERAFDRUKKEN extends javax.swing.JFrame {

    /**
     * Creates new form EXAMENGUIROOSTERAFDRUKKEN
     */
    public GuiROOSTERAFDRUKKEN() throws DBException {
        initComponents();
        setFaculteitLijst();
        ButtonOpleidingSubmit.setEnabled(false);
        ButtonRoosterAfdruk.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OpleidingenLijst = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        faculteitLijst = new javax.swing.JList<>();
        ButtonFaculteitSubmit = new javax.swing.JButton();
        ButtonRoosterAfdruk = new javax.swing.JButton();
        ButtonOpleidingSubmit = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        LijstSemester = new javax.swing.JList<>();
        ButtonKeerTerugNaarMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("WAARVAN WILT U HET EXAMENROOSTER AFDRUKKEN?");

        jLabel2.setText("Opleiding: ");

        OpleidingenLijst.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(OpleidingenLijst);

        jLabel3.setText("Semester:");

        jLabel4.setText("Faculteit:");

        faculteitLijst.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(faculteitLijst);

        ButtonFaculteitSubmit.setText("submit");
        ButtonFaculteitSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFaculteitSubmitActionPerformed(evt);
            }
        });

        ButtonRoosterAfdruk.setText("Rooster weergeven");
        ButtonRoosterAfdruk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRoosterAfdrukActionPerformed(evt);
            }
        });

        ButtonOpleidingSubmit.setText("submit");
        ButtonOpleidingSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOpleidingSubmitActionPerformed(evt);
            }
        });

        LijstSemester.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(LijstSemester);

        ButtonKeerTerugNaarMenu.setText("Keer terug naar menu");
        ButtonKeerTerugNaarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonKeerTerugNaarMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonFaculteitSubmit))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonOpleidingSubmit))))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonRoosterAfdruk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                            .addComponent(ButtonKeerTerugNaarMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(ButtonFaculteitSubmit)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonOpleidingSubmit))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonRoosterAfdruk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonKeerTerugNaarMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonFaculteitSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFaculteitSubmitActionPerformed
       try{  
        setOpleidingenLijst();
        ButtonOpleidingSubmit.setEnabled(true);
     } catch(DBException e){
         System.out.println("ERROR");
     }
    }//GEN-LAST:event_ButtonFaculteitSubmitActionPerformed

    private void ButtonRoosterAfdrukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRoosterAfdrukActionPerformed
        Rooster window = new Rooster();
        List<ExamenRoosterWeergaveItem> geplandeExamens;
        try {
            geplandeExamens = DBExamen.getGeplandeExamensRooster(getOpleiding().getOplNaam(),getSemester(), 1);
            for(ExamenRoosterWeergaveItem ex : geplandeExamens){
                Calendar cal = Calendar.getInstance();
                cal.setTime(ex.getExDatum());
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH) + 1;
                int day = cal.get(Calendar.DAY_OF_MONTH);
                
                if(ex.getExMoment() == Slot.Moment.VoorMiddag){
                    window.addExamenToCalendar(new DateTime(year, month, day, 8, 0, 0), new DateTime(year, month, day, 12, 0, 0), ex.getExNaam() + "\nVoormiddag");
                } else {
                    window.addExamenToCalendar(new DateTime(year, month, day, 13, 0, 0), new DateTime(year, month, day, 17, 0, 0), ex.getExNaam() + "\nNamiddag");
                }
                
            }
        } catch (DBException ex) {
            Logger.getLogger(GuiROOSTERAFDRUKKEN.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_ButtonRoosterAfdrukActionPerformed

    private void ButtonOpleidingSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOpleidingSubmitActionPerformed
        Opleiding opleiding = getOpleiding();
        try {
            setSemesterLijst(opleiding);
            ButtonRoosterAfdruk.setEnabled(true);
        } catch(DBException e){
            System.out.println("ERROR");
        }
    }//GEN-LAST:event_ButtonOpleidingSubmitActionPerformed

    private void ButtonKeerTerugNaarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonKeerTerugNaarMenuActionPerformed
        this.dispose();
    }//GEN-LAST:event_ButtonKeerTerugNaarMenuActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonFaculteitSubmit;
    private javax.swing.JButton ButtonKeerTerugNaarMenu;
    private javax.swing.JButton ButtonOpleidingSubmit;
    private javax.swing.JButton ButtonRoosterAfdruk;
    private javax.swing.JList<Integer> LijstSemester;
    private javax.swing.JList<Opleiding> OpleidingenLijst;
    private javax.swing.JList<Faculteit> faculteitLijst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    public void setFaculteitLijst() throws DBException{
        DefaultListModel dlm = new DefaultListModel();
        for(Faculteit f: DBFaculteit.getFaculteiten()){
            dlm.addElement(f);
        }
        faculteitLijst.setModel(dlm);
    }
    public void setOpleidingenLijst() throws DBException{
        Faculteit f = faculteitLijst.getSelectedValue();
        DefaultListModel dlm2 = new DefaultListModel();
        for(Opleiding opl: DBOpleiding.getOpleidingen(f)){
            dlm2.addElement(opl);
            
        }
        OpleidingenLijst.setModel(dlm2);
    }
    
    public Opleiding getOpleiding(){
        return OpleidingenLijst.getSelectedValue();
    }
    
    public void setSemesterLijst(Opleiding opl) throws DBException{
       DefaultListModel semesterLijst = new DefaultListModel();
       for (int i = 1; i <= (DBOpleiding.getOpleidingsduur(opl)*2)  ; i++) {
           semesterLijst.addElement(i);
           
       } 
       LijstSemester.setModel(semesterLijst);
   } 
    
    public int getSemester(){
        return LijstSemester.getSelectedValue();
    }

}
