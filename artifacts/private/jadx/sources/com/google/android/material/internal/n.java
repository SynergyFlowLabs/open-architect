package com.google.android.material.internal;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f112887a = "lge";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f112888b = "samsung";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f112889c = "meizu";

    private n() {
    }

    @NonNull
    private static String a() {
        String str = Build.MANUFACTURER;
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static boolean b() {
        return c() || e();
    }

    public static boolean c() {
        return a().equals(f112887a);
    }

    public static boolean d() {
        return a().equals(f112889c);
    }

    public static boolean e() {
        return a().equals(f112888b);
    }
}
