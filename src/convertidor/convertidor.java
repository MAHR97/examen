/*Resuelve el siguiente problema elaborando un programa que tenga 
 *una GUI. Debe usar los elementos vistos en clases para hacer una
 *interfaz atractiva al usuario. 
 *Se evaluará la solución correcta del problema y el uso de 
 *contenedores, layout managers, componentes y listeners:

Elabora un programa que pida una cantidad y especifique el 
tipo de moneda origen para que permita al usuario convertirla 
a un tipo de moneda destino. Los tipos de monedas pueden ser 
dólares, euros o pesos.*/


package convertidor;
 
import javax.swing.*;
import java.awt.*;


public class convertidor extends JFrame {
		
		public convertidor() {
			
			JFrame ventana = new JFrame("Convertidor de divisas");
			
			JButton btn1;
			JTextField div;
			JLabel text1, text2;
			JTextArea res;
			float total;
			
			JPanel conv = new JPanel();
			conv.setBorder(javax.swing.BorderFactory.createTitledBorder("Divisas"));
			
			text1 = new JLabel ("Convertir:");
			conv.add(text1);
			
			div = new JTextField("Ingrese el monto que desea convertir:");
			conv.add(div);
			
			JComboBox combo1 = new JComboBox();
			combo1.setBounds(10,10,80,20);
	        conv.add(combo1);
	        combo1.addItem("Dólares");
	        combo1.addItem("Euros");
	        combo1.addItem("Pesos");
	       
	        text2 = new JLabel ("A:");
	        conv.add(text2);
	        
	        JComboBox combo2 = new JComboBox();
			combo1.setBounds(10,10,80,20);
	        conv.add(combo2);
	        combo2.addItem("Dólares");
	        combo2.addItem("Euros");
	        combo2.addItem("Pesos");
	        
	        btn1 = new JButton("Convertir");
	        conv.add(btn1);
	        
            /*operaciones();
	        
	        res = new JTextArea();*/
	        
		}
		
		/*public void operaciones() {
			
			double entrante, saliente, dp, de, pe, pd, ed, ep;
			double d =, p, e;
			
			
			
			de = d * 20;
			dp = d * 0.5;
			pe = p * 0.05;
			
			
		}*/
	
	public static void main(String[] args) {
		convertidor ventana = new convertidor();
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ventana.pack();
	}
}
