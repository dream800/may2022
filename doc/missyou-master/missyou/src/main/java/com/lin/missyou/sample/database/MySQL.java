/**
 * @作者 7七月
 * @微信公号 林间有风
 * @开源项目 $ http://7yue.pro
 * @免费专栏 $ http://course.7yue.pro
 * @我的课程 $ http://imooc.com/t/4294850
 * @创建时间 2019-12-30 12:18
 */
package com.lin.missyou.sample.database;

import com.lin.missyou.sample.IConnect;
import org.springframework.stereotype.Component;

public class MySQL implements IConnect {
    private String ip = "localhost";

    private Integer port = 3306;

    public MySQL(String ip, Integer port) {
        this.ip = ip;
        this.port = port;
    }

    public MySQL() {
    }


    @Override
    public void connect() {
        System.out.println(this.ip +":" + this.port);
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
