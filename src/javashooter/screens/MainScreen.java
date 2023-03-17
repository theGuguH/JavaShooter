package javashooter.screens;

import javashooter.*;

import java.awt.*;

public class MainScreen extends GameScreen {

    @Override
    public void run() {
    }
    @Override
    public void update() {
    }
    @Override
    public void render(Graphics graphics){
        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, Main.dimension.width, Main.dimension.height);
    }
    @Override
    public void unloadScreen() {

    }
}
