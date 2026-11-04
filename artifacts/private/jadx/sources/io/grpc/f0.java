package io.grpc;

import io.grpc.s1;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public abstract class f0<T extends s1<T>> extends s1<T> {
    protected f0() {
    }

    private T F() {
        return this;
    }

    @z7.e("Unsupported")
    public static s1<?> l(String str, int i10) {
        throw new UnsupportedOperationException("Subclass failed to hide static factory");
    }

    @z7.e("Unsupported")
    public static s1<?> m(String str) {
        throw new UnsupportedOperationException("Subclass failed to hide static factory");
    }

    @Override // io.grpc.s1
    public T A(String str) {
        J().A(str);
        return (T) F();
    }

    @Override // io.grpc.s1
    public T B(long j10) {
        J().B(j10);
        return (T) F();
    }

    @Override // io.grpc.s1
    public T C(g2 g2Var) {
        J().C(g2Var);
        return (T) F();
    }

    @Override // io.grpc.s1
    public T D(long j10) {
        J().D(j10);
        return (T) F();
    }

    @Override // io.grpc.s1
    public T E(b bVar) {
        J().E(bVar);
        return (T) F();
    }

    @Override // io.grpc.s1
    public T G() {
        J().G();
        return (T) F();
    }

    @Override // io.grpc.s1
    public T H() {
        J().H();
        return (T) F();
    }

    @Override // io.grpc.s1
    public T I(String str) {
        J().I(str);
        return (T) F();
    }

    protected abstract s1<?> J();

    @Override // io.grpc.s1
    public T a(o oVar) {
        J().a(oVar);
        return (T) F();
    }

    @Override // io.grpc.s1
    public r1 b() {
        return J().b();
    }

    @Override // io.grpc.s1
    public T c(t tVar) {
        J().c(tVar);
        return (T) F();
    }

    @Override // io.grpc.s1
    public T d(a0 a0Var) {
        J().d(a0Var);
        return (T) F();
    }

    @Override // io.grpc.s1
    public T e(String str) {
        J().e(str);
        return (T) F();
    }

    @Override // io.grpc.s1
    public T f(@fj.h Map<String, ?> map) {
        J().f(map);
        return (T) F();
    }

    @Override // io.grpc.s1
    public T g() {
        J().g();
        return (T) F();
    }

    @Override // io.grpc.s1
    public T h() {
        J().h();
        return (T) F();
    }

    @Override // io.grpc.s1
    public T i() {
        J().i();
        return (T) F();
    }

    @Override // io.grpc.s1
    public T j() {
        J().j();
        return (T) F();
    }

    @Override // io.grpc.s1
    public T k(Executor executor) {
        J().k(executor);
        return (T) F();
    }

    @Override // io.grpc.s1
    public T n(long j10, TimeUnit timeUnit) {
        J().n(j10, timeUnit);
        return (T) F();
    }

    @Override // io.grpc.s1
    public T o(List<l> list) {
        J().o(list);
        return (T) F();
    }

    @Override // io.grpc.s1
    public T p(l... lVarArr) {
        J().p(lVarArr);
        return (T) F();
    }

    @Override // io.grpc.s1
    public T q(long j10, TimeUnit timeUnit) {
        J().q(j10, timeUnit);
        return (T) F();
    }

    @Override // io.grpc.s1
    public T r(long j10, TimeUnit timeUnit) {
        J().r(j10, timeUnit);
        return (T) F();
    }

    @Override // io.grpc.s1
    public T s(boolean z10) {
        J().s(z10);
        return (T) F();
    }

    @Override // io.grpc.s1
    public T t(int i10) {
        J().t(i10);
        return (T) F();
    }

    public String toString() {
        return com.google.common.base.b0.c(this).f("delegate", J()).toString();
    }

    @Override // io.grpc.s1
    public T u(int i10) {
        J().u(i10);
        return (T) F();
    }

    @Override // io.grpc.s1
    public T v(int i10) {
        J().v(i10);
        return (T) F();
    }

    @Override // io.grpc.s1
    public T w(int i10) {
        J().w(i10);
        return (T) F();
    }

    @Override // io.grpc.s1
    public T x(int i10) {
        J().x(i10);
        return (T) F();
    }

    @Override // io.grpc.s1
    @Deprecated
    public T y(x1.d dVar) {
        J().y(dVar);
        return (T) F();
    }

    @Override // io.grpc.s1
    public T z(Executor executor) {
        J().z(executor);
        return (T) F();
    }
}
