package chengzi.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by huanghao on 2016/12/16.
 */
@Controller
public class BaseController {
    private static int counter=0;
    private static final String VIEW_INDEX="index";
    private static final Logger logger= LoggerFactory.getLogger(BaseController.class);

//    @RequestMapping(value = "/" ,method = RequestMethod.GET)
//    public String welcome(ModelMap model){
//        model.addAttribute("message","Welcome");
//        model.addAttribute("counter",++counter);
//        logger.debug("[Welcome counter :{}",counter);
//        return VIEW_INDEX;
//    }
//
//    @RequestMapping(value = "/{name}" ,method = RequestMethod.GET)
//    public String welcome(@PathVariable String name , ModelMap model){
//        model.addAttribute("message","Welcome "+name);
//        model.addAttribute("counter",++counter);
//        logger.debug("[Welcome counter :{}",counter);
//        return VIEW_INDEX;
//    }
}
