package chengzi.sessionContext;

import chengzi.dataObject.RoomDO;

import java.util.HashMap;

/**
 * Created by huanghao on 2016/12/18.
 */
public class RoomContext {
    private HashMap<Integer,RoomDO> roomDOs = null;
    private static RoomContext roomContext = null;

    private RoomContext(){
        roomDOs = new HashMap<Integer,RoomDO>();
    }

    public static RoomContext getInstance(){
        synchronized (RoomContext.class) {
            if (roomContext == null) {
                roomContext = new RoomContext();
            }
        }
        return roomContext;
    }

    public void addRoom(int roomId,RoomDO roomDO){
        synchronized (RoomContext.class){
            roomDOs.put(roomId,roomDO);
        }
    }

    public void removeRoom(int roomId){
        synchronized (RoomContext.class){
            roomDOs.remove(roomId);
        }
    }

    public int size(){
        return roomDOs.size();
    }
}
