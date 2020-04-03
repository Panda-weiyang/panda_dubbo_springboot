package cn.panda.dubbo.springboot.api.vo;

import java.io.Serializable;

public class LoginVo implements Serializable {

    private static final long serialVersionUID = 6882559735241665373L;

    private String code;
    private String desc;

    private String content;

    private String serverHostname;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getServerHostname() {
        return serverHostname;
    }
    public void setServerHostname(String serverHostname) {
        this.serverHostname = serverHostname;
    }
}
