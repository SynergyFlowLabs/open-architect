package com.google.android.gms.internal.auth;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static volatile e2 f107708a = e2.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f107709b = new Object();

    public static boolean a(Context context, Uri uri) {
        ProviderInfo providerInfoResolveContentProvider;
        String authority = uri.getAuthority();
        boolean z10 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        }
        if (f107708a.b()) {
            return ((Boolean) f107708a.a()).booleanValue();
        }
        synchronized (f107709b) {
            try {
                if (f107708a.b()) {
                    return ((Boolean) f107708a.a()).booleanValue();
                }
                if ("com.google.android.gms".equals(context.getPackageName()) || ((providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 268435456)) != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName))) {
                    try {
                        if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                            z10 = true;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                f107708a = e2.d(Boolean.valueOf(z10));
                return ((Boolean) f107708a.a()).booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
