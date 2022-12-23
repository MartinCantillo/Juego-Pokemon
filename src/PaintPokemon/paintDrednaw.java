/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaintPokemon;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author marti
 */
public class paintDrednaw extends JPanel {

    int x, y;

    public paintDrednaw(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        ImageIcon drednaw = new ImageIcon(getClass().getResource("/Images/drednaw.png"));
        g.drawImage(drednaw.getImage(), y, x, 100, 100, this);//fila 2 columna 6

    }
}
