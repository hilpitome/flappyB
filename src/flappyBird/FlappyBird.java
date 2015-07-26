package flappyBird;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class FlappyBird implements ActionListener
{
	public static FlappyBird FlappyBird;
	public final int WIDTH=500, HEIGHT=600;
	public Renderer renderer;
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
		
		timer.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		renderer.repaint();				
	}
	
	public void repaint(Graphics g) 
	{
		System.out.println("bomm baff");
		
	}
 
	public static void main(String[] args)
	{ 
		FlappyBird = new FlappyBird();
		
		
	}

	
	
}
