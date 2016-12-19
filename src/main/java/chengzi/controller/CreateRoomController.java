package chengzi.controller;

import chengzi.dataObject.RoomDO;
import chengzi.sessionContext.RoomContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONObject;
import java.io.PrintWriter;
import java.util.HashMap;


/**
 * Created by huanghao on 2016/12/18.
 */
@Controller
public class CreateRoomController {
    private static final Logger logger= LoggerFactory.getLogger(CreateRoomController.class);

    @RequestMapping(value = "/pages/createRomeSubmit" ,method = RequestMethod.POST)
    public String createRoom(HttpServletRequest request, HttpServletResponse response){
        try {
            String str = request.getParameter("submitParas");
            logger.error(str);
            JSONObject jb= JSONObject.fromObject(str);
            int langrenNum =(Integer)jb.get("langrenNum");
            int yuyanjiaNum =(Integer)jb.get("yuyanjiaNum");
            int cunminNum =(Integer)jb.get("cunminNum");
            int nvwuNum =(Integer)jb.get("nvwuNum");
            int lierenNum =(Integer)jb.get("lierenNum");
            int shouweiNum =(Integer)jb.get("shouweiNum");
            int baichiNum =(Integer)jb.get("baichiNum");
            int daozeiNum =(Integer)jb.get("daozeiNum");
            int qiubiteNum =(Integer)jb.get("qiubiteNum");
            int yehaiziNum =(Integer)jb.get("yehaiziNum");
            logger.error("langrenNum :" + langrenNum + "; yuyanjiaNum : " + yuyanjiaNum + "; cunminNum : " + cunminNum
                    + "; nvwuNum : " + nvwuNum + "; lierenNum : " + lierenNum + "; shouweiNum : " + shouweiNum + "; baichiNum : "
                    + baichiNum + "; daozeiNum : " + daozeiNum + "; qiubiteNum : " + qiubiteNum + "; yehaiziNum : " + yehaiziNum);
            RoomDO newRoom = new RoomDO(langrenNum,cunminNum,yuyanjiaNum,nvwuNum,lierenNum,shouweiNum,baichiNum,daozeiNum,qiubiteNum,yehaiziNum);
            RoomContext.getInstance().addRoom(newRoom.getRoomId(), newRoom);
            logger.error(new Integer(RoomContext.getInstance().size()).toString());

            response.setContentType("application/json");
            response.setHeader("Pragma", "No-cache");
            response.setHeader("Cache-Control", "no-cache");
            response.setCharacterEncoding("UTF-8");
            PrintWriter out= null;
            out = response.getWriter();
            out.print(JSONObject.fromObject(new HashMap<String,String>().put("success","true")).toString());
            out.flush();
            out.close();
        } catch (Exception e) {
            logger.error(e.toString());
        }
        return "success";
    }

}
