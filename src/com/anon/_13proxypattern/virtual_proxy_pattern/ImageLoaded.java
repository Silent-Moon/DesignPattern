package com.anon._13proxypattern.virtual_proxy_pattern;

import java.awt.*;

public class ImageLoaded implements State {
    private ImageProxy imageProxy;

    public ImageLoaded(ImageProxy imageProxy) {
        this.imageProxy = imageProxy;
    }

    /**
     * After successfully loading an image, no need to turn back to <code>ImageNotLoaded</code>. This is the final state.
     */
    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        imageProxy.getImageIcon().paintIcon(c, g, x, y);
    }

    @Override
    public int getIconWidth() {
        return imageProxy.getImageIcon().getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return imageProxy.getImageIcon().getIconHeight();
    }
}
