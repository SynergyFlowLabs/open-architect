package io.grpc.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes13.dex */
@gj.d
public final class i3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i3 f289263c = new i3(new io.grpc.b3[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.grpc.b3[] f289264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f289265b = new AtomicBoolean(false);

    @com.google.common.annotations.e
    i3(io.grpc.b3[] b3VarArr) {
        this.f289264a = b3VarArr;
    }

    public static i3 i(io.grpc.n[] nVarArr, io.grpc.a aVar, io.grpc.v1 v1Var) {
        i3 i3Var = new i3(nVarArr);
        for (io.grpc.n nVar : nVarArr) {
            nVar.n(aVar, v1Var);
        }
        return i3Var;
    }

    public static i3 j(List<? extends io.grpc.u2.a> list, String str, io.grpc.v1 v1Var) {
        if (list.isEmpty()) {
            return f289263c;
        }
        int size = list.size();
        io.grpc.b3[] b3VarArr = new io.grpc.b3[size];
        for (int i10 = 0; i10 < size; i10++) {
            b3VarArr[i10] = list.get(i10).a(str, v1Var);
        }
        return new i3(b3VarArr);
    }

    public void a() {
        for (io.grpc.b3 b3Var : this.f289264a) {
            ((io.grpc.n) b3Var).k();
        }
    }

    public void b(io.grpc.v1 v1Var) {
        for (io.grpc.b3 b3Var : this.f289264a) {
            ((io.grpc.n) b3Var).l(v1Var);
        }
    }

    public void c() {
        for (io.grpc.b3 b3Var : this.f289264a) {
            ((io.grpc.n) b3Var).m();
        }
    }

    @com.google.common.annotations.e
    public List<io.grpc.b3> d() {
        return new ArrayList(Arrays.asList(this.f289264a));
    }

    public void e(int i10) {
        for (io.grpc.b3 b3Var : this.f289264a) {
            b3Var.a(i10);
        }
    }

    public void f(int i10, long j10, long j11) {
        for (io.grpc.b3 b3Var : this.f289264a) {
            b3Var.b(i10, j10, j11);
        }
    }

    public void g(long j10) {
        for (io.grpc.b3 b3Var : this.f289264a) {
            b3Var.c(j10);
        }
    }

    public void h(long j10) {
        for (io.grpc.b3 b3Var : this.f289264a) {
            b3Var.d(j10);
        }
    }

    public void k(int i10) {
        for (io.grpc.b3 b3Var : this.f289264a) {
            b3Var.e(i10);
        }
    }

    public void l(int i10, long j10, long j11) {
        for (io.grpc.b3 b3Var : this.f289264a) {
            b3Var.f(i10, j10, j11);
        }
    }

    public void m(long j10) {
        for (io.grpc.b3 b3Var : this.f289264a) {
            b3Var.g(j10);
        }
    }

    public void n(long j10) {
        for (io.grpc.b3 b3Var : this.f289264a) {
            b3Var.h(j10);
        }
    }

    public void o(io.grpc.u2.c<?, ?> cVar) {
        for (io.grpc.b3 b3Var : this.f289264a) {
            ((io.grpc.u2) b3Var).l(cVar);
        }
    }

    public <ReqT, RespT> io.grpc.w p(io.grpc.w wVar) {
        io.grpc.w wVarJ = (io.grpc.w) com.google.common.base.j0.F(wVar, "context");
        for (io.grpc.b3 b3Var : this.f289264a) {
            wVarJ = ((io.grpc.u2) b3Var).j(wVarJ);
            com.google.common.base.j0.V(wVarJ, "%s returns null context", b3Var);
        }
        return wVarJ;
    }

    public void q(io.grpc.y2 y2Var) {
        if (this.f289265b.compareAndSet(false, true)) {
            for (io.grpc.b3 b3Var : this.f289264a) {
                b3Var.i(y2Var);
            }
        }
    }
}
