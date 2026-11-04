package com.google.firebase.inappmessaging.internal;

/* JADX INFO: loaded from: classes5.dex */
@ij.f
public class o3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final e3.d f122898d = e3.d.bm();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y2 f122899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.inappmessaging.internal.time.a f122900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private io.reactivex.s<e3.d> f122901c = io.reactivex.s.Y();

    @ij.a
    o3(@w8.g y2 y2Var, com.google.firebase.inappmessaging.internal.time.a aVar) {
        this.f122899a = y2Var;
        this.f122900b = aVar;
    }

    public static /* synthetic */ boolean b(o3 o3Var, com.google.firebase.inappmessaging.model.m mVar, e3.b bVar) {
        return o3Var.o(bVar, mVar) || bVar.getValue() < mVar.b();
    }

    public static /* synthetic */ boolean d(o3 o3Var, com.google.firebase.inappmessaging.model.m mVar, e3.b bVar) {
        return !o3Var.o(bVar, mVar);
    }

    public static /* synthetic */ io.reactivex.i h(final o3 o3Var, final com.google.firebase.inappmessaging.model.m mVar, final e3.d dVar) {
        o3Var.getClass();
        return io.reactivex.b0.l3(dVar.O8(mVar.c(), o3Var.q())).g2(new dj.r() { // from class: com.google.firebase.inappmessaging.internal.j3
            @Override // dj.r
            public final boolean test(Object obj) {
                return o3.d(this.f122818a, mVar, (e3.b) obj);
            }
        }).K5(io.reactivex.b0.l3(o3Var.q())).z3(new dj.o() { // from class: com.google.firebase.inappmessaging.internal.k3
            @Override // dj.o
            public final Object apply(Object obj) {
                return e3.d.gm(dVar).Ql(mVar.c(), o3.l((e3.b) obj)).build();
            }
        }).w2(new dj.o() { // from class: com.google.firebase.inappmessaging.internal.l3
            @Override // dj.o
            public final Object apply(Object obj) {
                o3 o3Var2 = this.f122844a;
                e3.d dVar2 = (e3.d) obj;
                return o3Var2.f122899a.d(dVar2).J(new dj.a() { // from class: com.google.firebase.inappmessaging.internal.h3
                    @Override // dj.a
                    public final void run() {
                        this.f122646a.n(dVar2);
                    }
                });
            }
        });
    }

    public static /* synthetic */ e3.b i(o3 o3Var, com.google.firebase.inappmessaging.model.m mVar, e3.d dVar) {
        o3Var.getClass();
        return dVar.O8(mVar.c(), o3Var.q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f122901c = io.reactivex.s.Y();
    }

    private io.reactivex.s<e3.d> k() {
        return this.f122901c.v1(this.f122899a.c(e3.d.tm()).W(new dj.g() { // from class: com.google.firebase.inappmessaging.internal.f3
            @Override // dj.g
            public final void accept(Object obj) {
                this.f122630a.n((e3.d) obj);
            }
        })).T(new dj.g() { // from class: com.google.firebase.inappmessaging.internal.g3
            @Override // dj.g
            public final void accept(Object obj) {
                this.f122641a.j();
            }
        });
    }

    private static e3.b l(e3.b bVar) {
        return e3.b.im(bVar).Pl().Rl(bVar.getValue() + 1).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(e3.d dVar) {
        this.f122901c = io.reactivex.s.w0(dVar);
    }

    private boolean o(e3.b bVar, com.google.firebase.inappmessaging.model.m mVar) {
        return this.f122900b.a() - bVar.cf() > mVar.d();
    }

    private e3.b q() {
        return e3.b.hm().Rl(0L).Ql(this.f122900b.a()).build();
    }

    public io.reactivex.c m(final com.google.firebase.inappmessaging.model.m mVar) {
        return k().G(f122898d).f0(new dj.o() { // from class: com.google.firebase.inappmessaging.internal.i3
            @Override // dj.o
            public final Object apply(Object obj) {
                return o3.h(this.f122654a, mVar, (e3.d) obj);
            }
        });
    }

    public io.reactivex.k0<Boolean> p(final com.google.firebase.inappmessaging.model.m mVar) {
        return k().v1(io.reactivex.s.w0(e3.d.bm())).y0(new dj.o() { // from class: com.google.firebase.inappmessaging.internal.m3
            @Override // dj.o
            public final Object apply(Object obj) {
                return o3.i(this.f122865a, mVar, (e3.d) obj);
            }
        }).b0(new dj.r() { // from class: com.google.firebase.inappmessaging.internal.n3
            @Override // dj.r
            public final boolean test(Object obj) {
                return o3.b(this.f122887a, mVar, (e3.b) obj);
            }
        }).v0();
    }
}
