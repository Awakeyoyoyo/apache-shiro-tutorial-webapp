package realms;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.realm.Realm;

public class MyRealm1 implements Realm {
    //返回一个唯一的Realm名字
    public String getName() {
        return "MyRealm1";
    }
    //判断此Realm是否支持此Token
    public boolean supports(AuthenticationToken authenticationToken) {
        return false;
    }
    //根据Token获取认证信息
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        return null;
    }
}
