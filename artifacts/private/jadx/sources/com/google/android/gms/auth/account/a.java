package com.google.android.gms.auth.account;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.auth.m;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public static final com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.C0969d> f105071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @Deprecated
    public static final b f105072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a.g f105073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a.AbstractC0967a f105074d;

    static {
        com.google.android.gms.common.api.a.g gVar = new com.google.android.gms.common.api.a.g();
        f105073c = gVar;
        i iVar = new i();
        f105074d = iVar;
        f105071a = new com.google.android.gms.common.api.a<>("WorkAccount.API", iVar, gVar);
        f105072b = new m();
    }

    private a() {
    }

    @NonNull
    public static c a(@NonNull Activity activity) {
        return new c(activity);
    }

    @NonNull
    public static c b(@NonNull Context context) {
        return new c(context);
    }
}
