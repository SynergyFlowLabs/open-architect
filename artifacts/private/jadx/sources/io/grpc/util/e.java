package io.grpc.util;

import com.google.common.base.b0;
import io.grpc.e0;
import io.grpc.o1;
import io.grpc.v;
import io.grpc.y2;

/* JADX INFO: loaded from: classes13.dex */
@e0("https://github.com/grpc/grpc-java/issues/1771")
public abstract class e extends o1 {
    @Override // io.grpc.o1
    public boolean b() {
        return h().b();
    }

    @Override // io.grpc.o1
    public void c(y2 y2Var) {
        h().c(y2Var);
    }

    @Override // io.grpc.o1
    public void d(o1.i iVar) {
        h().d(iVar);
    }

    @Override // io.grpc.o1
    @Deprecated
    public void e(o1.j jVar, v vVar) {
        h().e(jVar, vVar);
    }

    @Override // io.grpc.o1
    public void f() {
        h().f();
    }

    @Override // io.grpc.o1
    public void g() {
        h().g();
    }

    protected abstract o1 h();

    public String toString() {
        return b0.c(this).f("delegate", h()).toString();
    }
}
