package javashooter;

import javashooter.*;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.Vector;

public class Main{
    public static program initialProgram;
    public static Dimension dimension;

    public Main(program initialProgram){
        this.initialProgram = initialProgram;
        dimension = initialProgram.dimension;
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
        GameScreen.atualGameScreen.render(g);
        bs.show();
    }
}