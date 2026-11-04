package io.reactivex.internal.operators.observable;

import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes10.dex */
public final class l {
    private l() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> void a(io.reactivex.g0<? extends T> g0Var) {
        io.reactivex.internal.util.f fVar = new io.reactivex.internal.util.f();
        io.reactivex.internal.observers.u uVar = new io.reactivex.internal.observers.u(io.reactivex.internal.functions.a.h(), fVar, fVar, io.reactivex.internal.functions.a.h());
        g0Var.a(uVar);
        io.reactivex.internal.util.e.a(fVar, uVar);
        Throwable th2 = fVar.f303478a;
        if (th2 != null) {
            throw io.reactivex.internal.util.k.f(th2);
        }
    }

    public static <T> void b(io.reactivex.g0<? extends T> g0Var, dj.g<? super T> gVar, dj.g<? super Throwable> gVar2, dj.a aVar) {
        io.reactivex.internal.functions.b.g(gVar, "onNext is null");
        io.reactivex.internal.functions.b.g(gVar2, "onError is null");
        io.reactivex.internal.functions.b.g(aVar, "onComplete is null");
        c(g0Var, new io.reactivex.internal.observers.u(gVar, gVar2, aVar, io.reactivex.internal.functions.a.h()));
    }

    public static <T> void c(io.reactivex.g0<? extends T> g0Var, io.reactivex.i0<? super T> i0Var) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        io.reactivex.internal.observers.i iVar = new io.reactivex.internal.observers.i(linkedBlockingQueue);
        i0Var.d(iVar);
        g0Var.a(iVar);
        while (!iVar.k()) {
            Object objPoll = linkedBlockingQueue.poll();
            if (objPoll == null) {
                try {
                    objPoll = linkedBlockingQueue.take();
                } catch (InterruptedException e10) {
                    iVar.dispose();
                    i0Var.onError(e10);
                    return;
                }
            }
            if (iVar.k() || g0Var == io.reactivex.internal.observers.i.f298755c || io.reactivex.internal.util.q.d(objPoll, i0Var)) {
                return;
            }
        }
    }
}
