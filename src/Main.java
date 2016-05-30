import javax.swing.JFrame;
import java.awt.Color;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("PacMan");
		frame.setLayout(null);
		frame.setSize(1200,572);
		frame.setLocation(100,100);
		frame.setResizable(false);
		frame.setBackground(Color.CYAN);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PacMan pacman = new PacMan(frame);
		Thread pm_thread = new Thread(pacman);
		pm_thread.start();
		frame.setVisible(true);
	}
}
