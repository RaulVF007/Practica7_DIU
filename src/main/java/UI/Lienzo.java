/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author raulv
 */
public class Lienzo extends JPanel{
    
    private BufferedImage image = null;
    
    public void drawImage(BufferedImage img) {
        this.image = img;
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if(image!=null){
            this.setPreferredSize(new Dimension(image.getWidth(),image.getHeight()));
            g.drawImage(image, 0, 0, null);
        }
    }
}
