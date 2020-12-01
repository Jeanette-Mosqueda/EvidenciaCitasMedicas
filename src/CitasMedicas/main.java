package CitasMedicas;

import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class main  {
    public static void main(String[] args) {
        JFrame frame = new JFrame("IniciarSesion");
        frame.setContentPane(new IniciarSesion().panelIniciar);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(480,320);
        frame.setVisible(true);

    }
}
