import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientesWindow extends JFrame {

    private JPanel clientesPanel;
    private JTable tableClientes;
    private JButton btnVoltar;

    public ClientesWindow(String title) {
        super(title);

        createTable();

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setContentPane(clientesPanel);
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
        tableClientes.setModel(new DefaultTableModel(null, new String[] {"Nome"}));
    }
}