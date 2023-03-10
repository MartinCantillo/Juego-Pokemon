/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Framep;

import Entity.PokemonEntity;
import Package.View;
import PaintPokebolsa.*;
import PaintPokemon.paintDarkrai;
import PaintPokemon.paintGengar;
import java.awt.Graphics;
import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

/**
 *
 * @author marti
 */
public class backpack extends javax.swing.JFrame {

    /**
     *
     */
    public static LinkedList<PokemonEntity> lista = new LinkedList<>();
    DefaultListModel modelo = new DefaultListModel();
    public static PokemonEntity vectorPo[] = new PokemonEntity[6];
    // static private RegisterPokemon re = new RegisterPokemon();
    public static int i = 0, auxi = 0;

    public backpack() {
        initComponents();
        this.setTitle("Pokebolsa");
        ImageIcon campo = new ImageIcon(getClass().getResource("/ImagesR/PickaHuevo.png"));
        this.setIconImage(campo.getImage());
        this.setLocationRelativeTo(null);
        backpackPanel b = new backpackPanel(650);
        this.add(b);
        b.setBounds(6, 6, 800, 800);
        mostrarrehistrados();
        this.setResizable(false);
        // this.list1lista.setModel(modelo);
        this.jListMostrar.setModel(modelo);

    }

    public void LLenar(PokemonEntity e) {
        vectorPo[i] = e;
        lista.add(e);
        i++;
    }
//
//    public void recorrermostrar() {
//        int auxx, auxy;
//        for (int j = 0; j < i; j++) {
//            if (vectorPo[j].getNombre().equalsIgnoreCase("Pikachu")) {
//                auxx = vectorPo[j].getFila();
//                auxy = vectorPo[j].getColumna();
//            } else if (vectorPo[j].getNombre().equalsIgnoreCase("Bulbasur")) {
//                auxx = vectorPo[j].getFila();
//                auxy = vectorPo[j].getColumna();
//            } else if (vectorPo[j].getNombre().equalsIgnoreCase("Gengar")) {
//                auxx = vectorPo[j].getFila();
//                auxy = vectorPo[j].getColumna();
//            } else if (vectorPo[j].getNombre().equalsIgnoreCase("Darkrai")) {
//                auxx = vectorPo[j].getFila();
//                auxy = vectorPo[j].getColumna();
//            } else if (vectorPo[j].getNombre().equalsIgnoreCase("Drednaw")) {
//                auxx = vectorPo[j].getFila();
//                auxy = vectorPo[j].getColumna();
//            } else if (vectorPo[j].getNombre().equalsIgnoreCase("Toricroak")) {
//                auxx = vectorPo[j].getFila();
//                auxy = vectorPo[j].getColumna();
//            }
//        }
//    }

//    public void comparar() {
//        Collections.sort(lista);
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListMostrar = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2arena = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Informacion Pokemones");

        jScrollPane1.setViewportView(jListMostrar);

        jMenu1.setText("Inicio");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2arena.setText("Arena");
        jMenu2arena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2arenaMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2arena);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(660, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        beginning b = new beginning();
        this.setVisible(false);
        b.setVisible(true);

    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2arenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2arenaMouseClicked
        View v = new View();
        this.setVisible(false);
        v.setVisible(true);
    }//GEN-LAST:event_jMenu2arenaMouseClicked

    /**
     * @param g
     * @param args the command line arguments
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        CargarPikachu();
        CargarBulbasur();
        CargarGengar();
        CargarDarkrai();
        CargarDrednaw();
        CargarToricroack();

    }

    public void CargarPikachu() {
        int x, y, auxx, auxy;
        for (int j = 0; j < i; j++) {
            if (vectorPo[j].getNombre().equalsIgnoreCase("Pikachu")) {
                auxx = vectorPo[j].getFila();
                auxy = vectorPo[j].getColumna();
                x = auxx;
                y = auxy;

                switch (x) {
                    case 0 ->
                        x = 65;

                    case 1 ->
                        x = 180;
                    case 2 ->
                        x = 280;
                    case 3 ->
                        x = 390;
                    case 4 ->
                        x = 500;
                    case 5 ->
                        x = 600;

                }
                switch (y) {
                    case 0 ->
                        y = 20;
                    case 1 ->
                        y = 120;
                    case 2 ->
                        y = 240;
                    case 3 ->
                        y = 340;
                    case 4 ->
                        y = 442;
                    case 5 ->
                        y = 555;
                }
                paintPickaPoke pa = new paintPickaPoke(x, y);
                pa.paint(getGraphics());

            } else {
                // break;
            }
        }

    }

    public void CargarBulbasur() {
        int auxx, x, auxy, y;
        for (int j = 0; j < i; j++) {
            if (vectorPo[j].getNombre().equalsIgnoreCase("Bulbasur")) {
                auxx = vectorPo[j].getFila();
                auxy = vectorPo[j].getColumna();
                x = auxx;
                y = auxy;

                switch (x) {
                    case 0 ->
                        x = 65;
                    case 1 ->
                        x = 180;
                    case 2 ->
                        x = 280;
                    case 3 ->
                        x = 390;
                    case 4 ->
                        x = 500;
                    case 5 ->
                        x = 600;

                }
                switch (y) {
                    case 0 ->
                        y = 20;
                    case 1 ->
                        y = 120;
                    case 2 ->
                        y = 240;
                    case 3 ->
                        y = 340;
                    case 4 ->
                        y = 442;
                    case 5 ->
                        y = 555;
                }
                paintBulbasurPoke pa = new paintBulbasurPoke(x, y);
                pa.paint(getGraphics());

            } else {
                // break;
            }
        }
    }

    public void CargarGengar() {
        int auxx, x, auxy, y;
        for (int j = 0; j < i; j++) {
            if (vectorPo[j].getNombre().equalsIgnoreCase("Gengar")) {
                auxx = vectorPo[j].getFila();
                auxy = vectorPo[j].getColumna();
                x = auxx;
                y = auxy;

                switch (x) {
                    case 0 ->
                        x = 65;
                    case 1 ->
                        x = 180;
                    case 2 ->
                        x = 280;
                    case 3 ->
                        x = 390;
                    case 4 ->
                        x = 500;
                    case 5 ->
                        x = 600;

                }
                switch (y) {
                    case 0 ->
                        y = 20;
                    case 1 ->
                        y = 120;
                    case 2 ->
                        y = 240;
                    case 3 ->
                        y = 340;
                    case 4 ->
                        y = 442;
                    case 5 ->
                        y = 555;
                }
                paintGengar pa = new paintGengar(x, y);
                pa.paint(getGraphics());

            } else {
                // break;
            }
        }

    }

    public void CargarDarkrai() {
        int auxx, x, auxy, y;
        for (int j = 0; j < i; j++) {
            if (vectorPo[j].getNombre().equalsIgnoreCase("Darkrai")) {
                auxx = vectorPo[j].getFila();
                auxy = vectorPo[j].getColumna();
                x = auxx;
                y = auxy;

                switch (x) {
                    case 0 ->
                        x = 65;
                    case 1 ->
                        x = 180;
                    case 2 ->
                        x = 280;
                    case 3 ->
                        x = 390;
                    case 4 ->
                        x = 500;
                    case 5 ->
                        x = 600;

                }
                switch (y) {
                    case 0 ->
                        y = 20;
                    case 1 ->
                        y = 120;
                    case 2 ->
                        y = 240;
                    case 3 ->
                        y = 340;
                    case 4 ->
                        y = 442;
                    case 5 ->
                        y = 555;
                }
                paintDarkrai pa = new paintDarkrai(x, y);
                pa.paint(getGraphics());

            } else {
                //break;
            }
        }
    }

    public void CargarDrednaw() {
        int auxx, x, auxy, y;
        for (int j = 0; j < i; j++) {
            if (vectorPo[j].getNombre().equalsIgnoreCase("Drednaw")) {
                auxx = vectorPo[j].getFila();
                auxy = vectorPo[j].getColumna();
                x = auxx;
                y = auxy;

                switch (x) {
                    case 0 ->
                        x = 65;
                    case 1 ->
                        x = 180;
                    case 2 ->
                        x = 280;
                    case 3 ->
                        x = 390;
                    case 4 ->
                        x = 500;
                    case 5 ->
                        x = 600;
                }
                switch (y) {
                    case 0 ->
                        y = 20;
                    case 1 ->
                        y = 120;
                    case 2 ->
                        y = 240;
                    case 3 ->
                        y = 340;
                    case 4 ->
                        y = 442;
                    case 5 ->
                        y = 555;
                }
                paintDrednawPoke pa = new paintDrednawPoke(x, y);
                pa.paint(getGraphics());
            } else {
                // break;
            }
        }
    }

    public void CargarToricroack() {
        int auxx, x, auxy, y;
        for (int j = 0; j < i; j++) {
            if (vectorPo[j].getNombre().equalsIgnoreCase("Toricroak")) {
                auxx = vectorPo[j].getFila();
                auxy = vectorPo[j].getColumna();
                x = auxx;
                y = auxy;

                switch (x) {
                    case 0 ->
                        x = 65;
                    case 1 ->
                        x = 180;
                    case 2 ->
                        x = 280;
                    case 3 ->
                        x = 390;
                    case 4 ->
                        x = 500;
                    case 5 ->
                        x = 600;
                }
                switch (y) {
                    case 0 ->
                        y = 20;
                    case 1 ->
                        y = 120;
                    case 2 ->
                        y = 240;
                    case 3 ->
                        y = 340;
                    case 4 ->
                        y = 442;
                    case 5 ->
                        y = 555;
                }
                paintTonicroackPoke pa = new paintTonicroackPoke(x, y);
                pa.paint(getGraphics());
            } else {
                //break;
            }
        }
    }

    public void mostrarrehistrados() {

        Collections.sort(lista);

        for (PokemonEntity l : lista) {
            modelo.addElement(l.toString());

//            System.out.println("Lista forech---------");
//            System.out.println("E"+ lista);}
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(backpack.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(backpack.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(backpack.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(backpack.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new backpack().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListMostrar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2arena;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
