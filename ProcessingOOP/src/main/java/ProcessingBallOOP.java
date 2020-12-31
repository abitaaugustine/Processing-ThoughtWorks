import processing.core.PApplet;

public class ProcessingBallOOP extends PApplet {

    public class Ball {
        public int ball_x_position;
        public int ball_y_position;
        public int ball_speed;

        Ball(int x_position, int y_position,  int speed)
        {
            this.ball_x_position=x_position;
            this.ball_y_position=y_position;
            this.ball_speed=speed;
        }

        private void drawCircle() {
            ellipse(ball_x_position,ball_y_position,Diameter,Diameter);
            moveBall();
        }

        private void moveBall() {
            ball_x_position += ball_speed;
        }
    }

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

    Ball ball_1 = new Ball(Ball_1_x_position,Ball_1_y_position,Ball_1_speed);
    Ball ball_2 = new Ball(Ball_2_x_position,Ball_2_y_position,Ball_2_speed);
    Ball ball_3 = new Ball(Ball_3_x_position,Ball_3_y_position,Ball_3_speed);
    Ball ball_4 = new Ball(Ball_4_x_position,Ball_4_y_position,Ball_4_speed);

    public static void main(String[] args) {
        PApplet.main("ProcessingBallOOP", args);

    }

    @Override
    public void settings() {
        super.settings();

        size( Width , Height);
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
        ball_1.drawCircle();
        ball_2.drawCircle();
        ball_3.drawCircle();
        ball_4.drawCircle();
    }

}
