/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolphin;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import java.awt.Rectangle;
import java.awt.Robot;

public class Sprite {

    private int dx;
    private int dy;
    private int x;
    private int y;
    private int startX;
    private int startY;
    private Image image;
    double time = System.currentTimeMillis();
    boolean collided = false;
    boolean released = true;
    int forces = 3;
    ImageIcon ii;
    Robot robot;
    level l = new level();
    public int lvl = 0;

    public Sprite() throws Exception {
        
        initCraft();
    }
    
    public void initCraft() throws Exception{
        ii = new ImageIcon("Square.png");
        image = ii.getImage();
        x = 40;
        y = 500; 
    }


    public void move() {
        x += dx;
        y += dy;
        if(((System.currentTimeMillis() - time) > 500) && collided == false){
            dy++;
            time = System.currentTimeMillis();
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }
    
    public Rectangle getBounds(){
        return new Rectangle(x,y, 41,41);
    }
    
    public void collision(){
        Rectangle bounds = getBounds();
        Point ori = bounds.getLocation();
        collided = false;
        //First Level Intersections. For loops refuse to work
        if(lvl == 0){
            startX = 40;
            startY = 500;
            if(bounds.intersects(l.lev1.get(0))){
                if(side(l.lev1.get(0))){
                    dx = -dx;
                }else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev1.get(1))){
                if(side(l.lev1.get(1))){
                    dx = -dx;
                }
                else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev1.get(2))){
                lvl = 1;
                time = System.currentTimeMillis();
                collided = false;
                forces = 3;
                dx = 0;
                dy = 0;
                x = 600;
                y = -100;
                startX = x;
                startY = y;
            }
        }
        //level 2
        if(lvl == 1){
            if(bounds.intersects(l.lev2.get(0))){
                if(side(l.lev2.get(0))){
                    dx = -dx;
                }else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev2.get(1))){
                if(side(l.lev2.get(1))){
                    dx = -dx;
                }
                else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev2.get(2))){
                lvl = 2;
                time = System.currentTimeMillis();
                collided = false;
                forces = 3;
                dx = 0;
                dy = 0;
                x = 10;
                y = 500;
                startX = x;
                startY = y;
            }
        }
        //level 3
        if(lvl == 2){
            if(bounds.intersects(l.lev3.get(0))){
                if(side(l.lev3.get(0))){
                    dx = -dx;
                }else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev3.get(1))){
                if(side(l.lev3.get(1))){
                    dx = -dx;
                }
                else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev3.get(2))){
                if(side(l.lev3.get(2))){
                    dx = -dx;
                }else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev3.get(3))){
                if(side(l.lev3.get(3))){
                    dx = -dx;
                }
                else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev3.get(4))){
                if(side(l.lev3.get(4))){
                    dx = -dx;
                }
                else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev3.get(5))){
                if(side(l.lev3.get(5))){
                    dx = -dx;
                }
                else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev3.get(6))){
                lvl = 3;
                time = System.currentTimeMillis();
                collided = false;
                forces = 3;
                dx = 0;
                dy = 0;
                x = 180;
                y = 590;
                startX = x;
                startY = y;
            }
        }
        //level 4
        if(lvl == 3){
            if(bounds.intersects(l.lev4.get(0))){
                if(side(l.lev4.get(0))){
                    dx = -dx;
                }else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev4.get(1))){
                if(side(l.lev4.get(1))){
                    dx = -dx;
                }
                else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev4.get(2))){
                if(side(l.lev4.get(2))){
                    dx = -dx;
                }else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev4.get(3))){
                if(side(l.lev4.get(3))){
                    dx = -dx;
                }
                else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev4.get(4))){
                if(side(l.lev4.get(4))){
                    dx = -dx;
                }
                else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev4.get(5))){
                if(side(l.lev4.get(5))){
                    dx = -dx;
                }
                else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev4.get(6))){
                if(side(l.lev4.get(6))){
                    dx = -dx;
                }
                else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev4.get(7))){
                if(side(l.lev4.get(7))){
                    dx = -dx;
                }
                else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev4.get(8))){
                lvl = 4;
                time = System.currentTimeMillis();
                collided = false;
                forces = 3;
                dx = 0;
                dy = 0;
                x = 600;
                y = 550;
                startX = x;
                startY = y;
            }
        }
        //level 5
        if(lvl == 4){
            if(bounds.intersects(l.lev5.get(0))){
                if(side(l.lev5.get(0))){
                    dx = -dx;
                }else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev5.get(1))){
                if(side(l.lev5.get(1))){
                    dx = -dx;
                }
                else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev5.get(2))){
                if(side(l.lev5.get(2))){
                    dx = -dx;
                }
                else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev5.get(3))){
                if(side(l.lev5.get(3))){
                    dx = -dx;
                }
                else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev5.get(4))){
                lvl = 5;
                time = System.currentTimeMillis();
                collided = false;
                forces = 3;
                dx = 0;
                dy = 0;
                x = 50;
                y = 630;
                startX = x;
                startY = y;
            }
        }
        
        //level 6
        if(lvl == 5){
            if(bounds.intersects(l.lev6.get(0))){
                if(side(l.lev6.get(0))){
                    dx = -dx;
                }else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev6.get(1))){
                if(side(l.lev6.get(1))){
                    dx = -dx;
                }
                else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev6.get(2))){
                if(side(l.lev6.get(2))){
                    dx = -dx;
                }
                else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev6.get(3))){
                if(side(l.lev6.get(3))){
                    dx = -dx;
                }
                else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev6.get(4))){
                if(side(l.lev6.get(4))){
                    dx = -dx;
                }
                else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev6.get(5))){
                lvl = 6;
                time = System.currentTimeMillis();
                collided = false;
                forces = 3;
                dx = 0;
                dy = 0;
                x = 600;
                y = 400;
                startX = x;
                startY = y;
            }
        }
        
        //seventh level
        if(lvl == 6){
            if(bounds.getX() < 100){
                x = 100;
            }
            if(bounds.getX() > 1060){
                x = 1060;
            }
            if(bounds.intersects(l.lev7.get(0))){
                if(side(l.lev7.get(0))){
                    dx = -dx;
                }else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev7.get(1))){
                if(side(l.lev7.get(1))){
                    dx = -dx;
                }
                else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev7.get(2))){
                if(side(l.lev7.get(2))){
                    dx = -dx;
                }
                else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev7.get(3))){
                if(side(l.lev7.get(3))){
                    dx = -dx;
                }
                else{
                dy = -dy;
                }
                collided = true;
                forces = 3;
            }
            if(bounds.intersects(l.lev7.get(4))){
                lvl = 0;
                time = System.currentTimeMillis();
                collided = false;
                forces = 3;
                dx = 0;
                dy = 0;
                x = 40;
                y = 500;
                startX = x;
                startY = y;
            }
        }
    }
    
    boolean side(Rectangle r){
        Rectangle bounds = getBounds();
        System.out.println("in side " + bounds.getX() + " " + (r.getX()));
        if((bounds.getX() - (r.getX() + r.getWidth() + 3)) <= 0 && (bounds.getX() - (r.getX() + r.getWidth() + 2)) >=-6){
            //System.out.println("Hit side");
            return true;
        }
        if(((bounds.getX() + bounds.getWidth() + 3) - r.getX()) >= 0 && ((bounds.getX() + bounds.getWidth() + 2) - r.getX()) <= 6 ){
            //System.out.println("Hit side");
            return true;
        }
        return false;
    }
    
    int getLevel(){
        return lvl;
    }
    

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();
        
        if (key == KeyEvent.VK_ESCAPE) {
            time = System.currentTimeMillis();
            collided = false;
            forces = 3;
            dx = 0;
            dy = 0;
            x = startX;
            y = startY;
        }

        if (key == KeyEvent.VK_LEFT && released && forces > 0) {
            released = false;
            forces--;
            dx += -1;
            ii = new ImageIcon("L.png");
            image = ii.getImage();
        }

        if (key == KeyEvent.VK_RIGHT && released && forces > 0) {
            released = false;
            forces--;
            dx += 1;
            ii = new ImageIcon("R.png");
            image = ii.getImage();
        }

        if (key == KeyEvent.VK_UP && released && forces > 0) {
            released = false;
            forces--;
            dy += -1;
            ii = new ImageIcon("U.png");
            image = ii.getImage();
        }

        if (key == KeyEvent.VK_DOWN && released && forces > 0) {
            released = false;
            forces--;
            dy += 1;
            ii = new ImageIcon("D.png");
            image = ii.getImage();
        }
        if(key == KeyEvent.VK_A && released && forces > 0){
            released = false;
            forces--;
            dx += -2;
            ii = new ImageIcon("L.png");
            image = ii.getImage();
        }
        if(key == KeyEvent.VK_W && released && forces > 0){
            released = false;
            forces--;
            dy += -2;
            ii = new ImageIcon("U.png");
            image = ii.getImage();
        }
        if(key == KeyEvent.VK_D && released && forces > 0){
            released = false;
            forces--;
            dx += 2;
            ii = new ImageIcon("R.png");
            image = ii.getImage();
        }
        if(key == KeyEvent.VK_S && released && forces > 0){
            released = false;
            forces--;
            dy += 2;
            ii = new ImageIcon("D.png");
            image = ii.getImage();
        }
    }

    public void keyReleased(KeyEvent e) {
        
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_ESCAPE){
            released = true;
        }
        if (key == KeyEvent.VK_LEFT) {
            released = true;
            ii = new ImageIcon("Square.png");
            image = ii.getImage();
        }

        if (key == KeyEvent.VK_RIGHT) {
            //dx = 0;
            released = true;
            ii = new ImageIcon("Square.png");
            image = ii.getImage();
        }

        if (key == KeyEvent.VK_UP) {
           //dy = 0;
            released = true;
            ii = new ImageIcon("Square.png");
            image = ii.getImage();
        }

        if (key == KeyEvent.VK_DOWN) {
            //dy = 0;
            released = true;
            ii = new ImageIcon("Square.png");
            image = ii.getImage();
        }
        if(key == KeyEvent.VK_A){
            //dx = 0;
            released = true;
            ii = new ImageIcon("Square.png");
            image = ii.getImage();
        }
        if(key == KeyEvent.VK_W){
            //dy = 0;
            released = true;
            ii = new ImageIcon("Square.png");
            image = ii.getImage();
        }
        if(key == KeyEvent.VK_D){
            //dx = 0;
            released = true;
            ii = new ImageIcon("Square.png");
            image = ii.getImage();
        }
        if(key == KeyEvent.VK_S){
            //dy = 0;
            released = true;
            ii = new ImageIcon("Square.png");
            image = ii.getImage();
        }
    }
}
