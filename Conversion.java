
import javax.swing.JOptionPane;
// realizado por Jose A. Barranes S.
public class Conversion {
	public static void main(String[] args) {

    	String resp2 = "De Colones a Dolares";
    	String resp1 = "Conversión de Monedas";
    	Double monto = 0.0;
    	Double tipocambio = 0.0;
    	Double total = 0.0;
        
        String[] conversion = {
                "Conversión de Monedas", 
                "Conversión de Temperatura",
            };
        
        resp1 = (String) JOptionPane.showInputDialog(null, "Seleccione la conversión deseada", "Conversión", JOptionPane.DEFAULT_OPTION, null, conversion, conversion[0]);
 
        if (resp1 ==  "Conversión de Monedas") {
        	
        	String[] tiposdecambio = {
                "De Colones a Dolares",
                "De Colones a Euros",
                "De Colones a Libras",
                "De Colones a Yen"
            };
        	resp2 = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de moneda", " moneda", JOptionPane.DEFAULT_OPTION, null, tiposdecambio, tiposdecambio[0]);
        	
        	monto = Double.parseDouble (JOptionPane.showInputDialog("Digitar el monto a convertir",  1));
        	tipocambio = Double.parseDouble (JOptionPane.showInputDialog("Digitar el tipo de cambio",  1));
        	
        	total = tipocambio * monto;
	         String dialogo = resp1 +"\n"+resp2 +"\nMonto a Convertir  " + monto + "\nTipo de Cambio " + tipocambio +"\nResultado  " + total;
	  	      JOptionPane.showMessageDialog(null, dialogo);
        
       }
       if (resp1 == "Conversión de Temperatura") {
    	   String[] tiposdetemperatura = {
                   "De Celsius a Fahrenheit",
                   "De Fahrenheit a Celsius",
               };
           	resp2 = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de conversion", " moneda", JOptionPane.DEFAULT_OPTION, null, tiposdetemperatura, tiposdetemperatura[0]);
           	
           	monto = Double.parseDouble (JOptionPane.showInputDialog("Digitar la temperatura",  1));
           	if (resp2 == "De Celsius a Fahrenheit") {
         
         		total = monto * 1.8 + 32;
           		String dialogo = resp1 +"\n"+resp2 +"\nTemperatura a Convertir  " + monto +"\nResultado en Fahrenheit  " + total;
           		JOptionPane.showMessageDialog(null, dialogo);
           	} else { 
           		total = (monto - 32) / 1.8;
           		String dialogo = resp1 +"\n"+resp2 +"\nTemperatura a Convertir  " + monto +"\nResultado en Fahrenheit  " + total;
           		JOptionPane.showMessageDialog(null, dialogo);
           	}
       }
	}
}
