
package calculoedad;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.io.*;
import java.util.Formatter;

/**
 *
 * @author Joselito
 */
public class Calculoedad {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {

try{
            
Formatter outArchivo = new Formatter("edad.txt");

Calendar cal=new GregorianCalendar();
Scanner dato=new Scanner(System.in);
int diactual=cal.get(Calendar.DAY_OF_MONTH);
int mesactual=cal.get(Calendar.MONTH);
int yeractual=cal.get(Calendar.YEAR);
int dia,mes,anyo;
   //variables para los resultados
int diar,mesr,anyor;
     
    
System.out.println("dime un dia");
dia=dato.nextInt();
System.out.println("dime un mes");
mes=dato.nextInt();
System.out.println("dime un año");
anyo=dato.nextInt();
System.out.println("año es"+anyo);

mesr=Math.abs(mes-mesactual);
anyor=Math.abs(anyo-yeractual);
diar=diactual;

 outArchivo.format("%s \n","LA EDAD DE ES");
outArchivo.format("%s %d %s\n","Tienes: .",anyor," Años");
outArchivo.format("%s  %d %s\n"," Con ",mesr," meses");
outArchivo.format("%s %d %s \n"," y ",anyor," dia/s");
System.out.println("Tienes.."+anyor+"años "+"con"+mesr+"meses y"+diar+"dias");
outArchivo.close();
}catch (Exception ex) 
{  
//Captura un posible error le imprime en pantalla   
System.out.println(ex.getMessage());  
}
        
}
}

   
    
