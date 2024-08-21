package ornek;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame implements ActionListener {

    private JButton button1;
    private JButton button2;

    public ButtonFrame() {
        super("Button Practise");
        setLayout(new FlowLayout());
        button1 = new JButton("My Tree");
        button2 = new JButton("My House");

        Icon[] images = {
                (new ImageIcon(getClass().getResource("tree.png"))),
                (new ImageIcon(getClass().getResource("house.png"))),
                (new ImageIcon(getClass().getResource("coding.png"))),
                (new ImageIcon(getClass().getResource("data.png"))),
        };

        Random random = new Random();

        int randomIndex1 = random.nextInt(images.length);
        int randomIndex2 = random.nextInt(images.length);

        int randomIndex3 = random.nextInt(images.length);
        int randomIndex4 = random.nextInt(images.length);
        
        int randomIndex5 = random.nextInt(images.length);
        int randomIndex6 = random.nextInt(images.length);

        button1.setIcon(images[randomIndex1]);
        button2.setIcon(images[randomIndex2]);

        button1.addActionListener(this);
        button2.addActionListener(this);

        button1.setRolloverIcon(images[randomIndex5]);
        button2.setRolloverIcon(images[randomIndex6]);

        add(button1);
        add(button2);

        setVisible(true);
        setSize(300, 100);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new ButtonFrame();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == button1) {
            JOptionPane.showMessageDialog(null, button1.getText() + " is clicked", "ButtonFrame", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, button2.getText() + " is clicked", "ButtonFrame", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
