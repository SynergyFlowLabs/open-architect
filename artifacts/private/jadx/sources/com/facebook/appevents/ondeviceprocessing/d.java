package com.facebook.appevents.ondeviceprocessing;

import android.os.Bundle;
import androidx.core.app.w;
import com.facebook.internal.b0;
import com.facebook.internal.e1;
import com.facebook.internal.x;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f99164a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f99165b = e.class.getSimpleName();

    private d() {
    }

    @n
    @Nullable
    public static final Bundle a(@NotNull e.a eventType, @NotNull String applicationId, @NotNull List<com.facebook.appevents.e> appEvents) {
        if (com.facebook.internal.instrument.crashshield.b.e(d.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString(w.I0, eventType.toString());
            bundle.putString("app_id", applicationId);
            if (e.a.CUSTOM_APP_EVENTS != eventType) {
                return bundle;
            }
            JSONArray jSONArrayB = f99164a.b(appEvents, applicationId);
            if (jSONArrayB.length() == 0) {
                return null;
            }
            bundle.putString("custom_events", jSONArrayB.toString());
            return bundle;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, d.class);
            return null;
        }
    }

    private final JSONArray b(List<com.facebook.appevents.e> list, String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            List<com.facebook.appevents.e> mutableList = CollectionsKt.toMutableList((Collection) list);
            g5.a aVar = g5.a.f275403a;
            g5.a.d(mutableList);
            boolean zC = c(str);
            for (com.facebook.appevents.e eVar : mutableList) {
                if (!eVar.g()) {
                    e1 e1Var = e1.f99794a;
                    e1.g0(f99165b, Intrinsics.stringPlus("Event with invalid checksum: ", eVar));
                } else if (!eVar.h() || (eVar.h() && zC)) {
                    jSONArray.put(eVar.f());
                }
            }
            return jSONArray;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    private final boolean c(String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return false;
        }
        try {
            b0 b0Var = b0.f99725a;
            x xVarN = b0.n(str, false);
            if (xVarN != null) {
                return xVarN.t();
            }
            return false;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return false;
        }
    }
}
