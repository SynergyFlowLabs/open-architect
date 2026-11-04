package com.google.android.gms.auth.api.accounttransfer;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public static final String f105088a = "com.google.android.gms.auth.START_ACCOUNT_EXPORT";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public static final String f105089b = "com.google.android.gms.auth.ACCOUNT_IMPORT_DATA_AVAILABLE";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public static final String f105090c = "com.google.android.gms.auth.ACCOUNT_EXPORT_DATA_AVAILABLE";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public static final String f105091d = "key_extra_account_type";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a.g f105092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a.AbstractC0967a f105093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public static final com.google.android.gms.common.api.a f105094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final com.google.android.gms.internal.auth.p f105095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final com.google.android.gms.internal.auth.p f105096i;

    static {
        com.google.android.gms.common.api.a.g gVar = new com.google.android.gms.common.api.a.g();
        f105092e = gVar;
        f fVar = new f();
        f105093f = fVar;
        f105094g = new com.google.android.gms.common.api.a("AccountTransfer.ACCOUNT_TRANSFER_API", fVar, gVar);
        f105095h = new com.google.android.gms.internal.auth.p();
        f105096i = new com.google.android.gms.internal.auth.p();
    }

    private a() {
    }

    @NonNull
    public static b a(@NonNull Activity activity) {
        return new b(activity, (v) null);
    }

    @NonNull
    public static b b(@NonNull Context context) {
        return new b(context, (v) null);
    }
}
