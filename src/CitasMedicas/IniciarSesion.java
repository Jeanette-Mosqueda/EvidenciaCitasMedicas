package CitasMedicas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class IniciarSesion {
    public JPanel panelIniciar;
    private JButton registrarButton;

    private JButton aceptarButton;
    private JTextField textField1;
    private JPasswordField passwordField1;


    public IniciarSesion() {
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Component component = (Component) e.getSource();
                JFrame frame = (JFrame) SwingUtilities.getRoot(component);
                frame.setContentPane(new Registro().panelRegistro);
                frame.setVisible(true);
            }
        });
        aceptarButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Component component = (Component) e.getSource();
                        JFrame frame = (JFrame) SwingUtilities.getRoot(component);
                        frame.setContentPane(new Inicio().panelInicio);
                        frame.setVisible(true);
                    }
                });

    }
}
