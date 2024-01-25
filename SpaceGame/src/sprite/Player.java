package sprite;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import cam.Params;

public class Player extends Sprite{
	private int width;
	public Player()
	{
		initPlayer();
	}
	private void initPlayer()
	{
		var pyIm="src/images/Player.png";
		var img=new ImageIcon(pyIm);
		
		width=img.getImage().getWidth(null);
		setImage(img.getImage());
		int Start_X =270;
		setX(Start_X);
		
		int Start_Y=280;
		setY(Start_Y);
	}
	public void act()
	{
		x+=dx;
		
		if(x<=2)
		{
			x=2;
		}
		if(x>= Params.BOARD_WIDTH - 2*width)
		{
			x=Params.BOARD_WIDTH -2*width;
		}
			
	}
	public void keyPressed(KeyEvent e)
	{
		int key=e.getKeyCode();
		if(key == KeyEvent.VK_LEFT)
		{
			dx= -2;
		}
		if(key == KeyEvent.VK_RIGHT)
		{
			dx =2;
		}
	}
	public void KeyRelesed(KeyEvent e)
	{
		int key=e.getKeyCode();
		if(key == KeyEvent.VK_LEFT ) {
			dx=0;
		}
		if(key==KeyEvent.VK_RIGHT)
		{
			dx=0;
		}
	}

}
