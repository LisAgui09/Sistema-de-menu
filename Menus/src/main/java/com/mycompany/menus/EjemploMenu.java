
package com.mycompany.menus;

import java.awt.EventQueue;
import javax.swing.*;

public class EjemploMenu extends JFrame {

    private final JPanel contentPane;

    /**
     * Launch the application.
     * @param args
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                EjemploMenu frame = new EjemploMenu();
                frame.setVisible(true);
            } catch (Exception e) {
            }
        });
    }

    /**
     * Create the frame.
     */
    public EjemploMenu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        // Crear la barra de menú
        JMenuBar barraMenu = new JMenuBar();

        // Crear los menús
        JMenu archivo = new JMenu("Archivo");
        JMenu editar = new JMenu("Editar");
        JMenu ayuda = new JMenu("Ayuda");

        // Añadir los menús a la barra de menú
        barraMenu.add(archivo);
        barraMenu.add(editar);
        barraMenu.add(ayuda);

        // Crear los elementos del menú Archivo
        JMenuItem abrir = new JMenuItem("Abrir");
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem cargar = new JMenuItem("Cargar");
        JMenuItem salir = new JMenuItem("Salir");

        // Añadir acción a los elementos del menú Archivo
        abrir.addActionListener(e -> System.out.println("Abrir archivo"));
        guardar.addActionListener(e -> System.out.println("Guardar archivo"));
        cargar.addActionListener(e -> System.out.println("Cargar archivo"));
        salir.addActionListener(e -> System.exit(0));

        // Añadir elementos al menú Archivo
        archivo.add(abrir);
        archivo.add(new JSeparator());
        archivo.add(guardar);
        archivo.add(cargar);
        archivo.add(new JSeparator());
        archivo.add(salir);

        // Crear los elementos del menú Editar
        JMenuItem modificar = new JMenuItem("Modificar");
        JMenuItem copiar = new JMenuItem("Copiar");
        JMenuItem pegar = new JMenuItem("Pegar");

        // Añadir acción a los elementos del menú Editar
        modificar.addActionListener(e -> System.out.println("Modificar texto"));
        copiar.addActionListener(e -> System.out.println("Copiar texto"));
        pegar.addActionListener(e -> System.out.println("Pegar texto"));

        // Añadir elementos al menú Editar
        editar.add(modificar);
        editar.add(copiar);
        editar.add(pegar);

        // Crear los elementos del menú Ayuda
        JMenuItem acercaDe = new JMenuItem("Acerca de");

        // Añadir acción a los elementos del menú Ayuda
        acercaDe.addActionListener(e -> System.out.println("Acerca de"));
        // Añadir elementos al menú Ayuda
        ayuda.add(acercaDe);

        // Indicar que es el menú por defecto
        setJMenuBar(barraMenu);
    }
}


