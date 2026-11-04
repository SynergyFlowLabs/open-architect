package com.google.android.gms.auth.api.proxy;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.a0;

/* JADX INFO: loaded from: classes4.dex */
@g6.c
@a0
public class a extends h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @a0
    public static final int f105596t = 3000;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @a0
    public static final int f105597u = 3001;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @a0
    public static final int f105598v = 3002;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @a0
    public static final int f105599w = 3003;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @a0
    public static final int f105600x = 3004;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @a0
    public static final int f105601y = 3005;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @a0
    public static final int f105602z = 3006;

    private a() {
    }

    @NonNull
    public static String a(int i10) {
        switch (i10) {
            case 3000:
                return "AUTH_API_INVALID_CREDENTIALS";
            case 3001:
                return "AUTH_API_ACCESS_FORBIDDEN";
            case 3002:
                return "AUTH_API_CLIENT_ERROR";
            case 3003:
                return "AUTH_API_SERVER_ERROR";
            case 3004:
                return "AUTH_TOKEN_ERROR";
            case f105601y /* 3005 */:
                return "AUTH_URL_RESOLUTION";
            case f105602z /* 3006 */:
                return "AUTH_APP_CERT_ERROR";
            default:
                return h.a(i10);
        }
    }
}
