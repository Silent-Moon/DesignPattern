package com.anon._13proxypattern.virtual_proxy_pattern;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {
    private State imageLoaded;
    private State imageNotLoaded;

    private State currentState;

    private ImageIcon imageIcon;
    private URL imageURL;
    private boolean retrieving;

    public ImageProxy(URL imageURL) {
        this.imageLoaded = new ImageLoaded(this);
        this.imageNotLoaded = new ImageNotLoaded(this);
        this.currentState = this.imageNotLoaded;
        this.imageURL = imageURL;
        this.retrieving = false;
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        currentState.paintIcon(c, g, x, y);
    }

    @Override
    public int getIconWidth() {
        return currentState.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return currentState.getIconHeight();
    }

    public boolean isRetrieving() {
        return retrieving;
    }

    public void setRetrieving(boolean retrieving) {
        this.retrieving = retrieving;
    }

    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    public URL getImageURL() {
        return imageURL;
    }

    public void setImageURL(URL imageURL) {
        this.imageURL = imageURL;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getImageLoaded() {
        return imageLoaded;
    }

    public State getImageNotLoaded() {
        return imageNotLoaded;
    }
}
