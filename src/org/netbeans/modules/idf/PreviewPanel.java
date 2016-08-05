package org.netbeans.modules.idf;

import java.util.prefs.PreferenceChangeEvent;
import java.util.prefs.PreferenceChangeListener;
import java.util.prefs.Preferences;
import org.openide.util.NbBundle;
import org.openide.util.NbPreferences;

@NbBundle.Messages({
    "none=Formatting will ignore interfaces.",
    "increasing=public class ClassA implements MyInterface {\n" +
"\n" +
"    @Override\n" +
"    public void doThis(String description, int howManyTimes) {\n" +
"    }\n" +
"\n" +
"    @Override\n" +
"    public void doThis(String description) {\n" +
"    }\n" +
"\n" +
"    @Override\n" +
"    public void doThis() {\n" +
"    }\n" +
"    \n" +
"}",
    "decreasing=public class ClassA implements MyInterface {\n" +
"\n" +
"    @Override\n" +
"    public void doThis() {\n" +
"    }\n" +
"    \n" +
"    @Override\n" +
"    public void doThis(String description) {\n" +
"    }\n" +
"\n" +
"    @Override\n" +
"    public void doThis(String description, int howManyTimes) {\n" +
"    }\n" +
"    \n" +
"}\n" +
"",
    "asDeclared=public class ClassA implements ActionListener, Runnable {\n"
    + "\n"
    + "    //After formatting, this member will be second,\n"
    + "    //because its interface is declared second:\n"
    + "    @Override\n"
    + "    public void run() {\n"
    + "    }\n"
    + "    \n"
    + "    //After formatting, this member will be first,\n"
    + "    //because its interface is declared first:\n"
    + "    @Override\n"
    + "    public void actionPerformed(ActionEvent e) {\n"
    + "    }\n"
    + "    \n"
    + "}",
    "alphabetical=public class ClassA implements KeyListener, ActionListener {\n" +
"\n" +
"    // After formatting, these three members \n" +
"    // will be sorted alphabetically:     \n" +
"    @Override\n" +
"    public void keyTyped(KeyEvent e) {\n" +
"    }\n" +
"    @Override\n" +
"    public void keyPressed(KeyEvent e) {\n" +
"    }\n" +
"    @Override\n" +
"    public void keyReleased(KeyEvent e) {\n" +
"    }\n" +
"\n" +
"    // After formatting, this member will  \n" +
"    // still be here, since its interface\n" +
"    // is declared after KeyListener:\n" +
"    @Override\n" +
"    public void actionPerformed(ActionEvent e) {\n" +
"    }\n" +
"    \n" +
"}\n" +
""
})
public class PreviewPanel extends javax.swing.JPanel {

    Preferences idfPref = NbPreferences.forModule(FmtInterfaceDrivenCodeGeneration.class);

    public PreviewPanel() {
        initComponents();
        valueProvider(idfPref.get("interfaceDrivenFormatterPref", "none"));
        idfPref.addPreferenceChangeListener(new PreferenceChangeListener() {
            public void preferenceChange(PreferenceChangeEvent evt) {
                if (evt.getKey().equals("interfaceDrivenFormatterPref")) {
                    valueProvider(evt.getNewValue());
                }
            }
        });
    }
    
    private void valueProvider(String value) {
        if (value.equals("asdeclared")) {
            jEditorPane1.setText(Bundle.asDeclared());
        } else if (value.equals("alphabetical")) {
            jEditorPane1.setText(Bundle.alphabetical());
        } else if (value.equals("increasing")) {
            jEditorPane1.setText(Bundle.increasing());
        } else if (value.equals("decreasing")) {
            jEditorPane1.setText(Bundle.decreasing());
        } else if (value.equals("none")) {
            jEditorPane1.setText(Bundle.none());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        jScrollPane2.setEnabled(false);

        jEditorPane1.setEditable(false);
        jEditorPane1.setContentType("text/x-java"); // NOI18N
        jScrollPane2.setViewportView(jEditorPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
