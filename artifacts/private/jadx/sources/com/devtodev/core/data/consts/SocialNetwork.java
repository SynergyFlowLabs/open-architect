package com.devtodev.core.data.consts;

import com.devtodev.core.data.metrics.MetricConsts;

/* JADX INFO: loaded from: classes3.dex */
public class SocialNetwork {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f98082a;
    public static final SocialNetwork Vk = new SocialNetwork("vk");
    public static final SocialNetwork Twitter = new SocialNetwork("tw");
    public static final SocialNetwork Facebook = new SocialNetwork(MetricConsts.FacebookInfo);
    public static final SocialNetwork GooglePlus = new SocialNetwork("gp");
    public static final SocialNetwork WhatsApp = new SocialNetwork("wp");
    public static final SocialNetwork Viber = new SocialNetwork("vb");
    public static final SocialNetwork Evernote = new SocialNetwork("en");
    public static final SocialNetwork GoogleMail = new SocialNetwork("gm");
    public static final SocialNetwork LinkedIn = new SocialNetwork("in");
    public static final SocialNetwork Pinterest = new SocialNetwork("pi");
    public static final SocialNetwork Qzone = new SocialNetwork("qq");
    public static final SocialNetwork Reddit = new SocialNetwork("rt");
    public static final SocialNetwork Renren = new SocialNetwork("rr");
    public static final SocialNetwork Tumblr = new SocialNetwork("tb");

    private SocialNetwork(String str) {
        if (str != null) {
            this.f98082a = str;
        } else {
            this.f98082a = "";
        }
    }

    public static SocialNetwork Custom(String str) {
        return new SocialNetwork(str);
    }

    public String getNetworkName() {
        return this.f98082a;
    }
}
