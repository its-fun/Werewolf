package chengzi.controller;

import chengzi.dataObject.RoomDO;
import chengzi.sessionContext.RoomContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import net.sf.json.JSONObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by huanghao on 2016/12/18.
 */
@Controller
public class CreateRoomController {
    private static final Logger logger= LoggerFactory.getLogger(CreateRoomController.class);

    @RequestMapping(value = "/pages/createRomeSubmit" ,method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public @ResponseBody
    Map<String, String> createRoom(@RequestBody String str, HttpServletRequest request){
        try {
            logger.error(str);
            JSONObject jb= JSONObject.fromObject(str);
            int langrenNum =Integer.parseInt((String) jb.get("langrenNum"));
            int yuyanjiaNum =Integer.parseInt((String) jb.get("yuyanjiaNum"));
            int cunminNum =Integer.parseInt((String)jb.get("cunminNum"));
            int nvwuNum =Integer.parseInt((String)jb.get("nvwuNum"));
            int lierenNum =Integer.parseInt((String)jb.get("lierenNum"));
            int shouweiNum =Integer.parseInt((String)jb.get("shouweiNum"));
            int baichiNum =Integer.parseInt((String)jb.get("baichiNum"));
            int daozeiNum =Integer.parseInt((String)jb.get("daozeiNum"));
            int qiubiteNum =Integer.parseInt((String)jb.get("qiubiteNum"));
            int yehaiziNum =Integer.parseInt((String)jb.get("yehaiziNum"));
            logger.error("langrenNum :" + langrenNum + "; yuyanjiaNum : " + yuyanjiaNum + "; cunminNum : " + cunminNum
                    + "; nvwuNum : " + nvwuNum + "; lierenNum : " + lierenNum + "; shouweiNum : " + shouweiNum + "; baichiNum : "
                    + baichiNum + "; daozeiNum : " + daozeiNum + "; qiubiteNum : " + qiubiteNum + "; yehaiziNum : " + yehaiziNum);
            RoomDO newRoom = new RoomDO(langrenNum,cunminNum,yuyanjiaNum,nvwuNum,lierenNum,shouweiNum,baichiNum,daozeiNum,qiubiteNum,yehaiziNum);
            RoomContext.getInstance().addRoom(newRoom.getRoomId(), newRoom);

            HttpSession session = request.getSession();
            session.setAttribute("roomNum", new Integer(newRoom.getRoomId()).toString());

        } catch (Exception e) {
            logger.error(e.toString());
        }
        Map<String, String> result = new HashMap<>();
        result.put("success","true");
        return result;
    }

    @RequestMapping(value = "/pages/createRoomSucPre" ,method = RequestMethod.GET)
    public String createRoomSuc(ModelMap model, HttpServletRequest request){
        logger.error((String)request.getSession().getAttribute("roomNum"));
        model.addAttribute("roomNum", (String)request.getSession().getAttribute("roomNum"));
        logger.error("CreateRoomSuccess current Room count : " + new Integer(RoomContext.getInstance().size()).toString());
        return "redirect:createRoomSuc.jsp";
    }

}
