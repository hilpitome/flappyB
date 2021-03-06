package flappyBird;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.Timer;

public class FlappyBird implements ActionListener
{
	public static FlappyBird FlappyBird;
	
	public final int WIDTH=800, HEIGHT=800;
	
	public Renderer renderer;
	
	public Rectangle bird;
	
	public Random rand;
	
	public ArrayList<Rectangle> columns;
	
	public int ticks, yMotion;
	
	public FlappyBird()
    {
		JFrame jframe = new JFrame();
		Timer timer = new Timer(20, this);
		
		renderer = new Renderer();
		rand = new Random();
		
		jframe.add(renderer);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		jframe.setSize(WIDTH, HEIGHT);
//		jframe.setResizable(false);
		jframe.setVisible(true);
		
		bird = new Rectangle(WIDTH/2-10, HEIGHT/2-10,10,20);
		columns = new ArrayList<Rectangle>();
		
		addColumn(true);
		addColumn(true);
		addColumn(true);
		addColumn(true);
				
		timer.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		ticks++;
	if (ticks % 2 == 0 && yMotion<15)
		
	{
		yMotion += 2;
	}
	    bird.y += yMotion;
		renderer.repaint();				
	}
	
	public void addColumn(boolean start)
	{
		int space=300;
		int width=100;
		int height=50 + rand.nextInt(300);
		
		if (start)
		{		
		  columns.add(new Rectangle(WIDTH+width+columns.size()*300, HEIGHT-height-120,width,height));
		  columns.add(new Rectangle(WIDTH +width+ (columns.size()-1)*300, 0, width, HEIGHT- height- space));
	    }
		else
		{
			columns.add(new Rectangle(columns.get(columns.size()-1).x+600, HEIGHT-height-120,width,height));
			columns.add(new Rectangle(columns.get(columns.size()-1).x, 0, width,HEIGHT-height-space));
		}
	}
	public void paintColumn(Graphics g, Rectangle column)
	{
	    g.setColor(Color.green.darker());
	    g.fillRect(column.x, column.y, column.width, column.height);
	}
	
	public void repaint(Graphics g) 
	{
			g.setColor(Color.cyan);
			g.fillRect(0, 0, WIDTH, HEIGHT);
			
			g.setColor(Color.orange);
			g.fillRect(0,HEIGHT-150, WIDTH, 150);
			
			g.setColor(Color.green);
			g.fillRect(0,HEIGHT-150, WIDTH, 20);
			
			g.setColor(Color.red);
			g.fillRect(bird.x, bird.y, bird.width, bird.height);
			
			for (Rectangle column: columns)
			{
				paintColumn(g, column);
			}
			
	}
 
	public static void main(String[] args)
	{ 
		FlappyBird = new FlappyBird();
		
		
	}

	
	
}
