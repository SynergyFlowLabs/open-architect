package io.reactivex.internal.subscriptions;

import ej.l;
import org.reactivestreams.v;

/* JADX INFO: loaded from: classes11.dex */
public enum g implements l<Object> {
    INSTANCE;

    public static void b(v<?> vVar) {
        vVar.l(INSTANCE);
        vVar.onComplete();
    }

    public static void c(Throwable th2, v<?> vVar) {
        vVar.l(INSTANCE);
        vVar.onError(th2);
    }

    @Override // org.reactivestreams.w
    public void cancel() {
    }

    @Override // ej.o
    public void clear() {
    }

    @Override // ej.o
    public boolean isEmpty() {
        return true;
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
    public Object poll() {
        return null;
    }

    @Override // ej.o
    public boolean r(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.reactivestreams.w
    public void request(long j10) {
        j.p(j10);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }
}
