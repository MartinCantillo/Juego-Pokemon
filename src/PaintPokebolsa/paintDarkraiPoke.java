/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaintPokebolsa;

import PaintPokemon.*;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author marti
 */
public class paintDarkraiPoke extends JPanel {

    int x, y;

    public paintDarkraiPoke(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public paintDarkraiPoke() {

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        ImageIcon pok2 = new ImageIcon(getClass().getResource("/Images/dar3.png"));
        g.drawImage(pok2.getImage(), y, x, 120, 120, this);//fila 4 columna 5

    }
}
