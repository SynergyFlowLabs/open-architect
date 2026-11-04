package io.codetail.animation;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes13.dex */
final class d extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.nineoldandroids.animation.a f288272b;

    class a implements com.nineoldandroids.animation.a.InterfaceC1443a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b.a f288273a;

        a(b.a aVar) {
            this.f288273a = aVar;
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC1443a
        public void a(com.nineoldandroids.animation.a aVar) {
            this.f288273a.d();
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC1443a
        public void b(com.nineoldandroids.animation.a aVar) {
            this.f288273a.a();
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC1443a
        public void d(com.nineoldandroids.animation.a aVar) {
            this.f288273a.b();
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC1443a
        public void e(com.nineoldandroids.animation.a aVar) {
            this.f288273a.c();
        }
    }

    d(com.nineoldandroids.animation.a aVar, io.codetail.animation.a aVar2) {
        super(aVar2);
        this.f288272b = aVar;
    }

    @Override // io.codetail.animation.b
    public void a(b.a aVar) {
        if (aVar == null) {
            this.f288272b.a(null);
        } else {
            this.f288272b.a(new a(aVar));
        }
    }

    @Override // io.codetail.animation.b
    public void b() {
        this.f288272b.cancel();
    }

    @Override // io.codetail.animation.b
    public void c() {
        this.f288272b.c();
    }

    @Override // io.codetail.animation.b
    public Object d() {
        return this.f288272b;
    }

    @Override // io.codetail.animation.b
    public boolean e() {
        return false;
    }

    @Override // io.codetail.animation.b
    public boolean f() {
        return this.f288272b.g();
    }

    @Override // io.codetail.animation.b
    public void h(int i10) {
        this.f288272b.k(i10);
    }

    @Override // io.codetail.animation.b
    public void i(Interpolator interpolator) {
        this.f288272b.l(interpolator);
    }

    @Override // io.codetail.animation.b
    public void j() {
        this.f288272b.p();
    }

    @Override // io.codetail.animation.b
    public void k() {
        this.f288272b.q();
    }

    @Override // io.codetail.animation.b
    public void l() {
        this.f288272b.r();
    }
}
