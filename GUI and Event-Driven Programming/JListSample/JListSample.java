package JListSample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *  Ch14JListSample class
 *
 * <p>
 * A sample frame to illustrate the use of JList.
 */
class JListSample extends JFrame
                           implements ActionListener {


    private static final int FRAME_WIDTH    = 300;
    private static final int FRAME_HEIGHT   = 250;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    private JList list;

    public static void main(String[] args) {
        JListSample frame = new JListSample();
        frame.setVisible(true);
    }

    public JListSample() {
        Container   contentPane;
        JPanel      listPanel, okPanel;

        JButton     okButton;
        String[]    names = {"Ape", "Bat", "Bee", "Cat",
                            "Dog", "Eel", "Fox", "Gnu",
                            "Hen", "Man", "Sow", "Yak"};

        setSize      (FRAME_WIDTH, FRAME_HEIGHT);
        setTitle     ("Program Ch14JListSample2");
        setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane = getContentPane( );
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(new BorderLayout());

        listPanel = new JPanel(new GridLayout(0,1));
        listPanel.setBorder(BorderFactory.createTitledBorder(
        		                          "Three-letter Animal Names"));

        list = new JList(names);
        listPanel.add(new JScrollPane(list));
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        okPanel = new JPanel(new FlowLayout());
        okButton = new JButton("OK");
        okButton.addActionListener(this);
        okPanel.add(okButton);

        contentPane.add(listPanel, BorderLayout.CENTER);
        contentPane.add(okPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation( EXIT_ON_CLOSE );
    }

    public void actionPerformed(ActionEvent event) {

        Object[] name;
        int[]    loc;

        name = list.getSelectedValues();
        loc  = list.getSelectedIndices();

        System.out.println("Currently selected animal names are ");
        for (int i = 0; i < name.length; i++) {
            System.out.println((String)name[i] + " at position " + loc[i]);
        }
    }
}
