package io.grpc.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
@com.google.common.annotations.e
public final class r2 extends io.grpc.x1.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f289783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f289784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f289785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j f289786d;

    public r2(boolean z10, int i10, int i11, j jVar) {
        this.f289783a = z10;
        this.f289784b = i10;
        this.f289785c = i11;
        this.f289786d = (j) com.google.common.base.j0.F(jVar, "autoLoadBalancerFactory");
    }

    @Override // io.grpc.x1.i
    public io.grpc.x1.c a(Map<String, ?> map) {
        Object objC;
        try {
            io.grpc.x1.c cVarF = this.f289786d.f(map);
            if (cVarF == null) {
                objC = null;
            } else {
                if (cVarF.d() != null) {
                    return io.grpc.x1.c.b(cVarF.d());
                }
                objC = cVarF.c();
            }
            return io.grpc.x1.c.a(q1.b(map, this.f289783a, this.f289784b, this.f289785c, objC));
        } catch (RuntimeException e10) {
            return io.grpc.x1.c.b(io.grpc.y2.f291452g.u("failed to parse service config").t(e10));
        }
    }
}
