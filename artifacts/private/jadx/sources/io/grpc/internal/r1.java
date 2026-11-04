package io.grpc.internal;

/* JADX INFO: loaded from: classes13.dex */
@gj.d
public interface r1 extends u {

    public interface a {
        void a();

        void b(io.grpc.y2 y2Var);

        void c();

        void d(boolean z10);

        default io.grpc.a e(io.grpc.a aVar) {
            return aVar;
        }
    }

    void a(io.grpc.y2 y2Var);

    @fj.h
    @fj.c
    Runnable f(a aVar);

    void h(io.grpc.y2 y2Var);
}
