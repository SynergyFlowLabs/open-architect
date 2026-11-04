package com.google.android.gms.location;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends com.google.android.gms.common.api.h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f109668t = 1000;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f109669u = 1001;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f109670v = 1002;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f109671w = 1004;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f109672x = 1005;

    private i() {
    }

    @NonNull
    public static String a(int i10) {
        switch (i10) {
            case 1000:
                return "GEOFENCE_NOT_AVAILABLE";
            case 1001:
                return "GEOFENCE_TOO_MANY_GEOFENCES";
            case 1002:
                return "GEOFENCE_TOO_MANY_PENDING_INTENTS";
            case 1003:
            default:
                return com.google.android.gms.common.api.h.a(i10);
            case 1004:
                return "GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION";
        }
    }

    public static int b(int i10) {
        if (i10 == 0) {
            return i10;
        }
        if (i10 < 1000 || i10 >= 1006) {
            return 13;
        }
        return i10;
    }
}
