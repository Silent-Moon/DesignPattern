package com.anon._13proxypattern.virtual_proxy_pattern;

import javax.swing.*;
import java.awt.*;

public class ImageNotLoaded implements State {
    private ImageProxy imageProxy;
    private Thread retrievalThread;

    public ImageNotLoaded(ImageProxy imageProxy) {
        this.imageProxy = imageProxy;
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        g.drawString("Loading CD cover, please wait...", x + 300, y + 190);
        if (!imageProxy.isRetrieving()) {
            imageProxy.setRetrieving(true);
            retrievalThread = new Thread(() -> {
                try {
                    ImageIcon imageIcon = new ImageIcon(imageProxy.getImageURL(), "CD Cover");
                    imageProxy.setImageIcon(imageIcon);
                    imageProxy.setCurrentState(imageProxy.getImageLoaded());
                    c.repaint();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            retrievalThread.start();
        }
    }

    @Override
    public int getIconWidth() {
        return 800;
    }

    @Override
    public int getIconHeight() {
        return 600;
    }
}
