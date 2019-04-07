package calculator;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EtchedBorder;

public class Calculator implements ActionListener{
    JFrame frame = new JFrame("Подсчет количества символов в тексте"); 
    JPanel panelLeft = new JPanel(); 
    JPanel panelRight = new JPanel(); 
    JPanel panelBottom = new JPanel(); 
    public JTextField[] fields = new JTextField[2];

    public Calculator() {
        panelLeft.setLayout(new BoxLayout(panelLeft, BoxLayout.Y_AXIS));
        panelLeft.setPreferredSize(new Dimension(250, 300));

        panelRight.setLayout(new BoxLayout(panelRight, BoxLayout.Y_AXIS));
        panelRight.setPreferredSize(new Dimension(230,300));

        addLabel(panelLeft, "Текст:", Color.BLACK);
        addLabel(panelLeft, "Количество символов в тексте:", Color.BLACK);
        for(int i = 0; i < fields.length; i++){
            if(fields.length >= 0){
                fields[i] = addTextField(panelRight);}

        }