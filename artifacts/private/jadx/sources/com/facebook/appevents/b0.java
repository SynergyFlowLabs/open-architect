package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import com.facebook.internal.t0;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f98593c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f98594d = b0.class.getSimpleName();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f98595e = "_fb_pixel_referral_id";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Context f98596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f98597b = "fbmq-0.1";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle c(String str) {
            try {
                return d(new JSONObject(str));
            } catch (JSONException unused) {
                return new Bundle();
            }
        }

        private final Bundle d(JSONObject jSONObject) throws JSONException {
            Bundle bundle = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "jsonObject.keys()");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                String str = next;
                bundle.putString(str, jSONObject.getString(str));
            }
            return bundle;
        }

        public final String b() {
            return b0.a();
        }

        private a() {
        }
    }

    public b0(@Nullable Context context) {
        this.f98596a = context;
    }

    public static final /* synthetic */ String a() {
        if (com.facebook.internal.instrument.crashshield.b.e(b0.class)) {
            return null;
        }
        try {
            return f98594d;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, b0.class);
            return null;
        }
    }

    @JavascriptInterface
    @NotNull
    public final String getProtocol() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            return this.f98597b;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    @JavascriptInterface
    public final void sendEvent(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            if (str != null) {
                f0 f0VarD = f0.a.d(f0.f98865b, this.f98596a, null, 2, null);
                Bundle bundleC = f98593c.c(str3);
                bundleC.putString(f98595e, str);
                f0VarD.j(str2, bundleC);
                return;
            }
            t0.a aVar = t0.f100109e;
            com.facebook.t0 t0Var = com.facebook.t0.DEVELOPER_ERRORS;
            String TAG = f98594d;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            aVar.d(t0Var, TAG, "Can't bridge an event without a referral Pixel ID. Check your webview Pixel configuration");
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }
}
