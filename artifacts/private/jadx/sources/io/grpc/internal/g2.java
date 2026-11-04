package io.grpc.internal;

/* JADX INFO: loaded from: classes13.dex */
public final class g2 extends io.grpc.o1.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.grpc.e f289218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.grpc.v1 f289219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.grpc.w1<?, ?> f289220c;

    public g2(io.grpc.w1<?, ?> w1Var, io.grpc.v1 v1Var, io.grpc.e eVar) {
        this.f289220c = (io.grpc.w1) com.google.common.base.j0.F(w1Var, "method");
        this.f289219b = (io.grpc.v1) com.google.common.base.j0.F(v1Var, "headers");
        this.f289218a = (io.grpc.e) com.google.common.base.j0.F(eVar, "callOptions");
    }

    @Override // io.grpc.o1.h
    public io.grpc.e a() {
        return this.f289218a;
    }

    @Override // io.grpc.o1.h
    public io.grpc.v1 b() {
        return this.f289219b;
    }

    @Override // io.grpc.o1.h
    public io.grpc.w1<?, ?> c() {
        return this.f289220c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g2.class == obj.getClass()) {
            g2 g2Var = (g2) obj;
            if (com.google.common.base.d0.a(this.f289218a, g2Var.f289218a) && com.google.common.base.d0.a(this.f289219b, g2Var.f289219b) && com.google.common.base.d0.a(this.f289220c, g2Var.f289220c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return com.google.common.base.d0.b(this.f289218a, this.f289219b, this.f289220c);
    }

    public final String toString() {
        return "[method=" + this.f289220c + " headers=" + this.f289219b + " callOptions=" + this.f289218a + "]";
    }
}
