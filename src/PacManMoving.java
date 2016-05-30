
public class PacManMoving implements Runnable {
	
	private PacManPanel pmp;
	
	public PacManMoving(PacManPanel pmp) {
		this.pmp = pmp;
		Thread thread = new Thread(this);
		thread.start();
	}
	
	public void run() {
		while (true) {
			int count = 0;
			switch (pmp.pacman.pacman_state) {
				case UP:
					if (pmp.pm_y != 0 && pmp.obstacle_state[pmp.pm_x/25][(pmp.pm_y/25)-1] == ObstacleState.UNLOCK) {
						while (count != 25) {
							pmp.pm_y = pmp.pm_y - 1;
							if ((count/13)%2 == 0) {
								pmp.mouth_open = !pmp.mouth_open;
							}
							pmp.repaint();
							count++;
							try {
								Thread.sleep(5);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
					break;
				case DOWN:
					if (pmp.pm_y != 525 && pmp.obstacle_state[pmp.pm_x/25][(pmp.pm_y/25)+1] == ObstacleState.UNLOCK) {
						while (count != 25) {
							pmp.pm_y = pmp.pm_y + 1;
							if ((count/13)%2 == 0) {
								pmp.mouth_open = !pmp.mouth_open;
							}
							pmp.repaint();
							count++;
							try {
								Thread.sleep(5);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
					break;
				case LEFT:
					if (pmp.pm_x != 0 && pmp.obstacle_state[(pmp.pm_x/25)-1][pmp.pm_y/25] == ObstacleState.UNLOCK) {
						while (count != 25) {
							pmp.pm_x = pmp.pm_x - 1;
							if ((count/13)%2 == 0) {
								pmp.mouth_open = !pmp.mouth_open;
							}
							pmp.repaint();
							count++;
							try {
								Thread.sleep(5);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
					break;
				case RIGHT:
					if (pmp.pm_x != 875 && pmp.obstacle_state[(pmp.pm_x/25)+1][pmp.pm_y/25] == ObstacleState.UNLOCK) {
						while (count != 25) {
							pmp.pm_x = pmp.pm_x + 1;
							if ((count/13)%2 == 0) {
								pmp.mouth_open = !pmp.mouth_open;
							}
							pmp.repaint();
							count++;
							try {
								Thread.sleep(5);
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
	}
	
}