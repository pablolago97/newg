/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damfight;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import controles.*;
/**
 *
 * @author Pablo
 */


public class Metodos extends Canvas implements Runnable{
    
    //Variable que determina la 'frame'
    private static JFrame ventana;
    
    //Estado del programa
    private static volatile boolean on = false;
    
    //Medidas de la 'frame'
    private static final int ANCHO = 800;
    private static final int ALTO = 600;
    
    //hilos
    public static Thread thread;
    private static Teclado teclado;
    
    //Nombre de la 'frame'
    private static final String NOMBRE = "Dam Fight";
    
    //Métodos
    void Juego (){
        
        setPreferredSize(new Dimension(ANCHO, ALTO));
        
        teclado = new Teclado();
        addKeyListener(teclado); 
            
        ventana = new JFrame(NOMBRE);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setLayout(new BorderLayout());
        ventana.add(this, BorderLayout.CENTER);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
}

    synchronized void iniciar(){
        on = true;
        thread = new Thread(this, "Gráficos");
        thread.start();
    }
    
    synchronized void detener(){
        on = false;
        
        try {
            thread.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void run() {
        while(on){
            
        }
    }
}
