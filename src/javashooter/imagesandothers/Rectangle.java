package javashooter.imagesandothers;

public class Rectangle {
    public Vector2 position;
    public int width;
    public int height;

    public int getLeft(){
        return (int)this.position.x;
    }

    public int getRight(){
        return (int)this.position.x + this.width;
    }

    public int getTop(){
        return (int)this.position.y;
    }

    public int getBottom(){
        return (int)this.position.y + this.height;
    }

    public boolean contains(int x, int y){
        return ((((this.position.x <= x) && (x < (this.position.x + this.width))) && (this.position.y <= y)) && (y < (this.position.y + this.height)));
    }

    public boolean contains(Vector2 value){
        return ((((this.position.x <= value.x) && (value.x < (this.position.x + this.width))) && (this.position.y <= value.y)) && (value.y < (this.position.y + this.height)));
    }
    public boolean contains(Rectangle value){
        return ((((this.position.x <= value.position.x) && ((value.position.x + value.width) <= (this.position.x + this.width))) && (this.position.y <= value.position.y)) && ((value.position.y + value.height) <= (this.position.y + this.height)));
    }

    public Vector2 getCenter(){
        return new Vector2((this.position.x + this.width) / 2,(this.position.y + this.height) / 2 );
    }
    public void inflate(int horizontalValue, int verticalValue){
        this.position.x -= horizontalValue;
        this.position.y -= verticalValue;
        this.width += horizontalValue * 2;
        this.height += verticalValue * 2;
    }
    public void inflate(Vector2 value){
        this.position = Vector2.minus(this.position, value);
        this.width += value.x * 2;
        this.height += value.y * 2;
    }
    public void inflate(int value){
        this.position.x -= value;
        this.position.y -= value;
        this.width += value * 2;
        this.height += value * 2;
    }
    @Override
    public String toString(){
        return ("{{X:" + position.x + " Y:" + position.y + " Width:" + width + " Height:" + height + "}}");
    }

    public boolean intersects(Rectangle r2){
        return !(r2.getLeft() > getRight() || r2.getRight() < getLeft() || r2.getTop() > getBottom() || r2.getBottom() < getTop());
    }
}
