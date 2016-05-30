import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class PacManPanel extends JPanel implements KeyListener {
	
	private static final long serialVersionUID = 1L;
	protected PacMan pacman;
	protected JLabel label;
	protected int pm_x = 0, pm_y = 0;
	protected int m1_x = 10*25, m1_y = 10*25;
	protected int m2_x = 30*25, m2_y = 2*25;
	protected int m3_x = 0*25, m3_y = 20*25;
	protected int m4_x = 32*25, m4_y = 21*25;
	protected int m5_x = 14*25, m5_y = 10*25;
	protected int m6_x = 32*25, m6_y = 10*25;
	protected int m7_x = 7*25, m7_y = 21*25;
	protected int m8_x = 15*25, m8_y = 11*25;
	protected CharacterState monster1_state, monster2_state, monster3_state, monster4_state;
	protected CharacterState monster5_state, monster6_state, monster7_state, monster8_state;
	protected ObstacleState[][] obstacle_state;
	private ObstacleStateRecord obstacle_state_record;
	private PacManMoving pacman_moving;
	private Monster1Moving monster1_moving;
	private Monster2Moving monster2_moving;
	private Monster3Moving monster3_moving;
	private Monster4Moving monster4_moving;
	private Monster5Moving monster5_moving;
	private Monster6Moving monster6_moving;
	private Monster7Moving monster7_moving;
	private Monster8Moving monster8_moving;
	protected boolean mouth_open = false;
	protected boolean monster1_exist = true, monster2_exist = true, monster3_exist = true, monster4_exist = true;
	protected boolean monster5_exist = true, monster6_exist = true, monster7_exist = true, monster8_exist = true;
	
	public PacManPanel(PacMan pacman, JFrame frame) {
		this.pacman = pacman;
		this.pacman.pacman_state = CharacterState.ORIGIN;
		setLayout(null);
		label = new JLabel("Score:  " + this.pacman.getPoints());
		Font font = new Font(Font.DIALOG_INPUT, Font.ITALIC, 20);
		label.setFont(font);
		label.setForeground(Color.WHITE);
		label.setBounds (780, 15, 100, 40);
		add(label);
		monster1_state = CharacterState.ORIGIN;
		monster2_state = CharacterState.ORIGIN;
		monster3_state = CharacterState.ORIGIN;
		monster4_state = CharacterState.ORIGIN;
		monster5_state = CharacterState.ORIGIN;
		monster6_state = CharacterState.ORIGIN;
		monster7_state = CharacterState.ORIGIN;
		monster8_state = CharacterState.ORIGIN;
		obstacle_state = new ObstacleState[36][22];
		obstacle_state_record = new ObstacleStateRecord(this);
		pacman_moving = new PacManMoving(this);
		monster1_moving = new Monster1Moving(this);
		monster2_moving = new Monster2Moving(this);
		monster3_moving = new Monster3Moving(this);
		monster4_moving = new Monster4Moving(this);
		monster5_moving = new Monster5Moving(this);
		monster6_moving = new Monster6Moving(this);
		monster7_moving = new Monster7Moving(this);
		monster8_moving = new Monster8Moving(this);
		frame.addKeyListener(this);
	}
	
	public void keyPressed(KeyEvent event) {
		switch (event.getKeyCode()) {
			case KeyEvent.VK_UP:
				pacman.pacman_state = CharacterState.UP;
				break;
			case KeyEvent.VK_DOWN:
				pacman.pacman_state = CharacterState.DOWN;
				break;
			case KeyEvent.VK_LEFT:
				pacman.pacman_state = CharacterState.LEFT;
				break;
			case KeyEvent.VK_RIGHT:
				pacman.pacman_state = CharacterState.RIGHT;
				break;
			default:
				break;
		}
	}

	public void keyTyped(KeyEvent event) {}
	
	public void keyReleased(KeyEvent event) {	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i=0; i<36; i++) {
			for (int j=0; j<22; j++) {
				if (obstacle_state[i][j] == ObstacleState.UNLOCK) {
					g.drawImage(pacman.image_block, 25*i, 25*j, 25, 25, null);
				} else {
					g.drawImage(pacman.image_block_lock, 25*i, 25*j, 25, 25, null);
				}
			}
		}
		g.drawImage(pacman.image_rectangle, 30*25, 0, 6*25, 3*25, null);
		if (pacman.pacman_state == CharacterState.ORIGIN || mouth_open == false) {
			g.drawImage(pacman.image_pacman_origin, pm_x, pm_y, 25, 25, null);
		} else if (pacman.pacman_state == CharacterState.UP) {
			g.drawImage(pacman.image_pacman_up, pm_x, pm_y, 25, 25, null);
		} else if (pacman.pacman_state == CharacterState.DOWN) {
			g.drawImage(pacman.image_pacman_down, pm_x, pm_y, 25, 25, null);
		} else if (pacman.pacman_state == CharacterState.LEFT) {
			g.drawImage(pacman.image_pacman_left, pm_x, pm_y, 25, 25, null);
		} else if (pacman.pacman_state ==CharacterState.RIGHT) {
			g.drawImage(pacman.image_pacman_right, pm_x, pm_y, 25, 25, null);
		}
		if (monster1_exist == true) {
			g.drawImage(pacman.image_monster1, m1_x, m1_y, 25, 25, null);
		}
		if (monster2_exist == true) {
			g.drawImage(pacman.image_monster2, m2_x, m2_y, 25, 25, null);
		}
		if (monster3_exist == true) {
			g.drawImage(pacman.image_monster3, m3_x, m3_y, 25, 25, null);
		}
		if (monster4_exist == true) {
			g.drawImage(pacman.image_monster4, m4_x, m4_y, 25, 25, null);
		}
		if (monster5_exist == true) {
			g.drawImage(pacman.image_monster5, m5_x, m5_y, 25, 25, null);
		}
		if (monster6_exist == true) {
			g.drawImage(pacman.image_monster6, m6_x, m6_y, 25, 25, null);
		}
		if (monster7_exist == true) {
			g.drawImage(pacman.image_monster7, m7_x, m7_y, 25, 25, null);
		}
		if (monster8_exist == true) {
			g.drawImage(pacman.image_monster8, m8_x, m8_y, 25, 25, null);
		}
	}
	
}