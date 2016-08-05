package org.netbeans.modules.idf;

import java.util.prefs.Preferences;
import javax.swing.JComponent;
import org.netbeans.modules.options.editor.spi.PreferencesCustomizer;
import org.netbeans.modules.options.editor.spi.PreviewProvider;
import org.openide.util.HelpCtx;

public class InterfaceDrivenControler {

    private static class CategorySupport implements PreviewProvider, PreferencesCustomizer {
        @Override
        public JComponent getPreviewComponent() {
            return new PreviewPanel();
        }
        @Override
        public void refreshPreview() {
        }
        @Override
        public String getId() {
            return "interface-driven-formatter";
        }
        @Override
        public String getDisplayName() {
            return Bundle.CTL_DisplayText();
        }
        @Override
        public HelpCtx getHelpCtx() {
            return HelpCtx.DEFAULT_HELP;
        }
        @Override
        public JComponent getComponent() {
            return new FmtInterfaceDrivenCodeGeneration();
        }
    }

    public static PreferencesCustomizer.Factory getController() {
        return new PreferencesCustomizer.Factory() {
            @Override
            public PreferencesCustomizer create(Preferences preferences) {
                return new CategorySupport();
            }
        };
    }
    
}
