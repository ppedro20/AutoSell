import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventosWindow extends JFrame {

    private JPanel eventosPanel;
    private JButton btnVerEventos;
    private JButton btnAdicionarEvento;
    private JButton btnRemoverEvento;

    public EventosWindow(String title, String filial) {
        super(title);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setContentPane(eventosPanel);
        pack();

        btnVerEventos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var window = new SedeFilialWindow("Sede / Filial");
                window.setVisible(true);
                setVisible(false);
            }
        });

        btnAdicionarEvento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var window = new AdicionarEventoWindow("Adicionar Evento", filial);
                window.setVisible(true);
                setVisible(false);
            }
        });

        btnRemoverEvento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var window = new AdicionarEventoWindow("Adicionar Evento", filial);
                window.setVisible(true);
                setVisible(false);
            }
        });
    }
}