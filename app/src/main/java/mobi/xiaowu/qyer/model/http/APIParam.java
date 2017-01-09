package mobi.xiaowu.qyer.model.http;


import java.util.Map;
import java.util.TreeMap;

/**
 * Created by xiaowu on 2017/1/8.
 */

public class APIParam {
    //qyer_discount_androi
    //  client_secret=227097da1d07a2a9860f
    // &track_user_id=
    // &track_deviceid=352284042226724
    // &track_app_version=2.0.4
    // &track_app_channel=qq
    // &track_device_info=hlte
    // &track_os=Android4.4.2
    // &app_installtime=1483531797801
    // &size=720x1242
    // &ra_referer=app_home
//
    public static final String CLIENT_ID = "client_id";
    public static final String CLIENT_SECRET = "client_secret";
    public static final String TRACK_USER_ID = "track_user_id";
    public static final String TRACK_DEVICEID = "track_deviceid";
    public static final String TRACK_APP_VERSION = "track_app_version";
    public static final String TRACK_APP_CHANNEL = "track_app_channel";
    public static final String TRACK_DEVICE_INFO = "track_device_info";
    public static final String TRACK_OS = "track_os";
    public static final String APP_INSTALLTIME = "app_installtime";
    public static final String SIZE = "size";
    public static final String RA_REFERER = "ra_referer";
    
    private static Map<String,String> mMap;
    private void ParamService(){
        
    }
    public static Map<String,String> getDeviceType(){
        mMap = new TreeMap<>();
        mMap.put(CLIENT_ID,"qyer_discount_androi");
        mMap.put(CLIENT_SECRET,"227097da1d07a2a9860f");
        mMap.put(TRACK_USER_ID,"");
        mMap.put(TRACK_DEVICEID,"352284042226724");
        mMap.put(TRACK_APP_VERSION,"2.0.4");
        mMap.put(TRACK_APP_CHANNEL,"qq");
        mMap.put(TRACK_DEVICE_INFO,"hlte");
        mMap.put(TRACK_OS,"Android4.4.2");
        mMap.put(APP_INSTALLTIME,"1483531797801");
        mMap.put(SIZE,"720x1242");
        mMap.put(RA_REFERER,"app_home");
        return mMap;
    }
}
