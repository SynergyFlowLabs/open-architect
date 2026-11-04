package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
final class c extends com.google.android.gms.common.api.k implements z4 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a.g f107595o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a.AbstractC0967a f107596p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f107597q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final com.google.android.gms.common.logging.a f107598r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f107599n;

    static {
        com.google.android.gms.common.api.a.g gVar = new com.google.android.gms.common.api.a.g();
        f107595o = gVar;
        o7 o7Var = new o7();
        f107596p = o7Var;
        f107597q = new com.google.android.gms.common.api.a("GoogleAuthService.API", o7Var, gVar);
        f107598r = com.google.android.gms.auth.j.a("GoogleAuthServiceClient");
    }

    c(@NonNull Context context) {
        super(context, (com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.C0969d>) f107597q, com.google.android.gms.common.api.a.d.N1, com.google.android.gms.common.api.k.a.f106306c);
        this.f107599n = context;
    }

    static /* bridge */ /* synthetic */ void K0(Status status, Object obj, com.google.android.gms.tasks.l lVar) {
        if (com.google.android.gms.common.api.internal.c0.e(status, obj, lVar)) {
            return;
        }
        f107598r.j("The task is already complete.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.auth.z4
    public final Task P(@NonNull final AccountChangeEventsRequest accountChangeEventsRequest) {
        com.google.android.gms.common.internal.w.s(accountChangeEventsRequest, "request cannot be null.");
        return x0(com.google.android.gms.common.api.internal.b0.a().e(com.google.android.gms.auth.k.f105711k).c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.auth.n7
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                c cVar = this.f107717a;
                AccountChangeEventsRequest accountChangeEventsRequest2 = accountChangeEventsRequest;
                ((i7) ((b7) obj).M()).s(new s7(cVar, (com.google.android.gms.tasks.l) obj2), accountChangeEventsRequest2);
            }
        }).f(1515).a());
    }

    @Override // com.google.android.gms.internal.auth.z4
    public final Task Q(final zzbw zzbwVar) {
        return x0(com.google.android.gms.common.api.internal.b0.a().e(com.google.android.gms.auth.k.f105712l).c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.auth.m7
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                c cVar = this.f107712a;
                ((i7) ((b7) obj).M()).p(new q7(cVar, (com.google.android.gms.tasks.l) obj2), zzbwVar);
            }
        }).f(1513).a());
    }

    @Override // com.google.android.gms.internal.auth.z4
    public final Task V(@NonNull final Account account, @NonNull final String str, final Bundle bundle) {
        com.google.android.gms.common.internal.w.s(account, "Account name cannot be null!");
        com.google.android.gms.common.internal.w.m(str, "Scope cannot be null!");
        return x0(com.google.android.gms.common.api.internal.b0.a().e(com.google.android.gms.auth.k.f105712l).c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.auth.l7
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                c cVar = this.f107702a;
                ((i7) ((b7) obj).M()).u(new p7(cVar, (com.google.android.gms.tasks.l) obj2), account, str, bundle);
            }
        }).f(1512).a());
    }

    @Override // com.google.android.gms.internal.auth.z4
    public final Task a(@NonNull final String str) {
        com.google.android.gms.common.internal.w.s(str, "Client package name cannot be null!");
        return x0(com.google.android.gms.common.api.internal.b0.a().e(com.google.android.gms.auth.k.f105711k).c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.auth.j7
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                c cVar = this.f107674a;
                ((i7) ((b7) obj).M()).w(new r7(cVar, (com.google.android.gms.tasks.l) obj2), str);
            }
        }).f(1514).a());
    }

    @Override // com.google.android.gms.internal.auth.z4
    public final Task o(@NonNull final Account account) {
        com.google.android.gms.common.internal.w.s(account, "account cannot be null.");
        return x0(com.google.android.gms.common.api.internal.b0.a().e(com.google.android.gms.auth.k.f105711k).c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.auth.k7
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                c cVar = this.f107695a;
                ((i7) ((b7) obj).M()).v(new b(cVar, (com.google.android.gms.tasks.l) obj2), account);
            }
        }).f(1517).a());
    }
}
