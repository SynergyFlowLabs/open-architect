package io.reactivex.internal.disposables;

import ej.j;
import io.reactivex.i0;
import io.reactivex.n0;
import io.reactivex.v;

/* JADX INFO: loaded from: classes8.dex */
public enum e implements j<Object> {
    INSTANCE,
    NEVER;

    public static void b(io.reactivex.f fVar) {
        fVar.d(INSTANCE);
        fVar.onComplete();
    }

    public static void c(v<?> vVar) {
        vVar.d(INSTANCE);
        vVar.onComplete();
    }

    public static void d(i0<?> i0Var) {
        i0Var.d(INSTANCE);
        i0Var.onComplete();
    }

    public static void e(Throwable th2, io.reactivex.f fVar) {
        fVar.d(INSTANCE);
        fVar.onError(th2);
    }

    public static void f(Throwable th2, v<?> vVar) {
        vVar.d(INSTANCE);
        vVar.onError(th2);
    }

    public static void l(Throwable th2, i0<?> i0Var) {
        i0Var.d(INSTANCE);
        i0Var.onError(th2);
    }

    public static void o(Throwable th2, n0<?> n0Var) {
        n0Var.d(INSTANCE);
        n0Var.onError(th2);
    }

    @Override // ej.o
    public void clear() {
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
    }

    @Override // ej.o
    public boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return this == INSTANCE;
    }

    @Override // ej.o
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // ej.k
    public int p(int i10) {
        return i10 & 2;
    }

    @Override // ej.o
    @cj.g
    public Object poll() throws Exception {
        return null;
    }

    @Override // ej.o
    public boolean r(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
