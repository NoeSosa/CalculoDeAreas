/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javax.swing.border.BevelBorder;

public class GUI extends JFrame {
    ImageIcon iconotria = new ImageIcon("src/Imagenes/triangle_24_2x_1.png");
    ImageIcon iconocir = new ImageIcon("src/Imagenes/round.png");
    ImageIcon iconocua = new ImageIcon("src/Imagenes/square_shape.png");
    ImageIcon iconorec = new ImageIcon("src/Imagenes/rectangulo.png");
    public Container contenedor;
    
    public final  JPanel Acciones;
    public JPanel  Figuras;
    public JButton Triangulo, Cuadrado, Rectangulo, Circulo;
        
        
        public GUI(){
        contenedor = getContentPane();
        Acciones= new JPanel();
        Triangulo = new JButton(); 
       Cuadrado = new JButton();
       Rectangulo = new JButton();
       Circulo = new JButton();
       Rectangulo = new JButton();
        setSize(400, 280);
        this.setTitle("Area de figuras");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
         Interfaz();
         setLocationRelativeTo(null);
        }
        
        
        public void Interfaz(){
            

            //Botones
            Triangulo.setPreferredSize(new Dimension (120, 80));
            Triangulo.setIcon(iconotria);
            
            
            Circulo.setIcon(iconocir);
            Circulo.setPreferredSize(new Dimension (120, 80));
           
            
            Cuadrado.setIcon(iconocua);
            Cuadrado.setPreferredSize(new Dimension (120, 80));
            
            
            Rectangulo.setIcon(iconorec);
            Rectangulo.setPreferredSize(new Dimension(120,80));
            
            //Layout del panel contenedor 
            contenedor.setLayout(new BorderLayout());
           
            //Panel de acciones 
            Acciones.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
            Acciones.setPreferredSize(new Dimension (400, 400));
            Acciones.setSize(400, 400);
            

            //Colocar Botones en el panel
            Acciones.add(Triangulo);
            Acciones.add(Circulo);
            Acciones.add(Cuadrado);
            Acciones.add(Rectangulo);
            contenedor.add(Acciones, BorderLayout.NORTH);
            //Creacion de oyentes
            OyenteTriangulo oTriangulo = new OyenteTriangulo();
            OyenteCirculo oCirculo= new OyenteCirculo();
            OyenteCuadrado oCuadrado = new OyenteCuadrado();
            OyenteRectangulo oRectangulo= new OyenteRectangulo();
            //registro de oyentes
            Triangulo.addActionListener((ActionListener)oTriangulo);
            Circulo.addActionListener((ActionListener)oCirculo);
            Cuadrado.addActionListener((ActionListener)oCuadrado);
            Rectangulo.addActionListener((ActionListener)oRectangulo);
        }
       

    private class OyenteTriangulo implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            GUI_Triangulo tr = new GUI_Triangulo();
            tr.setVisible(true);
           
            
            
        }
    }

    private class OyenteCirculo implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            GUI_Circulo cir = new GUI_Circulo();
            cir.setVisible(true);
        }
    }

    private class OyenteCuadrado implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            GUI_Cuadrado cua = new GUI_Cuadrado();
            cua.setVisible(true);
        }
    }

    private class OyenteRectangulo implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            GUI_Rectangulo rec = new GUI_Rectangulo();
            rec.setVisible(true);
        }
    }

    
}
