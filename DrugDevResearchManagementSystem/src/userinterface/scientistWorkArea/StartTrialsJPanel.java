/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */
package userinterface.scientistWorkArea;

import business.Ecosystem;
import business.drug.Drug;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.patient.Patient;
import business.userAcoount.UserAccount;
import business.vitalsigns.VitalSigns;
import business.workqueue.StudyWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ujjval
 */
public class StartTrialsJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    Ecosystem business;
    private Drug drug;
    private UserAccount account;
    private Organization organization;
    private StudyWorkRequest req;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    StartTrialsJPanel(JPanel userProcessContainer, Enterprise enterprise, Ecosystem business, UserAccount account, Organization org, Drug d, StudyWorkRequest req) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.business = business;
        this.account = account;
        this.organization = org;
        this.req = req;
        this.drug = d;
        jTextFieldDrug.setText(drug.toString());
        populateTable();
    }
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) drugJTable.getModel();
        model.setRowCount(0);
        Object row[] = new Object[6];
        row[0] = drug.getDrugNumber();
        row[1] = drug;
        row[2] = drug.getClinicalTrialStatus();
        row[3] = req.getStudy().getRecruitmentStatus();
        row[4] = req;
        row[5] = req.getStudy().getPhase();
        model.addRow(row);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJBtn = new javax.swing.JButton();
        headerJlbl = new javax.swing.JLabel();
        jTextFieldDrug = new javax.swing.JTextField();
        numberOfPatientJlbl = new javax.swing.JLabel();
        requestPatientJBtn = new javax.swing.JButton();
        jTextFieldpatientNum = new javax.swing.JTextField();
        drugNameJlbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        drugJTable = new javax.swing.JTable();
        updateTrialStatusJBtn = new javax.swing.JButton();
        administerDrugJBtn = new javax.swing.JButton();
        step1Jbl = new javax.swing.JLabel();
        step2Jbl = new javax.swing.JLabel();
        step3Jbl = new javax.swing.JLabel();
        step4Jbl = new javax.swing.JLabel();
        viewStatusJButton = new javax.swing.JButton();
        statusJComboBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJBtn.setFont(new java.awt.Font("Levenim MT", 1, 12)); // NOI18N
        backJBtn.setText("<<Back");
        backJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJBtnActionPerformed(evt);
            }
        });
        add(backJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 120, -1));

        headerJlbl.setFont(new java.awt.Font("Levenim MT", 1, 24)); // NOI18N
        headerJlbl.setForeground(new java.awt.Color(0, 204, 204));
        headerJlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerJlbl.setText("                  Start Trials");
        add(headerJlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 370, -1));
        add(jTextFieldDrug, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 180, 30));

        numberOfPatientJlbl.setFont(new java.awt.Font("Levenim MT", 1, 12)); // NOI18N
        numberOfPatientJlbl.setForeground(new java.awt.Color(0, 204, 204));
        numberOfPatientJlbl.setText("Number of Patients Required      :");
        add(numberOfPatientJlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 230, -1));

        requestPatientJBtn.setFont(new java.awt.Font("Levenim MT", 1, 12)); // NOI18N
        requestPatientJBtn.setText("Request Patients");
        requestPatientJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestPatientJBtnActionPerformed(evt);
            }
        });
        add(requestPatientJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 190, -1));
        add(jTextFieldpatientNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 180, 30));

        drugNameJlbl.setFont(new java.awt.Font("Levenim MT", 1, 12)); // NOI18N
        drugNameJlbl.setForeground(new java.awt.Color(0, 204, 204));
        drugNameJlbl.setText("Drug Name                                    :");
        add(drugNameJlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 230, -1));

        drugJTable.setFont(new java.awt.Font("Levenim MT", 1, 12)); // NOI18N
        drugJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug ID", "Drug Name", "Clinical Trial Status", "Recruitement Status", "StudyName", "Study Phase"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(drugJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 780, 140));

        updateTrialStatusJBtn.setFont(new java.awt.Font("Levenim MT", 1, 12)); // NOI18N
        updateTrialStatusJBtn.setText("Update Trial Status");
        updateTrialStatusJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTrialStatusJBtnActionPerformed(evt);
            }
        });
        add(updateTrialStatusJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, -1, 30));

        administerDrugJBtn.setFont(new java.awt.Font("Levenim MT", 1, 12)); // NOI18N
        administerDrugJBtn.setText("Administer Drug");
        administerDrugJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                administerDrugJBtnActionPerformed(evt);
            }
        });
        add(administerDrugJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 190, -1));

        step1Jbl.setFont(new java.awt.Font("Levenim MT", 1, 12)); // NOI18N
        step1Jbl.setForeground(new java.awt.Color(0, 204, 204));
        step1Jbl.setText("Step1:");
        add(step1Jbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        step2Jbl.setFont(new java.awt.Font("Levenim MT", 1, 12)); // NOI18N
        step2Jbl.setForeground(new java.awt.Color(0, 204, 204));
        step2Jbl.setText("Step2:");
        add(step2Jbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        step3Jbl.setFont(new java.awt.Font("Levenim MT", 1, 12)); // NOI18N
        step3Jbl.setForeground(new java.awt.Color(0, 204, 204));
        step3Jbl.setText("Step3:");
        add(step3Jbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        step4Jbl.setFont(new java.awt.Font("Levenim MT", 1, 12)); // NOI18N
        step4Jbl.setForeground(new java.awt.Color(0, 204, 204));
        step4Jbl.setText("Step4:");
        add(step4Jbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        viewStatusJButton.setFont(new java.awt.Font("Levenim MT", 1, 12)); // NOI18N
        viewStatusJButton.setText("View Result");
        viewStatusJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStatusJButtonActionPerformed(evt);
            }
        });
        add(viewStatusJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 190, -1));

        statusJComboBox.setFont(new java.awt.Font("Levenim MT", 1, 12)); // NOI18N
        statusJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trial Passed", "Trial Failed" }));
        add(statusJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 180, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        if (component instanceof ScientistWorkAreaJPanel) {
            ScientistWorkAreaJPanel s = (ScientistWorkAreaJPanel) component;
            s.populateDrugTable();
            s.populateTable();
        }
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJBtnActionPerformed

    private void requestPatientJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestPatientJBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = drugJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row!!");
            return;
        } else if (jTextFieldpatientNum.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please provide the number of patients required!!");
            return;
        } else {
            StudyWorkRequest req = (StudyWorkRequest) drugJTable.getValueAt(selectedRow, 4);
            if ((req.getStudy().getRecruitmentStatus().equals("New"))) {
                this.req.getStudy().setRecruitmentStatus(jTextFieldpatientNum.getText() + " Patients Required!");
                this.req.getStudy().setRecruitmentNumber(Integer.parseInt(jTextFieldpatientNum.getText()));
                populateTable();
            } else {
                JOptionPane.showMessageDialog(this, "Already requested");
                return;
            }
        }
    }//GEN-LAST:event_requestPatientJBtnActionPerformed

    private void updateTrialStatusJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTrialStatusJBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = drugJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row!!");
            return;
        } else {
            Drug d = ((Drug) drugJTable.getValueAt(selectedRow, 1));
            StudyWorkRequest req = (StudyWorkRequest) drugJTable.getValueAt(selectedRow, 4);
            String status = statusJComboBox.getSelectedItem().toString();
            d.setClinicalTrialStatus(status);
            
            populateTable();
        }
    }//GEN-LAST:event_updateTrialStatusJBtnActionPerformed

    private void administerDrugJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_administerDrugJBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = drugJTable.getSelectedRow();
        StudyWorkRequest req = (StudyWorkRequest) drugJTable.getValueAt(selectedRow, 4);
        Drug d = (Drug) drugJTable.getValueAt(selectedRow, 1);
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row!!");
            return;
        } else if (req.getStudy().getRecruitmentStatus().equals("New")) {
            JOptionPane.showMessageDialog(this, "Please request for Patients!");
            return;
        } else if(req.getStudy().getRecruitmentStatus().contains("Patients Required!")){
            JOptionPane.showMessageDialog(this, "Patient not yet assigned!");
            return;
        }
        else if (d.getClinicalTrialStatus().equals("Drug Administered")) {
            JOptionPane.showMessageDialog(this, "Drug Already Administered");
            return;
        } else {
            d.setClinicalTrialStatus("Drug Administered");
            for (Patient p : req.getStudy().getPatientList()) {
                for (int i = 0; i < 2; i++) {
                    VitalSigns v = p.getVitalSignHistory().addVitals();
                    Random r1 = new Random();
                    int Low = 20;
                    int High = 100;
                    int Result1 = r1.nextInt(High - Low) + Low;
                    v.setBreathRate(Result1);
                    
                    Random r2 = new Random();
                    int Low2 = 20;
                    int High2 = 140;
                    int Result2 = r2.nextInt(High2 - Low2) + Low2;
                    v.setHeartRate(Result2);
                    
                    Random r3 = new Random();
                    int Low3 = 100;
                    int High3 = 200;
                    int Result3 = r3.nextInt(High3 - Low3) + Low3;
                    v.setHighBP(Result3);
                    
                    Random r4 = new Random();
                    int Low4 = 50;
                    int High4 = 90;
                    int Result4 = r4.nextInt(High4 - Low4) + Low4;
                    v.setLowBP(Result4);
                    
                    float minX = 2.0f;
                    float maxX = 5.0f;
                    Random rand = new Random();
                    float finalX = rand.nextFloat() * (maxX - minX) + minX;
                    v.setLDLC(finalX);
                    
                    float minY = 5.0f;
                    float maxY = 8.0f;
                    Random rand2 = new Random();
                    float finalY = rand2.nextFloat() * (maxY - minY) + minY;
                    v.setHDLC(finalY);
                }
            }
            populateTable();
        }
    }//GEN-LAST:event_administerDrugJBtnActionPerformed

    private void viewStatusJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStatusJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = drugJTable.getSelectedRow();
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row!!");
            return;
        } else if (req.getStudy().getRecruitmentStatus().equals("New")) {
            JOptionPane.showMessageDialog(this, "Patient not yet assigned!");
            return;
        } else {
            
            
            StudyWorkRequest req1 = (StudyWorkRequest) drugJTable.getValueAt(selectedRow, 4);
            ViewResultJPanel vrjp = new ViewResultJPanel(userProcessContainer, enterprise, business, account, organization, req1);
            userProcessContainer.add("ViewResultJPanel", vrjp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        

    }//GEN-LAST:event_viewStatusJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton administerDrugJBtn;
    private javax.swing.JButton backJBtn;
    private javax.swing.JTable drugJTable;
    private javax.swing.JLabel drugNameJlbl;
    private javax.swing.JLabel headerJlbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldDrug;
    private javax.swing.JTextField jTextFieldpatientNum;
    private javax.swing.JLabel numberOfPatientJlbl;
    private javax.swing.JButton requestPatientJBtn;
    private javax.swing.JComboBox<String> statusJComboBox;
    private javax.swing.JLabel step1Jbl;
    private javax.swing.JLabel step2Jbl;
    private javax.swing.JLabel step3Jbl;
    private javax.swing.JLabel step4Jbl;
    private javax.swing.JButton updateTrialStatusJBtn;
    private javax.swing.JButton viewStatusJButton;
    // End of variables declaration//GEN-END:variables

}
