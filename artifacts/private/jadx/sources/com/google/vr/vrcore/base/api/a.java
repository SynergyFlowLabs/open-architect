package com.google.vr.vrcore.base.api;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Boolean f129943a;

    private static synchronized boolean a(Context context) {
        try {
            if (f129943a == null) {
                try {
                    f129943a = Boolean.valueOf(b.b(context.getPackageManager().getPackageInfo(context.getPackageName(), 64), b.f129946c, b.f129947d, b.f129945b));
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalStateException("Unable to find self package info", e10);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f129943a.booleanValue();
    }

    public static boolean b(Context context) {
        return f129943a != null ? f129943a.booleanValue() : a(context);
    }
}
