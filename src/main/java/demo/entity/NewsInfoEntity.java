package demo.entity;

import java.util.Date;

/**
 * 新闻实体类
 * @author yxp
 * 2020年3月2日10:05:41
 */
public class NewsInfoEntity {

    private String id;

    /**
     * 新闻标题
     */
    private String newsTitle;

    /**
     * 新闻略缩图
     */
    private String newsMap;

    /**
     * 新闻内容
     */
    private String newsContent;

    /**
     * 创建时间
     */
    private String dataTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsMap() {
        return newsMap;
    }

    public void setNewsMap(String newsMap) {
        this.newsMap = newsMap;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }
}
