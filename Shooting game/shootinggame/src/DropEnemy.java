
public class DropEnemy extends Enemy{
	public DropEnemy(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
	}
	public void draw(MyFrame f) {
		f.setColor(0, 128, 0);
			f.fillOval(x, y, 32, 32);
			f.setColor(200, 200, 200);
		
			
		}
	public void move(){
		super.move();
		vy=vy+0.1;
	}
	
	
	
}
