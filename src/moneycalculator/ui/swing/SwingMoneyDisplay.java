package moneycalculator.ui.swing;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import moneycalculator.ui.MoneyDisplay;


public class SwingMoneyDisplay extends JPanel implements MoneyDisplay {

    public SwingMoneyDisplay() {
        setLayout(new FlowLayout());
        add(title());
        add(amount());
        add(currency());
        
    }
    
    private JLabel title() {
        JLabel jLabel = new JLabel("La cantidad introducida es:");
        return jLabel;
    }
    
    private JLabel amount() {
        JLabel jLabel = new JLabel("400");
        return jLabel;
    }

    private JLabel currency() {
        JLabel jLabel = new JLabel("€");
        return jLabel;
    }
}