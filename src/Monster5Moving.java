import java.util.Random;

public class Monster5Moving implements Runnable {
	
	private PacManPanel pmp;
	private Random random = new Random();
	private int count = 0;
	private int direction, last_direction=0;
	
	public Monster5Moving(PacManPanel pmp) {
		this.pmp = pmp;
		Thread thread = new Thread(this);
		thread.start();
	}
	
	public void run() {
		while (pmp.monster5_exist == true) {
			int one_block = 0;
			int lock_num = 0;
			if (pmp.m5_y == 0 || pmp.obstacle_state[pmp.m5_x/25][(pmp.m5_y/25)-1] == ObstacleState.LOCK) {
				lock_num++;
			}
			if (pmp.m5_y == 525 || pmp.obstacle_state[pmp.m5_x/25][(pmp.m5_y/25)+1] == ObstacleState.LOCK) {
				lock_num++;
			}
			if (pmp.m5_x == 0 || pmp.obstacle_state[(pmp.m5_x/25)-1][pmp.m5_y/25] == ObstacleState.LOCK) {
				lock_num++;
			}
			if (pmp.m5_x == 875 || pmp.obstacle_state[(pmp.m5_x/25)+1][pmp.m5_y/25] == ObstacleState.LOCK) {
				lock_num++;
			}
			if (lock_num == 3) {
				direction = random.nextInt(4);
				if (direction == 0) {
					pmp.monster5_state = CharacterState.UP;
				} else if (direction == 1) {
					pmp.monster5_state = CharacterState.RIGHT;
				} else if (direction == 2) {
					pmp.monster5_state = CharacterState.DOWN;
				} else {
					pmp.monster5_state = CharacterState.LEFT;
				}
			} else {
				if (count%3 == 0) {
					count = 0;
					direction = random.nextInt(4);
					if (direction == 0 && direction != (last_direction+2)%4) {
						pmp.monster5_state = CharacterState.UP;
					} else if (direction == 1 && direction != (last_direction+2)%4) {
						pmp.monster5_state = CharacterState.RIGHT;
					} else if (direction == 2 && direction != (last_direction+2)%4) {
						pmp.monster5_state = CharacterState.DOWN;
					} else if (direction == 3 && direction != (last_direction+2)%4) {
						pmp.monster5_state = CharacterState.LEFT;
					} else {
						direction = last_direction;
					}
				}
			}
			last_direction = direction;
			count++;
			switch (pmp.monster5_state) {
				case UP:
					if (pmp.m5_y != 0 && pmp.obstacle_state[pmp.m5_x/25][(pmp.m5_y/25)-1] == ObstacleState.UNLOCK) {
						while (one_block != 25) {
							pmp.m5_y = pmp.m5_y - 1;
							if ((Math.abs(pmp.m5_x-pmp.pm_x) < 25 && pmp.m5_y == pmp.pm_y) || (pmp.m5_x == pmp.pm_x && Math.abs(pmp.m5_y-pmp.pm_y) < 25)) {
								pmp.monster5_exist = false;
							}
							pmp.repaint();
							one_block++;
							try {
								Thread.sleep(3);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
					break;
				case DOWN:
					if (pmp.m5_y != 525 && pmp.obstacle_state[pmp.m5_x/25][(pmp.m5_y/25)+1] == ObstacleState.UNLOCK) {
						while (one_block != 25) {
							pmp.m5_y = pmp.m5_y + 1;
							if ((Math.abs(pmp.m5_x-pmp.pm_x) < 25 && pmp.m5_y == pmp.pm_y) || (pmp.m5_x == pmp.pm_x && Math.abs(pmp.m5_y-pmp.pm_y) < 25)) {
								pmp.monster5_exist = false;
							}
							pmp.repaint();
							one_block++;
							try {
								Thread.sleep(3);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
					break;
				case LEFT:
					if (pmp.m5_x != 0 && pmp.obstacle_state[(pmp.m5_x/25)-1][pmp.m5_y/25] == ObstacleState.UNLOCK) {
						while (one_block != 25) {
							pmp.m5_x = pmp.m5_x - 1;
							if ((Math.abs(pmp.m5_x-pmp.pm_x) < 25 && pmp.m5_y == pmp.pm_y) || (pmp.m5_x == pmp.pm_x && Math.abs(pmp.m5_y-pmp.pm_y) < 25)) {
								pmp.monster5_exist = false;
							}
							pmp.repaint();
							one_block++;
							try {
								Thread.sleep(3);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
					break;
				case RIGHT:
					if (pmp.m5_x != 875 && pmp.obstacle_state[(pmp.m5_x/25)+1][pmp.m5_y/25] == ObstacleState.UNLOCK) {
						while (one_block != 25) {
							pmp.m5_x = pmp.m5_x + 1;
							if ((Math.abs(pmp.m5_x-pmp.pm_x) < 25 && pmp.m5_y == pmp.pm_y) || (pmp.m5_x == pmp.pm_x && Math.abs(pmp.m5_y-pmp.pm_y) < 25)) {
								pmp.monster5_exist = false;
							}
							pmp.repaint();
							one_block++;
							try {
								Thread.sleep(3);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
					break;
				default:
					break;
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		pmp.pacman.addPoints();
	}
	
}