package io.reactivex.internal.operators.observable;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes10.dex */
public final class o3<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f302093b;

    static final class a<T> extends ArrayDeque<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f302094e = 7240042530241604978L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f302096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f302097c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f302098d;

        a(io.reactivex.i0<? super T> i0Var, int i10) {
            this.f302095a = i0Var;
            this.f302096b = i10;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302097c, cVar)) {
                this.f302097c = cVar;
                this.f302095a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (this.f302098d) {
                return;
            }
            this.f302098d = true;
            this.f302097c.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302098d;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            io.reactivex.i0<? super T> i0Var = this.f302095a;
            while (!this.f302098d) {
                T tPoll = poll();
                if (tPoll == null) {
                    if (this.f302098d) {
                        return;
                    }
                    i0Var.onComplete();
                    return;
                }
                i0Var.onNext(tPoll);
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f302095a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f302096b == size()) {
                poll();
            }
            offer(t10);
        }
    }

    public o3(io.reactivex.g0<T> g0Var, int i10) {
        super(g0Var);
        this.f302093b = i10;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(i0Var, this.f302093b));
    }
}
