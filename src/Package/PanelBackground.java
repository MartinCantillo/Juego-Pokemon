/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

import PaintPokemon.paintPicka;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author marti
 */
public class PanelBackground extends JPanel {

    Color colorFondo;
    Color color2 = Color.BLACK;

    int tammax, tam, cant, faltante;

    public PanelBackground() {
    }

    public PanelBackground(int tammax) {
        this.tammax = tammax;
        this.cant = 6;
        this.tam = tammax / cant;
        this.faltante = tammax % cant;

    }

    @Override
    public void paint(Graphics pintor) {
        super.paint(pintor);
        pintor.setColor(color2);
        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 6; y++) {
                // pintor.fillRect(x*tam, y*tam, tam-1, tam-1);
                pintor.fillRect(faltante / 2 + x * tam, faltante / 2 + y * tam, tam - 1, tam - 1); // esto es  para que el pintor grafique

            }
        }

    }

}
