package demo.dao;

import demo.entity.NewsInfoEntity;
import demo.entity.userInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface newsInfoMapper {

    /**
     * 新闻列表查询
     * @return
     */
    List<Map<String,Object>> findAll(NewsInfoEntity entity);


    int insert(NewsInfoEntity entity);

}