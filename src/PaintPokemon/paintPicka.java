/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaintPokemon;

import Package.View;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author marti
 */
public class paintPicka extends JPanel {

    private int x, y;

    public paintPicka(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public paintPicka() {

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        ImageIcon picka = new ImageIcon(getClass().getResource("/Images/picka3.png"));
        g.drawImage(picka.getImage(), y, x, 120, 120, this);

    }
//

}
