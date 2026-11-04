package io.grpc.util;

import com.google.common.base.j0;
import io.grpc.e0;
import io.grpc.o1;
import io.grpc.u;
import io.grpc.v;
import io.grpc.y2;

/* JADX INFO: loaded from: classes13.dex */
@gj.c
@e0("https://github.com/grpc/grpc-java/issues/5999")
public final class h extends e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @com.google.common.annotations.e
    static final o1.k f291024p = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o1 f291025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o1.f f291026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @fj.h
    private o1.d f291027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private o1 f291028j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @fj.h
    private o1.d f291029k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private o1 f291030l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private u f291031m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o1.k f291032n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f291033o;

    class a extends o1 {
        a() {
        }

        @Override // io.grpc.o1
        public void c(y2 y2Var) {
            h.this.f291026h.q(u.TRANSIENT_FAILURE, new o1.e(o1.g.f(y2Var)));
        }

        @Override // io.grpc.o1
        public void d(o1.i iVar) {
            throw new IllegalStateException("GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses");
        }

        @Override // io.grpc.o1
        public void g() {
        }
    }

    class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        o1 f291035a;

        b() {
        }

        @Override // io.grpc.util.f, io.grpc.o1.f
        public void q(u uVar, o1.k kVar) {
            if (this.f291035a == h.this.f291030l) {
                j0.h0(h.this.f291033o, "there's pending lb while current lb has been out of READY");
                h.this.f291031m = uVar;
                h.this.f291032n = kVar;
                if (uVar == u.READY) {
                    h.this.s();
                    return;
                }
                return;
            }
            if (this.f291035a == h.this.f291028j) {
                h.this.f291033o = uVar == u.READY;
                if (h.this.f291033o || h.this.f291030l == h.this.f291025g) {
                    h.this.f291026h.q(uVar, kVar);
                } else {
                    h.this.s();
                }
            }
        }

        @Override // io.grpc.util.f
        protected o1.f t() {
            return h.this.f291026h;
        }
    }

    class c extends o1.k {
        c() {
        }

        @Override // io.grpc.o1.k
        public o1.g a(o1.h hVar) {
            return o1.g.g();
        }

        public String toString() {
            return "BUFFER_PICKER";
        }
    }

    public h(o1.f fVar) {
        a aVar = new a();
        this.f291025g = aVar;
        this.f291028j = aVar;
        this.f291030l = aVar;
        this.f291026h = (o1.f) j0.F(fVar, "helper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        this.f291026h.q(this.f291031m, this.f291032n);
        this.f291028j.g();
        this.f291028j = this.f291030l;
        this.f291027i = this.f291029k;
        this.f291030l = this.f291025g;
        this.f291029k = null;
    }

    @Override // io.grpc.util.e, io.grpc.o1
    @Deprecated
    public void e(o1.j jVar, v vVar) {
        throw new UnsupportedOperationException("handleSubchannelState() is not supported by " + h.class.getName());
    }

    @Override // io.grpc.util.e, io.grpc.o1
    public void g() {
        this.f291030l.g();
        this.f291028j.g();
    }

    @Override // io.grpc.util.e
    protected o1 h() {
        o1 o1Var = this.f291030l;
        return o1Var == this.f291025g ? this.f291028j : o1Var;
    }

    public String r() {
        return h().getClass().getSimpleName();
    }

    public void t(o1.d dVar) {
        j0.F(dVar, "newBalancerFactory");
        if (dVar.equals(this.f291029k)) {
            return;
        }
        this.f291030l.g();
        this.f291030l = this.f291025g;
        this.f291029k = null;
        this.f291031m = u.CONNECTING;
        this.f291032n = f291024p;
        if (dVar.equals(this.f291027i)) {
            return;
        }
        b bVar = new b();
        o1 o1VarA = dVar.a(bVar);
        bVar.f291035a = o1VarA;
        this.f291030l = o1VarA;
        this.f291029k = dVar;
        if (this.f291033o) {
            return;
        }
        s();
    }
}
