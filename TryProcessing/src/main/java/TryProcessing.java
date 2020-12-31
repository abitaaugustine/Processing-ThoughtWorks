import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public final int Height = 480;
    public final int Width = 640;
    public final int Diameter = 10;

    public int Ball_1_x_position = 0;
    public int Ball_1_y_position = Height / 5;
    public int Ball_1_speed = 1;

    public int Ball_2_x_position = 0;
    public int Ball_2_y_position = 2 * Height / 5;
    public int Ball_2_speed = 2;

    public int Ball_3_x_position = 0;
    public int Ball_3_y_position = 3 * Height / 5;
    public int Ball_3_speed = 3;

    public int Ball_4_x_position = 0;
    public int Ball_4_y_position = 4 * Height / 5;
    public int Ball_4_speed = 4;

    public static void main(String[] args){
        PApplet.main("TryProcessing",args);

    }

    @Override
    public void settings() {
        super.settings();
        size(Width,Height);
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
        ellipse(Ball_1_x_position,Ball_1_y_position,Diameter,Diameter);
        ellipse(Ball_2_x_position,Ball_2_y_position,Diameter,Diameter);
        ellipse(Ball_3_x_position,Ball_3_y_position,Diameter,Diameter);
        ellipse(Ball_4_x_position,Ball_4_y_position,Diameter,Diameter);
        Ball_1_x_position  += Ball_1_speed;
        Ball_2_x_position  += Ball_2_speed;
        Ball_3_x_position  += Ball_3_speed;
        Ball_4_x_position  += Ball_4_speed;
    }
}
