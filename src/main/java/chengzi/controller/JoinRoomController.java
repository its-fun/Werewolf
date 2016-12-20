package chengzi.controller;

import chengzi.dataObject.Role;
import chengzi.dataObject.RoomDO;
import chengzi.sessionContext.RoomContext;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by huanghao on 2016/12/20.
 */
@Controller
public class JoinRoomController {
    private static final Logger logger= LoggerFactory.getLogger(CreateRoomController.class);

    @RequestMapping(value = "/pages/joinRoomSubmit" ,method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public @ResponseBody
    Map<String, String> createRoom(@RequestBody String str, HttpServletRequest request){
        Map<String, String> result = new HashMap<>();
        try {
            logger.error(str);
            JSONObject jb= JSONObject.fromObject(str);
            int roomNum =Integer.parseInt((String) jb.get("roomNum"));
            logger.error("roomNum :" + roomNum);
            RoomDO roomDO = RoomContext.getInstance().getRoom(roomNum);
            if(roomDO == null){
                result.put("success","false");
                return result;
            }
            Role role = roomDO.getRondomRole();
            if(role == null){
                result.put("success","false");
                return result;
            }
            HttpSession session = request.getSession();
            session.setAttribute("roomNum", new Integer(roomNum).toString());
            session.setAttribute("role", role);

        } catch (Exception e) {
            logger.error(e.toString());
            result.put("success","false");
            return result;
        }
        result.put("success","true");
        return result;
    }

}
