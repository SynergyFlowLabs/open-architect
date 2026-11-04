package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f106614a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f106615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private static String f106616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f106617d;

    public static int a(Context context) {
        c(context);
        return f106617d;
    }

    @androidx.annotation.p0
    public static String b(Context context) {
        c(context);
        return f106616c;
    }

    private static void c(Context context) {
        synchronized (f106614a) {
            try {
                if (f106615b) {
                    return;
                }
                f106615b = true;
                try {
                    Bundle bundle = com.google.android.gms.common.wrappers.d.a(context).c(context.getPackageName(), 128).metaData;
                    if (bundle == null) {
                        return;
                    }
                    f106616c = bundle.getString("com.google.app.id");
                    f106617d = bundle.getInt("com.google.android.gms.version");
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
