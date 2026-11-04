package io.grpc.util;

import com.google.common.base.b0;
import io.grpc.d0;
import io.grpc.e0;
import io.grpc.o1;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@e0("https://github.com/grpc/grpc-java/issues/1771")
public abstract class g extends o1.j {
    @Override // io.grpc.o1.j
    public io.grpc.f a() {
        return k().a();
    }

    @Override // io.grpc.o1.j
    public List<d0> c() {
        return k().c();
    }

    @Override // io.grpc.o1.j
    public io.grpc.a d() {
        return k().d();
    }

    @Override // io.grpc.o1.j
    public io.grpc.h e() {
        return k().e();
    }

    @Override // io.grpc.o1.j
    public Object f() {
        return k().f();
    }

    @Override // io.grpc.o1.j
    public void g() {
        k().g();
    }

    @Override // io.grpc.o1.j
    public void h() {
        k().h();
    }

    @Override // io.grpc.o1.j
    public void i(o1.l lVar) {
        k().i(lVar);
    }

    @Override // io.grpc.o1.j
    public void j(List<d0> list) {
        k().j(list);
    }

    protected abstract o1.j k();

    public String toString() {
        return b0.c(this).f("delegate", k()).toString();
    }
}
