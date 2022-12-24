import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GuiProject extends JFrame{
    private JButton button = new JButton("press");
    private JTextField txt = new JTextField(5);
    private JLabel lbl = new JLabel("Input");
    private JRadioButton rd1 = new JRadioButton("Select this");
    private JRadioButton rd2 = new JRadioButton("Select that");
    private JCheckBox check = new JCheckBox("Check", false);
    public GuiProject() {
        super("Simple Example");
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(lbl);
        container.add(txt);

        ButtonGroup group = new ButtonGroup();
        group.add(rd1);
        group.add(rd2);
        container.add(rd1);
        rd1.setSelected(true);
        container.add(rd2);
        container.add(check);

        class ButtonEventListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String message = "";
                message += "Button was pressed\n";
                message += "Text is" + txt.getText() + "\n";
                message += (rd1.isSelected() ? "rd 1" : "rd 2") + "is selected!\n";
                message += "CheckBox is" + ((check.isSelected()) ? "checked" : "unchecked");
                JOptionPane.showMessageDialog(null, message, "Outpur", JOptionPane.PLAIN_MESSAGE);
                button.addActionListener(new ButtonEventListener());
                container.add(button);

            }


        }


    }
}
