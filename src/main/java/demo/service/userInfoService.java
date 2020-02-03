package demo.service;

import demo.dao.userInfoMapper;
import demo.entity.userInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class userInfoService {

    /**
     * 注入DAO
     */
    @Autowired
    private userInfoMapper userInfoMapper;

    public Map<String, Object> userLogin(String username, String password){
        return userInfoMapper.userLogin(username,password);
    }


}
