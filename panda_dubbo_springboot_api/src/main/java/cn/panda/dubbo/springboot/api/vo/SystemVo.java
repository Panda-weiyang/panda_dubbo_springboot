package cn.panda.dubbo.springboot.api.vo;

import java.io.Serializable;

public class SystemVo implements Serializable {

    private static final long serialVersionUID = 3525685417226457878L;

    private String code;
    private String desc;

    private String version;

    private String serverHostname;

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
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
    public String getServerHostname() {
        return serverHostname;
    }
    public void setServerHostname(String serverHostname) {
        this.serverHostname = serverHostname;
    }
}
