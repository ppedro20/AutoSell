import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VeiculosWindow extends JFrame {

    private JPanel veiculosPanel;
    private JTable tableVeiculos;
    private JButton btnVoltar;

    public VeiculosWindow(String title) {
        super(title);

        createTable();

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setContentPane(veiculosPanel);
        pack();

        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var main = new AutoSell("AutoSell");
                main.setVisible(true);
                setVisible(false);
            }
        });
    }

    private void createTable() {
        tableVeiculos.setModel(new DefaultTableModel(null, new String[] {"Nome", "Marca", "Modelo", "Valor", "Filial"}));
    }
}