package demo.controller;

import demo.entity.userInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * 新闻控制层
 * @author yxp
 * 2020年3月2日10:05:57
 */

@Controller
@RequestMapping(value = {"/"})
public class userController {

    @Autowired
    private demo.service.newsInfoService newsInfoService;

    @Autowired
    private demo.service.userInfoService userInfoService;

    @RequestMapping("/")
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
    public String userLogin(userInfo userInfo, HttpServletRequest request){
        Map<String, Object> u = userInfoService.userLogin(userInfo.getUsername(), userInfo.getPassword1());
        if (u!=null){
            request.getSession().setAttribute("session_user",u);
            List<Map<String,Object>> aa = newsInfoService.findAll(null);
            request.setAttribute("list",aa);
            return "index";
        }
        return "loginError";
    }
}
