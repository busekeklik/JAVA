package JSlider;

import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;

class Ch14JSliderSample extends JFrame
                           implements ChangeListener {

    private static final int FRAME_WIDTH    = 450;
    private static final int FRAME_HEIGHT   = 260;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private static final int MIN_COLOR = 0;
    private static final int MAX_COLOR = 255;
    private JSlider redSlider;
    private JSlider greenSlider;
    private JSlider blueSlider;
    private JPanel colorPanel;


    public static void main(String[] args) {
        Ch14JSliderSample frame = new Ch14JSliderSample();
        frame.setVisible(true);
    }

    public Ch14JSliderSample() {
        Container   contentPane;
        JPanel      sliderPanel;

        setSize      (FRAME_WIDTH, FRAME_HEIGHT);
        setTitle     ("Program JListSample");
        setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane = getContentPane( );
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(new BorderLayout());

        sliderPanel = new JPanel(new FlowLayout());
        sliderPanel.setBorder(
                    BorderFactory.createTitledBorder("RGB Color Selection"));

        redSlider = createSlider(MAX_COLOR);
        greenSlider = createSlider(MAX_COLOR);
        blueSlider = createSlider(MAX_COLOR);

        sliderPanel.add(redSlider);
        sliderPanel.add(greenSlider);
        sliderPanel.add(blueSlider);

        colorPanel = new JPanel( );
        colorPanel.setBackground(Color.white);
        colorPanel.setBorder(BorderFactory.createLoweredBevelBorder());
        contentPane.add(colorPanel, BorderLayout.CENTER);
        contentPane.add(sliderPanel, BorderLayout.WEST);

        setDefaultCloseOperation( EXIT_ON_CLOSE );
    }

    public void stateChanged(ChangeEvent event) {

        int R, G, B;

        R = redSlider.getValue();
        G = greenSlider.getValue();
        B = blueSlider.getValue();

        colorPanel.setBackground(new Color(R, G, B));
    }

    private JSlider createSlider(int value ) {

        JSlider slider = new JSlider();

        slider.setOrientation(JSlider.VERTICAL);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setMinimum(MIN_COLOR);
        slider.setMaximum(MAX_COLOR);
        slider.setValue(value);
        slider.setMajorTickSpacing(50);
        slider.setMinorTickSpacing(25);

        slider.addChangeListener(this);

        return slider;
    }
}