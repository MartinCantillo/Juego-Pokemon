/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Package;

import Entity.PokemonEntity;
import Framep.RegisterPokemon;
import static Framep.RegisterPokemon.i;
import Framep.backpack;
import Framep.beginning;
import PaintPokemon.paintAsh;
import PaintPokemon.paintBulbasur;
import PaintPokemon.paintDarkrai;
import PaintPokemon.paintDrednaw;
import PaintPokemon.paintGengar;
import PaintPokemon.paintPicka;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import PaintPokemon.paintPicka;
import PaintPokemon.paintTonicroack;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author marti
 */
public class View extends javax.swing.JFrame {

    static PokemonEntity matriz[][] = new PokemonEntity[6][6];
    static PokemonEntity po = null;
    static PokemonEntity agregarpoke = null;
    public static PokemonEntity vectorP[] = new PokemonEntity[6];
    static private RegisterPokemon re = new RegisterPokemon();
    public static int incremento = 0, auxi = 0;
    public static ArrayList<PokemonEntity> pokebola = new ArrayList();

    public View() {

        initComponents();
        this.setTitle("Arena de combate");

        PanelBackground panel = new PanelBackground(650);
        ImageIcon campo = new ImageIcon(getClass().getResource("/IconFrame/campob.jpg"));
        this.setIconImage(campo.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.add(panel);
        panel.setOpaque(false);
        panel.setBounds(6, 6, 800, 800);

    }

    // le paso los parametros del registerPokemon 
    public View(RegisterPokemon i) {
        this.re = i;
    }
    //creo el objeto con los campos relleno

    public void LLenarvectorpokemon(int fila, int columna, String nombre, int comba_power, String tipo) {

        po = new PokemonEntity(fila, columna, nombre, comba_power, tipo);
        vectorP[incremento] = po;
        matriz[fila][columna] = po;
        incremento++;
        pokebola.add(po);

    }

//    public void imprimirmatriz(int fila, int columna) {
//        for (int j = 0; j < matriz.length; j++) {
//            for (int k = 0; k < matriz.length; k++) {
//                System.out.print(matriz[j][k] + " ");
//            }
//            System.out.println("");
//        }
//    }
    public void imprimir() {
//        for (PokemonEntity p1 : pokebola) {
//            //   JOptionPane.showMessageDialog(null, p1.toString());
//            System.out.println("Arena" + p1.toString());
//        }
        for (int j = 0; j < incremento; j++) {
            System.out.println("Arena" + vectorP[j].toString());
        }
    }

    public int Buscarpikachu() {
        String pi = "Pikachu";

        int pos = -1;
        for (int j = 0; j < pokebola.size(); j++) {
            if (pokebola.get(j).getNombre().equalsIgnoreCase(pi)) {
                pos = j;
            }
        }
        if (pos != -1) {
            return pos;
        } else {
            return pos;
        }
    }

    public int BuscarBulbasur() {
        String pi = "Bulbasur";

        int pos = -1;
        for (int j = 0; j < pokebola.size(); j++) {
            if (pokebola.get(j).getNombre().equalsIgnoreCase(pi)) {
                pos = j;
            }
        }
        if (pos != -1) {
            return pos;
        } else {
            return pos;
        }
    }

    public int BuscarGengar() {
        String pi = "Gengar";

        int pos = -1;
        for (int j = 0; j < pokebola.size(); j++) {
            if (pokebola.get(j).getNombre().equalsIgnoreCase(pi)) {
                pos = j;
            }
        }
        if (pos != -1) {
            return pos;
        } else {
            return pos;
        }
    }

    public int BuscarDarkrai() {
        String pi = "Darkrai";

        int pos = -1;
        for (int j = 0; j < pokebola.size(); j++) {
            if (pokebola.get(j).getNombre().equalsIgnoreCase(pi)) {
                pos = j;
            }
        }
        if (pos != -1) {
            return pos;
        } else {
            return pos;
        }
    }

    public int BuscarDrednaw() {
        String pi = "Drednaw";

        int pos = -1;
        for (int j = 0; j < pokebola.size(); j++) {
            if (pokebola.get(j).getNombre().equalsIgnoreCase(pi)) {
                pos = j;
            }
        }
        if (pos != -1) {
            return pos;
        } else {
            return pos;
        }
    }

    public int BuscarToricroak() {
        String pi = "Toricroak";

        int pos = -1;
        for (int j = 0; j < pokebola.size(); j++) {
            if (pokebola.get(j).getNombre().equalsIgnoreCase(pi)) {
                pos = j;
            }
        }
        if (pos != -1) {
            return pos;
        } else {
            return pos;
        }
    }

//    @Override
//    public void paint(Graphics g) {
//        super.paint(g);
////         paintPicka pa = new paintPicka();
////        this.add(pa);
//
//         ImageIcon bulbasur = new ImageIcon(getClass().getResource("/Images/bul3.png"));
//        g.drawImage(bulbasur.getImage(), 15, 270, 95, 95, this);//fila 2 columna 4
////        ImageIcon pok2 = new ImageIcon(getClass().getResource("/Images/dar3.png"));
////        ImageIcon pok3 = new ImageIcon(getClass().getResource("/Images/gengar.png"));
////        ImageIcon pokemon = new ImageIcon(getClass().getResource("/Images/picka3.png"));
////        ImageIcon pok4 = new ImageIcon(getClass().getResource("/Images/drednaw.png"));
////        ImageIcon pok5 = new ImageIcon(getClass().getResource("/Images/bul3.png"));
////        ImageIcon pok6 = new ImageIcon(getClass().getResource("/Images/toricroak.png"));
////        ImageIcon ash = new ImageIcon(getClass().getResource("/Images/ash3.png"));
////         g.drawImage(ash.getImage(), 15, 50, 100, 100, this);
////        //(x,y)
////        g.drawImage(pokemon.getImage(), 415, 550, 120, 120, this); //fila 5 columna 2
////        g.drawImage(pok2.getImage(), 215, 50, 120, 120, this);//fila 4 columna 5
////        g.drawImage(pok3.getImage(), 515, 265, 115, 115, this);//fila 5 columna 6
////        g.drawImage(pok4.getImage(), 15, 470, 100, 100, this);//fila 2 columna 6
////        g.drawImage(pok5.getImage(), 15, 270, 95, 95, this);//fila 2 columna 4
////        g.drawImage(pok6.getImage(), 515, 50, 120, 120, this);//fila 2 columna 4 // el tamaño de este cambia porque es mas pequeño que los otros
////        // las x el primero es 15, segundo 150 , tercero 215, cuarto 315 , cinco 415 , sexto 515
////        // las y el primero es 50 , el segundo es 150 , tercero 270 , cuarto 370, quinto 450 y sexto 550
////        // entre el x es menor mas a la izquierda y mayor para la derecha
////        // entre el y es menor mas para arriba y mayor para abajo
////
////        // para bul3 y drednaw en y el primero 70 , segundo 170 , tercero 270 , cuarto 370 , quinto 470 sexto en y es 570 
////        //dar3 el primero es 50, segundo 150
//    }
//    @Override
//    public void paint(Graphics g) {
//        super.paint(g);
//        CargarPikachu();
//        CargarBulbasur();
//        CargarGengar();
//        CargarDarkrai();
//        CargarDrednaw();
//        CargarToricroack();
////         ImageIcon bulbasur = new ImageIcon(getClass().getResource("/Images/bul3.png"));
////        g.drawImage(bulbasur.getImage(), 15, 270, 95, 95, this);//fila 2 columna 4
//
//    }
//    public void Pintarpicka(int x, int y) {
//        paintPicka pa = new paintPicka(x, y);
//        pa.paint(getGraphics());
//
//    }
//
//    public void Pintarbulba() {
//        paintBulbasur bu = new paintBulbasur();
//        bu.paint(getGraphics());
//
//    }
//
//    public void PintarDrednaw() {
//        paintDrednaw dr = new paintDrednaw();
//        dr.paint(getGraphics());
//
//    }
//
//    public void PintarDarkrai() {
//        paintDarkrai dar = new paintDarkrai();
//        dar.paint(getGraphics());
//
//    }
//
//    public void PintarGengar() {
//        paintGengar gengar = new paintGengar();
//        gengar.paint(getGraphics());
//
//    }
//
//    public void PintarToricroack() {
//        paintTonicroack tori = new paintTonicroack();
//        tori.paint(getGraphics());
//
//    }
//
//    public void CargarPikachu() {
//        int pikachu = 1;
//        PokemonEntity pi = new PokemonEntity(pikachu);
//        PokemonImplements pickaDao = new PokemonImplements();
//        pickaDao.MantenerCargadaImagenes(pi);
//        String m = pi.getNombre();
//        int x = pi.getFila();
//        int y = pi.getColumna();
//        System.out.println("fila " + x + " columna " + y);
//        System.out.println("nombre" + pi.getNombre());
//        if (pi.getNombre().equalsIgnoreCase("Pikachu")) {
//            paintPicka pa = new paintPicka(x, y);
//            pa.paint(getGraphics());
//        } else {
//            System.out.println("else que  es null");
//
//        }
//    }
//
//    public void CargarBulbasur() {
//        int bulbasur = 2;
//        //PokemonEntity pi = new PokemonEntity(bulbasur);
//        PokemonImplements pickaDao = new PokemonImplements();
//        pickaDao.MantenerCargadaImagenes(pi);
//        String m = pi.getNombre();
//        // System.out.println("Cargar Bulbasur " + m);
//
//        //System.out.println("Cargar pikachu" + pi.getCodigo());
//        if (m.equalsIgnoreCase("Bulbasur")) {
//            paintBulbasur pa = new paintBulbasur();
//            pa.paint(getGraphics());
//        } else {
//            System.out.println("else que  es null");
//
//        }
//    }
////
//
//    public void CargarGengar() {
//        int g = 3;
//
//        //        &//PokemonEntity pi = new PokemonEntity(g);
//        //        PokemonImplements pickaDao = new PokemonImplements();
//        //        pickaDao.MantenerCargadaImagenes(pi);
//        //        String m = pi.getNombre();
//        // System.out.println("Cargar Bulbasur " + m);
//        //System.out.println("Cargar pikachu" + pi.getCodigo());
//        if (m.equalsIgnoreCase("Gengar")) {
//            paintGengar pa = new paintGengar();
//            pa.paint(getGraphics());
//        } else {
//            System.out.println("else que  es null");
//
//        }
//
//    }
//
//    public void CargarDarkrai() {
//        int g = 4;
//        PokemonEntity pi = new PokemonEntity(g);
//        PokemonImplements pickaDao = new PokemonImplements();
//        pickaDao.MantenerCargadaImagenes(pi);
//        String m = pi.getNombre();
//        // System.out.println("Cargar Bulbasur " + m);
//
//        //System.out.println("Cargar pikachu" + pi.getCodigo());
//        if (m.equalsIgnoreCase("Darkrai")) {
//            paintDarkrai pa = new paintDarkrai();
//            pa.paint(getGraphics());
//        } else {
//            System.out.println("else que  es null");
//
//        }
//    }
//
//    public void CargarDrednaw() {
//        int g = 5;
//        PokemonEntity pi = new PokemonEntity(g);
//        PokemonImplements pickaDao = new PokemonImplements();
//        pickaDao.MantenerCargadaImagenes(pi);
//        String m = pi.getNombre();
//        if (m.equalsIgnoreCase("Drednaw")) {
//            paintDrednaw pa = new paintDrednaw();
//            pa.paint(getGraphics());
//        } else {
//            System.out.println("else que  es null");
//
//        }
//    }
//
//    public void CargarToricroack() {
//
//        int g = 6;
//        PokemonEntity pi = new PokemonEntity(g);
//        PokemonImplements pickaDao = new PokemonImplements();
//        pickaDao.MantenerCargadaImagenes(pi);
//        String m = pi.getNombre();
//        // System.out.println("Cargar Bulbasur " + m);
//
//        //System.out.println("Cargar pikachu" + pi.getCodigo());
//        if (m.equalsIgnoreCase("Toricroak")) {
//            paintTonicroack pa = new paintTonicroack();
//            pa.paint(getGraphics());
//        } else {
//            System.out.println("else que  es null");
//
//        }
//}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4inicio = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu10Buscarpokemon = new javax.swing.JMenu();
        jMenu10Agarrarpokemon1 = new javax.swing.JMenu();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jMenu6.setText("File");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar2.add(jMenu7);

        jMenu8.setText("File");
        jMenuBar3.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar3.add(jMenu9);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        jMenu4inicio.setBorder(null);
        jMenu4inicio.setText(" Inicio");
        jMenu4inicio.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenu4inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4inicioMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4inicio);

        jMenu5.setText("Pokebolsa");
        jMenu5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu10Buscarpokemon.setBorder(null);
        jMenu10Buscarpokemon.setText("Buscar");
        jMenu10Buscarpokemon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenu10Buscarpokemon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu10BuscarpokemonMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu10Buscarpokemon);

        jMenu10Agarrarpokemon1.setBorder(null);
        jMenu10Agarrarpokemon1.setText("  Agarrar");
        jMenu10Agarrarpokemon1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenu10Agarrarpokemon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu10Agarrarpokemon1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu10Agarrarpokemon1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu4inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4inicioMouseClicked
        beginning b = new beginning();
        this.setVisible(false);
        b.setVisible(true);
    }//GEN-LAST:event_jMenu4inicioMouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        backpack b = new backpack();
        this.setVisible(false);
        b.setVisible(true);

    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu10BuscarpokemonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu10BuscarpokemonMouseClicked
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite la fila", "Ingresar", JOptionPane.INFORMATION_MESSAGE));
        int y = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite la columna", "Ingresar", JOptionPane.INFORMATION_MESSAGE));
        int auxx = x, auxy = y, in = 0;
        if (x > 5 || y > 5) {
            JOptionPane.showMessageDialog(null, " Por favor verifique ", "Alerta", JOptionPane.WARNING_MESSAGE);

        } else {
            PokemonEntity n[] = new PokemonEntity[6];
            boolean bandera = false;
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
            if (auxx == 0 && auxy == 0) {

                for (int j = 0; j <= auxx + 1; j++) {
                    for (int k = 0; k <= auxy + 1; k++) {
                        if (matriz[j][k] != null) {
                            n[in] = matriz[j][k];
                            bandera = true;
                            in++;

                        }
                    }
                }
                if (bandera == true) {
                    paintAsh p = new paintAsh(x, y);
                    p.paint(getGraphics());
                    for (int j = 0; j < in; j++) {
                        JOptionPane.showMessageDialog(null, "" + n[j].toString(), "Informacion Pokemon cercano", JOptionPane.INFORMATION_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "No hay ningun pokemon cercano", "Alerta ", JOptionPane.WARNING_MESSAGE);
                }
            } else if ((auxx == 1 && auxy == 0) || (auxx == 2 && auxy == 0) || (auxx == 3 && auxy == 0) || (auxx == 4 && auxy == 0)) {
                for (int j = 0; j <= auxx + 1; j++) {
                    for (int k = 0; k <= auxy + 1; k++) {
                        if (matriz[j][k] != null) {
                            n[in] = matriz[j][k];
                            bandera = true;
                            in++;
                        }
                    }
                }
                if (bandera == true) {
                    paintAsh p = new paintAsh(x, y);
                    p.paint(getGraphics());
                    for (int j = 0; j < in; j++) {
                        JOptionPane.showMessageDialog(null, "" + n[j].toString(), "Informacion Pokemon cercano", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No hay ningun pokemon cercano", "Alerta ", JOptionPane.WARNING_MESSAGE);
                }
            } else if (auxx == 5 && auxy == 0) {

                for (int j = 4; j <= 5; j++) {
                    for (int k = 0; k <= auxy + 1; k++) {
                        if (matriz[j][k] != null) {
                            n[in] = matriz[j][k];
                            bandera = true;
                            in++;
                        }
                    }
                }
                if (bandera == true) {
                    paintAsh p = new paintAsh(x, y);
                    p.paint(getGraphics());
                    for (int j = 0; j < in; j++) {
                        JOptionPane.showMessageDialog(null, "" + n[j].toString(), "Informacion Pokemon cercano", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No hay ningun pokemon cercano", "Alerta ", JOptionPane.WARNING_MESSAGE);
                }
            } else if ((auxx == 5 && auxy == 1) || (auxx == 5 && auxy == 2) || (auxx == 5 && auxy == 3) || (auxx == 5 && auxy == 4)) {
                for (int j = 4; j <= 5; j++) {
                    for (int k = auxy - 1; k <= auxy + 1; k++) {
                        if (matriz[j][k] != null) {
                            n[in] = matriz[j][k];
                            bandera = true;
                            in++;
                        }
                    }
                }
                if (bandera == true) {
                    paintAsh p = new paintAsh(x, y);
                    p.paint(getGraphics());
                    for (int j = 0; j < in; j++) {
                        JOptionPane.showMessageDialog(null, "" + n[j].toString(), "Informacion Pokemon cercano", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No hay ningun pokemon cercano", "Alerta ", JOptionPane.WARNING_MESSAGE);
                }
            } else if (auxx == 5 && auxy == 5) {

                for (int j = 4; j <= 5; j++) {
                    for (int k = 4; k <= 5; k++) {
                        if (matriz[j][k] != null) {
                            n[in] = matriz[j][k];
                            bandera = true;
                            in++;
                        }
                    }
                }
                if (bandera == true) {
                    paintAsh p = new paintAsh(x, y);
                    p.paint(getGraphics());
                    for (int j = 0; j < in; j++) {
                        JOptionPane.showMessageDialog(null, "" + n[j].toString(), "Informacion Pokemon cercano", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No hay ningun pokemon cercano", "Alerta ", JOptionPane.WARNING_MESSAGE);
                }
            } else if ((auxx == 0 && auxy == 1) || (auxx == 0 && auxy == 2) || (auxx == 0 && auxy == 3) || (auxx == 0 && auxy == 4)) {
                for (int j = 0; j <= 1; j++) {
                    for (int k = auxy - 1; k <= auxy + 1; k++) {
                        if (matriz[j][k] != null) {
                            n[in] = matriz[j][k];
                            bandera = true;
                            in++;
                        }
                    }
                }
                if (bandera == true) {
                    paintAsh p = new paintAsh(x, y);
                    p.paint(getGraphics());
                    for (int j = 0; j < in; j++) {
                        JOptionPane.showMessageDialog(null, "" + n[j].toString(), "Informacion Pokemon cercano", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No hay ningun pokemon cercano", "Alerta ", JOptionPane.WARNING_MESSAGE);
                }
            } else if (auxx == 0 && auxy == 5) {

                for (int j = 0; j <= 1; j++) {
                    for (int k = 4; k <= 5; k++) {
                        if (matriz[j][k] != null) {
                            n[in] = matriz[j][k];
                            bandera = true;
                            in++;
                        }
                    }
                }
                if (bandera == true) {
                    paintAsh p = new paintAsh(x, y);
                    p.paint(getGraphics());
                    for (int j = 0; j < in; j++) {
                        JOptionPane.showMessageDialog(null, "" + n[j].toString(), "Informacion Pokemon cercano", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No hay ningun pokemon cercano", "Alerta ", JOptionPane.WARNING_MESSAGE);
                }
            } else if ((auxx == 1 && auxy == 5) || (auxx == 2 && auxy == 5) || (auxx == 3 && auxy == 5) || (auxx == 4 && auxy == 5)) {
                for (int j = auxx - 1; j <= auxx + 1; j++) {
                    for (int k = 4; k <= 5; k++) {
                        if (matriz[j][k] != null) {
                            n[in] = matriz[j][k];
                            bandera = true;
                            in++;
                        }
                    }
                }
                if (bandera == true) {
                    paintAsh p = new paintAsh(x, y);
                    p.paint(getGraphics());
                    for (int j = 0; j < in; j++) {
                        JOptionPane.showMessageDialog(null, "" + n[j].toString(), "Informacion Pokemon cercano", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No hay ningun pokemon cercano", "Alerta ", JOptionPane.WARNING_MESSAGE);
                }
            } else {

                for (int j = auxx - 1; j <= auxx + 1; j++) {
                    for (int k = auxy - 1; k <= auxy + 1; k++) {
                        if (matriz[j][k] != null) {
                            n[in] = matriz[j][k];
                            bandera = true;
                            in++;
                        }
                    }
                }
                if (bandera == true) {
                    paintAsh p = new paintAsh(x, y);
                    p.paint(getGraphics());
                    for (int j = 0; j < in; j++) {
                        JOptionPane.showMessageDialog(null, "" + n[j].toString(), "Informacion Pokemon cercano", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No hay ningun pokemon cercano", "Alerta ", JOptionPane.WARNING_MESSAGE);
                }
            }
        }

    }//GEN-LAST:event_jMenu10BuscarpokemonMouseClicked

    private void jMenu10Agarrarpokemon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu10Agarrarpokemon1MouseClicked

        String nombre = "", n = "";
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite la fila", "Ingresar", JOptionPane.INFORMATION_MESSAGE));
        int y = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite la columna", "Ingresar", JOptionPane.INFORMATION_MESSAGE));
        int auxx = x, auxy = y;
        boolean bandera = false;
        if (x > 5 || y > 5) {
            JOptionPane.showMessageDialog(null, " Por favor verifique ", "Alerta", JOptionPane.WARNING_MESSAGE);

        } else {
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
            backpack b;
            b = new backpack();
            for (int j = 0; j < i; j++) {
                if (vectorP[j].getFila() == auxx && vectorP[j].getColumna() == auxy) {
                    bandera = true;
                    nombre = vectorP[j].getNombre();
                    agregarpoke = vectorP[j];
                    // vectorP[j] = vectorP[j + 1];
                    pokebola.add(po);
                    b.LLenar(agregarpoke);
                }
            }

            if (bandera == true) {
                JOptionPane.showMessageDialog(null, " Pokemon " + nombre + " encontrado ", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                if (nombre.equalsIgnoreCase("Pikachu")) {
                    paintPicka p = new paintPicka(x, y);
                    p.paint(getGraphics());

                } else if (nombre.equalsIgnoreCase("Bulbasur")) {
                    paintBulbasur p = new paintBulbasur(x, y);
                    p.paint(getGraphics());

                } else if (nombre.equalsIgnoreCase("Gengar")) {
                    paintGengar p = new paintGengar(x, y);
                    p.paint(getGraphics());

                } else if (nombre.equalsIgnoreCase("Darkrai")) {
                    paintDarkrai p = new paintDarkrai(x, y);
                    p.paint(getGraphics());

                } else if (nombre.equalsIgnoreCase("Drednaw")) {
                    paintDrednaw p = new paintDrednaw(x, y);
                    p.paint(getGraphics());

                } else if (nombre.equalsIgnoreCase("Toricroak")) {
                    paintTonicroack p = new paintTonicroack(x, y);
                    p.paint(getGraphics());
                }

            } else {
                JOptionPane.showMessageDialog(null, " No existe Pokemon", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }

        }


    }//GEN-LAST:event_jMenu10Agarrarpokemon1MouseClicked

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5ActionPerformed

    /**
     * @param arg0
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(View.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10Agarrarpokemon1;
    private javax.swing.JMenu jMenu10Buscarpokemon;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4inicio;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    // End of variables declaration//GEN-END:variables

}
