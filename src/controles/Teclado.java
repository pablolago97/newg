/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Pablo
 */
public final class Teclado implements KeyListener {
    
    private final static int numeroTeclas = 120;
    private final boolean[]teclas = new boolean[numeroTeclas];
    
    public boolean up;
    public boolean down;
    public boolean right;
    public boolean left;
    
    //Eventos mover pj's
    
    public void actualizar(){
        up = teclas[KeyEvent.VK_W];
        down = teclas[KeyEvent.VK_S];
        right = teclas[KeyEvent.VK_D];
        left = teclas[KeyEvent.VK_A];
    }

    
    public void keyTyped(KeyEvent e) {
        teclas[e.getKeyCode()] = true;
    }

    
    public void keyPressed(KeyEvent e) {
        teclas[e.getKeyCode()] = false;
    }

    
    public void keyReleased(KeyEvent e) {
    }
    
    
}
