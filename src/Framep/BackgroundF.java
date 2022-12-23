/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Framep;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author marti
 */
public class BackgroundF extends JPanel {

    public BackgroundF() {
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //pintor.setColor();
        ImageIcon i = new ImageIcon(getClass().getResource("/Images/reg.jpg"));
        g.drawImage(i.getImage(), 0, 0, 680, 680, this);//

    }
//
}
