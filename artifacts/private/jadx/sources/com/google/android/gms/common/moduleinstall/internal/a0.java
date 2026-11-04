package com.google.android.gms.common.moduleinstall.internal;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends com.google.android.gms.common.api.k implements com.google.android.gms.common.moduleinstall.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a.g f106764n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a.AbstractC0967a f106765o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f106766p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f106767q = 0;

    static {
        com.google.android.gms.common.api.a.g gVar = new com.google.android.gms.common.api.a.g();
        f106764n = gVar;
        s sVar = new s();
        f106765o = sVar;
        f106766p = new com.google.android.gms.common.api.a("ModuleInstall.API", sVar, gVar);
    }

    public a0(Activity activity) {
        super(activity, (com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.C0969d>) f106766p, com.google.android.gms.common.api.a.d.N1, com.google.android.gms.common.api.k.a.f106306c);
    }

    static final ApiFeatureRequest K0(boolean z10, com.google.android.gms.common.api.n... nVarArr) {
        com.google.android.gms.common.internal.w.s(nVarArr, "Requested APIs must not be null.");
        com.google.android.gms.common.internal.w.b(nVarArr.length > 0, "Please provide at least one OptionalModuleApi.");
        for (com.google.android.gms.common.api.n nVar : nVarArr) {
            com.google.android.gms.common.internal.w.s(nVar, "Requested API must not be null.");
        }
        return ApiFeatureRequest.b2(Arrays.asList(nVarArr), z10);
    }

    @Override // com.google.android.gms.common.moduleinstall.c
    public final Task<ModuleAvailabilityResponse> B(com.google.android.gms.common.api.n... nVarArr) {
        final ApiFeatureRequest apiFeatureRequestK0 = K0(false, nVarArr);
        if (apiFeatureRequestK0.T1().isEmpty()) {
            return com.google.android.gms.tasks.n.g(new ModuleAvailabilityResponse(true, 0));
        }
        com.google.android.gms.common.api.internal.b0.a aVarA = com.google.android.gms.common.api.internal.b0.a();
        aVarA.e(com.google.android.gms.internal.base.r.f107952a);
        aVarA.f(27301);
        aVarA.d(false);
        aVarA.c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.common.moduleinstall.internal.n
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((h) ((b0) obj).M()).s(new t(this.f106778a, (com.google.android.gms.tasks.l) obj2), apiFeatureRequestK0);
            }
        });
        return r0(aVarA.a());
    }

    @Override // com.google.android.gms.common.moduleinstall.c
    public final Task<Void> Y(com.google.android.gms.common.api.n... nVarArr) {
        final ApiFeatureRequest apiFeatureRequestK0 = K0(false, nVarArr);
        if (apiFeatureRequestK0.T1().isEmpty()) {
            return com.google.android.gms.tasks.n.g(null);
        }
        com.google.android.gms.common.api.internal.b0.a aVarA = com.google.android.gms.common.api.internal.b0.a();
        aVarA.e(com.google.android.gms.internal.base.r.f107952a);
        aVarA.f(27302);
        aVarA.d(false);
        aVarA.c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.common.moduleinstall.internal.r
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((h) ((b0) obj).M()).v(new u(this.f106786a, (com.google.android.gms.tasks.l) obj2), apiFeatureRequestK0, null);
            }
        });
        return r0(aVarA.a());
    }

    @Override // com.google.android.gms.common.moduleinstall.c
    public final Task<Boolean> k(com.google.android.gms.common.moduleinstall.a aVar) {
        return v0(com.google.android.gms.common.api.internal.p.c(aVar, com.google.android.gms.common.moduleinstall.a.class.getSimpleName()), 27306);
    }

    @Override // com.google.android.gms.common.moduleinstall.c
    public final Task<ModuleInstallIntentResponse> s(com.google.android.gms.common.api.n... nVarArr) {
        final ApiFeatureRequest apiFeatureRequestK0 = K0(true, nVarArr);
        if (apiFeatureRequestK0.T1().isEmpty()) {
            return com.google.android.gms.tasks.n.g(new ModuleInstallIntentResponse(null));
        }
        com.google.android.gms.common.api.internal.b0.a aVarA = com.google.android.gms.common.api.internal.b0.a();
        aVarA.e(com.google.android.gms.internal.base.r.f107952a);
        aVarA.f(27307);
        aVarA.c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.common.moduleinstall.internal.p
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((h) ((b0) obj).M()).u(new y(this.f106782a, (com.google.android.gms.tasks.l) obj2), apiFeatureRequestK0);
            }
        });
        return r0(aVarA.a());
    }

    @Override // com.google.android.gms.common.moduleinstall.c
    public final Task<Void> t(com.google.android.gms.common.api.n... nVarArr) {
        final ApiFeatureRequest apiFeatureRequestK0 = K0(false, nVarArr);
        if (apiFeatureRequestK0.T1().isEmpty()) {
            return com.google.android.gms.tasks.n.g(null);
        }
        com.google.android.gms.common.api.internal.b0.a aVarA = com.google.android.gms.common.api.internal.b0.a();
        aVarA.e(com.google.android.gms.internal.base.r.f107952a);
        aVarA.f(27303);
        aVarA.d(false);
        aVarA.c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.common.moduleinstall.internal.o
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((h) ((b0) obj).M()).w(new z(this.f106780a, (com.google.android.gms.tasks.l) obj2), apiFeatureRequestK0);
            }
        });
        return r0(aVarA.a());
    }

    @Override // com.google.android.gms.common.moduleinstall.c
    public final Task<ModuleInstallResponse> x(com.google.android.gms.common.moduleinstall.d dVar) {
        final ApiFeatureRequest apiFeatureRequestO1 = ApiFeatureRequest.O1(dVar);
        final com.google.android.gms.common.moduleinstall.a aVarB = dVar.b();
        Executor executorC = dVar.c();
        if (apiFeatureRequestO1.T1().isEmpty()) {
            int i10 = 1 << 0;
            return com.google.android.gms.tasks.n.g(new ModuleInstallResponse(0));
        }
        if (aVarB == null) {
            com.google.android.gms.common.api.internal.b0.a aVarA = com.google.android.gms.common.api.internal.b0.a();
            aVarA.e(com.google.android.gms.internal.base.r.f107952a);
            aVarA.d(true);
            aVarA.f(27304);
            aVarA.c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.common.moduleinstall.internal.q
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.common.api.internal.w
                public final void accept(Object obj, Object obj2) throws RemoteException {
                    ((h) ((b0) obj).M()).v(new v(this.f106784a, (com.google.android.gms.tasks.l) obj2), apiFeatureRequestO1, null);
                }
            });
            return r0(aVarA.a());
        }
        com.google.android.gms.common.internal.w.r(aVarB);
        com.google.android.gms.common.api.internal.o oVarE0 = executorC == null ? E0(aVarB, com.google.android.gms.common.moduleinstall.a.class.getSimpleName()) : com.google.android.gms.common.api.internal.p.b(aVarB, executorC, com.google.android.gms.common.moduleinstall.a.class.getSimpleName());
        final c cVar = new c(oVarE0);
        final AtomicReference atomicReference = new AtomicReference();
        com.google.android.gms.common.api.internal.w wVar = new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.common.moduleinstall.internal.k
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((h) ((b0) obj).M()).v(new w(this.f106770a, atomicReference, (com.google.android.gms.tasks.l) obj2, aVarB), apiFeatureRequestO1, cVar);
            }
        };
        com.google.android.gms.common.api.internal.w wVar2 = new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.common.moduleinstall.internal.l
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((h) ((b0) obj).M()).L(new x(this.f106775a, (com.google.android.gms.tasks.l) obj2), cVar);
            }
        };
        com.google.android.gms.common.api.internal.v.a aVarA2 = com.google.android.gms.common.api.internal.v.a();
        aVarA2.h(oVarE0);
        aVarA2.e(com.google.android.gms.internal.base.r.f107952a);
        aVarA2.d(true);
        aVarA2.c(wVar);
        aVarA2.g(wVar2);
        aVarA2.f(27305);
        return t0(aVarA2.a()).v(new com.google.android.gms.tasks.k() { // from class: com.google.android.gms.common.moduleinstall.internal.m
            @Override // com.google.android.gms.tasks.k
            public final Task a(Object obj) {
                int i11 = a0.f106767q;
                AtomicReference atomicReference2 = atomicReference;
                return atomicReference2.get() != null ? com.google.android.gms.tasks.n.g((ModuleInstallResponse) atomicReference2.get()) : com.google.android.gms.tasks.n.f(new com.google.android.gms.common.api.b(Status.f105888h));
            }
        });
    }

    public a0(Context context) {
        super(context, (com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.C0969d>) f106766p, com.google.android.gms.common.api.a.d.N1, com.google.android.gms.common.api.k.a.f106306c);
    }
}
