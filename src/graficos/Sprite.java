/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

/**
 *
 * @author Pablo
 */
public final class Sprite {
    
    private final int LADO;
    
    private int x;
    private int y;
    
    public int[] pixeles;
    private final HojaSprites HOJA;
    
    //Cargar px
    public Sprite(final int LADO, final int COLUMNA, final int FILA, final HojaSprites HOJA){
        
        this.LADO=LADO;
        pixeles = new int[LADO * LADO];
        
        this.x = COLUMNA*LADO;
        this.y = FILA*LADO;
        this.HOJA = HOJA;
        
        for(int y = 0; y<LADO;y++){
            for(int x = 0; x<LADO;x++){
        pixeles[x+y*LADO] = HOJA.pixeles[(x+this.x)+(y+this.y)*HOJA.getANCHO()];
    }
    
}
    }
}
