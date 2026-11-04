package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.api.k;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g extends k<com.google.android.gms.common.api.a.d.C0969d> implements f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a.g f105562n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a.AbstractC0967a f105563o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f105564p;

    static {
        com.google.android.gms.common.api.a.g gVar = new com.google.android.gms.common.api.a.g();
        f105562n = gVar;
        i iVar = new i();
        f105563o = iVar;
        f105564p = new com.google.android.gms.common.api.a("SmsRetriever.API", iVar, gVar);
    }

    public g(@NonNull Activity activity) {
        super(activity, (com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.C0969d>) f105564p, com.google.android.gms.common.api.a.d.N1, k.a.f106306c);
    }

    @Override // com.google.android.gms.auth.api.phone.f
    @NonNull
    public abstract Task<Void> O(@p0 String str);

    @Override // com.google.android.gms.auth.api.phone.f
    @NonNull
    public abstract Task<Void> u();

    public g(@NonNull Context context) {
        super(context, (com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.C0969d>) f105564p, com.google.android.gms.common.api.a.d.N1, k.a.f106306c);
    }
}
