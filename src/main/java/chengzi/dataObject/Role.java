package chengzi.dataObject;

/**
 * Created by huanghao on 2016/12/19.
 */
public class Role {
    private boolean isAlive;
    private int playerId = -1;


    public Role(){
        this.isAlive = true;
    }
    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public boolean hasOwner(){
        return playerId == -1;
    }
}
