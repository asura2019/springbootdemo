package demo.service;

import demo.dao.newsInfoMapper;
import demo.entity.NewsInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class newsInfoService {

    /**
     * 注入DAO
     */
    @Autowired
    private newsInfoMapper newsInfoMapper;

    public List<Map<String,Object>> findAll(NewsInfoEntity entity){
        return newsInfoMapper.findAll(entity);
    }

    public int insert(NewsInfoEntity entity){
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        entity.setId(uuid);
        entity.setDataTime(null);
        return newsInfoMapper.insert(entity);
    }

}
