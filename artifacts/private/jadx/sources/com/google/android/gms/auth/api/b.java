package com.google.android.gms.auth.api;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.internal.auth.l0;
import com.google.android.gms.internal.auth.q0;

/* JADX INFO: loaded from: classes4.dex */
@a0
@g6.a
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @a0
    @g6.a
    public static final com.google.android.gms.common.api.a<c> f105147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @a0
    @g6.a
    public static final com.google.android.gms.auth.api.proxy.b f105148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public static final com.google.android.gms.common.api.a.g f105149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a.AbstractC0967a f105150d;

    static {
        com.google.android.gms.common.api.a.g gVar = new com.google.android.gms.common.api.a.g();
        f105149c = gVar;
        i iVar = new i();
        f105150d = iVar;
        f105147a = new com.google.android.gms.common.api.a<>("Auth.PROXY_API", iVar, gVar);
        f105148b = new q0();
    }

    @NonNull
    @g6.a
    public static com.google.android.gms.auth.api.proxy.c a(@NonNull Activity activity, @p0 c cVar) {
        return new l0(activity, cVar);
    }

    @NonNull
    @g6.a
    public static com.google.android.gms.auth.api.proxy.c b(@NonNull Context context, @p0 c cVar) {
        return new l0(context, cVar);
    }
}
