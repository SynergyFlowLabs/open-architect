package io.grpc.stub;

import com.appsflyer.AppsFlyerProperties;
import com.google.common.base.j0;
import io.grpc.e0;
import io.grpc.stub.d;
import io.grpc.y;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
@fj.c
@gj.d
public abstract class d<S extends d<S>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.grpc.f f290897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.grpc.e f290898b;

    public interface a<T extends d<T>> {
        T a(io.grpc.f fVar, io.grpc.e eVar);
    }

    protected d(io.grpc.f fVar) {
        this(fVar, io.grpc.e.f288718k);
    }

    public static <T extends d<T>> T d(a<T> aVar, io.grpc.f fVar) {
        return (T) e(aVar, fVar, io.grpc.e.f288718k);
    }

    public static <T extends d<T>> T e(a<T> aVar, io.grpc.f fVar, io.grpc.e eVar) {
        return (T) aVar.a(fVar, eVar);
    }

    protected abstract S a(io.grpc.f fVar, io.grpc.e eVar);

    public final io.grpc.e b() {
        return this.f290898b;
    }

    public final io.grpc.f c() {
        return this.f290897a;
    }

    public final S f(io.grpc.d dVar) {
        return (S) a(this.f290897a, this.f290898b.n(dVar));
    }

    @Deprecated
    public final S g(io.grpc.f fVar) {
        return (S) a(fVar, this.f290898b);
    }

    public final S h(String str) {
        return (S) a(this.f290897a, this.f290898b.o(str));
    }

    public final S i(@fj.h y yVar) {
        return (S) a(this.f290897a, this.f290898b.p(yVar));
    }

    public final S j(long j10, TimeUnit timeUnit) {
        return (S) a(this.f290897a, this.f290898b.q(j10, timeUnit));
    }

    public final S k(Executor executor) {
        return (S) a(this.f290897a, this.f290898b.r(executor));
    }

    public final S l(io.grpc.l... lVarArr) {
        return (S) a(io.grpc.m.c(this.f290897a, lVarArr), this.f290898b);
    }

    @e0("https://github.com/grpc/grpc-java/issues/2563")
    public final S m(int i10) {
        return (S) a(this.f290897a, this.f290898b.s(i10));
    }

    @e0("https://github.com/grpc/grpc-java/issues/2563")
    public final S n(int i10) {
        return (S) a(this.f290897a, this.f290898b.t(i10));
    }

    @e0("https://github.com/grpc/grpc-java/issues/1869")
    public final <T> S o(io.grpc.e.c<T> cVar, T t10) {
        return (S) a(this.f290897a, this.f290898b.u(cVar, t10));
    }

    public final S p() {
        return (S) a(this.f290897a, this.f290898b.w());
    }

    protected d(io.grpc.f fVar, io.grpc.e eVar) {
        this.f290897a = (io.grpc.f) j0.F(fVar, AppsFlyerProperties.CHANNEL);
        this.f290898b = (io.grpc.e) j0.F(eVar, "callOptions");
    }
}
