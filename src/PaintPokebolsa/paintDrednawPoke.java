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
public class paintDrednawPoke extends JPanel {

    int x, y;

    public paintDrednawPoke(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public paintDrednawPoke() {

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        ImageIcon drednaw = new ImageIcon(getClass().getResource("/Images/drednaw.png"));
        g.drawImage(drednaw.getImage(), y, x, 100, 100, this);//fila 2 columna 6

    }
}
