package chengzi.dataObject;

import java.util.ArrayList;

/**
 * Created by huanghao on 2016/12/18.
 */
public class RoomDO {
    private static int incredRoomId = 0;

    private int roomId;
    private int langrenNum;
    private int cunminNum;
    private int yuyanjiaNum;
    private int nvwuNum;
    private int lierenNum;
    private int shouweiNum;
    private int baichiNum;
    private int daozeiNum;
    private int qiubiteNum;
    private int yehaiziNum;

    private ArrayList<Role> roles = null;

    public RoomDO(int langrenNum, int cunminNum, int yuyanjiaNum, int nvwuNum, int lierenNum, int shouweiNum,
             int baichiNum, int daozeiNum, int qiubiteNum, int yehaiziNum){
        synchronized (RoomDO.class){
            incredRoomId ++;
        }
        this.roomId = incredRoomId;
        this.langrenNum = langrenNum;
        this.cunminNum = cunminNum;
        this.yuyanjiaNum = yuyanjiaNum;
        this.nvwuNum = nvwuNum;
        this.lierenNum = lierenNum;
        this.shouweiNum = shouweiNum;
        this.baichiNum = baichiNum;
        this.daozeiNum = daozeiNum;
        this.qiubiteNum = qiubiteNum;
        this.yehaiziNum = yehaiziNum;
        initRoles();
    }

    public RoomDO(){
        synchronized (RoomDO.class){
            incredRoomId ++;
        }
        this.roomId = incredRoomId;
    }

    private void initRoles(){
        roles = new ArrayList<>();
        for (int i=0;i<langrenNum;i++){
            roles.add(new LangRen());
        }
        for (int i=0;i<cunminNum;i++){
            roles.add(new CunMin());
        }
        for (int i=0;i<yuyanjiaNum;i++){
            roles.add(new YuYanJia());
        }
        for (int i=0;i<nvwuNum;i++){
            roles.add(new NvWu());
        }
//        for (int i=0;i<lierenNum;i++){
//            roles.add(new LangRen());
//        }
//        for (int i=0;i<shouweiNum;i++){
//            roles.add(new LangRen());
//        }
//        for (int i=0;i<baichiNum;i++){
//            roles.add(new LangRen());
//        }
//        for (int i=0;i<daozeiNum;i++){
//            roles.add(new LangRen());
//        }
//        for (int i=0;i<qiubiteNum;i++){
//            roles.add(new LangRen());
//        }
//        for (int i=0;i<yehaiziNum;i++){
//            roles.add(new LangRen());
//        }
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getLangrenNum() {
        return langrenNum;
    }

    public void setLangrenNum(int langrenNum) {
        this.langrenNum = langrenNum;
    }

    public int getCunminNum() {
        return cunminNum;
    }

    public void setCunminNum(int cunminNum) {
        this.cunminNum = cunminNum;
    }

    public int getYuyanjiaNum() {
        return yuyanjiaNum;
    }

    public void setYuyanjiaNum(int yuyanjiaNum) {
        this.yuyanjiaNum = yuyanjiaNum;
    }

    public int getNvwuNum() {
        return nvwuNum;
    }

    public void setNvwuNum(int nvwuNum) {
        this.nvwuNum = nvwuNum;
    }

    public int getLierenNum() {
        return lierenNum;
    }

    public void setLierenNum(int lierenNum) {
        this.lierenNum = lierenNum;
    }

    public int getShouweiNum() {
        return shouweiNum;
    }

    public void setShouweiNum(int shouweiNum) {
        this.shouweiNum = shouweiNum;
    }

    public int getBaichiNum() {
        return baichiNum;
    }

    public void setBaichiNum(int baichiNum) {
        this.baichiNum = baichiNum;
    }

    public int getDaozeiNum() {
        return daozeiNum;
    }

    public void setDaozeiNum(int daozeiNum) {
        this.daozeiNum = daozeiNum;
    }

    public int getQiubiteNum() {
        return qiubiteNum;
    }

    public void setQiubiteNum(int qiubiteNum) {
        this.qiubiteNum = qiubiteNum;
    }

    public int getYehaiziNum() {
        return yehaiziNum;
    }

    public void setYehaiziNum(int yehaiziNum) {
        this.yehaiziNum = yehaiziNum;
    }


}
