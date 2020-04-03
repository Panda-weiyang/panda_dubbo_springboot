package cn.panda.dubbo.springboot.api.param;

import java.io.Serializable;

public class SystemParam implements Serializable {

    private static final long serialVersionUID = -3624039083130923841L;

    private String version;

    private String phone;
    private String type;

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
