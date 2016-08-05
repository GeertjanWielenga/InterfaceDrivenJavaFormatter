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
        asDeclaredCheckBox = new javax.swing.JCheckBox();
        alphabeticalCheckBox = new javax.swing.JCheckBox();
        increasingGeneralityCheckBox = new javax.swing.JCheckBox();
        decreasingGeneralityCheckBox = new javax.swing.JCheckBox();
        noneCheckBox = new javax.swing.JCheckBox();

        buttonGroup1.add(asDeclaredCheckBox);
        asDeclaredCheckBox.setText("As declared");

        buttonGroup1.add(alphabeticalCheckBox);
        alphabeticalCheckBox.setText("Alphabetical");

        buttonGroup1.add(increasingGeneralityCheckBox);
        increasingGeneralityCheckBox.setText("By increasing generality");

        buttonGroup1.add(decreasingGeneralityCheckBox);
        decreasingGeneralityCheckBox.setText("By decreasing generality");

        buttonGroup1.add(noneCheckBox);
        noneCheckBox.setSelected(true);
        noneCheckBox.setText("None of the above");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(asDeclaredCheckBox)
                    .addComponent(alphabeticalCheckBox)
                    .addComponent(increasingGeneralityCheckBox)
                    .addComponent(decreasingGeneralityCheckBox)
                    .addComponent(noneCheckBox))
                .addContainerGap(302, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(asDeclaredCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alphabeticalCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(increasingGeneralityCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(decreasingGeneralityCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noneCheckBox)
                .addContainerGap(150, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox alphabeticalCheckBox;
    private javax.swing.JCheckBox asDeclaredCheckBox;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox decreasingGeneralityCheckBox;
    private javax.swing.JCheckBox increasingGeneralityCheckBox;
    private javax.swing.JCheckBox noneCheckBox;
    // End of variables declaration//GEN-END:variables
}
