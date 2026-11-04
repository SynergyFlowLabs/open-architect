package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class j9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static volatile com.google.common.base.e0 f108584a = com.google.common.base.e0.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f108585b = new Object();

    public static boolean a(Context context, Uri uri) {
        ProviderInfo providerInfoResolveContentProvider;
        String authority = uri.getAuthority();
        boolean z10 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        }
        if (f108584a.e()) {
            return ((Boolean) f108584a.d()).booleanValue();
        }
        synchronized (f108585b) {
            try {
                if (f108584a.e()) {
                    return ((Boolean) f108584a.d()).booleanValue();
                }
                if ("com.google.android.gms".equals(context.getPackageName()) || ((providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 268435456)) != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName))) {
                    try {
                        if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                            z10 = true;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                f108584a = com.google.common.base.e0.f(Boolean.valueOf(z10));
                return ((Boolean) f108584a.d()).booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
