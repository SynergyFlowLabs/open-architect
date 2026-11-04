package io.reactivex.internal.subscriptions;

import ej.l;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.v;

/* JADX INFO: loaded from: classes11.dex */
public final class h<T> extends AtomicInteger implements l<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f303454c = -3830916580126663321L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f303455d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f303456e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f303457f = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final T f303458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final v<? super T> f303459b;

    public h(v<? super T> vVar, T t10) {
        this.f303459b = vVar;
        this.f303458a = t10;
    }

    public boolean a() {
        return get() == 2;
    }

    @Override // org.reactivestreams.w
    public void cancel() {
        lazySet(2);
    }

    @Override // ej.o
    public void clear() {
        lazySet(1);
    }

    @Override // ej.o
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // ej.o
    public boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // ej.k
    public int p(int i10) {
        return i10 & 1;
    }

    @Override // ej.o
    @cj.g
    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f303458a;
    }

    @Override // ej.o
    public boolean r(T t10, T t11) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.reactivestreams.w
    public void request(long j10) {
        if (j.p(j10) && compareAndSet(0, 1)) {
            v<? super T> vVar = this.f303459b;
            vVar.onNext(this.f303458a);
            if (get() != 2) {
                vVar.onComplete();
            }
        }
    }
}
