
public class DropEnemy extends Enemy{
	public DropEnemy(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		life=1+GameWorld.stage-1;
	}
	public void draw(MyFrame f) {
		f.setColor(0, 200, 0);
		f.fillRect(x, y+10, 30, 10);
		f.fillRect(x + 10, y + 20, 10, 20);

			
		}
	public void move(){
		super.move();
		
		vy=vy+0.1+(GameWorld.stage-1)/10;
	}
	
	
	
}
