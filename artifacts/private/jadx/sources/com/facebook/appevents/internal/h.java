package com.facebook.appevents.internal;

import android.content.Context;
import androidx.core.app.w;
import com.facebook.appevents.q;
import com.facebook.internal.e1;
import com.facebook.internal.t0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f99013a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Map<a, String> f99014b = MapsKt.hashMapOf(TuplesKt.to(a.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), TuplesKt.to(a.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    public enum a {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            return (a[]) Arrays.copyOf(aVarArrValuesCustom, aVarArrValuesCustom.length);
        }
    }

    private h() {
    }

    @oj.n
    @NotNull
    public static final JSONObject a(@NotNull a activityType, @Nullable com.facebook.internal.c cVar, @Nullable String str, boolean z10, @NotNull Context context) throws JSONException {
        Intrinsics.checkNotNullParameter(activityType, "activityType");
        Intrinsics.checkNotNullParameter(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(w.I0, f99014b.get(activityType));
        String strI = q.f99234b.i();
        if (strI != null) {
            jSONObject.put("app_user_id", strI);
        }
        e1 e1Var = e1.f99794a;
        e1.C0(jSONObject, cVar, str, z10, context);
        try {
            e1.D0(jSONObject, context);
        } catch (Exception e10) {
            t0.f100109e.e(com.facebook.t0.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e10.toString());
        }
        e1 e1Var2 = e1.f99794a;
        JSONObject jSONObjectA = e1.A();
        if (jSONObjectA != null) {
            Iterator<String> itKeys = jSONObjectA.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObjectA.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
