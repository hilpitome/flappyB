package flappyBird;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class FlappyBird implements ActionListener
{
	public static FlappyBird FlappyBird;
	
	public final int WIDTH=500, HEIGHT=600;
	
	public Renderer renderer;
	
	public Rectangle bird;
	
	public FlappyBird()
    {
		JFrame jframe = new JFrame();
		
		renderer = new Renderer();
		Timer timer = new Timer(20, this);
		
		jframe.add(renderer);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		jframe.setSize(WIDTH, HEIGHT);
		jframe.setResizable(false);
		jframe.setVisible(true);
		
		bird = new Rectangle(WIDTH/2-10, HEIGHT/2-10,20,20);
		
		timer.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		renderer.repaint();				
	}
	
	public void repaint(Graphics g) 
	{
			g.setColor(Color.cyan);
			g.fillRect(0, 0, WIDTH, HEIGHT);
			
			g.setColor(Color.red);
			g.fillRect(bird.x, bird.y, bird.width, bird.height);
			
	}
 
	public static void main(String[] args)
	{ 
		FlappyBird = new FlappyBird();
		
		
	}

	
	
}
