package demo.controller;

import demo.entity.NewsInfoEntity;
import demo.service.newsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * 新闻控制层
 * @author yxp
 * 2020年3月2日10:05:57
 */

@Controller
@RequestMapping(value = {"/news"})
public class NewsController {

    @Autowired
    private newsInfoService newsInfoService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<Map<String,Object>> userLogin(HttpServletRequest request){
        List<Map<String,Object>> list = newsInfoService.findAll(null);
        request.setAttribute("newsList",list);
        //return "index";
        return newsInfoService.findAll(null);
    }

    @RequestMapping("/save")
    @ResponseBody
    public int save(NewsInfoEntity entity){
        return newsInfoService.insert(entity);
    }
}
