package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.model.f0;
import com.google.firebase.remoteconfig.e0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@k8.a
@u7.d
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f121313a = 256;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.firebase.encoders.a f121314b = new com.google.firebase.encoders.json.e().k(a.f121258b).j();

    static j a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        return b(jSONObject.getString(com.google.firebase.remoteconfig.internal.h.f124535o), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong(e0.c.D2));
    }

    public static j b(String str, String str2, String str3, String str4, long j10) {
        return new b(str, str2, i(str3), str4, j10);
    }

    private static String i(String str) {
        if (str.length() > 256) {
            str = str.substring(0, 256);
        }
        return str;
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract long f();

    public abstract String g();

    public f0.f.d.e h() {
        return f0.f.d.e.a().d(f0.f.d.e.b.a().c(g()).b(e()).a()).b(c()).c(d()).e(f()).a();
    }
}
