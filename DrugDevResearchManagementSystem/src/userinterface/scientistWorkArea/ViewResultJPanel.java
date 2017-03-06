/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */
package userinterface.scientistWorkArea;

import business.Ecosystem;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.patient.Patient;
import business.userAcoount.UserAccount;
import business.vitalsigns.VitalSigns;
import business.workqueue.StudyWorkRequest;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Harsh
 */
public class ViewResultJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    Ecosystem business;
    UserAccount account;
    Organization org;
    StudyWorkRequest req;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public ViewResultJPanel(JPanel userProcessContainer, Enterprise enterprise, Ecosystem business, UserAccount account, Organization org, StudyWorkRequest req) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.business = business;
        this.account = account;
        this.org = org;
        this.req = req;
        populateComboBox();
        populateVitalSignComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patientComboBox = new javax.swing.JComboBox();
        viewCumulativeResult = new javax.swing.JButton();
        vitalSignResultsJPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        vitalsignComboBox = new javax.swing.JComboBox<>();
        trialSummaryjPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        summaryButton = new javax.swing.JButton();
        vitalSignJlbl = new javax.swing.JLabel();
        assignedPatientsJlbl = new javax.swing.JLabel();
        backJbtn = new javax.swing.JButton();
        trialSummaryJlbl = new javax.swing.JLabel();
        vitalSignHeaderJlbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patientComboBox.setFont(new java.awt.Font("Levenim MT", 1, 12)); // NOI18N
        patientComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(patientComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 170, -1));

        viewCumulativeResult.setFont(new java.awt.Font("Levenim MT", 1, 12)); // NOI18N
        viewCumulativeResult.setText("Show Vital Sign Result");
        viewCumulativeResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCumulativeResultActionPerformed(evt);
            }
        });
        add(viewCumulativeResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, -1, 30));

        vitalSignResultsJPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vitalSignResultsJPanel.add(jScrollPane2);

        add(vitalSignResultsJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 630, 400));

        vitalsignComboBox.setFont(new java.awt.Font("Levenim MT", 1, 12)); // NOI18N
        vitalsignComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(vitalsignComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 180, -1));

        trialSummaryjPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        trialSummaryjPanel.add(jScrollPane1);

        add(trialSummaryjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 670, 400));

        summaryButton.setFont(new java.awt.Font("Levenim MT", 1, 12)); // NOI18N
        summaryButton.setText("Display Trial Summary");
        summaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                summaryButtonActionPerformed(evt);
            }
        });
        add(summaryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 520, 270, -1));

        vitalSignJlbl.setFont(new java.awt.Font("Levenim MT", 1, 12)); // NOI18N
        vitalSignJlbl.setForeground(new java.awt.Color(0, 204, 204));
        vitalSignJlbl.setText("Vital Signs:");
        add(vitalSignJlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, -1, -1));

        assignedPatientsJlbl.setFont(new java.awt.Font("Levenim MT", 1, 12)); // NOI18N
        assignedPatientsJlbl.setForeground(new java.awt.Color(0, 204, 204));
        assignedPatientsJlbl.setText("Assigned Patients:");
        add(assignedPatientsJlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        backJbtn.setFont(new java.awt.Font("Levenim MT", 1, 12)); // NOI18N
        backJbtn.setText("<<Back");
        backJbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJbtnActionPerformed(evt);
            }
        });
        add(backJbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, -1));

        trialSummaryJlbl.setFont(new java.awt.Font("Levenim MT", 1, 24)); // NOI18N
        trialSummaryJlbl.setForeground(new java.awt.Color(0, 204, 204));
        trialSummaryJlbl.setText("Trial Summary");
        add(trialSummaryJlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 190, -1));

        vitalSignHeaderJlbl.setFont(new java.awt.Font("Levenim MT", 1, 24)); // NOI18N
        vitalSignHeaderJlbl.setForeground(new java.awt.Color(0, 204, 204));
        vitalSignHeaderJlbl.setText("Vital Sign Result");
        add(vitalSignHeaderJlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 220, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void populateVitalSignComboBox() {
        vitalsignComboBox.removeAllItems();
        vitalsignComboBox.addItem("Breath Rate");
        vitalsignComboBox.addItem("Heart Rate");
        vitalsignComboBox.addItem("High Blood Pressure");
        vitalsignComboBox.addItem("HDLC");
        vitalsignComboBox.addItem("LDLC");
        vitalsignComboBox.addItem("Low Blood Pressure");
    }


    private void viewCumulativeResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCumulativeResultActionPerformed
        Patient p = (Patient) patientComboBox.getSelectedItem();
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
        HashMap<Object, String> hmap = new HashMap<>();
        JFreeChart barChart = null;

        if (vitalsignComboBox.getSelectedItem().equals("Breath Rate")) {

            int i = 0;
            for (VitalSigns v : p.getVitalSignHistory().getVitalSignList()) {
                hmap.put(v.getBreathRate(), "Day" + i);
                i++;
            }
            Set set = hmap.entrySet();
            Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
                Map.Entry mentry = (Map.Entry) iterator.next();
                barChartData.setValue((Number) mentry.getKey(), "vital Signs", (Comparable) mentry.getValue());
            }

            barChart = ChartFactory.createBarChart("VitalSigns", "Days", "Number Of Breaths", barChartData, PlotOrientation.VERTICAL, false, true, false);

        } else if (vitalsignComboBox.getSelectedItem().equals("Heart Rate")) {

            int i = 0;
            for (VitalSigns v : p.getVitalSignHistory().getVitalSignList()) {
                hmap.put(v.getHeartRate(), "Day" + i);
                i++;
            }

            Set set = hmap.entrySet();
            Iterator iterator = set.iterator();

            while (iterator.hasNext()) {
                Map.Entry mentry = (Map.Entry) iterator.next();
                barChartData.setValue((Number) mentry.getKey(), "vital Signs", (Comparable) mentry.getValue());
            }

            barChart = ChartFactory.createBarChart("VitalSigns", "Days", "Number Of Beats/min", barChartData, PlotOrientation.VERTICAL, false, true, false);

        } else if (vitalsignComboBox.getSelectedItem().equals("High Blood Pressure")) {

            int i = 0;
            for (VitalSigns v : p.getVitalSignHistory().getVitalSignList()) {
                hmap.put(v.getHighBP(), "Day" + i);
                i++;
            }

            Set set = hmap.entrySet();
            Iterator iterator = set.iterator();

            while (iterator.hasNext()) {
                Map.Entry mentry = (Map.Entry) iterator.next();
                barChartData.setValue((Number) mentry.getKey(), "vital Signs", (Comparable) mentry.getValue());
            }

            barChart = ChartFactory.createBarChart("VitalSigns", "Days", "High Blood Pressure", barChartData, PlotOrientation.VERTICAL, false, true, false);

        } else if (vitalsignComboBox.getSelectedItem().equals("HDLC")) {
            int i = 0;

            for (VitalSigns v : p.getVitalSignHistory().getVitalSignList()) {
                hmap.put(v.getHDLC(), "Day" + i);
                i++;
            }

            Set set = hmap.entrySet();
            Iterator iterator = set.iterator();

            while (iterator.hasNext()) {
                Map.Entry mentry = (Map.Entry) iterator.next();
                barChartData.setValue((Number) mentry.getKey(), "vital Signs", (Comparable) mentry.getValue());
            }

            barChart = ChartFactory.createBarChart("VitalSigns", "Days", "HDLC", barChartData, PlotOrientation.VERTICAL, false, true, false);

        } else if (vitalsignComboBox.getSelectedItem().equals("LDLC")) {
            int i = 0;

            for (VitalSigns v : p.getVitalSignHistory().getVitalSignList()) {

                hmap.put(v.getLDLC(), "Day" + i);

                i++;
            }

            Set set = hmap.entrySet();
            Iterator iterator = set.iterator();

            while (iterator.hasNext()) {
                Map.Entry mentry = (Map.Entry) iterator.next();
                barChartData.setValue((Number) mentry.getKey(), "vital Signs", (Comparable) mentry.getValue());
            }

            barChart = ChartFactory.createBarChart("VitalSigns", "Days", "LDLC", barChartData, PlotOrientation.VERTICAL, false, true, false);

        } else if (vitalsignComboBox.getSelectedItem().equals("Low Blood Pressure")) {
            int i = 0;

            for (VitalSigns v : p.getVitalSignHistory().getVitalSignList()) {

                hmap.put(v.getLowBP(), "Day" + i);

                i++;
            }

            Set set = hmap.entrySet();
            Iterator iterator = set.iterator();

            while (iterator.hasNext()) {
                Map.Entry mentry = (Map.Entry) iterator.next();
                barChartData.setValue((Number) mentry.getKey(), "vital Signs", (Comparable) mentry.getValue());
            }

            barChart = ChartFactory.createBarChart("VitalSigns", "Days", "Low BP", barChartData, PlotOrientation.VERTICAL, false, true, false);

        }

        CategoryPlot barChrt = barChart.getCategoryPlot();
        barChrt.setRangeGridlinePaint(Color.ORANGE);

        ChartPanel barPanel = new ChartPanel(barChart);

        vitalSignResultsJPanel.removeAll();
        vitalSignResultsJPanel.add(barPanel, BorderLayout.CENTER);
        vitalSignResultsJPanel.validate();
    }//GEN-LAST:event_viewCumulativeResultActionPerformed

    private void summaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_summaryButtonActionPerformed
        // TODO add your handling code here:hr
        int sickPatients = 0;
        int improvedConditionPatients = 0;
        int breathRate = 0;
        int heartRate = 0;
        int highBp = 0;
        int lowBp = 0;
        float ldlc = 0;
        float hdlc = 0;

        for (Patient p : req.getStudy().getPatientList()) {
            int count = 0;
            for (VitalSigns v : p.getVitalSignHistory().getVitalSignList()) {
                breathRate += v.getBreathRate();
                heartRate += v.getHeartRate();
                highBp += v.getHighBP();
                lowBp += v.getLowBP();
                ldlc += v.getLDLC();
                hdlc += v.getHDLC();
                count++;
            }
            
         breathRate =  breathRate/count;
         heartRate = heartRate/count;
         highBp = highBp/count;
         lowBp = lowBp/count;
         ldlc=ldlc/count;
         hdlc=hdlc/count;
       

              
        if (breathRate<60&&heartRate<100&&highBp<160&&lowBp<90){
            
             sickPatients += 1;
            
        }
        else{
             improvedConditionPatients +=1;
        }


            breathRate = breathRate / count;
            heartRate = heartRate / count;
            highBp = highBp / count;
            lowBp = lowBp / count;
            ldlc = ldlc / count;
            hdlc = hdlc / count;
           

            if (breathRate < 60 && heartRate < 90 && highBp < 150 && lowBp < 80) {
                improvedConditionPatients += 1;

            } else {
                sickPatients += 1;
            }

        }
 

        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("sickPatients", sickPatients);
        pieDataset.setValue("improvedConditionPatients", improvedConditionPatients);
        JFreeChart chart = ChartFactory.createPieChart("Pie Chart", pieDataset, true, true, true);

        PiePlot p = (PiePlot) chart.getPlot();
        //   p.setForegroundAlpha(TOP_ALIGNMENT);
        // ChartFrame frame = new ChartFrame("Pie Chart",chart);
        // frame.setVisible(true);

        ChartPanel cp = new ChartPanel(chart);
        trialSummaryjPanel.removeAll();
        trialSummaryjPanel.add(cp, BorderLayout.CENTER);
        trialSummaryjPanel.validate();

    }//GEN-LAST:event_summaryButtonActionPerformed

    private void backJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJbtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJbtnActionPerformed

    public void populateComboBox() {
       
        patientComboBox.removeAllItems();

        for (Patient p : req.getStudy().getPatientList()) {
            patientComboBox.addItem(p);

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assignedPatientsJlbl;
    private javax.swing.JButton backJbtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox patientComboBox;
    private javax.swing.JButton summaryButton;
    private javax.swing.JLabel trialSummaryJlbl;
    private javax.swing.JPanel trialSummaryjPanel;
    private javax.swing.JButton viewCumulativeResult;
    private javax.swing.JLabel vitalSignHeaderJlbl;
    private javax.swing.JLabel vitalSignJlbl;
    private javax.swing.JPanel vitalSignResultsJPanel;
    private javax.swing.JComboBox<String> vitalsignComboBox;
    // End of variables declaration//GEN-END:variables

}