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
public class paintTonicroack extends JPanel {

    int x, y;

    public paintTonicroack(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        ImageIcon toricroack = new ImageIcon(getClass().getResource("/Images/toricroak.png"));
        g.drawImage(toricroack.getImage(), y, x, 120, 120, this);

    }

}
