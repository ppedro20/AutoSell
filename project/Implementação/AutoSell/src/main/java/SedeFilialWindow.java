import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SedeFilialWindow extends JFrame {

    private JPanel sedeFilialPanel;
    private JButton btnVoltar;
    private JButton btnSede;
    private JButton btnFilial1;
    private JButton btnFilial2;
    private JButton btnFilial3;
    private JButton btnFilial4;
    private JButton btnFilial5;
    private JButton btnFilial6;
    private JButton btnFilial7;
    private JButton btnFilial8;
    private JButton btnFilial9;
    private JButton btnFilial10;
    private JButton btnFilial11;
    private JButton btnFilial12;
    private JButton btnFilial13;
    private JButton btnFilial14;

    public SedeFilialWindow(String titulo) {
        super(titulo);
 
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setContentPane(sedeFilialPanel);
        pack();

        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var main = new AutoSell("AutoSell");
                main.setVisible(true);
                setVisible(false);
            }
        });

        btnSede.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var window = new FilialWindow(btnSede.getText());
                window.setVisible(true);
                setVisible(false);
            }
        });

        btnFilial1.addActionListener(createWindow(btnFilial1));
        btnFilial3.addActionListener(createWindow(btnFilial3));
        btnFilial4.addActionListener(createWindow(btnFilial4));
        btnFilial5.addActionListener(createWindow(btnFilial5));
        btnFilial6.addActionListener(createWindow(btnFilial6));
        btnFilial7.addActionListener(createWindow(btnFilial7));
        btnFilial8.addActionListener(createWindow(btnFilial8));
        btnFilial9.addActionListener(createWindow(btnFilial9));
        btnFilial10.addActionListener(createWindow(btnFilial10));
        btnFilial11.addActionListener(createWindow(btnFilial11));
        btnFilial12.addActionListener(createWindow(btnFilial12));
        btnFilial13.addActionListener(createWindow(btnFilial13));
        btnFilial14.addActionListener(createWindow(btnFilial14));
    }

    public ActionListener createWindow(JButton button) {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var window = new FilialWindow("Filial: " + button.getText());
                window.setVisible(true);
                setVisible(false);
            }
        };
        return actionListener;
    }
}