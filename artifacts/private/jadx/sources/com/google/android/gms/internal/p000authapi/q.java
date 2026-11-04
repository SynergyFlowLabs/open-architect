package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.identity.d;
import com.google.android.gms.auth.api.identity.w;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.b0;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.l;
import i6.c;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends k implements d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final a.g f107521o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final a.AbstractC0967a f107522p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final a f107523q;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f107524n;

    static {
        a.g gVar = new a.g();
        f107521o = gVar;
        l lVar = new l();
        f107522p = lVar;
        f107523q = new a("Auth.Api.Identity.SignIn.API", lVar, gVar);
    }

    public q(@NonNull Activity activity, @NonNull w wVar) {
        super(activity, (a<w>) f107523q, wVar, k.a.f106306c);
        this.f107524n = t.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void K0(GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, r rVar, l lVar) throws RemoteException {
        ((q0) rVar.M()).p(new p(this, lVar), getPhoneNumberHintIntentRequest, this.f107524n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void L0(r rVar, l lVar) throws RemoteException {
        ((q0) rVar.M()).u(new n(this, lVar), this.f107524n);
    }

    @Override // com.google.android.gms.auth.api.identity.d
    public final String X(@p0 Intent intent) throws b {
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
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new b(Status.f105888h);
    }

    @Override // com.google.android.gms.auth.api.identity.d
    public final Task<PendingIntent> c(@NonNull GetSignInIntentRequest getSignInIntentRequest) {
        com.google.android.gms.common.internal.w.r(getSignInIntentRequest);
        GetSignInIntentRequest.a aVarN2 = GetSignInIntentRequest.n2(getSignInIntentRequest);
        aVarN2.f(this.f107524n);
        final GetSignInIntentRequest getSignInIntentRequestA = aVarN2.a();
        return r0(b0.a().e(s.f107533f).c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.auth-api.k
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((q0) ((r) obj).M()).s(new o(this.f107515a, (l) obj2), (GetSignInIntentRequest) com.google.android.gms.common.internal.w.r(getSignInIntentRequestA));
            }
        }).f(1555).a());
    }

    @Override // com.google.android.gms.auth.api.identity.d
    public final Task<PendingIntent> c0(@NonNull final GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest) {
        com.google.android.gms.common.internal.w.r(getPhoneNumberHintIntentRequest);
        return r0(b0.a().e(s.f107535h).c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.auth-api.h
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                this.f107510a.K0(getPhoneNumberHintIntentRequest, (r) obj, (l) obj2);
            }
        }).f(1653).a());
    }

    @Override // com.google.android.gms.auth.api.identity.d
    public final Task<Void> g0() {
        A0().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Iterator<com.google.android.gms.common.api.l> it = com.google.android.gms.common.api.l.n().iterator();
        while (it.hasNext()) {
            it.next().z();
        }
        i.a();
        return x0(b0.a().e(s.f107529b).c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.auth-api.i
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                this.f107512a.L0((r) obj, (l) obj2);
            }
        }).d(false).f(1554).a());
    }

    @Override // com.google.android.gms.auth.api.identity.d
    public final SignInCredential h(@p0 Intent intent) throws b {
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
        SignInCredential signInCredential = (SignInCredential) c.b(intent, "sign_in_credential", SignInCredential.CREATOR);
        if (signInCredential != null) {
            return signInCredential;
        }
        throw new b(Status.f105888h);
    }

    @Override // com.google.android.gms.auth.api.identity.d
    public final Task<BeginSignInResult> i0(@NonNull BeginSignInRequest beginSignInRequest) {
        com.google.android.gms.common.internal.w.r(beginSignInRequest);
        BeginSignInRequest.a aVarQ2 = BeginSignInRequest.q2(beginSignInRequest);
        aVarQ2.h(this.f107524n);
        final BeginSignInRequest beginSignInRequestA = aVarQ2.a();
        return r0(b0.a().e(new Feature("auth_api_credentials_begin_sign_in", 8L)).c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.auth-api.j
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((q0) ((r) obj).M()).n(new m(this.f107513a, (l) obj2), (BeginSignInRequest) com.google.android.gms.common.internal.w.r(beginSignInRequestA));
            }
        }).d(false).f(1553).a());
    }

    public q(@NonNull Context context, @NonNull w wVar) {
        super(context, (a<w>) f107523q, wVar, k.a.f106306c);
        this.f107524n = t.a();
    }
}
