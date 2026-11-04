package io.grpc.util;

import com.google.common.base.b0;
import io.grpc.c3;
import io.grpc.d0;
import io.grpc.e0;
import io.grpc.o1;
import io.grpc.r1;
import io.grpc.s1;
import io.grpc.u;
import io.grpc.x1;
import io.grpc.z1;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes13.dex */
@e0("https://github.com/grpc/grpc-java/issues/1771")
public abstract class f extends o1.f {
    @Override // io.grpc.o1.f
    public r1 a(d0 d0Var, String str) {
        return t().a(d0Var, str);
    }

    @Override // io.grpc.o1.f
    public r1 b(List<d0> list, String str) {
        return t().b(list, str);
    }

    @Override // io.grpc.o1.f
    public r1 c(String str) {
        return t().c(str);
    }

    @Override // io.grpc.o1.f
    @Deprecated
    public s1<?> d(String str) {
        return t().d(str);
    }

    @Override // io.grpc.o1.f
    public s1<?> e(String str, io.grpc.g gVar) {
        return t().e(str, gVar);
    }

    @Override // io.grpc.o1.f
    public o1.j f(o1.b bVar) {
        return t().f(bVar);
    }

    @Override // io.grpc.o1.f
    public String g() {
        return t().g();
    }

    @Override // io.grpc.o1.f
    public io.grpc.g h() {
        return t().h();
    }

    @Override // io.grpc.o1.f
    public io.grpc.h i() {
        return t().i();
    }

    @Override // io.grpc.o1.f
    public x1.b j() {
        return t().j();
    }

    @Override // io.grpc.o1.f
    public z1 k() {
        return t().k();
    }

    @Override // io.grpc.o1.f
    public ScheduledExecutorService l() {
        return t().l();
    }

    @Override // io.grpc.o1.f
    public c3 m() {
        return t().m();
    }

    @Override // io.grpc.o1.f
    public io.grpc.g n() {
        return t().n();
    }

    @Override // io.grpc.o1.f
    @Deprecated
    public void o() {
        t().o();
    }

    @Override // io.grpc.o1.f
    public void p() {
        t().p();
    }

    @Override // io.grpc.o1.f
    public void q(u uVar, o1.k kVar) {
        t().q(uVar, kVar);
    }

    @Override // io.grpc.o1.f
    public void r(r1 r1Var, d0 d0Var) {
        t().r(r1Var, d0Var);
    }

    @Override // io.grpc.o1.f
    public void s(r1 r1Var, List<d0> list) {
        t().s(r1Var, list);
    }

    protected abstract o1.f t();

    public String toString() {
        return b0.c(this).f("delegate", t()).toString();
    }
}
