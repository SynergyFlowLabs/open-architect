package com.google.android.gms.auth.api.signin;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class f extends com.google.android.gms.common.api.h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f105654t = 12500;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f105655u = 12501;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f105656v = 12502;

    private f() {
    }

    @NonNull
    public static String a(int i10) {
        switch (i10) {
            case f105654t /* 12500 */:
                return "A non-recoverable sign in failure occurred";
            case f105655u /* 12501 */:
                return "Sign in action cancelled";
            case f105656v /* 12502 */:
                return "Sign-in in progress";
            default:
                return com.google.android.gms.common.api.h.a(i10);
        }
    }
}
