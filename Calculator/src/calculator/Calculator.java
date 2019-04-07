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


        JButton calc = addButton(panelBottom, "Расчет");
        calc.addActionListener(this);
        JButton reset = addButton(panelBottom, "Сброс");
        reset.addActionListener(this);


        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(450,200);
        JLabel top = new JLabel("Первое поле является обязательным для заполнения");
        top.setHorizontalAlignment(JLabel.CENTER);

        frame.add(top, BorderLayout.NORTH);
        frame.add(panelLeft, BorderLayout.WEST);
        frame.add(panelRight, BorderLayout.EAST);
        frame.add(panelBottom, BorderLayout.SOUTH);
        frame.setResizable(false);

    }


    public void addLabel(JComponent container, String name, Color color){
        JLabel label = new JLabel(name);
        label.setMaximumSize(new Dimension(200,20));
        label.setForeground(color);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBorder(new EtchedBorder());
        container.add(label);
    }

    public JTextField addTextField(JComponent container){
        JTextField field = new JTextField();
        field.setMaximumSize(new Dimension(350,20));
        container.add(field);
        return field;
    }

    public JButton addButton(JComponent container, String name){
        JButton button = new JButton(name);
        button.setMaximumSize(new Dimension(100,20));
        button.setHorizontalAlignment(JButton.CENTER);
        container.add(button);
        return button;
    }