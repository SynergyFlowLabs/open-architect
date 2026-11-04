package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public static final String f106698l = "GooglePlayServicesErrorDialog";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final int f106699m = k.f106704a;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    @Deprecated
    public static final String f106700n = "com.google.android.gms";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public static final String f106701o = "com.android.vending";

    private j() {
    }

    public static boolean A(int i10, @NonNull Activity activity, @androidx.annotation.p0 Fragment fragment, int i11, @androidx.annotation.p0 DialogInterface.OnCancelListener onCancelListener) {
        if (true == k.o(activity, i10)) {
            i10 = 18;
        }
        int i12 = i10;
        f fVarX = f.x();
        if (fragment == null) {
            return fVarX.B(activity, i12, i11, onCancelListener);
        }
        Dialog dialogF = fVarX.F(activity, i12, com.google.android.gms.common.internal.p0.c(fragment, f.x().e(activity, i12, "d"), i11), onCancelListener, null);
        if (dialogF == null) {
            return false;
        }
        fVarX.I(activity, dialogF, f106698l, onCancelListener);
        return true;
    }

    @Deprecated
    public static void B(int i10, @NonNull Context context) {
        f fVarX = f.x();
        if (k.o(context, i10) || k.p(context, i10)) {
            fVarX.K(context);
        } else {
            fVarX.D(context, i10);
        }
    }

    public static boolean C() {
        return com.google.android.gms.common.api.internal.i.g();
    }

    public static void D() {
        com.google.android.gms.common.internal.l.j();
    }

    @NonNull
    @Deprecated
    public static PendingIntent f(int i10, @NonNull Context context, int i11) {
        return g.i().f(context, i10, i11);
    }

    @NonNull
    @Deprecated
    public static String g(int i10) {
        return k.g(i10);
    }

    @NonNull
    public static Context i(@NonNull Context context) {
        return k.i(context);
    }

    @NonNull
    public static Resources j(@NonNull Context context) {
        return k.j(context);
    }

    @com.google.android.gms.common.internal.n
    @Deprecated
    public static int l(@NonNull Context context) {
        return k.l(context);
    }

    @g6.a
    @Deprecated
    public static int m(@NonNull Context context, int i10) {
        return k.m(context, i10);
    }

    @Deprecated
    public static boolean s(int i10) {
        return k.s(i10);
    }

    @androidx.annotation.p0
    @Deprecated
    public static Dialog v(int i10, @NonNull Activity activity, int i11) {
        return w(i10, activity, i11, null);
    }

    @androidx.annotation.p0
    @Deprecated
    public static Dialog w(int i10, @NonNull Activity activity, int i11, @androidx.annotation.p0 DialogInterface.OnCancelListener onCancelListener) {
        if (true == k.o(activity, i10)) {
            i10 = 18;
        }
        return f.x().t(activity, i10, i11, onCancelListener);
    }

    public static boolean x() {
        return com.google.android.gms.common.api.internal.i.f();
    }

    @Deprecated
    public static boolean y(int i10, @NonNull Activity activity, int i11) {
        return z(i10, activity, i11, null);
    }

    @Deprecated
    public static boolean z(int i10, @NonNull Activity activity, int i11, @androidx.annotation.p0 DialogInterface.OnCancelListener onCancelListener) {
        return A(i10, activity, null, i11, onCancelListener);
    }
}
