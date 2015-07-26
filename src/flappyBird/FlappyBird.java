package flappyBird;

import java.awt.Graphics;

import javax.swing.JFrame;

public class FlappyBird 
{
	public static FlappyBird FlappyBird;
	public final int WIDTH=500, HEIGHT=600;
	public Renderer renderer;
	public FlappyBird()
    {
		JFrame jframe = new JFrame();
		
		renderer = new Renderer();
		
		jframe.add(renderer);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		jframe.setSize(WIDTH, HEIGHT);
		jframe.setResizable(false);
		jframe.setVisible(true);
		
		
	}
	
	public void repaint(Graphics g) 
	{
		// TODO Auto-generated method stub
		
	}
 
	public static void main(String[] args)
	{ 
		FlappyBird = new FlappyBird();
		
		
	}

	
	
}
