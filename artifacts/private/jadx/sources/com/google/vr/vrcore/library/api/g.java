package com.google.vr.vrcore.library.api;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;

/* JADX INFO: loaded from: classes5.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f130066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f130067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static d f130068c;

    public static Context a(Context context) throws com.google.vr.vrcore.base.api.c {
        if (f130066a == null) {
            int iD = com.google.vr.vrcore.base.api.d.d(context);
            if (iD < 9) {
                throw new com.google.vr.vrcore.base.api.c(4);
            }
            try {
                f130066a = context.createPackageContext("com.google.vr.vrcore", 3);
                f130067b = iD;
            } catch (PackageManager.NameNotFoundException unused) {
                throw new com.google.vr.vrcore.base.api.c(1);
            }
        }
        return f130066a;
    }

    public static int b(Context context) throws com.google.vr.vrcore.base.api.c {
        a(context);
        return f130067b;
    }

    public static d c(Context context) throws com.google.vr.vrcore.base.api.c {
        if (f130068c == null) {
            f130068c = d.a.p(d(a(context).getClassLoader(), "com.google.vr.vrcore.library.VrCreator"));
        }
        return f130068c;
    }

    private static IBinder d(ClassLoader classLoader, String str) {
        try {
            return (IBinder) classLoader.loadClass(str).newInstance();
        } catch (ClassNotFoundException unused) {
            String strValueOf = String.valueOf(str);
            throw new IllegalStateException(strValueOf.length() != 0 ? "Unable to find dynamic class ".concat(strValueOf) : new String("Unable to find dynamic class "));
        } catch (IllegalAccessException unused2) {
            String strValueOf2 = String.valueOf(str);
            throw new IllegalStateException(strValueOf2.length() != 0 ? "Unable to call the default constructor of ".concat(strValueOf2) : new String("Unable to call the default constructor of "));
        } catch (InstantiationException unused3) {
            String strValueOf3 = String.valueOf(str);
            throw new IllegalStateException(strValueOf3.length() != 0 ? "Unable to instantiate the remote class ".concat(strValueOf3) : new String("Unable to instantiate the remote class "));
        }
    }
}
