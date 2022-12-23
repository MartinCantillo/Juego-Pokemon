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
public class paintTonicroackPoke extends JPanel {

    int x, y;

    public paintTonicroackPoke(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public paintTonicroackPoke() {
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        ImageIcon toricroack = new ImageIcon(getClass().getResource("/Images/toricroak.png"));
        g.drawImage(toricroack.getImage(), y, x, 120, 120, this);

    }

}
