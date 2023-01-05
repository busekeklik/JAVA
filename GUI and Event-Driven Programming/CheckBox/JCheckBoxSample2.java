package CheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JCheckBoxSample2 extends JFrame implements ActionListener, ItemListener{
    private static final int FRAME_WIDTH    = 300;
    private static final int FRAME_HEIGHT   = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    private JCheckBox[] checkBox;

    public static void main(String[] args) {
        JCheckBoxSample2 frame = new JCheckBoxSample2();
        frame.setVisible(true);
    }
    public JCheckBoxSample2() {
        Container   contentPane;
        JPanel      checkPanel, okPanel;

        JButton     okButton;
        String[]    btnText = {"Java", "C++", "Smalltalk", "Ada"};

        //set the frame properties
        setSize      (FRAME_WIDTH, FRAME_HEIGHT);
        setTitle     ("Program Ch14JCheckBoxSample2");
        setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane = getContentPane( );
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(new BorderLayout());

        //create and place four checkboxes
        checkPanel = new JPanel(new GridLayout(0,1));
        checkPanel.setBorder(BorderFactory.createTitledBorder("Can Program In"));
        checkBox = new JCheckBox[btnText.length];

        for (int i = 0; i < checkBox.length; i++) {
            checkBox[i] = new JCheckBox(btnText[i]);
            checkPanel.add(checkBox[i]);

            checkBox[i].addItemListener(this);
        }

        okPanel = new JPanel(new FlowLayout());
        okButton = new JButton("OK");
        okButton.addActionListener(this);
        okPanel.add(okButton);

        contentPane.add(checkPanel, BorderLayout.CENTER);
        contentPane.add(okPanel, BorderLayout.SOUTH);

        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( EXIT_ON_CLOSE );
    }

    public void actionPerformed(ActionEvent event) {

        StringBuffer skill = new StringBuffer("You can program in\n");

        for (int i = 0; i < checkBox.length; i++) {

            if (checkBox[i].isSelected()) {
                skill.append(checkBox[i].getText() + "\n");
            }
        }

        JOptionPane.showMessageDialog(this, skill.toString());
    }

    public void itemStateChanged(ItemEvent event) {

        JCheckBox source = (JCheckBox) event.getSource();

        String state;

        if (event.getStateChange() == ItemEvent.SELECTED) {
            state = "is selected";
        } else {
            state = "is deselected";
        }

        JOptionPane.showMessageDialog(this, "JCheckBox '" +
                                            source.getText() +
                                            "' " + state);
    }
}