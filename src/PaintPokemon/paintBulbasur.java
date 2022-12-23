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
public class paintBulbasur extends JPanel {

    int x, y;

    public paintBulbasur(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        ImageIcon bulbasur = new ImageIcon(getClass().getResource("/Images/bul3.png"));
        g.drawImage(bulbasur.getImage(), y, x, 95, 95, this);

    }

}
