package chengzi.dataObject;

/**
 * Created by huanghao on 2016/12/18.
 */
public class RoomDO {
    private static int incredRoomId = 0;

    private int roomId;

    public RoomDO(){
        incredRoomId ++;
        this.roomId = incredRoomId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }


}
