package javashooter.imagesandothers;

public class Vector2 {
    public float x;
    public float y;
    public static final Vector2 zero = new Vector2(0, 0);
    public static final Vector2 one = new Vector2(1, 1);
    public static final Vector2 oneX = new Vector2(1, 0);
    public static final Vector2 oneY = new Vector2(0, 1);
    public static final Vector2 onePlusXMinusY = new Vector2(1, -1);
    public static final Vector2 oneMinusXPlusY = new Vector2(-1, 1);

    public Vector2(float x, float y){
        this.x = x;
        this.y = y;
    }

    public static Vector2 add(Vector2 a, Vector2 b) { return new Vector2(a.x + b.x, a.y + b.y); }
    public static Vector2 minus(Vector2 a, Vector2 b) { return new Vector2(a.x - b.x, a.y - b.y); }
    public static Vector2 multiply(Vector2 a, Vector2 b) { return new Vector2(a.x * b.x, a.y * b.y); }
    public static Vector2 divide(Vector2 a, Vector2 b) { return new Vector2(a.x / b.x, a.y / b.y); }
}
