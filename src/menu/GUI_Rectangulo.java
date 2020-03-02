
package menu;

import Operaciones.Op;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.BevelBorder;

/**
 *
 * @author SP314-51
 */
public class GUI_Rectangulo extends JFrame{
    String RecAlt="", RecBas="";
    public  JTextField numrecbas;
    public JButton Aceptar3;
    public JTextField numrecalt;
    public JLabel Texbas, Texalt;
    public JPanel  Rectangulos;
    public Container contenedor5;
    public GUI_Rectangulo(){
        Rectangulos= new JPanel(null);
            contenedor5 = getContentPane();
            Texbas = new JLabel("Valor de la base: ");
            numrecbas = new JTextField(10);
            Texalt= new JLabel("Valor de la altura: ");
            numrecalt = new JTextField(10);
            Aceptar3 =new JButton();
            setVisible(true);
            setSize(400, 200);
            setTitle("Dimenciones");
            operect();
            setLocationRelativeTo(null);
            
    }
    
    public void operect(){
         //Panel
            Rectangulos.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
            Rectangulos.setPreferredSize(new Dimension (400, 400));
            Rectangulos.setSize(400, 400);
            
            //Cajas de texto
            Texbas.setBounds(50,25,100,30);
            numrecbas.setBounds(150,25, 100, 30);
            Texalt.setBounds(50,45,200,60);
            numrecalt.setBounds(155,60,100,30);
            //Boton
            Aceptar3.setText("Calcular");
            Aceptar3.setPreferredSize(new Dimension (120,80));
            Aceptar3.setSize(100,50);
            Aceptar3.setBounds(155,100,100,30);
            
            //Agregar cajas de texto y botones al Panel
            Rectangulos.add(Texbas);
            Rectangulos.add(numrecbas);
            Rectangulos.add(Texalt);
            Rectangulos.add(numrecalt);
            Rectangulos.add(Aceptar3);
            contenedor5.add(Rectangulos, BorderLayout.NORTH);
            //Crear oyente
            OyenteAceptar3 oAceptar3= new OyenteAceptar3();
            //registrodeoyente
            Aceptar3.addActionListener((ActionListener)oAceptar3);
    }

    private class OyenteAceptar3 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            float basrec, altrec, arec;
            RecAlt=numrecalt.getText();
            RecBas=numrecbas.getText();
            basrec=Float.parseFloat(RecBas);
            altrec=Float.parseFloat(RecAlt);
            Op op = new Op();
            JOptionPane area= new JOptionPane();
            if(altrec>0 && basrec>0){

            area.showMessageDialog(null, "El area del rectangulo es: "+ op.AreaRectangulo(basrec, altrec)+ " cm^2", "Area" ,JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
    
}
