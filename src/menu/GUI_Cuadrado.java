
package menu;

/**
 *
 * @author SP314-51
 */
import Operaciones.Op;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.BevelBorder;

public class GUI_Cuadrado extends JFrame {
    String Lado="";
    public JTextField lad;
    public JButton Aceptar2;
    public JTextField num3;
    public JLabel Texcua;
    public JPanel Cuadrados;
    public Container contenedor4;
    
    public GUI_Cuadrado(){
        
             Cuadrados= new JPanel(null);
            contenedor4 = getContentPane();
            Texcua = new JLabel("Valor del Lado: ");
            lad = new JTextField(10);
            Aceptar2=new JButton();
            setVisible(true);
            setSize(400, 200);
            setTitle("Lado");
            setLocationRelativeTo(null);
            
            opecua();
    
    }
    public void opecua(){
        //Panel
            Cuadrados.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
            Cuadrados.setPreferredSize(new Dimension (400, 400));
            Cuadrados.setSize(400, 400);
         //Cajas de texto
            Texcua.setBounds(50,25,100,30);
            lad.setBounds(150,25, 100, 30);
            //Boton
            Aceptar2.setText("Calcular");
            Aceptar2.setPreferredSize(new Dimension (120,80));
            Aceptar2.setSize(100,50);
            Aceptar2.setBounds(155,100,100,30);
            
            Cuadrados.add(Texcua);
            Cuadrados.add(lad);
            Cuadrados.add(Aceptar2);
            contenedor4.add(Cuadrados, BorderLayout.NORTH);
            //crear oyente
            OyenteAceptar2 oAceptar2= new OyenteAceptar2();
            Aceptar2.addActionListener((ActionListener)oAceptar2);
    }

    private class OyenteAceptar2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            float areacua;
            
            Lado=lad.getText();
            areacua=Float.parseFloat(Lado);
            Op op = new Op();
            JOptionPane area= new JOptionPane();
            if(areacua>0){

            area.showMessageDialog(null, "El area del cuadrado es: "+ op.Cuadrado(areacua)+ " cm^2", "Area" ,JOptionPane.PLAIN_MESSAGE);
            }else{
            area.showMessageDialog( null, "Syntax Error", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
