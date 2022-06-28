import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdicionarEventoWindow extends JFrame {
    private JPanel adicionarEventoPanel;
    private JButton btnAdicionar;
    private JTextField textNome;
    private JTextField textLocal;
    private JTextField textDataInicio;
    private JTextField textDataFim;
    private JButton btnLimpar;
    private JButton btnVeiculo;

    public AdicionarEventoWindow(String title, String filial) {
        super(title);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setContentPane(adicionarEventoPanel);
        pack();

        btnAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var window = new SedeFilialWindow("Sede / Filial");
                window.setVisible(true);
                setVisible(false);
            }
        });

        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var window = new SedeFilialWindow("Sede / Filial");
                window.setVisible(true);
                setVisible(false);
            }
        });

        btnVeiculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var window = new SedeFilialWindow("Sede / Filial");
                window.setVisible(true);
                setVisible(false);
            }
        });

    }
}