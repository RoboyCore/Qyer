package mobi.xiaowu.qyer.app;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import cn.sharesdk.framework.ShareSDK;

/**
 * Created by xiaowu on 2017/1/8.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ShareSDK.initSDK(this);//第三方分享
    }

    /**
     * 获取当前的应用版本号
     * @return 版本
     */
    public String getVersionName(){
        PackageManager pm = getPackageManager();
        try {
            PackageInfo info = pm.getPackageInfo(getPackageName(), 0);
            return info.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return "";
    }
}
