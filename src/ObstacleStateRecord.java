
public class ObstacleStateRecord {
	
	PacManPanel pmp;
	
	public ObstacleStateRecord(PacManPanel pmp) {
		this.pmp = pmp;
		Record();
	}
	
	void Record() {
		for (int i=0; i<36; i++) {
			for (int j=0; j<22; j++) {
				pmp.obstacle_state[i][j] = ObstacleState.UNLOCK;
			}
		}
		pmp.obstacle_state[30][0] = ObstacleState.LOCK;  // rectangle
		pmp.obstacle_state[30][1] = ObstacleState.LOCK;
		pmp.obstacle_state[30][2] = ObstacleState.LOCK;
		pmp.obstacle_state[31][2] = ObstacleState.LOCK;
		pmp.obstacle_state[32][2] = ObstacleState.LOCK;
		pmp.obstacle_state[33][2] = ObstacleState.LOCK;
		pmp.obstacle_state[34][2] = ObstacleState.LOCK;
		pmp.obstacle_state[35][2] = ObstacleState.LOCK;
		
		
		
		
		pmp.obstacle_state[1][1] = ObstacleState.LOCK;  // 浩
		pmp.obstacle_state[2][1] = ObstacleState.LOCK;
		pmp.obstacle_state[1][4] = ObstacleState.LOCK;
		pmp.obstacle_state[2][4] = ObstacleState.LOCK;
		pmp.obstacle_state[1][8] = ObstacleState.LOCK;
		pmp.obstacle_state[2][8] = ObstacleState.LOCK;
		pmp.obstacle_state[2][7] = ObstacleState.LOCK;
		pmp.obstacle_state[2][6] = ObstacleState.LOCK;
		pmp.obstacle_state[4][1] = ObstacleState.LOCK;
		pmp.obstacle_state[4][2] = ObstacleState.LOCK;
		pmp.obstacle_state[3][2] = ObstacleState.LOCK;
		pmp.obstacle_state[3][3] = ObstacleState.LOCK;
		pmp.obstacle_state[5][2] = ObstacleState.LOCK;
		pmp.obstacle_state[6][2] = ObstacleState.LOCK;
		pmp.obstacle_state[7][2] = ObstacleState.LOCK;
		pmp.obstacle_state[8][2] = ObstacleState.LOCK;
		pmp.obstacle_state[6][1] = ObstacleState.LOCK;
		pmp.obstacle_state[6][3] = ObstacleState.LOCK;
		pmp.obstacle_state[3][4] = ObstacleState.LOCK;
		pmp.obstacle_state[4][4] = ObstacleState.LOCK;
		pmp.obstacle_state[5][4] = ObstacleState.LOCK;
		pmp.obstacle_state[6][4] = ObstacleState.LOCK;
		pmp.obstacle_state[7][4] = ObstacleState.LOCK;
		pmp.obstacle_state[8][4] = ObstacleState.LOCK;
		pmp.obstacle_state[9][4] = ObstacleState.LOCK;
		pmp.obstacle_state[4][6] = ObstacleState.LOCK;
		pmp.obstacle_state[4][7] = ObstacleState.LOCK;
		pmp.obstacle_state[4][8] = ObstacleState.LOCK;
		pmp.obstacle_state[5][6] = ObstacleState.LOCK;
		pmp.obstacle_state[6][6] = ObstacleState.LOCK;
		pmp.obstacle_state[7][6] = ObstacleState.LOCK;
		pmp.obstacle_state[8][6] = ObstacleState.LOCK;
		pmp.obstacle_state[8][7] = ObstacleState.LOCK;
		pmp.obstacle_state[8][8] = ObstacleState.LOCK;
		pmp.obstacle_state[5][8] = ObstacleState.LOCK;
		pmp.obstacle_state[6][8] = ObstacleState.LOCK;
		pmp.obstacle_state[7][8] = ObstacleState.LOCK;
		
		
		
		pmp.obstacle_state[17][1] = ObstacleState.LOCK;  // 全
		pmp.obstacle_state[17][2] = ObstacleState.LOCK;
		pmp.obstacle_state[16][2] = ObstacleState.LOCK;
		pmp.obstacle_state[15][2] = ObstacleState.LOCK;
		pmp.obstacle_state[15][3] = ObstacleState.LOCK;
		pmp.obstacle_state[14][3] = ObstacleState.LOCK;
		pmp.obstacle_state[14][4] = ObstacleState.LOCK;
		pmp.obstacle_state[13][4] = ObstacleState.LOCK;
		pmp.obstacle_state[13][5] = ObstacleState.LOCK;
		pmp.obstacle_state[12][5] = ObstacleState.LOCK;
		pmp.obstacle_state[18][2] = ObstacleState.LOCK;
		pmp.obstacle_state[19][2] = ObstacleState.LOCK;
		pmp.obstacle_state[19][3] = ObstacleState.LOCK;
		pmp.obstacle_state[20][3] = ObstacleState.LOCK;
		pmp.obstacle_state[20][4] = ObstacleState.LOCK;
		pmp.obstacle_state[21][4] = ObstacleState.LOCK;
		pmp.obstacle_state[21][5] = ObstacleState.LOCK;
		pmp.obstacle_state[22][5] = ObstacleState.LOCK;
		pmp.obstacle_state[15][4] = ObstacleState.LOCK;
		pmp.obstacle_state[16][4] = ObstacleState.LOCK;
		pmp.obstacle_state[17][4] = ObstacleState.LOCK;
		pmp.obstacle_state[18][4] = ObstacleState.LOCK;
		pmp.obstacle_state[19][4] = ObstacleState.LOCK;
		pmp.obstacle_state[15][6] = ObstacleState.LOCK;
		pmp.obstacle_state[16][6] = ObstacleState.LOCK;
		pmp.obstacle_state[17][6] = ObstacleState.LOCK;
		pmp.obstacle_state[18][6] = ObstacleState.LOCK;
		pmp.obstacle_state[19][6] = ObstacleState.LOCK;
		pmp.obstacle_state[17][5] = ObstacleState.LOCK;
		pmp.obstacle_state[17][7] = ObstacleState.LOCK;
		pmp.obstacle_state[17][8] = ObstacleState.LOCK;
		pmp.obstacle_state[14][8] = ObstacleState.LOCK;
		pmp.obstacle_state[15][8] = ObstacleState.LOCK;
		pmp.obstacle_state[16][8] = ObstacleState.LOCK;
		pmp.obstacle_state[18][8] = ObstacleState.LOCK;
		pmp.obstacle_state[19][8] = ObstacleState.LOCK;
		pmp.obstacle_state[20][8] = ObstacleState.LOCK;
		
		
		
		
		pmp.obstacle_state[3][10] = ObstacleState.LOCK;  // S
		pmp.obstacle_state[2][10] = ObstacleState.LOCK;
		pmp.obstacle_state[1][10] = ObstacleState.LOCK;
		pmp.obstacle_state[1][11] = ObstacleState.LOCK;
		pmp.obstacle_state[1][12] = ObstacleState.LOCK;
		pmp.obstacle_state[2][12] = ObstacleState.LOCK;
		pmp.obstacle_state[3][12] = ObstacleState.LOCK;
		pmp.obstacle_state[3][13] = ObstacleState.LOCK;
		pmp.obstacle_state[3][14] = ObstacleState.LOCK;
		pmp.obstacle_state[2][14] = ObstacleState.LOCK;
		pmp.obstacle_state[1][14] = ObstacleState.LOCK;
		
		
		pmp.obstacle_state[5][10] = ObstacleState.LOCK;  // O
		pmp.obstacle_state[5][11] = ObstacleState.LOCK;
		pmp.obstacle_state[5][12] = ObstacleState.LOCK;
		pmp.obstacle_state[5][13] = ObstacleState.LOCK;
		pmp.obstacle_state[5][14] = ObstacleState.LOCK;
		pmp.obstacle_state[6][14] = ObstacleState.LOCK;
		pmp.obstacle_state[7][14] = ObstacleState.LOCK;
		pmp.obstacle_state[7][13] = ObstacleState.LOCK;
		pmp.obstacle_state[7][12] = ObstacleState.LOCK;
		pmp.obstacle_state[7][11] = ObstacleState.LOCK;
		pmp.obstacle_state[7][10] = ObstacleState.LOCK;
		pmp.obstacle_state[6][10] = ObstacleState.LOCK;
		
		
		pmp.obstacle_state[9][10] = ObstacleState.LOCK;  // F
		pmp.obstacle_state[10][10] = ObstacleState.LOCK;
		pmp.obstacle_state[11][10] = ObstacleState.LOCK;
		pmp.obstacle_state[9][11] = ObstacleState.LOCK;
		pmp.obstacle_state[9][12] = ObstacleState.LOCK;
		pmp.obstacle_state[9][13] = ObstacleState.LOCK;
		pmp.obstacle_state[9][14] = ObstacleState.LOCK;
		pmp.obstacle_state[10][12] = ObstacleState.LOCK;
		pmp.obstacle_state[11][12] = ObstacleState.LOCK;
		
		
		pmp.obstacle_state[13][10] = ObstacleState.LOCK;  // T
		pmp.obstacle_state[14][10] = ObstacleState.LOCK;
		pmp.obstacle_state[15][10] = ObstacleState.LOCK;
		pmp.obstacle_state[14][11] = ObstacleState.LOCK;
		pmp.obstacle_state[14][12] = ObstacleState.LOCK;
		pmp.obstacle_state[14][13] = ObstacleState.LOCK;
		pmp.obstacle_state[14][14] = ObstacleState.LOCK;
		
		
		pmp.obstacle_state[17][10] = ObstacleState.LOCK;  // W
		pmp.obstacle_state[17][11] = ObstacleState.LOCK;
		pmp.obstacle_state[17][12] = ObstacleState.LOCK;
		pmp.obstacle_state[17][13] = ObstacleState.LOCK;
		pmp.obstacle_state[17][14] = ObstacleState.LOCK;
		pmp.obstacle_state[18][14] = ObstacleState.LOCK;
		pmp.obstacle_state[19][14] = ObstacleState.LOCK;
		pmp.obstacle_state[19][13] = ObstacleState.LOCK;
		pmp.obstacle_state[19][12] = ObstacleState.LOCK;
		pmp.obstacle_state[19][11] = ObstacleState.LOCK;
		pmp.obstacle_state[19][10] = ObstacleState.LOCK;
		pmp.obstacle_state[20][14] = ObstacleState.LOCK;
		pmp.obstacle_state[21][14] = ObstacleState.LOCK;
		pmp.obstacle_state[21][13] = ObstacleState.LOCK;
		pmp.obstacle_state[21][12] = ObstacleState.LOCK;
		pmp.obstacle_state[21][11] = ObstacleState.LOCK;
		pmp.obstacle_state[21][10] = ObstacleState.LOCK;
		
		
		pmp.obstacle_state[24][10] = ObstacleState.LOCK;  // A
		pmp.obstacle_state[23][10] = ObstacleState.LOCK;
		pmp.obstacle_state[23][11] = ObstacleState.LOCK;
		pmp.obstacle_state[23][12] = ObstacleState.LOCK;
		pmp.obstacle_state[23][13] = ObstacleState.LOCK;
		pmp.obstacle_state[23][14] = ObstacleState.LOCK;
		pmp.obstacle_state[25][10] = ObstacleState.LOCK;
		pmp.obstacle_state[25][11] = ObstacleState.LOCK;
		pmp.obstacle_state[25][12] = ObstacleState.LOCK;
		pmp.obstacle_state[25][13] = ObstacleState.LOCK;
		pmp.obstacle_state[25][14] = ObstacleState.LOCK;
		pmp.obstacle_state[24][12] = ObstacleState.LOCK;
		pmp.obstacle_state[25][12] = ObstacleState.LOCK;
		
		
		pmp.obstacle_state[27][10] = ObstacleState.LOCK;  // R
		pmp.obstacle_state[27][11] = ObstacleState.LOCK;
		pmp.obstacle_state[27][12] = ObstacleState.LOCK;
		pmp.obstacle_state[27][13] = ObstacleState.LOCK;
		pmp.obstacle_state[27][14] = ObstacleState.LOCK;
		pmp.obstacle_state[28][10] = ObstacleState.LOCK;
		pmp.obstacle_state[29][10] = ObstacleState.LOCK;
		pmp.obstacle_state[30][10] = ObstacleState.LOCK;
		pmp.obstacle_state[30][11] = ObstacleState.LOCK;
		pmp.obstacle_state[30][12] = ObstacleState.LOCK;
		pmp.obstacle_state[29][12] = ObstacleState.LOCK;
		pmp.obstacle_state[28][12] = ObstacleState.LOCK;
		pmp.obstacle_state[29][13] = ObstacleState.LOCK;
		pmp.obstacle_state[29][14] = ObstacleState.LOCK;
		pmp.obstacle_state[30][14] = ObstacleState.LOCK;
		
		
		pmp.obstacle_state[32][10] = ObstacleState.LOCK;  // E
		pmp.obstacle_state[33][10] = ObstacleState.LOCK;
		pmp.obstacle_state[34][10] = ObstacleState.LOCK;
		pmp.obstacle_state[32][11] = ObstacleState.LOCK;
		pmp.obstacle_state[32][12] = ObstacleState.LOCK;
		pmp.obstacle_state[32][13] = ObstacleState.LOCK;
		pmp.obstacle_state[32][14] = ObstacleState.LOCK;
		pmp.obstacle_state[33][12] = ObstacleState.LOCK;
		pmp.obstacle_state[34][12] = ObstacleState.LOCK;
		pmp.obstacle_state[33][14] = ObstacleState.LOCK;
		pmp.obstacle_state[34][14] = ObstacleState.LOCK;
		
		
		
		
		pmp.obstacle_state[4][16] = ObstacleState.LOCK;  // S
		pmp.obstacle_state[3][16] = ObstacleState.LOCK; 
		pmp.obstacle_state[2][16] = ObstacleState.LOCK;
		pmp.obstacle_state[1][16] = ObstacleState.LOCK;
		pmp.obstacle_state[1][17] = ObstacleState.LOCK;
		pmp.obstacle_state[1][18] = ObstacleState.LOCK;
		pmp.obstacle_state[2][18] = ObstacleState.LOCK;
		pmp.obstacle_state[3][18] = ObstacleState.LOCK;
		pmp.obstacle_state[4][18] = ObstacleState.LOCK; 
		pmp.obstacle_state[4][19] = ObstacleState.LOCK;
		pmp.obstacle_state[4][20] = ObstacleState.LOCK; 
		pmp.obstacle_state[3][20] = ObstacleState.LOCK;
		pmp.obstacle_state[2][20] = ObstacleState.LOCK;
		pmp.obstacle_state[1][20] = ObstacleState.LOCK;
		
		
		pmp.obstacle_state[6][16] = ObstacleState.LOCK;  // T
		pmp.obstacle_state[7][16] = ObstacleState.LOCK;
		pmp.obstacle_state[8][16] = ObstacleState.LOCK;
		pmp.obstacle_state[9][16] = ObstacleState.LOCK;
		pmp.obstacle_state[10][16] = ObstacleState.LOCK;
		pmp.obstacle_state[8][17] = ObstacleState.LOCK;
		pmp.obstacle_state[8][18] = ObstacleState.LOCK;
		pmp.obstacle_state[8][19] = ObstacleState.LOCK;
		pmp.obstacle_state[8][20] = ObstacleState.LOCK;
		
		
		pmp.obstacle_state[12][16] = ObstacleState.LOCK;  // U
		pmp.obstacle_state[12][17] = ObstacleState.LOCK;
		pmp.obstacle_state[12][18] = ObstacleState.LOCK;
		pmp.obstacle_state[12][19] = ObstacleState.LOCK;
		pmp.obstacle_state[12][20] = ObstacleState.LOCK;
		pmp.obstacle_state[13][20] = ObstacleState.LOCK;
		pmp.obstacle_state[14][20] = ObstacleState.LOCK;
		pmp.obstacle_state[15][20] = ObstacleState.LOCK;
		pmp.obstacle_state[16][20] = ObstacleState.LOCK;
		pmp.obstacle_state[16][19] = ObstacleState.LOCK;
		pmp.obstacle_state[16][18] = ObstacleState.LOCK;
		pmp.obstacle_state[16][17] = ObstacleState.LOCK;
		pmp.obstacle_state[16][16] = ObstacleState.LOCK;
		
		
		pmp.obstacle_state[18][16] = ObstacleState.LOCK;  // D
		pmp.obstacle_state[18][17] = ObstacleState.LOCK;
		pmp.obstacle_state[18][18] = ObstacleState.LOCK;
		pmp.obstacle_state[18][19] = ObstacleState.LOCK;
		pmp.obstacle_state[18][20] = ObstacleState.LOCK;
		pmp.obstacle_state[19][16] = ObstacleState.LOCK;
		pmp.obstacle_state[20][16] = ObstacleState.LOCK;
		pmp.obstacle_state[21][16] = ObstacleState.LOCK;
		pmp.obstacle_state[22][17] = ObstacleState.LOCK;
		pmp.obstacle_state[22][18] = ObstacleState.LOCK;
		pmp.obstacle_state[22][19] = ObstacleState.LOCK;
		pmp.obstacle_state[21][20] = ObstacleState.LOCK;
		pmp.obstacle_state[20][20] = ObstacleState.LOCK;
		pmp.obstacle_state[19][20] = ObstacleState.LOCK;
		
		
		pmp.obstacle_state[24][16] = ObstacleState.LOCK;  // I
		pmp.obstacle_state[25][16] = ObstacleState.LOCK;
		pmp.obstacle_state[26][16] = ObstacleState.LOCK;
		pmp.obstacle_state[27][16] = ObstacleState.LOCK;
		pmp.obstacle_state[28][16] = ObstacleState.LOCK;
		pmp.obstacle_state[26][17] = ObstacleState.LOCK;
		pmp.obstacle_state[26][18] = ObstacleState.LOCK;
		pmp.obstacle_state[26][19] = ObstacleState.LOCK;
		pmp.obstacle_state[26][20] = ObstacleState.LOCK;
		pmp.obstacle_state[24][20] = ObstacleState.LOCK;
		pmp.obstacle_state[25][20] = ObstacleState.LOCK;
		pmp.obstacle_state[27][20] = ObstacleState.LOCK;
		pmp.obstacle_state[28][20] = ObstacleState.LOCK;
		
		
		pmp.obstacle_state[30][16] = ObstacleState.LOCK;  // O
		pmp.obstacle_state[30][17] = ObstacleState.LOCK;
		pmp.obstacle_state[30][18] = ObstacleState.LOCK;
		pmp.obstacle_state[30][19] = ObstacleState.LOCK;
		pmp.obstacle_state[30][20] = ObstacleState.LOCK;
		pmp.obstacle_state[31][20] = ObstacleState.LOCK;
		pmp.obstacle_state[32][20] = ObstacleState.LOCK;
		pmp.obstacle_state[33][20] = ObstacleState.LOCK;
		pmp.obstacle_state[34][20] = ObstacleState.LOCK;
		pmp.obstacle_state[34][19] = ObstacleState.LOCK;
		pmp.obstacle_state[34][18] = ObstacleState.LOCK;
		pmp.obstacle_state[34][17] = ObstacleState.LOCK;
		pmp.obstacle_state[34][16] = ObstacleState.LOCK;
		pmp.obstacle_state[33][16] = ObstacleState.LOCK;
		pmp.obstacle_state[32][16] = ObstacleState.LOCK;
		pmp.obstacle_state[31][16] = ObstacleState.LOCK;
		
	}
	
}
