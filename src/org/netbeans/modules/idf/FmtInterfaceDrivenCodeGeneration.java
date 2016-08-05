package org.netbeans.modules.idf;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.prefs.Preferences;
import org.openide.util.NbBundle;
import org.openide.util.NbPreferences;

@NbBundle.Messages({
    "CTL_DisplayText=Ordering by Interface"
})
public class FmtInterfaceDrivenCodeGeneration extends javax.swing.JPanel {

    Preferences fmtIDCGPref = NbPreferences.forModule(FmtInterfaceDrivenCodeGeneration.class);

    public FmtInterfaceDrivenCodeGeneration() {
        initComponents();
        setName(Bundle.CTL_DisplayText());
        asDeclaredCheckBox.addActionListener(new SwitchIDFPreference("asdeclared"));
        alphabeticalCheckBox.addActionListener(new SwitchIDFPreference("alphabetical"));
        increasingGeneralityCheckBox.addActionListener(new SwitchIDFPreference("increasing"));
        decreasingGeneralityCheckBox.addActionListener(new SwitchIDFPreference("decreasing"));
        enableCheckBox.addActionListener(new EnableDisableActionListener());
    }
    
    private class EnableDisableActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (enableCheckBox.isSelected()) {
                asDeclaredCheckBox.setEnabled(true);
                alphabeticalCheckBox.setEnabled(true);
                increasingGeneralityCheckBox.setEnabled(true);
                decreasingGeneralityCheckBox.setEnabled(true);
            } else if (!enableCheckBox.isSelected()) {
                asDeclaredCheckBox.setEnabled(false);
                alphabeticalCheckBox.setEnabled(false);
                increasingGeneralityCheckBox.setEnabled(false);
                decreasingGeneralityCheckBox.setEnabled(false);
                asDeclaredCheckBox.setSelected(false);
                alphabeticalCheckBox.setSelected(false);
                increasingGeneralityCheckBox.setSelected(false);
                decreasingGeneralityCheckBox.setSelected(false);
                buttonGroup1.clearSelection();
                fmtIDCGPref.put("interfaceDrivenFormatterPref", "none");
            }
        }
    }
    
    private class SwitchIDFPreference implements ActionListener {
        private final String idfPref;
        private SwitchIDFPreference(String idfPref) {
            this.idfPref = idfPref;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            fmtIDCGPref.put("interfaceDrivenFormatterPref", idfPref);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        alphabeticalCheckBox = new javax.swing.JCheckBox();
        increasingGeneralityCheckBox = new javax.swing.JCheckBox();
        asDeclaredCheckBox = new javax.swing.JCheckBox();
        decreasingGeneralityCheckBox = new javax.swing.JCheckBox();
        enableCheckBox = new javax.swing.JCheckBox();

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        buttonGroup1.add(alphabeticalCheckBox);
        alphabeticalCheckBox.setText("Alphabetical");
        alphabeticalCheckBox.setEnabled(false);

        buttonGroup1.add(increasingGeneralityCheckBox);
        increasingGeneralityCheckBox.setText("By increasing generality");
        increasingGeneralityCheckBox.setEnabled(false);

        buttonGroup1.add(asDeclaredCheckBox);
        asDeclaredCheckBox.setText("As declared");
        asDeclaredCheckBox.setEnabled(false);

        buttonGroup1.add(decreasingGeneralityCheckBox);
        decreasingGeneralityCheckBox.setText("By decreasing generality");
        decreasingGeneralityCheckBox.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(asDeclaredCheckBox)
                    .addComponent(alphabeticalCheckBox)
                    .addComponent(increasingGeneralityCheckBox)
                    .addComponent(decreasingGeneralityCheckBox))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(asDeclaredCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alphabeticalCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(increasingGeneralityCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(decreasingGeneralityCheckBox)
                .addContainerGap())
        );

        enableCheckBox.setText("Select Interface-Driven Formatting Option");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enableCheckBox))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enableCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox alphabeticalCheckBox;
    private javax.swing.JCheckBox asDeclaredCheckBox;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox decreasingGeneralityCheckBox;
    private javax.swing.JCheckBox enableCheckBox;
    private javax.swing.JCheckBox increasingGeneralityCheckBox;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
