package com.apple.eawt.event;

import java.util.EventListener;

/** Java for Mac OS X 10.5 Update 7, Java for Mac OS X 10.6 Update 2 */
public interface GesturePhaseListener extends GestureListener {

    public void gestureBegan(GesturePhaseEvent e);
    public void gestureEnded(GesturePhaseEvent e);
}
