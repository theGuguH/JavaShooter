package javashooter.imagesandothers;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class Texture2D {
    //Fazer uma variavel de imagem mais fácil de se usar, parecido com a do Monogame
    private final Image texture;
    private final ImageIcon imgIco;

    public Texture2D(String imagePath){
        imgIco = new ImageIcon(imagePath);
        texture = imgIco.getImage();
    }

    //Geters
    public int getWidth(){ return imgIco.getIconWidth(); }
    public int getHeight(){ return imgIco.getIconHeight(); }

    public void draw(Graphics graphics, Vector2 position){
        graphics.drawImage(texture, (int)position.x, (int)position.y, null);
    }
    public void draw(Graphics graphics, Vector2 position, ImageObserver imgObs){
        graphics.drawImage(texture, (int)position.x, (int)position.y, imgObs);
    }
    public void draw(Graphics graphics, Vector2 position, Color color){
        graphics.drawImage(texture, (int)position.x, (int)position.y, color, null);
    }
    public void draw(Graphics graphics, Vector2 position, ImageObserver imgObs, Color color){
        graphics.drawImage(texture, (int)position.x, (int)position.y, color, imgObs);
    }
}
