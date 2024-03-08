package e1;

public class StrategyKnight implements Strategy {

    private boolean canMove = false;
    private Pair<Integer, Integer> position;

    public StrategyKnight(int xKnight, int yknight, int row, int col){
        int x = row-xKnight;
		int y = col-yknight;

        if (x!=0 && y!=0 && Math.abs(x)+Math.abs(y)==3) {
			position = new Pair<>(row,col);
            canMove = true;
        }
    }
    
    public boolean canMove(){
        return this.canMove;
    }

    public Pair<Integer, Integer> position(){
        return position;
    }
}
