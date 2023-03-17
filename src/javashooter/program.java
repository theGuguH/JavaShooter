package javashooter;

import javax.swing.*;
import java.awt.*;

public class program extends Canvas implements Runnable {
    public static boolean gExit = false;
    public Dimension dimension = new Dimension(800, 480);
    public static Main mainThread;
    public program(){
        this.setPreferredSize(dimension);
    }
    public static void main(String[] args){
        program main = new program();
        JFrame jframe = new JFrame("Java Shooter");
        jframe.add(main);
        jframe.setLocationRelativeTo(null);
        jframe.pack();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jframe.setVisible(true);

        new Thread(main).start();
    }

    @Override
    public void run() {
        mainThread = new Main(this);
        mainThread.run();
        while(!gExit){
            mainThread.update();
            mainThread.render();
            try {
                Thread.sleep(1000 / 60);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}