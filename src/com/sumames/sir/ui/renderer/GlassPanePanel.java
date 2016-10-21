package com.sumames.sir.ui.renderer;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.RenderingHints;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import javax.swing.JPanel;

/**
 *
 * @author usu
 */
public class GlassPanePanel extends JPanel {

    public GlassPanePanel() {
        super();
        setLayout(null);
        setOpaque(false);
        addMouseListener(new MouseAdapter() {
        });
        addKeyListener(new KeyAdapter() {
        });
    }

    public void showPanel(JPanel panel, Dimension size) {
        removeAll();
        this.setLayout(new GridBagLayout());
        add(panel, new GridBagConstraints());
        panel.setSize(size.width, size.height);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        GradientPaint paint = new GradientPaint(0, 0, Color.LIGHT_GRAY, getWidth(), getHeight(), Color.GRAY);

        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setComposite(AlphaComposite.SrcOver.derive(0F));
        g2.setPaint(paint);
        g2.fillRect(0, 0, getWidth(), getHeight());
//          super.paintComponent(g); 
//            Graphics2D g2d = (Graphics2D) g.create();
//            GraphicsUtilities.applyQualityRenderingHints(g2d);
//            int width = getWidth() - 1;
//            int height = getHeight() - 1;
//            int buffer = FRAME / 2;
//            RoundRectangle2D base = new RoundRectangle2D.Double(buffer, buffer, width - FRAME, height - FRAME, RADIUS, RADIUS);
//            g2d.setColor(new Color(0, 0, 0, 128));
//            g2d.fill(base);
//            g2d.setColor(Color.WHITE);
//            g2d.setStroke(new BasicStroke(FRAME, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
//            g2d.draw(base);
//            g2d.dispose();
    }
}
