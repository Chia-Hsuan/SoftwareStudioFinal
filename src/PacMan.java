import java.awt.image.BufferedImage;

import javax.swing.JFrame;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class PacMan implements Runnable {
	
	private PacManPanel pmp;
	protected BufferedImage image_block, image_block_lock, image_rectangle;
	protected BufferedImage image_pacman_origin;
	protected BufferedImage image_pacman_up;
	protected BufferedImage image_pacman_down;
	protected BufferedImage image_pacman_left;
	protected BufferedImage image_pacman_right;
	protected BufferedImage image_monster1, image_monster2, image_monster3, image_monster4;
	protected BufferedImage image_monster5, image_monster6, image_monster7, image_monster8;
	protected CharacterState pacman_state;
	private int points = 0;
	protected JFrame frame;
	protected int pm_x, pm_y;
	
	public PacMan(JFrame frame) {
		try {
			image_block =  ImageIO.read(new File("materials/Pacman/block.png"));
			image_block_lock =  ImageIO.read(new File("materials/Pacman/block_lock.png"));
			image_rectangle =  ImageIO.read(new File("materials/Pacman/rectangle.png"));
			image_pacman_origin =  ImageIO.read(new File("materials/Pacman/pacman_origin.png"));
			image_pacman_up =  ImageIO.read(new File("materials/Pacman/pacman_up.png"));
			image_pacman_down =  ImageIO.read(new File("materials/Pacman/pacman_down.png"));
			image_pacman_left =  ImageIO.read(new File("materials/Pacman/pacman_left.png"));
			image_pacman_right =  ImageIO.read(new File("materials/Pacman/pacman_right.png"));
			image_monster1 =  ImageIO.read(new File("materials/Pacman/monster1.png"));
			image_monster2 =  ImageIO.read(new File("materials/Pacman/monster2.png"));
			image_monster3 =  ImageIO.read(new File("materials/Pacman/monster3.png"));
			image_monster4 =  ImageIO.read(new File("materials/Pacman/monster4.png"));	
			image_monster5 =  ImageIO.read(new File("materials/Pacman/monster5.png"));
			image_monster6 =  ImageIO.read(new File("materials/Pacman/monster6.png"));
			image_monster7 =  ImageIO.read(new File("materials/Pacman/monster7.png"));
			image_monster8 =  ImageIO.read(new File("materials/Pacman/monster8.png"));	
		} catch (IOException e) {
			System.out.println("No Picture");
		}
		this.frame = frame;
		pmp = new PacManPanel(this, frame);
		pmp.setBounds(0, 0, 900, 550);
		frame.add(pmp);
	}
	
	public int getPoints() {
		return points;
	}
	
	public void addPoints() {
		points = points + 1;
		pmp.label.setText("Score:  " + getPoints());
	}
	
	public void run() {
		
	}
	
}