package com.google.android.gms.auth.api.phone;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends com.google.android.gms.common.api.h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f105565t = 36500;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f105566u = 36501;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f105567v = 36502;

    private h() {
    }

    @NonNull
    public static String a(int i10) {
        switch (i10) {
            case f105565t /* 36500 */:
                return "PLATFORM_NOT_SUPPORTED";
            case f105566u /* 36501 */:
                return "API_NOT_AVAILABLE";
            case f105567v /* 36502 */:
                return "USER_PERMISSION_REQUIRED";
            default:
                return com.google.android.gms.common.api.h.a(i10);
        }
    }
}
