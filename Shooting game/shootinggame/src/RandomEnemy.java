
public class RandomEnemy extends Enemy{
	public RandomEnemy(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
	}
	public void move(){
		super.move();
		vx=Math.random()*4-2;
	}
	public void draw(MyFrame f) {
		    f.setColor(0, 128, 0);
			f.fillRect(x, y, 32, 32);
			f.setColor(200, 200, 200);
			f.fillOval(x-16, y+8, 64, 16);
			
		}
	
	
	
	
	
	
	
}
