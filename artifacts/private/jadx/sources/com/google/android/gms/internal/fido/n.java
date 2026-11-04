package com.google.android.gms.internal.fido;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes4.dex */
public final class n {
    public static int a(int i10, int i11, String str) {
        String strA;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            strA = o.a("%s (%s) must not be negative", FirebaseAnalytics.d.f120644b0, Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                throw new IllegalArgumentException("negative size: " + i11);
            }
            strA = o.a("%s (%s) must be less than size (%s)", FirebaseAnalytics.d.f120644b0, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(strA);
    }

    public static int b(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(f(i10, i11, FirebaseAnalytics.d.f120644b0));
        }
        return i10;
    }

    public static void c(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(boolean z10, String str, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(o.a(str, Character.valueOf(c10)));
        }
    }

    public static void e(int i10, int i11, int i12) {
        String strF;
        if (i10 >= 0 && i11 >= i10 && i11 <= i12) {
            return;
        }
        if (i10 < 0 || i10 > i12) {
            strF = f(i10, i12, "start index");
        } else {
            strF = (i11 < 0 || i11 > i12) ? f(i11, i12, "end index") : o.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(strF);
    }

    private static String f(int i10, int i11, String str) {
        if (i10 < 0) {
            return o.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return o.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }
}
