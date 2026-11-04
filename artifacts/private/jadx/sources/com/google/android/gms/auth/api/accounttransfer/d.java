package com.google.android.gms.auth.api.accounttransfer;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends com.google.android.gms.common.api.h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f105101t = 20500;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f105102u = 20501;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f105103v = 20502;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f105104w = 20503;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f105105x = 20504;

    private d() {
    }

    @NonNull
    public static String a(int i10) {
        switch (i10) {
            case f105101t /* 20500 */:
                return "NOT_ALLOWED_SECURITY";
            case f105102u /* 20501 */:
                return "NO_DATA_AVAILABLE";
            case f105103v /* 20502 */:
                return "INVALID_REQUEST";
            case f105104w /* 20503 */:
                return "CHALLENGE_NOT_ALLOWED";
            case f105105x /* 20504 */:
                return "SESSION_INACTIVE";
            default:
                return com.google.android.gms.common.api.h.a(i10);
        }
    }
}
