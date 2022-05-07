/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujaimagen;

import javax.swing.JFrame;

/**
 *
 * @author carlos
 */
public class DibujaImagen {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
         Client_DibujaImagen application;
         // String ImagePath = "C:\\CASTELLON\\PMV_Parada\\img\\Contenido.png";    
         String ImagePath;    
         int seconds = 1;
         if (args.length  > 2){
            System.out.println("usage: java -jar DibujaImgen.jar file secconds ");
        } else{
          //  ImagePath = "/home/pi/PMV_Parada/img/" + args[0];
           ImagePath = "C:\\CASTELLON\\PMV_Parada\\img\\" + args[0];
          
          try{
               seconds = Integer.parseInt(args[1]);
            }catch  (NumberFormatException ex){
                ex.printStackTrace();
            }
            
            application = new Client_DibujaImagen (ImagePath,seconds); 
            application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
                        
            application.setSize(1280, 780);
            
            try {

                   Thread.sleep(500);                 // milliseconds .
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            application.setVisible(true);
            application.runClient();
        }
        
    }
    
}
