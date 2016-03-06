/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolphin;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Board extends JPanel implements ActionListener {

    private Timer timer;
    private Sprite craft;
    private final int DELAY = 10;
    private int lvl = 0;
    level l = new level();
    ImageIcon ii = new ImageIcon("BG_1.png");

    public Board() throws Exception {

        initBoard();
    }
    
    private void initBoard() throws Exception {
        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.WHITE);

        craft = new Sprite();
        timer = new Timer(DELAY, this);
        timer.start();        
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
        Toolkit.getDefaultToolkit().sync();
    }

    private void doDrawing(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.black);
        //draw the first level. for loops again refused to work
        if(lvl == 0){
            g2d.draw(l.lev1.get(0));
            g2d.fill(l.lev1.get(0));
            g2d.draw(l.lev1.get(1));
            g2d.fill(l.lev1.get(1));
            g2d.draw(l.lev1.get(2));
        }
        //second level
        if(lvl == 1){
            g2d.draw(l.lev2.get(0));
            g2d.fill(l.lev2.get(0));
            g2d.draw(l.lev2.get(1));
            g2d.fill(l.lev2.get(1));
            g2d.draw(l.lev2.get(2));
        }
        //third level
        if(lvl == 2){
            g2d.draw(l.lev3.get(0));
            g2d.fill(l.lev3.get(0));
            g2d.draw(l.lev3.get(1));
            g2d.fill(l.lev3.get(1));
            g2d.draw(l.lev3.get(2));
            g2d.fill(l.lev3.get(2));
            g2d.draw(l.lev3.get(3));
            g2d.fill(l.lev3.get(3));
            g2d.draw(l.lev3.get(4));
            g2d.fill(l.lev3.get(4));
            g2d.draw(l.lev3.get(5));
            g2d.fill(l.lev3.get(5));
            g2d.draw(l.lev3.get(6));
        }
        //fourth level
        if(lvl == 3){
            g2d.draw(l.lev4.get(0));
            g2d.fill(l.lev4.get(0));
            g2d.draw(l.lev4.get(1));
            g2d.fill(l.lev4.get(1));
            g2d.draw(l.lev4.get(2));
            g2d.fill(l.lev4.get(2));
            g2d.draw(l.lev4.get(3));
            g2d.fill(l.lev4.get(3));
            g2d.draw(l.lev4.get(4));
            g2d.fill(l.lev4.get(4));
            g2d.draw(l.lev4.get(5));
            g2d.fill(l.lev4.get(5));
            g2d.draw(l.lev4.get(6));
            g2d.fill(l.lev4.get(6));
            g2d.draw(l.lev4.get(7));
            g2d.fill(l.lev4.get(7));
            g2d.draw(l.lev4.get(8));
        }
        //fifth level
        if(lvl == 4){
            g2d.draw(l.lev5.get(0));
            g2d.fill(l.lev5.get(0));
            g2d.draw(l.lev5.get(1));
            g2d.fill(l.lev5.get(1));
            g2d.draw(l.lev5.get(2));
            g2d.fill(l.lev5.get(2));
            g2d.draw(l.lev5.get(3));
            g2d.fill(l.lev5.get(3));
            g2d.draw(l.lev5.get(4));
        }
        //sixth level
        if(lvl == 5){
            g2d.draw(l.lev6.get(0));
            g2d.fill(l.lev6.get(0));
            g2d.draw(l.lev6.get(1));
            g2d.fill(l.lev6.get(1));
            g2d.draw(l.lev6.get(2));
            g2d.fill(l.lev6.get(2));
            g2d.draw(l.lev6.get(3));
            g2d.fill(l.lev6.get(3));
            g2d.draw(l.lev6.get(4));
            g2d.fill(l.lev6.get(4));
            g2d.draw(l.lev6.get(5));
        }
        
        //seventh level
        if(lvl == 6){
            g2d.draw(l.lev7.get(0));
            g2d.fill(l.lev7.get(0));
            g2d.draw(l.lev7.get(1));
            g2d.fill(l.lev7.get(1));
            g2d.draw(l.lev7.get(2));
            g2d.fill(l.lev7.get(2));
            g2d.draw(l.lev7.get(3));
            g2d.fill(l.lev7.get(3));
            g2d.draw(l.lev7.get(4));
        }
        g2d.drawImage(craft.getImage(), craft.getX(), craft.getY(), this);        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        lvl = craft.getLevel();
        craft.collision();
        craft.move();
        repaint();  
    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            craft.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            craft.keyPressed(e);
        }
    }
}
