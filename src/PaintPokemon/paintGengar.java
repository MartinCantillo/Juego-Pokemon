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
public class paintGengar extends JPanel {

    int x, y;

    public paintGengar(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        ImageIcon gengar = new ImageIcon(getClass().getResource("/Images/gengar.png"));
        g.drawImage(gengar.getImage(), y, x, 115, 115, this);//fila 5 columna 6

    }
}
