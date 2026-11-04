package com.google.firebase.remoteconfig.interop.rollouts;

import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@k8.a
@u7.d
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f124733a = "rolloutId";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f124734b = "variantId";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f124735c = "parameterKey";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f124736d = "parameterValue";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f124737e = "templateVersion";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.google.firebase.encoders.a f124738f = new com.google.firebase.encoders.json.e().k(com.google.firebase.remoteconfig.interop.rollouts.a.f124714b).j();

    @u7.d.a
    public static abstract class a {
        @NonNull
        public abstract d a();

        @NonNull
        public abstract a b(@NonNull String str);

        @NonNull
        public abstract a c(@NonNull String str);

        @NonNull
        public abstract a d(@NonNull String str);

        @NonNull
        public abstract a e(long j10);

        @NonNull
        public abstract a f(@NonNull String str);
    }

    @NonNull
    public static a a() {
        return new b.C1185b();
    }

    @NonNull
    public static d b(@NonNull String str) throws JSONException {
        return c(new JSONObject(str));
    }

    @NonNull
    public static d c(@NonNull JSONObject jSONObject) throws JSONException {
        return a().d(jSONObject.getString("rolloutId")).f(jSONObject.getString("variantId")).b(jSONObject.getString(f124735c)).c(jSONObject.getString(f124736d)).e(jSONObject.getLong("templateVersion")).a();
    }

    @NonNull
    public abstract String d();

    @NonNull
    public abstract String e();

    @NonNull
    public abstract String f();

    public abstract long g();

    @NonNull
    public abstract String h();
}
