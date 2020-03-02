/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import Operaciones.Op;

/**
 *
 * @author SP314-51
 */
public class GUI_Triangulo extends JFrame {
   
    String base="";
    String altura="";
    public  JTextField num1;
    public JButton Aceptar;
    public JTextField num2;
    public JLabel Tex, Tex1;
    public JPanel  Figuras;
    public Container contenedor2;
    public GUI_Triangulo(){
            
            Figuras= new JPanel(null);
            contenedor2 = getContentPane();
            Tex = new JLabel("Valor de la base: ");
            num1 = new JTextField(10);
            Tex1= new JLabel("Valor de la altura: ");
            num2 = new JTextField(10);
            Aceptar =new JButton();
            setVisible(true);
            setSize(400, 200);
            setTitle("Dimenciones");
            operaciones();
            setLocationRelativeTo(null);
            
        }
     public void operaciones(){
            //Panel
            Figuras.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
            Figuras.setPreferredSize(new Dimension (400, 400));
            Figuras.setSize(400, 400);
            
            //Cajas de texto
            Tex.setBounds(50,25,100,30);
            num1.setBounds(150,25, 100, 30);
            Tex1.setBounds(50,45,200,60);
            num2.setBounds(155,60,100,30);
            //Boton
            Aceptar.setText("Calcular");
            Aceptar.setPreferredSize(new Dimension (120,80));
            Aceptar.setSize(100,50);
            Aceptar.setBounds(155,100,100,30);
            
            //Agregar cajas de texto y botones al Panel
            Figuras.add(Tex);
            Figuras.add(num1);
            Figuras.add(Tex1);
            Figuras.add(num2);
            Figuras.add(Aceptar);
            contenedor2.add(Figuras, BorderLayout.NORTH);
            //Crear Oyente
            OyenteAceptar oAceptar = new OyenteAceptar();
            //Registro de los oyentes
            Aceptar.addActionListener((ActionListener)oAceptar);
            
        }

    

    

    private class OyenteAceptar implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            float alt, bas, are;
             altura=num2.getText();
             base=num1.getText();
            alt=Float.parseFloat(altura);
            bas=Float.parseFloat(base);
            Op op = new Op();
            JOptionPane area= new JOptionPane();
            if(alt>0 && bas>0){

            area.showMessageDialog(null, "El area del triangulo es: "+ op.AreaTriangulo(bas, alt)+ " cm^2", "Area" ,JOptionPane.PLAIN_MESSAGE);
            }else{
            area.showMessageDialog( null, "Syntax Error", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
          }
    }
    
}
