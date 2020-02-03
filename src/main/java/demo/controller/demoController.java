package demo.controller;

import demo.entity.userInfo;
import demo.service.userInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping(value = {"/user"})
//@RestController
//@RequestMapping("/")
public class demoController {

    @Autowired
    private userInfoService userInfoService;

    @RequestMapping("/loginHtml")
    public String hello(HttpServletRequest request){
        Map<String,Object> userInfo = (Map<String, Object>) request.getSession().getAttribute("session_user");
        if(userInfo!=null){
            Map<String, Object> u = userInfoService.userLogin((String) userInfo.get("USERNAME"), (String) userInfo.get("PASSWORD1"));
            if (u!=null){
                request.getSession().setAttribute("session_user",u);
                return "index";
            }
        }
        return "userLogin";
    }

    @RequestMapping("/userLogin")
    public String userLogin(userInfo userInfo,HttpServletRequest request){
        Map<String, Object> u = userInfoService.userLogin(userInfo.getUsername(), userInfo.getPassword1());
        if (u!=null){
            request.getSession().setAttribute("session_user",u);
            return "index";
        }
        return "loginError";
    }


}
