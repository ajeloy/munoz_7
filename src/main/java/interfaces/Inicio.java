package interfaces;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class Inicio extends JFrame implements ActionListener {

    private JTextField cuadro_ubicacionTexto;
    private JButton boton_cargar;
    private int contador_pulsaciones;
    private Texto ventanaGuardada;

    public Inicio() {
        super();
        iniciarVentana();
        iniciarComponentes();
    }

    /**
     * Inicia la ventana con sus valores necesarios.
     *
     * @param void
     * @return void
     */
    private void iniciarVentana() {
        this.setTitle("Presentador de texto");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Inicia y configura los componentes de la ventana.
     *
     * @param void
     * @return void
     */
    private void iniciarComponentes() {
        contador_pulsaciones = 0;
        Font fuente = new Font("Calibri", 3, 23);
        cuadro_ubicacionTexto = new JTextField("Ingrese la ubicación del texto");
        boton_cargar = new JButton("Cargar texto");
        cuadro_ubicacionTexto.setBounds(100, 100, 400, 70);
        boton_cargar.setBounds(200, 250, 200, 80);
        boton_cargar.addActionListener(this);
        boton_cargar.setFont(fuente);
        cuadro_ubicacionTexto.setFont(fuente);
        boton_cargar.setForeground(Color.red);
        cuadro_ubicacionTexto.setForeground(Color.BLUE);
        this.add(cuadro_ubicacionTexto);
        this.add(boton_cargar);
    }

    /**
     * Guarda la ventana ingresada por parámetros en un atributo.
     *
     * @param Clase que para guardar, de tipo Texto
     * @return void
     */
    public void guardarVentana(Texto ventanaGuardada) {
        this.ventanaGuardada = ventanaGuardada;
    }

    /**
     * Retorna el estado del objeto perteneciente a esta misma clase.
     *
     * @param void
     * @return Objeto de tipo Inicio
     */
    public Inicio getVentana() {
        return this;
    }

    /**
     * Devuelve un atributo privado.
     *
     * @param void
     * @return atributo de tipo JTextField
     */
    public JTextField getCuadro() {
        return cuadro_ubicacionTexto;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton_cargar) {
            if (contador_pulsaciones == 0) {
                Texto texto = new Texto(getVentana());
                texto.setVisible(true);
                this.setVisible(false);
            } else {
                ventanaGuardada.setVisible(true);
                this.setVisible(false);
            }
        }
    }
}
