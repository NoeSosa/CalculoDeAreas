/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import Operaciones.Op;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.border.BevelBorder;

/**
 *
 * @author SP314-51
 */
public class GUI_Circulo extends JFrame {
    String radio="";
    public  JTextField ra;
    public JButton Aceptar1;
    public JTextField num2;
    public JLabel Texcir;
    public JPanel  Circulos;
    public Container contenedor3;
    public GUI_Circulo(){
        Circulos= new JPanel(null);
            contenedor3 = getContentPane();
            Texcir = new JLabel("Valor del radio: ");
            ra = new JTextField(10);
            Aceptar1=new JButton();
            setVisible(true);
            setSize(400, 200);
            setTitle("Radio");
            setLocationRelativeTo(null);
            
            opecir();
            
    }
    public void opecir(){
        //Panel
            Circulos.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
            Circulos.setPreferredSize(new Dimension (400, 400));
            Circulos.setSize(400, 400);
         //Cajas de texto
            Texcir.setBounds(50,25,100,30);
            ra.setBounds(150,25, 100, 30);
            //Boton
            Aceptar1.setText("Calcular");
            Aceptar1.setPreferredSize(new Dimension (120,80));
            Aceptar1.setSize(100,50);
            Aceptar1.setBounds(155,100,100,30);
            //Agregar componentes al panel
            Circulos.add(Texcir);
            Circulos.add(ra);
            Circulos.add(Aceptar1);
            contenedor3.add(Circulos, BorderLayout.NORTH);
                //Crear Oyente
            OyenteAceptar1 oAceptar1 = new OyenteAceptar1();
            Aceptar1.addActionListener((ActionListener)oAceptar1);
            
        
    }

    private class OyenteAceptar1 implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            float rad;
            
            radio=ra.getText();
            rad=Float.parseFloat(radio);
            Op op = new Op();
            JOptionPane area= new JOptionPane();
            if(rad>0){

            area.showMessageDialog(null, "El area del circulo es: "+ op.AreaCirculo(rad)+ " cm^2", "Area" ,JOptionPane.PLAIN_MESSAGE);
            }else{
            area.showMessageDialog( null, "Syntax Error", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
}
