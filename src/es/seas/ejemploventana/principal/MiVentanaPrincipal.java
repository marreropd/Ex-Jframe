package es.seas.ejemploventana.principal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MiVentanaPrincipal extends JFrame {
    public MiVentanaPrincipal() throws HeadlessException {
        super("Login");
        setSize(new Dimension(300, 200));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        MiVentanaPrincipal ventana = new MiVentanaPrincipal();
        JPanel panelContenedor = new JPanel();
        panelContenedor.setBackground(Color.WHITE);
        ventana.setContentPane(panelContenedor);

        JLabel lblUsuario = new JLabel("Usuario: ");
        JTextField txtUsuario = new JTextField(20);
        JButton btnLogin = new JButton("Sign In");
        panelContenedor.add(lblUsuario);
        panelContenedor.add(txtUsuario);
        panelContenedor.add(btnLogin);
        JMenuBar barraMenu = new JMenuBar();
        JMenu mnuArchivo = new JMenu("Archivo");
        JMenuItem mnuItemNew = new JMenuItem("Nuevo");
        JMenuItem mnuItemSave = new JMenuItem("Guardar");
        JMenuItem mnuItemExit = new JMenuItem("Salir");
        mnuItemExit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        mnuArchivo.add(mnuItemNew);
        mnuArchivo.add(mnuItemSave);
        mnuArchivo.add(mnuItemExit);
        barraMenu.add(mnuArchivo);
        ventana.setJMenuBar(barraMenu);
        ventana.setVisible(true);
    }
}
