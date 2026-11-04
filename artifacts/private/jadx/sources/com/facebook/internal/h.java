package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f99880a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String[] f99881b = {net.openid.appauth.browser.g.a.f332842a, "com.chrome.beta", "com.chrome.dev"};

    private h() {
    }

    @oj.n
    @Nullable
    public static final String a() {
        if (com.facebook.internal.instrument.crashshield.b.e(h.class)) {
            return null;
        }
        try {
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            Context contextN = com.facebook.g0.n();
            List<ResolveInfo> listQueryIntentServices = contextN.getPackageManager().queryIntentServices(new Intent(androidx.browser.customtabs.f.f11910c), 0);
            Intrinsics.checkNotNullExpressionValue(listQueryIntentServices, "context.packageManager.queryIntentServices(serviceIntent, 0)");
            HashSet hashSet = ArraysKt.toHashSet(f99881b);
            Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                    return serviceInfo.packageName;
                }
            }
            return null;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, h.class);
            return null;
        }
    }

    @oj.n
    @NotNull
    public static final String b() {
        if (com.facebook.internal.instrument.crashshield.b.e(h.class)) {
            return null;
        }
        try {
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            return Intrinsics.stringPlus(f1.f99843g, com.facebook.g0.n().getPackageName());
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, h.class);
            return null;
        }
    }

    @oj.n
    @NotNull
    public static final String c(@NotNull String developerDefinedRedirectURI) {
        if (com.facebook.internal.instrument.crashshield.b.e(h.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(developerDefinedRedirectURI, "developerDefinedRedirectURI");
            f1 f1Var = f1.f99837a;
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            if (f1.h(com.facebook.g0.n(), developerDefinedRedirectURI)) {
                return developerDefinedRedirectURI;
            }
            return f1.h(com.facebook.g0.n(), b()) ? b() : "";
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, h.class);
            return null;
        }
    }
}
