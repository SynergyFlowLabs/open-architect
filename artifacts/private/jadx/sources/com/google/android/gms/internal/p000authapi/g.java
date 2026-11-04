package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.auth.api.identity.b;
import com.google.android.gms.auth.api.identity.j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.b0;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.l;
import i6.c;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends k implements b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final a.g f107506o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final a.AbstractC0967a f107507p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final a f107508q;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f107509n;

    static {
        a.g gVar = new a.g();
        f107506o = gVar;
        d dVar = new d();
        f107507p = dVar;
        f107508q = new a("Auth.Api.Identity.CredentialSaving.API", dVar, gVar);
    }

    public g(@NonNull Activity activity, @NonNull j jVar) {
        super(activity, (a<j>) f107508q, jVar, k.a.f106306c);
        this.f107509n = t.a();
    }

    @Override // com.google.android.gms.auth.api.identity.b
    public final Task<SaveAccountLinkingTokenResult> Z(@NonNull SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        w.r(saveAccountLinkingTokenRequest);
        SaveAccountLinkingTokenRequest.a aVarN2 = SaveAccountLinkingTokenRequest.n2(saveAccountLinkingTokenRequest);
        aVarN2.f(this.f107509n);
        final SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequestA = aVarN2.a();
        return r0(b0.a().e(s.f107534g).c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.auth-api.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((h0) ((b0) obj).M()).n(new e(this.f107499a, (l) obj2), (SaveAccountLinkingTokenRequest) w.r(saveAccountLinkingTokenRequestA));
            }
        }).d(false).f(1535).a());
    }

    @Override // com.google.android.gms.auth.api.identity.b
    public final Status n(@p0 Intent intent) {
        Status status;
        return (intent == null || (status = (Status) c.b(intent, "status", Status.CREATOR)) == null) ? Status.f105888h : status;
    }

    @Override // com.google.android.gms.auth.api.identity.b
    public final Task<SavePasswordResult> w(@NonNull SavePasswordRequest savePasswordRequest) {
        w.r(savePasswordRequest);
        SavePasswordRequest.a aVarB2 = SavePasswordRequest.b2(savePasswordRequest);
        aVarB2.c(this.f107509n);
        final SavePasswordRequest savePasswordRequestA = aVarB2.a();
        return r0(b0.a().e(s.f107532e).c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.auth-api.c
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((h0) ((b0) obj).M()).p(new f(this.f107502a, (l) obj2), (SavePasswordRequest) w.r(savePasswordRequestA));
            }
        }).d(false).f(1536).a());
    }

    public g(@NonNull Context context, @NonNull j jVar) {
        super(context, (a<j>) f107508q, jVar, k.a.f106306c);
        this.f107509n = t.a();
    }
}
