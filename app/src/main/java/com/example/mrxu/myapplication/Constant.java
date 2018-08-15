package com.example.mrxu.myapplication;

/**
 * 常量类
 */
public class Constant {

    //todo 正式地址
    public static final String BASE_URL = "";
    public static final String BASE_SHARE_URL = "";
    //     开发阿里云旺appId
    public static final String YWAPPID = "";
    public static final String ALIASTYPE = "";
    public static final String CUSTOM_ID = "";
    //        语音 图片
    public static final String BASE_IMG_URL = "";
    //    阿里云图片上传
    public static final String endPoint = "";
    public static final String STSServer = BASE_URL + "";
    public static final String bucketName = "";
//        腾讯
    public static final int ACCOUNT_TYPE = 	000;
    //sdk appid 由腾讯分配
    public static final int SDK_APPID = 000;
//视频分享的基础链接
    public static final String BASE_SHARE_VIDEO_URL = "";

    //todo 开发地址
//    public static final String BASE_URL = "";
//    public static final String BASE_SHARE_URL = "";
//    //     开发阿里云旺appId
//    public static final String YWAPPID = "";
//    public static final String ALIASTYPE = "";
//    public static final String CUSTOM_ID = "";
//    //    语音 图片
//    public static final String BASE_IMG_URL = "";
//    //    阿里云图片上传
//    public static final String endPoint = "";
//    public static final String STSServer = BASE_URL + "";
//    public static final String bucketName = "";
//    //    腾讯
//    public static final int ACCOUNT_TYPE = 000;
//    //sdk appid 由腾讯分配
//    public static final int SDK_APPID = 000;
//    //视频分享的基础链接
//    public static final String BASE_SHARE_VIDEO_URL = "";

    //todo  测试地址
//    public static final String BASE_URL = "";
//    public static final String BASE_SHARE_URL = "";
//    //阿里云旺appId
//    public static final String YWAPPID = "";
//    public static final String ALIASTYPE = "";
//    public static final String CUSTOM_ID = "";
//    //语音 图片
//    public static final String BASE_IMG_URL = "";
//    //阿里云图片上传
//    public static final String endPoint = "";
//    public static final String STSServer =  "";
//    public static final String bucketName = "";
////        腾讯
//    public static final int ACCOUNT_TYPE = 000;
//    //sdk appid 由腾讯分配
//    public static final int SDK_APPID = ;
////    视频分享的基础链接
//    public static final String BASE_SHARE_VIDEO_URL = "";


    //todo 测试线上地址
//    public static final String BASE_URL = "";
//    public static final String BASE_SHARE_URL = "";
//    //     开发阿里云旺appId
//    public static final String YWAPPID = "";
//    public static final String ALIASTYPE = "";
//    public static final String CUSTOM_ID = "";
//    //        语音 图片
//    public static final String BASE_IMG_URL = "";
//    //    阿里云图片上传
//    public static final String endPoint = "";
//    public static final String STSServer = "";
//    public static final String bucketName = "";
//    //腾讯
//    public static final int ACCOUNT_TYPE = 000;
//    //sdk appid 由腾讯分配
//    public static final int SDK_APPID = ;
////视频分享的基础链接
//    public static final String BASE_SHARE_VIDEO_URL = "";

    //true 线下环境,false 线上环境
    public static final boolean DEBUG = false;


    /**
     * 返回异常
     */

    public static final int DATA_RETURN_ERROR = 100;

    /**
     * 返回正常
     */
    public static final int DATA_RETURN_SUCCESS = 200;

    /**
     * 一页请求量
     */
    public static final int PAGE_SIZE = 20;

    //TODO 已经更换
    public static final String WX_APPID = "wx74ea489815b6888a";
    public static final String WX_APPKEY = "6c77a90d0d2e2bc449bd33448553dcf1";
    public static final String QQ_APPID = "101435865";
    public static final String QQ_APPKEY = "f6b08c7ab12543595a950358eebed0ec";
    public static final String WEIBO_APPKEY = "2922652196";
    public static final String WEIBO_SECRET = "f4805389c5d226a53f3676dbfd543aa0";


    /**
     * 支付宝appID
     */
    public static final String ALIappID = "2017090108502607";

    /**
     * 只有闪约用到该字段
     */
    public static String SELECT_DATE_TYPE = "";
    /**
     * shareDialog 从不同页面来显示不同按钮 1.圈子详情 2.邀约详情 3.个人中心
     */
    public static int SHARE_DIALOG_CIRCLE = 1;
    public static int SHARE_DIALOG_MEET = 2;
    public static int SHARE_DIALOG_CENTER = 3;


    /**
     * 用于N多界面跳转选择地址时的传值
     * 1.一触即约发布界面
     * 2.珍贵约--选择邀约项目--应邀界面
     * 3.真诚约发布界面
     * 4.单独邀约发布界面
     * 5.旅游 珍贵约
     */

    public static int FROM_WHICH_ACTIVITY = 0;

    /**
     * 单独邀约用到的toUid
     */
    public static String TOUID = "";


    /**
     * 刷新时间
     */
    public static int REFRESH_TIME = 100;


    /**
     * 真诚约选择商家分类
     */
    public static final String SINCERE_CLASS_EAT_ID = "1";
    public static final String SINCERE_CLASS_EAT_CODE = "050000";
    public static final String SINCERE_CLASS_EAT_NAME = "约人吃饭";

    public static final String SINCERE_CLASS_BUILD_ID = "84";
    public static final String SINCERE_CLASS_BUILD_CODE = "080100";
    public static final String SINCERE_CLASS_BUILD_NAME = "瑜伽健身";

    public static final String SINCERE_CLASS_CAMER_ID = "33";
    public static final String SINCERE_CLASS_CAMER_CODE = "080600";
    public static final String SINCERE_CLASS_CAMER_NAME = "看电影";

    public static final String SINCERE_CLASS_KGE_ID = "38";
    public static final String SINCERE_CLASS_KGE_CODE = "080300";
    public static final String SINCERE_CLASS_KGE_NAME = "唱K";

    public static final String SINCERE_CLASS_HAPPY_ID = "46";
    public static final String SINCERE_CLASS_HAPPY_CODE = "080500";
    public static final String SINCERE_CLASS_HAPPY_NAME = "休闲娱乐";

    public static final String SINCERE_CLASS_OTHER_ID = "0";
    public static final String SINCERE_CLASS_OTHER_CODE = "0";
    public static final String SINCERE_CLASS_OTHER_NAME = "其他";


    /**
     * 一触即约商家分类
     */
    public static final String PRECIOUS_CLASS_EAT_ID = "1";
    public static final String PRECIOUS_CLASS_EAT_CODE = "050000";
    public static final String PRECIOUS_CLASS_EAT_NAME = "餐饮类";

    public static final String PRECIOUS_CLASS_KTV_ID = "38";
    public static final String PRECIOUS_CLASS_KTV_CODE = "080302";
    public static final String PRECIOUS_CLASS_KTV_NAME = "唱K";

    public static final String PRECIOUS_CLASS_YUJIA_ID = "84";
    public static final String PRECIOUS_CLASS_YUJIA_CODE = "080111";
    public static final String PRECIOUS_CLASS_YUJIA_NAME = "瑜伽健身";

    public static final String PRECIOUS_CLASS_KOUYUZHIDAO_ID = "80";
    public static final String PRECIOUS_CLASS_KOUYUZHIDAO_CODE = "050500";
    public static final String PRECIOUS_CLASS_KOUYUZHIDAO_NAME = "口语指导";

    public static final String PRECIOUS_CLASS_XINLIZIXUN_ID = "78";
    public static final String PRECIOUS_CLASS_XINLIZIXUN_CODE = "050500";
    public static final String PRECIOUS_CLASS_XINLIZIXUN_NAME = "心理咨询";

    public static final String PRECIOUS_CLASS_CAMER_ID = "33";
    public static final String PRECIOUS_CLASS_CAMER_CODE = "080600";
    public static final String PRECIOUS_CLASS_CAMER_NAME = "看电影";

    public static final String PRECIOUS_CLASS_JIUBA_ID = "29";
    public static final String PRECIOUS_CLASS_JIUBA_CODE = "080200";
    public static final String PRECIOUS_CLASS_JIUBA_NAME = "高尔夫";

    public static final String PRECIOUS_CLASS_YOUYONG_ID = "30";
    public static final String PRECIOUS_CLASS_YOUYONG_CODE = "080110";
    public static final String PRECIOUS_CLASS_YOUYONG_NAME = "游泳";

    public static final String PRECIOUS_CLASS_PINCHA_ID = "82";
    public static final String PRECIOUS_CLASS_PINCHA_CODE = "050600";
    public static final String PRECIOUS_CLASS_PINCHA_NAME = "品茶";


    /**
     * 三个约会的名字
     */
    public static final String DATE_PRECIOUS_NAME = "淘达人";
    public static final String DATE_PRECIOUS_TWO_NAME = "付费";
    public static final String DATE_SINCERE_NAME = "友趣";
    public static final String DATE_ONETOUCH_NAME = "秒单";
    public static final String DATE_ALONE_NAME = "单独邀约";

    /**
     * 消息中固定id
     */
    public static final String IM_MEET_NEWS = "sys_meet";//邀约消息
    public static final String IM_APP_NEWS = "sys_app";//系统消息
    public static final String IM_SAYHELLO_NEWS = "sys_hi";//打招呼
    public static final String IM_CUSTOM = "custom";//系统消息 不显示的信息


    //    spUtils
    public static final String ASSUMABLY_ADDRESS = "assumably_address";//大概地点
    public static final String SEARCH_HISTORY = "search_history";//搜索记录
    public static final String ALONE_SEX = "alone_sex";//单独邀约的性别
    public static final String CITYTREE = "city_tree";//缓存城市
    public static final String SPLASH_AD = "splash_ad";//缓存广告
    public static final String VIDEO_MIN_TIME = "video_min_time";//视频录制最小值
    public static final String VIDEO_MAX_TIME = "video_max_time";//视频录制最大值
    /**
     * 如何成为vip
     */
    public static final String WEBVIEW_VIP = BASE_IMG_URL + "html/VIP.html";
    /**
     * 账号惩罚及申诉
     */
    public static final String WEBVIEW_APPEAL = BASE_IMG_URL + "html/Appeal.html";

    /**
     * 如何购买金币
     */
    public static final String WEBVIEW_BUY_GOLD = BASE_IMG_URL + "html/Gold.html";
    /**
     * 如何修改个人资料
     */
    public static final String WEBVIEW_EDIT = BASE_IMG_URL + "html/personal-data.html";
    /**
     * 如何保证安全
     */
    public static final String WEBVIEW_SAFE = BASE_IMG_URL + "html/security.html";
    /**
     * 如何申请提现
     */
    public static final String WEBVIEW_WITHDRAWAL = BASE_IMG_URL + "html/Withdrawals.html";
    /**
     * 用户协议
     */
    public static final String WEBVIEW_USER_AGREEMENT = BASE_IMG_URL + "html/index.html";

    /**
     * 关于取消订单的处理方案
     */
    public static final String WEBVIEW_USER_CANCLE = BASE_IMG_URL + "html/cancel.html";

    /**
     * 签到和补签分享
     */
    public static final String SIGN_SHARE = BASE_SHARE_URL + "sign/sign.html";
    /**
     * 获得免费补签卡
     */
    public static final String GET_RETROATIVE_SHARE = BASE_SHARE_URL + "sign/retroactive.html";
    /**
     * 赚钱
     */
    public static final String MAKE_MONEY_URL = BASE_IMG_URL + "/html/make-money/index.html";
    /**
     * 优惠券使用说明
     */
    public static final String COUPON_USE_EXPLAIN_URL = BASE_IMG_URL + "html/Coupon/index.html";

    /**
     * 账户说明
     */
    public static final String ACCOUNT_INFO_URL = BASE_IMG_URL + "html/Account-desc/index.html";

    /**
     * 注册--1.手机  2.三方
     * 这里是区分完善信息时，是手机还是三方
     */
    public static int REGISTER_WITH_PHONE = 1;
    public static int REGISTER_WITH_THREE = 2;

    /**
     * 验证手机号是否存在
     * type 类型:1-注册,4-登录
     */
    public static String TYPE_FOR_REGISTER = "1";
    public static String TYPE_FOR_LOGIN = "4";
}
