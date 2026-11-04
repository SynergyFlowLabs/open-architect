package io.reactivex.internal.operators.flowable;

import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class n0<T, K> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, K> f299840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Callable<? extends Collection<? super K>> f299841d;

    static final class a<T, K> extends io.reactivex.internal.subscribers.b<T, T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Collection<? super K> f299842f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final dj.o<? super T, K> f299843g;

        a(org.reactivestreams.v<? super T> vVar, dj.o<? super T, K> oVar, Collection<? super K> collection) {
            super(vVar);
            this.f299843g = oVar;
            this.f299842f = collection;
        }

        @Override // io.reactivex.internal.subscribers.b, ej.o
        public void clear() {
            this.f299842f.clear();
            super.clear();
        }

        @Override // io.reactivex.internal.subscribers.b, org.reactivestreams.v
        public void onComplete() {
            if (this.f303334d) {
                return;
            }
            this.f303334d = true;
            this.f299842f.clear();
            this.f303331a.onComplete();
        }

        @Override // io.reactivex.internal.subscribers.b, org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f303334d) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f303334d = true;
            this.f299842f.clear();
            this.f303331a.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f303334d) {
                return;
            }
            if (this.f303335e != 0) {
                this.f303331a.onNext(null);
                return;
            }
            try {
                if (this.f299842f.add(io.reactivex.internal.functions.b.g(this.f299843g.apply(t10), "The keySelector returned a null key"))) {
                    this.f303331a.onNext((Object) t10);
                } else {
                    this.f303332b.request(1L);
                }
            } catch (Throwable th2) {
                c(th2);
            }
        }

        @Override // ej.k
        public int p(int i10) {
            return d(i10);
        }

        @Override // ej.o
        @cj.g
        public T poll() throws Exception {
            T tPoll;
            while (true) {
                tPoll = this.f303333c.poll();
                if (tPoll == null || this.f299842f.add((Object) io.reactivex.internal.functions.b.g(this.f299843g.apply(tPoll), "The keySelector returned a null key"))) {
                    break;
                }
                if (this.f303335e == 2) {
                    this.f303332b.request(1L);
                }
            }
            return tPoll;
        }
    }

    public n0(io.reactivex.l<T> lVar, dj.o<? super T, K> oVar, Callable<? extends Collection<? super K>> callable) {
        super(lVar);
        this.f299840c = oVar;
        this.f299841d = callable;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        try {
            this.f299043b.j6(new a(vVar, this.f299840c, (Collection) io.reactivex.internal.functions.b.g(this.f299841d.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.subscriptions.g.c(th2, vVar);
        }
    }
}
