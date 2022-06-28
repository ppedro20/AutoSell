import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AutoSell extends JFrame {

    private JPanel filialPanel;
    private JButton btnSedeFilial;
    private JButton btnClientes;
    private JButton btnVeiculos;
    private JButton btnEstatisticas;

    public AutoSell(String title) {
        super(title);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(filialPanel);
        pack();

        btnSedeFilial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var window = new SedeFilialWindow("Sede / Filial");
                window.setVisible(true);
                setVisible(false);
            }
        });

        btnClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var window = new ClientesWindow("Clientes");
                window.setVisible(true);
                setVisible(false);
            }
        });

        btnVeiculos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var window = new VeiculosWindow("Veiculos");
                window.setVisible(true);
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) { new AutoSell("AutoSell").setVisible(true); }
}