import java.util.Vector;

public class GameFrame extends MyFrame{
	public void run() {
	 GameWorld.player=new Player(100,300,0,0);
	 GameWorld.playBullets=new Vector<PlayerBullet>();
	 addKeyListener(GameWorld.player);
	 while(true) {
		 clear();
		 GameWorld.player.draw(this);
		 GameWorld.player.move();
		 movePlayerBullets();
		 int i=0;
		 while(i< GameWorld.playBullets.size()) {
			 PlayerBullet b =GameWorld.playBullets.get(i);
			 b.draw(this);
			 b.move();
			 if(b.y<0) {
				 GameWorld.playBullets.remove(i);
			 }else {
				  i++;
		     }
		 }
		 sleep(0.03);
 }
	}
	public void movePlayerBullets() {
		 int i=0;
		 while(i< GameWorld.playBullets.size()) {
			 PlayerBullet b =GameWorld.playBullets.get(i);
			 b.draw(this);
			 b.move();
			 if(b.y<0) {
				 GameWorld.playBullets.remove(i);
			 }else {
				  i++;
		     }
		 }
		
		
		
	}
	
}
