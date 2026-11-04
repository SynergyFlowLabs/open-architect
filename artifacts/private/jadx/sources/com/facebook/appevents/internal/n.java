package com.facebook.appevents.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.appevents.f0;
import com.facebook.appevents.q;
import com.facebook.g0;
import com.facebook.internal.t0;
import com.planner5d.library.services.utility.i0;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f99075b = "PCKGCHKSUM";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n f99074a = new n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f99076c = n.class.getCanonicalName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final long[] f99077d = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, i0.f225269f, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    private n() {
    }

    private final String a(Context context) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String strStringPlus = Intrinsics.stringPlus("PCKGCHKSUM;", packageManager.getPackageInfo(context.getPackageName(), 0).versionName);
            SharedPreferences sharedPreferences = context.getSharedPreferences(g0.f99639w, 0);
            String string = sharedPreferences.getString(strStringPlus, null);
            if (string != null && string.length() == 32) {
                return string;
            }
            l lVar = l.f99054a;
            String strC = l.c(context, null);
            if (strC == null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "pm.getApplicationInfo(context.packageName, 0)");
                strC = l.b(applicationInfo.sourceDir);
            }
            sharedPreferences.edit().putString(strStringPlus, strC).apply();
            return strC;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    @oj.n
    public static final int b(long j10) {
        if (com.facebook.internal.instrument.crashshield.b.e(n.class)) {
            return 0;
        }
        int i10 = 0;
        while (true) {
            try {
                long[] jArr = f99077d;
                if (i10 >= jArr.length || jArr[i10] >= j10) {
                    break;
                }
                i10++;
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, n.class);
                return 0;
            }
        }
        return i10;
    }

    @oj.n
    public static final void c(@NotNull String activityName, @Nullable o oVar, @Nullable String str, @NotNull Context context) {
        String string;
        if (!com.facebook.internal.instrument.crashshield.b.e(n.class)) {
            try {
                Intrinsics.checkNotNullParameter(activityName, "activityName");
                Intrinsics.checkNotNullParameter(context, "context");
                String str2 = "Unclassified";
                if (oVar != null && (string = oVar.toString()) != null) {
                    str2 = string;
                }
                Bundle bundle = new Bundle();
                bundle.putString(com.facebook.appevents.p.Z, str2);
                bundle.putString(com.facebook.appevents.p.f99183a0, f99074a.a(context));
                u5.a aVar = u5.a.f381181a;
                bundle.putString(com.facebook.appevents.p.f99185b0, u5.a.a(context));
                f0.a aVar2 = f0.f98865b;
                f0 f0VarC = aVar2.c(activityName, str, null);
                f0VarC.j(com.facebook.appevents.p.f99184b, bundle);
                if (aVar2.f() != q.b.EXPLICIT_ONLY) {
                    f0VarC.d();
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, n.class);
            }
        }
    }

    private final void d() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            t0.a aVar = t0.f100109e;
            com.facebook.t0 t0Var = com.facebook.t0.APP_EVENTS;
            String str = f99076c;
            Intrinsics.checkNotNull(str);
            aVar.d(t0Var, str, "Clock skew detected");
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @oj.n
    public static final void e(@NotNull String activityName, @Nullable m mVar, @Nullable String str) {
        long jLongValue;
        String string;
        if (com.facebook.internal.instrument.crashshield.b.e(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            if (mVar == null) {
                return;
            }
            Long lC = mVar.c();
            long jLongValue2 = 0;
            if (lC == null) {
                Long lF = mVar.f();
                jLongValue = 0 - (lF == null ? 0L : lF.longValue());
            } else {
                jLongValue = lC.longValue();
            }
            if (jLongValue < 0) {
                f99074a.d();
                jLongValue = 0;
            }
            long jG = mVar.g();
            if (jG < 0) {
                f99074a.d();
                jG = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(com.facebook.appevents.p.f99188d, mVar.d());
            q1 q1Var = q1.f312784a;
            String str2 = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(b(jLongValue))}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(locale, format, *args)");
            bundle.putString(com.facebook.appevents.p.f99190e, str2);
            o oVarI = mVar.i();
            String str3 = "Unclassified";
            if (oVarI != null && (string = oVarI.toString()) != null) {
                str3 = string;
            }
            bundle.putString(com.facebook.appevents.p.Z, str3);
            Long lF2 = mVar.f();
            if (lF2 != null) {
                jLongValue2 = lF2.longValue();
            }
            bundle.putLong(j.f99026b, jLongValue2 / ((long) 1000));
            f0.f98865b.c(activityName, str, null).i(com.facebook.appevents.p.f99186c, jG / 1000, bundle);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, n.class);
        }
    }
}
