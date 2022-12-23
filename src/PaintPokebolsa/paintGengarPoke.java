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
public class paintGengarPoke extends JPanel {

    int x, y;

    public paintGengarPoke(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public paintGengarPoke() {
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        ImageIcon gengar = new ImageIcon(getClass().getResource("/Images/gengar.png"));
        g.drawImage(gengar.getImage(), y, x, 115, 115, this);

    }
}
