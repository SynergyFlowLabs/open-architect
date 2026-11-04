package com.facebook.appevents.codeless;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.b1;
import com.facebook.GraphRequest;
import com.facebook.appevents.p;
import com.facebook.g0;
import com.facebook.internal.b0;
import com.facebook.internal.e1;
import com.facebook.internal.x;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private static SensorManager f98784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private static l f98785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private static String f98786e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile boolean f98789h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f98782a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final m f98783b = new m();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f98787f = new AtomicBoolean(true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f98788g = new AtomicBoolean(false);

    private e() {
    }

    private final void c(final String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            if (f98789h) {
                return;
            }
            f98789h = true;
            g0 g0Var = g0.f99617a;
            g0.y().execute(new Runnable() { // from class: com.facebook.appevents.codeless.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.d(str);
                }
            });
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str) {
        String str2 = p.f99189d0;
        if (com.facebook.internal.instrument.crashshield.b.e(e.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            g0 g0Var = g0.f99617a;
            com.facebook.internal.c cVarF = com.facebook.internal.c.f99760f.f(g0.n());
            JSONArray jSONArray = new JSONArray();
            String str3 = Build.MODEL;
            if (str3 == null) {
                str3 = "";
            }
            jSONArray.put(str3);
            if ((cVarF == null ? null : cVarF.h()) != null) {
                jSONArray.put(cVarF.h());
            } else {
                jSONArray.put("");
            }
            jSONArray.put(p.f99189d0);
            com.facebook.appevents.internal.g gVar = com.facebook.appevents.internal.g.f99011a;
            if (com.facebook.appevents.internal.g.f()) {
                str2 = "1";
            }
            jSONArray.put(str2);
            e1 e1Var = e1.f99794a;
            Locale localeY = e1.y();
            jSONArray.put(localeY.getLanguage() + '_' + ((Object) localeY.getCountry()));
            String string = jSONArray.toString();
            Intrinsics.checkNotNullExpressionValue(string, "extInfoArray.toString()");
            bundle.putString(f5.a.f274948j, g());
            bundle.putString(f5.a.f274949k, string);
            GraphRequest.c cVar = GraphRequest.f98518n;
            q1 q1Var = q1.f312784a;
            boolean z10 = true;
            String str4 = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "java.lang.String.format(locale, format, *args)");
            JSONObject jSONObjectI = cVar.O(null, str4, bundle, null).l().i();
            AtomicBoolean atomicBoolean = f98788g;
            if (jSONObjectI == null || !jSONObjectI.optBoolean(f5.a.f274947i, false)) {
                z10 = false;
            }
            atomicBoolean.set(z10);
            if (atomicBoolean.get()) {
                l lVar = f98785d;
                if (lVar != null) {
                    lVar.j();
                }
            } else {
                f98786e = null;
            }
            f98789h = false;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, e.class);
        }
    }

    @n
    public static final void e() {
        if (com.facebook.internal.instrument.crashshield.b.e(e.class)) {
            return;
        }
        try {
            f98787f.set(false);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, e.class);
        }
    }

    @n
    public static final void f() {
        if (com.facebook.internal.instrument.crashshield.b.e(e.class)) {
            return;
        }
        try {
            f98787f.set(true);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, e.class);
        }
    }

    @n
    @NotNull
    public static final String g() {
        if (com.facebook.internal.instrument.crashshield.b.e(e.class)) {
            return null;
        }
        try {
            if (f98786e == null) {
                f98786e = UUID.randomUUID().toString();
            }
            String str = f98786e;
            if (str != null) {
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, e.class);
            return null;
        }
    }

    @n
    public static final boolean h() {
        if (com.facebook.internal.instrument.crashshield.b.e(e.class)) {
            return false;
        }
        try {
            return f98788g.get();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, e.class);
            return false;
        }
    }

    private final boolean i() {
        com.facebook.internal.instrument.crashshield.b.e(this);
        return false;
    }

    @n
    public static final void j(@NotNull Activity activity) {
        if (com.facebook.internal.instrument.crashshield.b.e(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            g.f98791f.a().f(activity);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, e.class);
        }
    }

    @n
    public static final void k(@NotNull Activity activity) {
        if (com.facebook.internal.instrument.crashshield.b.e(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (f98787f.get()) {
                g.f98791f.a().j(activity);
                l lVar = f98785d;
                if (lVar != null) {
                    lVar.o();
                }
                SensorManager sensorManager = f98784c;
                if (sensorManager == null) {
                    return;
                }
                sensorManager.unregisterListener(f98783b);
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, e.class);
        }
    }

    @n
    public static final void l(@NotNull Activity activity) {
        e eVar;
        if (!com.facebook.internal.instrument.crashshield.b.e(e.class)) {
            try {
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (f98787f.get()) {
                    g.f98791f.a().e(activity);
                    Context applicationContext = activity.getApplicationContext();
                    g0 g0Var = g0.f99617a;
                    final String strO = g0.o();
                    b0 b0Var = b0.f99725a;
                    final x xVarF = b0.f(strO);
                    if (Intrinsics.areEqual(xVarF == null ? null : Boolean.valueOf(xVarF.b()), Boolean.TRUE) || f98782a.i()) {
                        SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                        if (sensorManager != null) {
                            f98784c = sensorManager;
                            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                            l lVar = new l(activity);
                            f98785d = lVar;
                            m mVar = f98783b;
                            mVar.a(new m.b() { // from class: com.facebook.appevents.codeless.c
                                @Override // com.facebook.appevents.codeless.m.b
                                public final void a() {
                                    e.m(xVarF, strO);
                                }
                            });
                            sensorManager.registerListener(mVar, defaultSensor, 2);
                            if (xVarF != null && xVarF.b()) {
                                lVar.j();
                            }
                            eVar = f98782a;
                            if (eVar.i() && !f98788g.get()) {
                                eVar.c(strO);
                            }
                        }
                    } else {
                        eVar = f98782a;
                        if (eVar.i()) {
                            eVar.c(strO);
                        }
                    }
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, e.class);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(x xVar, String appId) {
        if (com.facebook.internal.instrument.crashshield.b.e(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(appId, "$appId");
            boolean z10 = xVar != null && xVar.b();
            g0 g0Var = g0.f99617a;
            boolean zX = g0.x();
            if (z10 && zX) {
                f98782a.c(appId);
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, e.class);
        }
    }

    @n
    public static final void n(boolean z10) {
        if (com.facebook.internal.instrument.crashshield.b.e(e.class)) {
            return;
        }
        try {
            f98788g.set(z10);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, e.class);
        }
    }
}
