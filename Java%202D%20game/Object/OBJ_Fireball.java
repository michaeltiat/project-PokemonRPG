package Object;

import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Projectile;
import main.GamePanel;

public class OBJ_Fireball extends Projectile  {
	GamePanel gp;
	public OBJ_Fireball(GamePanel gp) {
		super(gp);
		this.gp=gp;
		
		name="Fireball";
		speed=5;
		maxLife=80;
		life= maxLife;
		attack=2;
		useCost=1;
		alive=false;
		getImage();
		
	}
	public void getImage() {
		try {
			up1=ImageIO.read(getClass().getResourceAsStream("/tiles/fireball_up_1.png"));
			up2=ImageIO.read(getClass().getResourceAsStream("/tiles/fireball_up_2.png"));
			down1=ImageIO.read(getClass().getResourceAsStream("/tiles/fireball_down_1.png"));
			down2=ImageIO.read(getClass().getResourceAsStream("/tiles/fireball_down_2.png"));
			left1=ImageIO.read(getClass().getResourceAsStream("/tiles/fireball_left_1.png"));
			left2=ImageIO.read(getClass().getResourceAsStream("/tiles/fireball_left_2.png"));
			right1=ImageIO.read(getClass().getResourceAsStream("/tiles/fireball_right_1.png"));
			right2=ImageIO.read(getClass().getResourceAsStream("/tiles/fireball_right_2.png"));
		}
		catch (IOException e) {
			e.printStackTrace();
		}	
}

}