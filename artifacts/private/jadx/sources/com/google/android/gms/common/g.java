package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.gms.common.internal.a0
@g6.a
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @g6.a
    public static final String f106411b = "com.google.android.gms";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    @g6.a
    public static final String f106412c = "com.android.vending";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @g6.a
    static final String f106413d = "d";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @g6.a
    static final String f106414e = "n";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @g6.a
    public static final int f106410a = k.f106704a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final g f106415f = new g();

    @g6.a
    g() {
    }

    @NonNull
    @com.google.android.gms.common.internal.a0
    @g6.a
    public static g i() {
        return f106415f;
    }

    @g6.a
    public void a(@NonNull Context context) {
        k.a(context);
    }

    @com.google.android.gms.common.internal.a0
    @g6.a
    public int b(@NonNull Context context) {
        return k.d(context);
    }

    @com.google.android.gms.common.internal.a0
    @g6.a
    public int c(@NonNull Context context) {
        return k.e(context);
    }

    @g6.a
    @Deprecated
    @androidx.annotation.p0
    @com.google.android.gms.common.internal.a0
    public Intent d(int i10) {
        return e(null, i10, null);
    }

    @androidx.annotation.p0
    @com.google.android.gms.common.internal.a0
    @g6.a
    public Intent e(@androidx.annotation.p0 Context context, int i10, @androidx.annotation.p0 String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts(io.sentry.protocol.z.b.f306542i, "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && com.google.android.gms.common.util.l.n(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("gcore_");
        sb2.append(f106410a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                sb2.append(com.google.android.gms.common.wrappers.d.a(context).f(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb2.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    @androidx.annotation.p0
    @g6.a
    public PendingIntent f(@NonNull Context context, int i10, int i11) {
        return g(context, i10, i11, null);
    }

    @androidx.annotation.p0
    @com.google.android.gms.common.internal.a0
    @g6.a
    public PendingIntent g(@NonNull Context context, int i10, int i11, @androidx.annotation.p0 String str) {
        Intent intentE = e(context, i10, str);
        if (intentE == null) {
            return null;
        }
        return androidx.core.app.h0.e(context, i11, intentE, androidx.media3.common.j.W0, false);
    }

    @NonNull
    @g6.a
    public String h(int i10) {
        return k.g(i10);
    }

    @com.google.android.gms.common.internal.n
    @g6.a
    public int j(@NonNull Context context) {
        return k(context, f106410a);
    }

    @g6.a
    public int k(@NonNull Context context, int i10) {
        int iM = k.m(context, i10);
        if (k.o(context, iM)) {
            return 18;
        }
        return iM;
    }

    @com.google.android.gms.common.internal.a0
    @g6.a
    public boolean l(@NonNull Context context, int i10) {
        return k.o(context, i10);
    }

    @com.google.android.gms.common.internal.a0
    @g6.a
    public boolean m(@NonNull Context context, int i10) {
        return k.p(context, i10);
    }

    @g6.a
    public boolean n(@NonNull Context context, @NonNull String str) {
        return k.u(context, str);
    }

    @g6.a
    public boolean o(int i10) {
        return k.s(i10);
    }

    @g6.a
    public void p(@NonNull Context context, int i10) throws i, h {
        k.c(context, i10);
    }
}
