package com.google.firebase.perf.util;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.collection.g3;
import okhttp3.v;

/* JADX INFO: loaded from: classes5.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f124253a;

    public static int a(@NonNull byte[] bArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 4 && i11 < bArr.length; i11++) {
            i10 |= (bArr[i11] & 255) << (i11 * 8);
        }
        return i10;
    }

    public static void b(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean c(@NonNull Context context) {
        Boolean bool = f124253a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean boolValueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f124253a = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            com.google.firebase.perf.logging.a.e().a("No perf logcat meta data found " + e10.getMessage());
            return false;
        }
    }

    public static int d(long j10) {
        if (j10 > g3.f12256c) {
            return Integer.MAX_VALUE;
        }
        if (j10 < g3.f12261h) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static String e(@NonNull String str) {
        v vVarJ = v.J(str);
        if (vVarJ != null) {
            str = vVarJ.H().Y("").B("").F(null).o(null).toString();
        }
        return str;
    }

    public static String f(String str, int i10) {
        v vVarJ;
        int iLastIndexOf;
        if (str.length() <= i10) {
            return str;
        }
        if (str.charAt(i10) != '/' && (vVarJ = v.J(str)) != null) {
            return (vVarJ.x().lastIndexOf(47) < 0 || (iLastIndexOf = str.lastIndexOf(47, i10 + (-1))) < 0) ? str.substring(0, i10) : str.substring(0, iLastIndexOf);
        }
        return str.substring(0, i10);
    }
}
