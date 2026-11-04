package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<f> f120967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f120968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f120969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f120970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f120971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.firebase.crashlytics.internal.f f120972h;

    public a(String str, String str2, List<f> list, String str3, String str4, String str5, String str6, com.google.firebase.crashlytics.internal.f fVar) {
        this.f120965a = str;
        this.f120966b = str2;
        this.f120967c = list;
        this.f120968d = str3;
        this.f120969e = str4;
        this.f120970f = str5;
        this.f120971g = str6;
        this.f120972h = fVar;
    }

    public static a a(Context context, n0 n0Var, String str, String str2, List<f> list, com.google.firebase.crashlytics.internal.f fVar) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String strG = n0Var.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strB = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = n0.f121134h;
        }
        return new a(str, str2, list, strG, packageName, strB, str3, fVar);
    }

    private static String b(PackageInfo packageInfo) {
        return Long.toString(packageInfo.getLongVersionCode());
    }
}
