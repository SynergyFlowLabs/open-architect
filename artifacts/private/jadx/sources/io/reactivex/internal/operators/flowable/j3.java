package io.reactivex.internal.operators.flowable;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class j3 {

    static final class a<T, R> extends io.reactivex.l<R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final T f299601b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> f299602c;

        a(T t10, dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar) {
            this.f299601b = t10;
            this.f299602c = oVar;
        }

        @Override // io.reactivex.l
        public void k6(org.reactivestreams.v<? super R> vVar) {
            try {
                org.reactivestreams.u uVar = (org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.f299602c.apply(this.f299601b), "The mapper returned a null Publisher");
                if (!(uVar instanceof Callable)) {
                    uVar.e(vVar);
                    return;
                }
                try {
                    Object objCall = ((Callable) uVar).call();
                    if (objCall == null) {
                        io.reactivex.internal.subscriptions.g.b(vVar);
                    } else {
                        vVar.l(new io.reactivex.internal.subscriptions.h(vVar, objCall));
                    }
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    io.reactivex.internal.subscriptions.g.c(th2, vVar);
                }
            } catch (Throwable th3) {
                io.reactivex.internal.subscriptions.g.c(th3, vVar);
            }
        }
    }

    private j3() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> io.reactivex.l<U> a(T t10, dj.o<? super T, ? extends org.reactivestreams.u<? extends U>> oVar) {
        return io.reactivex.plugins.a.P(new a(t10, oVar));
    }

    public static <T, R> boolean b(org.reactivestreams.u<T> uVar, org.reactivestreams.v<? super R> vVar, dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar) {
        if (!(uVar instanceof Callable)) {
            return false;
        }
        try {
            a0.b bVar = (Object) ((Callable) uVar).call();
            if (bVar == null) {
                io.reactivex.internal.subscriptions.g.b(vVar);
                return true;
            }
            try {
                org.reactivestreams.u uVar2 = (org.reactivestreams.u) io.reactivex.internal.functions.b.g(oVar.apply(bVar), "The mapper returned a null Publisher");
                if (uVar2 instanceof Callable) {
                    try {
                        Object objCall = ((Callable) uVar2).call();
                        if (objCall == null) {
                            io.reactivex.internal.subscriptions.g.b(vVar);
                            return true;
                        }
                        vVar.l(new io.reactivex.internal.subscriptions.h(vVar, objCall));
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.b.b(th2);
                        io.reactivex.internal.subscriptions.g.c(th2, vVar);
                        return true;
                    }
                } else {
                    uVar2.e(vVar);
                }
                return true;
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                io.reactivex.internal.subscriptions.g.c(th3, vVar);
                return true;
            }
        } catch (Throwable th4) {
            io.reactivex.exceptions.b.b(th4);
            io.reactivex.internal.subscriptions.g.c(th4, vVar);
            return true;
        }
    }
}
