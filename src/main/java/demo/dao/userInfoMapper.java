package demo.dao;

import demo.entity.userInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.Map;

@Mapper
@Component
public interface userInfoMapper {

    /**
     * 登录查询
     * @param username
     * @param pwd
     * @return
     */
    Map<String, Object> userLogin(@Param("username") String username, @Param("pwd") String pwd);



    int deleteByPrimaryKey(String id);


    int insert(userInfo record);


    int insertSelective(userInfo record);


    userInfo selectByPrimaryKey(String id);


    int updateByPrimaryKeySelective(userInfo record);


    int updateByPrimaryKey(userInfo record);
}