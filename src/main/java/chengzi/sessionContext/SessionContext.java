package chengzi.sessionContext;

import chengzi.dataObject.RoomDO;

import java.util.ArrayList;

/**
 * Created by huanghao on 2016/12/18.
 */
public class SessionContext {
    private ArrayList<RoomDO> roomDOs = null;
    private static SessionContext sessionContext = null;

    private SessionContext(){
        roomDOs = new ArrayList<RoomDO>();
    }

    public static SessionContext getInstance(){
        synchronized (SessionContext.class) {
            if (sessionContext == null) {
                sessionContext = new SessionContext();
            }
        }
        return  sessionContext;
    }
}
