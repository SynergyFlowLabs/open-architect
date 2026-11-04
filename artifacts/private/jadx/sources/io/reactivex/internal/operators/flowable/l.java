package io.reactivex.internal.operators.flowable;

import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes10.dex */
public final class l {
    private l() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> void a(org.reactivestreams.u<? extends T> uVar) {
        io.reactivex.internal.util.f fVar = new io.reactivex.internal.util.f();
        io.reactivex.internal.subscribers.m mVar = new io.reactivex.internal.subscribers.m(io.reactivex.internal.functions.a.h(), fVar, fVar, io.reactivex.internal.functions.a.f298701l);
        uVar.e(mVar);
        io.reactivex.internal.util.e.a(fVar, mVar);
        Throwable th2 = fVar.f303478a;
        if (th2 != null) {
            throw io.reactivex.internal.util.k.f(th2);
        }
    }

    public static <T> void b(org.reactivestreams.u<? extends T> uVar, dj.g<? super T> gVar, dj.g<? super Throwable> gVar2, dj.a aVar) {
        io.reactivex.internal.functions.b.g(gVar, "onNext is null");
        io.reactivex.internal.functions.b.g(gVar2, "onError is null");
        io.reactivex.internal.functions.b.g(aVar, "onComplete is null");
        d(uVar, new io.reactivex.internal.subscribers.m(gVar, gVar2, aVar, io.reactivex.internal.functions.a.f298701l));
    }

    public static <T> void c(org.reactivestreams.u<? extends T> uVar, dj.g<? super T> gVar, dj.g<? super Throwable> gVar2, dj.a aVar, int i10) {
        io.reactivex.internal.functions.b.g(gVar, "onNext is null");
        io.reactivex.internal.functions.b.g(gVar2, "onError is null");
        io.reactivex.internal.functions.b.g(aVar, "onComplete is null");
        io.reactivex.internal.functions.b.h(i10, "number > 0 required");
        d(uVar, new io.reactivex.internal.subscribers.g(gVar, gVar2, aVar, io.reactivex.internal.functions.a.d(i10), i10));
    }

    public static <T> void d(org.reactivestreams.u<? extends T> uVar, org.reactivestreams.v<? super T> vVar) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        io.reactivex.internal.subscribers.f fVar = new io.reactivex.internal.subscribers.f(linkedBlockingQueue);
        uVar.e(fVar);
        while (!fVar.a()) {
            try {
                Object objPoll = linkedBlockingQueue.poll();
                if (objPoll == null) {
                    if (fVar.a()) {
                        return;
                    }
                    io.reactivex.internal.util.e.b();
                    objPoll = linkedBlockingQueue.take();
                }
                if (fVar.a() || objPoll == io.reactivex.internal.subscribers.f.f303341c || io.reactivex.internal.util.q.e(objPoll, vVar)) {
                    return;
                }
            } catch (InterruptedException e10) {
                fVar.cancel();
                vVar.onError(e10);
                return;
            }
        }
    }
}
