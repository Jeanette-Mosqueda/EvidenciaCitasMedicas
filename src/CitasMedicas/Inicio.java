package CitasMedicas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inicio {
    public JPanel panelInicio;
    private JButton DoctorButton;
    private JButton CitaButton;
    private JButton PacienteButton;

    public Inicio() {
        DoctorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Component component = (Component) e.getSource();
                JFrame frame = (JFrame) SwingUtilities.getRoot(component);
                frame.setContentPane(new Doctor().panelDoctor);
                frame.setVisible(true);
            }
        });
        PacienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Component component = (Component) e.getSource();
                JFrame frame = (JFrame) SwingUtilities.getRoot(component);
                frame.setContentPane(new Paciente().panelPaciente);
                frame.setVisible(true);
            }
        });
        CitaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Component component = (Component) e.getSource();
                JFrame frame = (JFrame) SwingUtilities.getRoot(component);
                frame.setContentPane(new Cita().panelCita);
                frame.setVisible(true);
            }
        });
    }

}
