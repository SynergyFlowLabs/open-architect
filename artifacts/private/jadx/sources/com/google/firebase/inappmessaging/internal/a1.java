package com.google.firebase.inappmessaging.internal;

import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ij.f
public class a1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.internal.firebase.inappmessaging.v1.sdkserving.b f122582c = com.google.internal.firebase.inappmessaging.v1.sdkserving.b.nm();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y2 f122583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private io.reactivex.s<com.google.internal.firebase.inappmessaging.v1.sdkserving.b> f122584b = io.reactivex.s.Y();

    @ij.a
    a1(@w8.e y2 y2Var) {
        this.f122583a = y2Var;
    }

    public static /* synthetic */ io.reactivex.i b(final a1 a1Var, HashSet hashSet, com.google.internal.firebase.inappmessaging.v1.sdkserving.b bVar) {
        a1Var.getClass();
        p2.a("Existing impressions: " + bVar.toString());
        com.google.internal.firebase.inappmessaging.v1.sdkserving.b.C1209b c1209bOm = com.google.internal.firebase.inappmessaging.v1.sdkserving.b.om();
        for (com.google.internal.firebase.inappmessaging.v1.sdkserving.a aVar : bVar.O7()) {
            if (!hashSet.contains(aVar.G0())) {
                c1209bOm.Sl(aVar);
            }
        }
        final com.google.internal.firebase.inappmessaging.v1.sdkserving.b bVarBuild = c1209bOm.build();
        p2.a("New cleared impression list: " + bVarBuild.toString());
        return a1Var.f122583a.d(bVarBuild).J(new dj.a() { // from class: com.google.firebase.inappmessaging.internal.r0
            @Override // dj.a
            public final void run() {
                this.f122921a.k(bVarBuild);
            }
        });
    }

    public static /* synthetic */ io.reactivex.i d(final a1 a1Var, com.google.internal.firebase.inappmessaging.v1.sdkserving.a aVar, com.google.internal.firebase.inappmessaging.v1.sdkserving.b bVar) {
        a1Var.getClass();
        final com.google.internal.firebase.inappmessaging.v1.sdkserving.b bVarG = g(bVar, aVar);
        return a1Var.f122583a.d(bVarG).J(new dj.a() { // from class: com.google.firebase.inappmessaging.internal.z0
            @Override // dj.a
            public final void run() {
                this.f123010a.k(bVarG);
            }
        });
    }

    private static com.google.internal.firebase.inappmessaging.v1.sdkserving.b g(com.google.internal.firebase.inappmessaging.v1.sdkserving.b bVar, com.google.internal.firebase.inappmessaging.v1.sdkserving.a aVar) {
        return com.google.internal.firebase.inappmessaging.v1.sdkserving.b.pm(bVar).Sl(aVar).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f122584b = io.reactivex.s.Y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(com.google.internal.firebase.inappmessaging.v1.sdkserving.b bVar) {
        this.f122584b = io.reactivex.s.w0(bVar);
    }

    public io.reactivex.c h(com.google.internal.firebase.inappmessaging.v1.sdkserving.i iVar) {
        final HashSet hashSet = new HashSet();
        for (com.google.internal.firebase.inappmessaging.v1.a.f fVar : iVar.hg()) {
            hashSet.add(fVar.N8().equals(com.google.internal.firebase.inappmessaging.v1.a.f.c.VANILLA_PAYLOAD) ? fVar.I8().G0() : fVar.hk().G0());
        }
        p2.a("Potential impressions to clear: " + hashSet.toString());
        return j().G(f122582c).f0(new dj.o() { // from class: com.google.firebase.inappmessaging.internal.v0
            @Override // dj.o
            public final Object apply(Object obj) {
                return a1.b(this.f122970a, hashSet, (com.google.internal.firebase.inappmessaging.v1.sdkserving.b) obj);
            }
        });
    }

    public io.reactivex.s<com.google.internal.firebase.inappmessaging.v1.sdkserving.b> j() {
        return this.f122584b.v1(this.f122583a.c(com.google.internal.firebase.inappmessaging.v1.sdkserving.b.Cm()).W(new dj.g() { // from class: com.google.firebase.inappmessaging.internal.t0
            @Override // dj.g
            public final void accept(Object obj) {
                this.f122941a.k((com.google.internal.firebase.inappmessaging.v1.sdkserving.b) obj);
            }
        })).T(new dj.g() { // from class: com.google.firebase.inappmessaging.internal.u0
            @Override // dj.g
            public final void accept(Object obj) {
                this.f122949a.i();
            }
        });
    }

    public io.reactivex.k0<Boolean> l(com.google.internal.firebase.inappmessaging.v1.a.f fVar) {
        return j().y0(new dj.o() { // from class: com.google.firebase.inappmessaging.internal.w0
            @Override // dj.o
            public final Object apply(Object obj) {
                return ((com.google.internal.firebase.inappmessaging.v1.sdkserving.b) obj).O7();
            }
        }).g0(new dj.o() { // from class: com.google.firebase.inappmessaging.internal.x0
            @Override // dj.o
            public final Object apply(Object obj) {
                return io.reactivex.b0.O2((List) obj);
            }
        }).z3(new dj.o() { // from class: com.google.firebase.inappmessaging.internal.y0
            @Override // dj.o
            public final Object apply(Object obj) {
                return ((com.google.internal.firebase.inappmessaging.v1.sdkserving.a) obj).G0();
            }
        }).o1(fVar.N8().equals(com.google.internal.firebase.inappmessaging.v1.a.f.c.VANILLA_PAYLOAD) ? fVar.I8().G0() : fVar.hk().G0());
    }

    public io.reactivex.c m(final com.google.internal.firebase.inappmessaging.v1.sdkserving.a aVar) {
        return j().G(f122582c).f0(new dj.o() { // from class: com.google.firebase.inappmessaging.internal.s0
            @Override // dj.o
            public final Object apply(Object obj) {
                return a1.d(this.f122932a, aVar, (com.google.internal.firebase.inappmessaging.v1.sdkserving.b) obj);
            }
        });
    }
}
