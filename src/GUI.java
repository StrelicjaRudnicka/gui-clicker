import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;




public class GUI implements ActionListener {

    private int count = 0;
    private JLabel thislabel;
    private JFrame nframe;
    private JPanel npanel;

    public GUI(){

         nframe = new JFrame();

        JButton onlybutton = new JButton("click here");
        onlybutton.addActionListener(this);
        thislabel = new JLabel("no. of clicks: 0");

        npanel = new JPanel();
        npanel.setBorder(BorderFactory.createEmptyBorder(45, 45, 20, 45));
        npanel.setLayout(new GridLayout(0, 1));
        npanel.add(onlybutton);
        npanel.add(thislabel);

        nframe.add(npanel, BorderLayout.CENTER);
        nframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nframe.setTitle("gui gui gui");
        nframe.pack();
        nframe.setVisible(true);
    }
    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        thislabel.setText("no. of clicks: " + count);
    }
}