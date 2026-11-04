package io.grpc.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class f2 extends io.grpc.p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f289191b = "shuffleAddressList";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f289192c;

    static {
        f289192c = !com.google.common.base.r0.d(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST")) && Boolean.parseBoolean(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST"));
    }

    @Override // io.grpc.o1.d
    public io.grpc.o1 a(io.grpc.o1.f fVar) {
        return f289192c ? new c2(fVar) : new e2(fVar);
    }

    @Override // io.grpc.p1
    public String b() {
        return v0.H;
    }

    @Override // io.grpc.p1
    public int c() {
        return 5;
    }

    @Override // io.grpc.p1
    public boolean d() {
        return true;
    }

    @Override // io.grpc.p1
    public io.grpc.x1.c e(Map<String, ?> map) {
        try {
            return io.grpc.x1.c.a(new e2.c(h1.d(map, f289191b)));
        } catch (RuntimeException e10) {
            return io.grpc.x1.c.b(io.grpc.y2.f291465t.t(e10).u("Failed parsing configuration for " + b()));
        }
    }
}
