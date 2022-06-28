import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FilialWindow extends JFrame {

    private JPanel filialPanel;
    private JLabel header;
    private JButton btnVoltar;
    private JButton btnEventos;
    private JButton btnTransacoes;
    private JButton btnVeiculos;
    private JButton btnPecas;

    public FilialWindow(String titulo) {
        super(titulo);

        header.setText(titulo);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setContentPane(filialPanel);
        pack();

        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var window = new SedeFilialWindow("Sede / Filial");
                window.setVisible(true);
                setVisible(false);
            }
        });

        btnEventos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var window = new EventosWindow("Eventos", titulo);
                window.setVisible(true);
                setVisible(false);
            }
        });
    }
}