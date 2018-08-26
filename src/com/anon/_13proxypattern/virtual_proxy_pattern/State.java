package com.anon._13proxypattern.virtual_proxy_pattern;

import java.awt.*;

public interface State {
    void paintIcon(final Component c, Graphics g, int x, int y);

    int getIconWidth();

    int getIconHeight();
}
