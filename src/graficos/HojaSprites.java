/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Pablo
 */
public class HojaSprites {

    public int getANCHO() {
        return ANCHO;
    }
    
     private final int ANCHO;
     private final int ALTO;
     public final int[]pixeles;
     
     public HojaSprites(final String RUTA, final int ANCHO, final int ALTO){
         this.ANCHO = ANCHO;
         this.ALTO = ALTO;
         
         pixeles = new int[ANCHO * ALTO];
         BufferedImage imagen;
         
         try {
             imagen = ImageIO.read(HojaSprites.class.getResource(RUTA));
             imagen.getRGB(0, 0, ANCHO, ALTO, pixeles, 0, ANCHO);
         } catch (IOException ex) {
             Logger.getLogger(HojaSprites.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
}
