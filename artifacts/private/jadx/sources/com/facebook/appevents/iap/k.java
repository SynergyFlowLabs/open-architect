package com.facebook.appevents.iap;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.annotation.b1;
import com.facebook.g0;
import com.facebook.internal.t;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f98972b = "com.google.android.play.billingclient.version";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k f98971a = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f98973c = new AtomicBoolean(false);

    private k() {
    }

    @n
    public static final void a() {
        if (com.facebook.internal.instrument.crashshield.b.e(k.class)) {
            return;
        }
        try {
            f98973c.set(true);
            b();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, k.class);
        }
    }

    @n
    public static final void b() {
        if (com.facebook.internal.instrument.crashshield.b.e(k.class)) {
            return;
        }
        try {
            if (f98973c.get()) {
                if (f98971a.c()) {
                    t tVar = t.f100072a;
                    if (t.g(t.b.IapLoggingLib2)) {
                        f fVar = f.f98900a;
                        g0 g0Var = g0.f99617a;
                        f.d(g0.n());
                        return;
                    }
                }
                a aVar = a.f98889a;
                a.g();
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, k.class);
        }
    }

    private final boolean c() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return false;
        }
        try {
            g0 g0Var = g0.f99617a;
            Context contextN = g0.n();
            ApplicationInfo applicationInfo = contextN.getPackageManager().getApplicationInfo(contextN.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)");
            String string = applicationInfo.metaData.getString(f98972b);
            return string != null && Integer.parseInt((String) StringsKt.split$default(string, new String[]{"."}, false, 3, 2, null).get(0)) >= 2;
        } catch (Exception unused) {
            return false;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return false;
        }
    }
}
