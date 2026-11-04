package io.grpc;

import io.grpc.j2;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public abstract class j0<T extends j2<T>> extends j2<T> {
    protected j0() {
    }

    @z7.e("Unsupported")
    public static j2<?> m(int i10) {
        throw new UnsupportedOperationException("Subclass failed to hide static factory");
    }

    private T z() {
        return this;
    }

    @Override // io.grpc.j2
    public T A(File file, File file2) {
        C().A(file, file2);
        return (T) z();
    }

    @Override // io.grpc.j2
    public T B(InputStream inputStream, InputStream inputStream2) {
        C().B(inputStream, inputStream2);
        return (T) z();
    }

    protected abstract j2<?> C();

    @Override // io.grpc.j2
    public T a(c cVar) {
        C().a(cVar);
        return (T) z();
    }

    @Override // io.grpc.j2
    public T b(t2 t2Var) {
        C().b(t2Var);
        return (T) z();
    }

    @Override // io.grpc.j2
    public T d(u2.a aVar) {
        C().d(aVar);
        return (T) z();
    }

    @Override // io.grpc.j2
    public T e(v2 v2Var) {
        C().e(v2Var);
        return (T) z();
    }

    @Override // io.grpc.j2
    public i2 f() {
        return C().f();
    }

    @Override // io.grpc.j2
    public T g(l2 l2Var) {
        C().g(l2Var);
        return (T) z();
    }

    @Override // io.grpc.j2
    public T h(@fj.h t tVar) {
        C().h(tVar);
        return (T) z();
    }

    @Override // io.grpc.j2
    public T i(@fj.h a0 a0Var) {
        C().i(a0Var);
        return (T) z();
    }

    @Override // io.grpc.j2
    public T j() {
        C().j();
        return (T) z();
    }

    @Override // io.grpc.j2
    public T k(@fj.h Executor executor) {
        C().k(executor);
        return (T) z();
    }

    @Override // io.grpc.j2
    public T l(@fj.h o0 o0Var) {
        C().l(o0Var);
        return (T) z();
    }

    @Override // io.grpc.j2
    public T n(long j10, TimeUnit timeUnit) {
        C().n(j10, timeUnit);
        return (T) z();
    }

    @Override // io.grpc.j2
    public T o(o2 o2Var) {
        C().o(o2Var);
        return (T) z();
    }

    @Override // io.grpc.j2
    public T p(long j10, TimeUnit timeUnit) {
        C().p(j10, timeUnit);
        return (T) z();
    }

    @Override // io.grpc.j2
    public T q(long j10, TimeUnit timeUnit) {
        C().q(j10, timeUnit);
        return (T) z();
    }

    @Override // io.grpc.j2
    public T r(long j10, TimeUnit timeUnit) {
        C().r(j10, timeUnit);
        return (T) z();
    }

    @Override // io.grpc.j2
    public T s(long j10, TimeUnit timeUnit) {
        C().s(j10, timeUnit);
        return (T) z();
    }

    @Override // io.grpc.j2
    public T t(long j10, TimeUnit timeUnit) {
        C().t(j10, timeUnit);
        return (T) z();
    }

    public String toString() {
        return com.google.common.base.b0.c(this).f("delegate", C()).toString();
    }

    @Override // io.grpc.j2
    public T u(int i10) {
        C().u(i10);
        return (T) z();
    }

    @Override // io.grpc.j2
    public T v(int i10) {
        C().v(i10);
        return (T) z();
    }

    @Override // io.grpc.j2
    public T w(long j10, TimeUnit timeUnit) {
        C().w(j10, timeUnit);
        return (T) z();
    }

    @Override // io.grpc.j2
    public T x(boolean z10) {
        C().x(z10);
        return (T) z();
    }

    @Override // io.grpc.j2
    public T y(b bVar) {
        C().y(bVar);
        return (T) z();
    }
}
