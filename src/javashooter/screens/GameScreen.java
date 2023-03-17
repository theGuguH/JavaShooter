package javashooter.screens;

import javashooter.imagesandothers.Texture2D;

import java.awt.*;

public abstract class GameScreen{
    public static GameScreen atualGameScreen = new MainScreen();
    public Texture2D background;

    public abstract void run();
    public abstract void update();
    public abstract void render(Graphics graphics);
    public abstract void unloadScreen();
    public void changeScreen(GameScreen newScreen){
        atualGameScreen.unloadScreen();
        atualGameScreen = newScreen;
        atualGameScreen.run();
        atualGameScreen.update();
    }
}
