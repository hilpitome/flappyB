package flappyBird;

import javax.swing.JFrame;

public class FlappyBird 
{
	public static FlappyBird FlappyBird;
	public final int WIDTH=500, HEIGHT=600;
	public FlappyBird()
	{
		JFrame jframe = new JFrame();
		
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		jframe.setSize(WIDTH, HEIGHT);
		jframe.setResizable(false);
		jframe.setVisible(true);
		
		
	}
 
	public static void main(String[] args)
	{ 
		FlappyBird = new FlappyBird();
		
		
	}
	
}
