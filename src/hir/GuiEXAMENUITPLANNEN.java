/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hir;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Liesbeth
 */
public class GuiEXAMENUITPLANNEN extends javax.swing.JFrame {

    /**
     * Creates new form GuiEXAMENUITPLANNEN
     */
    public GuiEXAMENUITPLANNEN() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LijstFaculteiten = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        LijstOpleidingen = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        LijstGeplandeExamens = new javax.swing.JList<>();
        ButtonKiesFaculteit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ButtonGekozenOpleiding = new javax.swing.JButton();
        ButtonExamenSubmit = new javax.swing.JButton();
        ButtonSemesterSubmit = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        LijstSemesters = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("EXAMEN UITPLANNEN");

        jLabel2.setText("Faculteit:");

        LijstFaculteiten.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(LijstFaculteiten);

        jLabel3.setText("Opleiding:");

        LijstOpleidingen.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(LijstOpleidingen);

        jLabel4.setText("Reeds geplande examens:");

        LijstGeplandeExamens.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(LijstGeplandeExamens);

        ButtonKiesFaculteit.setText("Submit");
        ButtonKiesFaculteit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonKiesFaculteitActionPerformed(evt);
            }
        });

        jLabel5.setText("Semester:");

        ButtonGekozenOpleiding.setText("Submit");
        ButtonGekozenOpleiding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGekozenOpleidingActionPerformed(evt);
            }
        });

        ButtonExamenSubmit.setText("Verwijder examen");

        ButtonSemesterSubmit.setText("Submit");
        ButtonSemesterSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSemesterSubmitActionPerformed(evt);
            }
        });

        LijstSemesters.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(LijstSemesters);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonKiesFaculteit)
                            .addComponent(ButtonGekozenOpleiding)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ButtonExamenSubmit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonSemesterSubmit)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonKiesFaculteit, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(ButtonGekozenOpleiding)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(ButtonSemesterSubmit)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(ButtonExamenSubmit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonKiesFaculteitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonKiesFaculteitActionPerformed
        try{  
        setOpleidingenLijst(LijstFaculteiten.getSelectedValue());
        ButtonGekozenOpleiding.setEnabled(true);
     } catch(DBException e){
         System.out.println("ERROR");
     }
    }//GEN-LAST:event_ButtonKiesFaculteitActionPerformed

    private void ButtonGekozenOpleidingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGekozenOpleidingActionPerformed
        Opleiding opleiding = getOpleiding();
        try {
            setSemesterLijst(opleiding);
            ButtonSemesterSubmit.setEnabled(true);
        } catch(DBException e){
            System.out.println("ERROR");
        }

    }//GEN-LAST:event_ButtonGekozenOpleidingActionPerformed

    private void ButtonSemesterSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSemesterSubmitActionPerformed
        int sem = getSemester(); 
           Opleiding opleiding = getOpleiding();
        try {
            setExamenLijst(sem, opleiding);
            ButtonExamenSubmit.setEnabled(true);
        } catch(DBException e){
            System.out.println("ERROR");
        }
    }//GEN-LAST:event_ButtonSemesterSubmitActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(GuiEXAMENUITPLANNEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiEXAMENUITPLANNEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiEXAMENUITPLANNEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiEXAMENUITPLANNEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiEXAMENUITPLANNEN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonExamenSubmit;
    private javax.swing.JButton ButtonGekozenOpleiding;
    private javax.swing.JButton ButtonKiesFaculteit;
    private javax.swing.JButton ButtonSemesterSubmit;
    private javax.swing.JList<Faculteit> LijstFaculteiten;
    private javax.swing.JList<Examen> LijstGeplandeExamens;
    private javax.swing.JList<Opleiding> LijstOpleidingen;
    private javax.swing.JList<Integer> LijstSemesters;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables

    public void setFaculteitLijst() throws DBException{
        DefaultListModel faculteiten = new DefaultListModel();
        for(Faculteit f: DBFaculteit.getFaculteiten()){
            faculteiten.addElement(f);
        }
        LijstFaculteiten.setModel(faculteiten);
    }
    
    public void setOpleidingenLijst(Faculteit faculteit) throws DBException{
        Faculteit f = LijstFaculteiten.getSelectedValue();
        DefaultListModel opleidingen = new DefaultListModel();
        for(Opleiding opl: DBOpleiding.getOpleidingen(faculteit)){
            opleidingen.addElement(opl);
            
        }
        LijstOpleidingen.setModel(opleidingen);
    }
    
    public Opleiding getOpleiding(){
        return LijstOpleidingen.getSelectedValue();
    }
    
    public void setSemesterLijst(Opleiding opl) throws DBException{
       DefaultListModel semesterLijst = new DefaultListModel();
       for (int i = 1; i <= (DBOpleiding.getOpleidingsduur(opl)*2)  ; i++) {
           semesterLijst.addElement(i);
           
       } 
       LijstSemesters.setModel(semesterLijst);
   } 
    
    public int getSemester(){
        return LijstSemesters.getSelectedValue();
    }
    
    public void setExamenLijst(int sem, Opleiding opleiding) throws DBException{
        String opl = opleiding.getOplNaam();
        DefaultListModel dlm3 = new DefaultListModel();
        for(Examen e: DBExamen.getExamens(DBExamen.getGeplandeExamenNrs(sem, opl, 1))){
            dlm3.addElement(e);
        }
        if (dlm3.isEmpty()){
            //Waarschuwingsbox als examenlijst leegt is
            JOptionPane.showMessageDialog(this,"Er zijn nog geen ingeplande examens.","Geen examens gevonden",JOptionPane.WARNING_MESSAGE);
        } else {
            LijstGeplandeExamens.setModel(dlm3);
        }
    }
}
