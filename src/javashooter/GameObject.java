package javashooter;

import javashooter.imagesandothers.*;

import java.awt.*;

public abstract class GameObject {
    public Vector2 position;
    public Texture2D image;

    public void draw(Graphics g){
        image.draw(g, position);
    }
}
