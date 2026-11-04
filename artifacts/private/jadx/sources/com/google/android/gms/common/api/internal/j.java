package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
@Deprecated
public final class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f106096e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private static j f106097f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f106098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Status f106099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f106100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f106101d;

    @androidx.annotation.l1
    @g6.a
    j(String str, boolean z10) {
        this.f106098a = str;
        this.f106099b = Status.f105886f;
        this.f106100c = z10;
        this.f106101d = !z10;
    }

    @g6.a
    private static j b(String str) {
        j jVar;
        synchronized (f106096e) {
            try {
                jVar = f106097f;
                if (jVar == null) {
                    throw new IllegalStateException("Initialize must be called before " + str + ".");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }

    @androidx.annotation.l1
    @g6.a
    static void c() {
        synchronized (f106096e) {
            f106097f = null;
        }
    }

    @androidx.annotation.p0
    @g6.a
    public static String d() {
        return b("getGoogleAppId").f106098a;
    }

    @NonNull
    @g6.a
    public static Status e(@NonNull Context context) {
        Status status;
        com.google.android.gms.common.internal.w.s(context, "Context must not be null.");
        synchronized (f106096e) {
            try {
                if (f106097f == null) {
                    f106097f = new j(context);
                }
                status = f106097f.f106099b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return status;
    }

    @NonNull
    @g6.a
    public static Status f(@NonNull Context context, @NonNull String str, boolean z10) {
        com.google.android.gms.common.internal.w.s(context, "Context must not be null.");
        com.google.android.gms.common.internal.w.m(str, "App ID must be nonempty.");
        synchronized (f106096e) {
            try {
                j jVar = f106097f;
                if (jVar != null) {
                    return jVar.a(str);
                }
                j jVar2 = new j(str, z10);
                f106097f = jVar2;
                return jVar2.f106099b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @g6.a
    public static boolean g() {
        j jVarB = b("isMeasurementEnabled");
        return jVarB.f106099b.q2() && jVarB.f106100c;
    }

    @g6.a
    public static boolean h() {
        return b("isMeasurementExplicitlyDisabled").f106101d;
    }

    @androidx.annotation.l1
    @g6.a
    Status a(String str) {
        String str2 = this.f106098a;
        if (str2 == null || str2.equals(str)) {
            return Status.f105886f;
        }
        return new Status(10, "Initialize was called with two different Google App IDs.  Only the first app ID will be used: '" + this.f106098a + "'.");
    }

    @androidx.annotation.l1
    @g6.a
    j(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(com.google.android.gms.common.r.b.f106810a));
        boolean z10 = true;
        if (identifier != 0) {
            int integer = resources.getInteger(identifier);
            boolean z11 = integer == 0;
            z10 = integer != 0;
            this.f106101d = z11;
        } else {
            this.f106101d = false;
        }
        this.f106100c = z10;
        String strB = com.google.android.gms.common.internal.n1.b(context);
        strB = strB == null ? new com.google.android.gms.common.internal.b0(context).a("google_app_id") : strB;
        if (TextUtils.isEmpty(strB)) {
            this.f106099b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f106098a = null;
        } else {
            this.f106098a = strB;
            this.f106099b = Status.f105886f;
        }
    }
}
