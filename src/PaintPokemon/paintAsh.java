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
public class paintAsh extends JPanel {

    private int x, y;

    public paintAsh(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public paintAsh() {

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        ImageIcon ash = new ImageIcon(getClass().getResource("/Images/ash3.png"));
        g.drawImage(ash.getImage(), y, x, 100, 100, this);

    }
}
