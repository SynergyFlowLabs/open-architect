package com.facebook.appevents.cloudbridge;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public enum l {
    ANON_ID("anon_id"),
    FB_LOGIN_ID("fb_login_id"),
    MAD_ID("madid"),
    PAGE_ID("page_id"),
    PAGE_SCOPED_USER_ID("page_scoped_user_id"),
    USER_DATA("ud"),
    ADV_TE("advertiser_tracking_enabled"),
    APP_TE("application_tracking_enabled"),
    CONSIDER_VIEWS("consider_views"),
    DEVICE_TOKEN("device_token"),
    EXT_INFO("extInfo"),
    INCLUDE_DWELL_DATA("include_dwell_data"),
    INCLUDE_VIDEO_DATA("include_video_data"),
    INSTALL_REFERRER("install_referrer"),
    INSTALLER_PACKAGE("installer_package"),
    RECEIPT_DATA("receipt_data"),
    URL_SCHEMES("url_schemes");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f98733a;

    l(String str) {
        this.f98733a = str;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static l[] valuesCustom() {
        l[] lVarArrValuesCustom = values();
        return (l[]) Arrays.copyOf(lVarArrValuesCustom, lVarArrValuesCustom.length);
    }

    @NotNull
    public final String l() {
        return this.f98733a;
    }
}
