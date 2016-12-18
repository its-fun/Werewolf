package chengzi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONObject;


/**
 * Created by huanghao on 2016/12/18.
 */
@Controller
public class CreateRoomController {

    @RequestMapping(value = "/Werewolf/pages/createRome.do" ,method = RequestMethod.POST, produces = "application/json")
    public String createRoom(HttpServletRequest request, HttpServletResponse response, @RequestBody String str){
        JSONObject jb= JSONObject.fromObject(str);
        //将json格式的字符串转换为json对象，并取得该对象的“userName”属性值
        String langrenNum =(String)jb.get("langrenNum");
        String yuyanjiaNum =(String)jb.get("yuyanjiaNum");
        String cunminNum =(String)jb.get("cunminNum");
        String nvwuNum =(String)jb.get("nvwuNum");
        String lierenNum =(String)jb.get("lierenNum");
        String shouweiNum =(String)jb.get("shouweiNum");
        String baichiNum =(String)jb.get("baichiNum");
        String daozeiNum =(String)jb.get("daozeiNum");
        String qiubiteNum =(String)jb.get("qiubiteNum");
        String yehaiziNum =(String)jb.get("yehaiziNum");
        return "";
    }

}
