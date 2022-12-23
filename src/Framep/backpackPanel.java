/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Framep;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author marti
 */
public class backpackPanel extends JPanel {

    Color colorFondo;
    Color color2 = Color.BLUE;

    int tammax, tam, cant, faltante;

    public backpackPanel() {
    }

    public backpackPanel(int tammax) {
        this.tammax = tammax;
        this.cant = 6;
        this.tam = tammax / cant;
        this.faltante = tammax % cant;
        this.colorFondo = Color.BLACK;
    }

    @Override
    public void paint(Graphics pintor) {
        super.paint(pintor);
        pintor.setColor(color2);
        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 6; y++) {
                pintor.fillRect(faltante / 2 + x * tam, faltante / 2 + y * tam, tam - 1, tam - 1);
            }
        }

    }
}
