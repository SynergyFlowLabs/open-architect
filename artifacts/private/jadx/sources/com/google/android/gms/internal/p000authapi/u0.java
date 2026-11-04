package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.auth.api.identity.a;
import com.google.android.gms.auth.api.identity.e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.b0;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.l;
import i6.c;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 extends k implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a.g f107542o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a.AbstractC0967a f107543p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f107544q;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f107545n;

    static {
        com.google.android.gms.common.api.a.g gVar = new com.google.android.gms.common.api.a.g();
        f107542o = gVar;
        s0 s0Var = new s0();
        f107543p = s0Var;
        f107544q = new com.google.android.gms.common.api.a("Auth.Api.Identity.Authorization.API", s0Var, gVar);
    }

    public u0(@NonNull Activity activity, @NonNull e eVar) {
        super(activity, (com.google.android.gms.common.api.a<e>) f107544q, eVar, k.a.f106306c);
        this.f107545n = t.a();
    }

    @Override // com.google.android.gms.auth.api.identity.a
    public final Task<AuthorizationResult> D(@NonNull AuthorizationRequest authorizationRequest) {
        w.r(authorizationRequest);
        AuthorizationRequest.a aVarU2 = AuthorizationRequest.u2(authorizationRequest);
        aVarU2.j(this.f107545n);
        final AuthorizationRequest authorizationRequestB = aVarU2.b();
        return r0(b0.a().e(s.f107530c).c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.auth-api.r0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((e0) ((a0) obj).M()).n(new t0(this.f107526a, (l) obj2), (AuthorizationRequest) w.r(authorizationRequestB));
            }
        }).d(false).f(1534).a());
    }

    @Override // com.google.android.gms.auth.api.identity.a
    public final AuthorizationResult i(@p0 Intent intent) throws b {
        if (intent == null) {
            throw new b(Status.f105888h);
        }
        Status status = (Status) c.b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new b(Status.f105890j);
        }
        if (!status.q2()) {
            throw new b(status);
        }
        AuthorizationResult authorizationResult = (AuthorizationResult) c.b(intent, "authorization_result", AuthorizationResult.CREATOR);
        if (authorizationResult != null) {
            return authorizationResult;
        }
        throw new b(Status.f105888h);
    }

    public u0(@NonNull Context context, @NonNull e eVar) {
        super(context, (com.google.android.gms.common.api.a<e>) f107544q, eVar, k.a.f106306c);
        this.f107545n = t.a();
    }
}
