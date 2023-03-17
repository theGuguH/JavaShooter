package javashooter;

import javashooter.imagesandothers.Texture2D;
import javashooter.imagesandothers.Vector2;
import javashooter.screens.GameScreen;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class Main{
    public static program initialProgram;
    public static Dimension dimension;
    public Texture2D backgroundImage;

    public Main(program initialProgram){
        this.initialProgram = initialProgram;
        dimension = initialProgram.dimension;
        backgroundImage = new Texture2D("javashooter\\Content\\Images\\background.png");
    }
    public void run(){
        GameScreen.atualGameScreen.run();
    }
    public void update(){
        GameScreen.atualGameScreen.update();
    }
    public void render(){
        BufferStrategy bs =  initialProgram.getBufferStrategy();

        if(bs == null){
            initialProgram.createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();
        backgroundImage.draw(g, Vector2.zero);
        GameScreen.atualGameScreen.render(g);
        bs.show();
    }
}