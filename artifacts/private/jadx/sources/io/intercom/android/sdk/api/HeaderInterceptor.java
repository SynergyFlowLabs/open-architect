package io.intercom.android.sdk.api;

import android.content.Context;
import android.util.Base64;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.utilities.commons.DeviceUtils;
import java.io.IOException;
import java.util.Random;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.w;

/* JADX INFO: loaded from: classes13.dex */
class HeaderInterceptor implements w {
    private static final String ACCEPT_LANGUAGE = "Accept-Language";
    private static final String AUTHORIZATION = "Authorization";
    private static final String CONTENT_TYPE_KEY = "Content-Type";
    private static final String CONTENT_TYPE_VALUE = "application/json";
    private static final String HOST_APP_VERSION_KEY = "X-INTERCOM-HOST-APP-VERSION";
    private static final String IDEMPOTENCY_KEY = "Idempotency-Key";
    private static final String INTERCOM_AGENT = "X-INTERCOM-AGENT";
    private static final String INTERCOM_AGENT_WRAPPER = "X-INTERCOM-AGENT-WRAPPER";
    private static final String SUPPORTED_LANGUAGES_KEY = "X-INTERCOM-SUPPORTED-LANGUAGES";
    private static final String SUPPORTED_LANGUAGE_LIST = "ar,bg,bn,bs,ca,cs,da,de,de-form,el,es,et,fa-IR,fi,fr,hi,he,hr,hu,id,it,ja,ko,lt,lv,mn,ms,nb,nl,pl,pt-PT,pt-BR,ro,ru,sl,sr,sv,sw,th,tr,uk,vi,zh-Hant,zh-Hans";
    private final AppIdentity appIdentity;
    private final String appVersion;
    private final String cordovaVersion;
    private final String flutterVersion;
    private final Random random;
    private final String reactNativeVersion;
    private final String userLocale;
    private final String versionName;

    HeaderInterceptor(String str, String str2, String str3, String str4, AppIdentity appIdentity, String str5, String str6, Random random) {
        this.cordovaVersion = str;
        this.reactNativeVersion = str2;
        this.flutterVersion = str3;
        this.versionName = str4;
        this.appIdentity = appIdentity;
        this.userLocale = str5;
        this.appVersion = str6;
        this.random = random;
    }

    public static HeaderInterceptor create(Context context, AppIdentity appIdentity) {
        return new HeaderInterceptor(context.getSharedPreferences(PlatformIdentifierUtilKt.WRAPPER_PREFS, 0).getString(PlatformIdentifierUtilKt.CORDOVA_VERSION, ""), context.getSharedPreferences(PlatformIdentifierUtilKt.WRAPPER_PREFS, 0).getString(PlatformIdentifierUtilKt.REACT_NATIVE_VERSION, ""), "", "17.2.0", appIdentity, UserLocaleUtilKt.getUserLocaleString(context), DeviceUtils.getAppVersion(context), new Random());
    }

    private String getBasicAuth() {
        return "Basic " + Base64.encodeToString((this.appIdentity.appId() + ":" + this.appIdentity.apiKey()).getBytes(), 2);
    }

    public static void setCordovaVersion(Context context, String str) {
        context.getSharedPreferences(PlatformIdentifierUtilKt.WRAPPER_PREFS, 0).edit().putString(PlatformIdentifierUtilKt.CORDOVA_VERSION, str).apply();
    }

    public static void setReactNativeVersion(Context context, String str) {
        context.getSharedPreferences(PlatformIdentifierUtilKt.WRAPPER_PREFS, 0).edit().putString(PlatformIdentifierUtilKt.REACT_NATIVE_VERSION, str).apply();
    }

    @Override // okhttp3.w
    public f0 intercept(w.a aVar) throws IOException {
        d0 d0VarRequest = aVar.request();
        d0.a aVarN = d0VarRequest.n().n("Authorization", getBasicAuth()).n(IDEMPOTENCY_KEY, Long.toHexString(this.random.nextLong())).n(INTERCOM_AGENT, "intercom-android-sdk/" + this.versionName).n("Accept-Language", this.userLocale).n(SUPPORTED_LANGUAGES_KEY, SUPPORTED_LANGUAGE_LIST).n(HOST_APP_VERSION_KEY, this.appVersion);
        if (d0VarRequest.f() == null || !d0VarRequest.f().contentType().toString().startsWith("multipart/")) {
            aVarN.n("Content-Type", "application/json");
        }
        if (!this.cordovaVersion.isEmpty()) {
            aVarN.n(INTERCOM_AGENT_WRAPPER, "intercom-sdk-cordova/" + this.cordovaVersion);
        }
        if (!this.reactNativeVersion.isEmpty()) {
            aVarN.n(INTERCOM_AGENT_WRAPPER, "intercom-sdk-react-native/" + this.reactNativeVersion);
        }
        if (!this.flutterVersion.isEmpty()) {
            aVarN.n(INTERCOM_AGENT_WRAPPER, "intercom-sdk-flutter/" + this.flutterVersion);
        }
        return aVar.c(aVarN.b());
    }
}
