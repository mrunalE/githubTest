package JavaTraining;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowHandler implements WindowListener {


    public void windowOpened(WindowEvent e) {

    }

    public void windowClosing(WindowEvent e) {
     MyFrame mf =(MyFrame)e.getSource();
     mf.dispose();

    }

    public void windowClosed(WindowEvent e) {

    }

    public void windowIconified(WindowEvent e) {

    }

    public void windowDeiconified(WindowEvent e) {

    }

    public void windowActivated(WindowEvent e) {

    }

    public void windowDeactivated(WindowEvent e) {

    }
}
