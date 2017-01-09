package mobi.xiaowu.qyer.model.http;

import java.util.Map;

import mobi.xiaowu.qyer.model.bean.Home;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Created by xiaowu on 2017/1/7.
 */

public interface HomeMsgService {
    //首页的数据来源，map存放设备信息
    @GET
    Observable<Home> getHomeMsg(@Url String url, @QueryMap Map<String,String> map);//获取home的第一个链接


}
