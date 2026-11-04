package io.reactivex.internal.subscriptions;

import org.reactivestreams.v;

/* JADX INFO: loaded from: classes11.dex */
public class f<T> extends c<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f303441d = -2151279923272604993L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f303442e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f303443f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f303444g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f303445h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f303446i = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final int f303447j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final int f303448k = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final int f303449l = 32;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final v<? super T> f303450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected T f303451c;

    public f(v<? super T> vVar) {
        this.f303450b = vVar;
    }

    public void cancel() {
        set(4);
        this.f303451c = null;
    }

    @Override // ej.o
    public final void clear() {
        lazySet(32);
        this.f303451c = null;
    }

    public final void f(T t10) {
        int i10 = get();
        while (i10 != 8) {
            if ((i10 & (-3)) != 0) {
                return;
            }
            if (i10 == 2) {
                lazySet(3);
                v<? super T> vVar = this.f303450b;
                vVar.onNext(t10);
                if (get() != 4) {
                    vVar.onComplete();
                    return;
                }
                return;
            }
            this.f303451c = t10;
            if (compareAndSet(0, 1)) {
                return;
            }
            i10 = get();
            if (i10 == 4) {
                this.f303451c = null;
                return;
            }
        }
        this.f303451c = t10;
        lazySet(16);
        v<? super T> vVar2 = this.f303450b;
        vVar2.onNext(t10);
        if (get() != 4) {
            vVar2.onComplete();
        }
    }

    public final boolean g() {
        if (get() != 4) {
            return false;
        }
        int i10 = 2 | 1;
        return true;
    }

    public final boolean h() {
        return getAndSet(4) != 4;
    }

    @Override // ej.o
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // ej.k
    public final int p(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    @Override // ej.o
    @cj.g
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t10 = this.f303451c;
        this.f303451c = null;
        return t10;
    }

    @Override // org.reactivestreams.w
    public final void request(long j10) {
        T t10;
        if (j.p(j10)) {
            do {
                int i10 = get();
                if ((i10 & (-2)) != 0) {
                    return;
                }
                if (i10 == 1) {
                    if (!compareAndSet(1, 3) || (t10 = this.f303451c) == null) {
                        return;
                    }
                    this.f303451c = null;
                    v<? super T> vVar = this.f303450b;
                    vVar.onNext(t10);
                    if (get() != 4) {
                        vVar.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }
}
