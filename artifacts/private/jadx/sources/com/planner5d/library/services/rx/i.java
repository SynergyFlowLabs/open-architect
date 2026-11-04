package com.planner5d.library.services.rx;

import com.planner5d.library.model.w;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action0;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes10.dex */
public class i {

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends e<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f224947d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ AtomicReference f224948e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ AtomicReference f224949f;

        a(AtomicBoolean atomicBoolean, AtomicReference atomicReference, AtomicReference atomicReference2) {
            this.f224947d = atomicBoolean;
            this.f224948e = atomicReference;
            this.f224949f = atomicReference2;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            AtomicReference atomicReference = this.f224948e;
            if (th2 == null) {
                th2 = new Exception("ToResult error");
            }
            atomicReference.set(th2);
            onCompleted();
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            this.f224947d.set(true);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onNext(T t10) {
            this.f224949f.set(t10);
        }
    }

    public static /* synthetic */ void a(Callable callable, Subscriber subscriber) {
        try {
            subscriber.onNext(callable.call());
            subscriber.onCompleted();
        } catch (Throwable th2) {
            subscriber.onError(j.a(th2));
        }
    }

    public static /* synthetic */ void b(Runnable runnable, Subscriber subscriber) {
        try {
            runnable.run();
            subscriber.onCompleted();
        } catch (Throwable th2) {
            subscriber.onError(j.a(th2));
        }
    }

    public static /* synthetic */ void c(w wVar, CompositeSubscription compositeSubscription) {
        Subscription subscription = (Subscription) wVar.a();
        if (subscription != null) {
            compositeSubscription.remove(subscription);
        }
    }

    @Deprecated(since = "Use coroutines - will not work properly in tests")
    public static <T> Observable<T> d(Observable.OnSubscribe<T> onSubscribe) {
        return e(onSubscribe, true);
    }

    @Deprecated(since = "Use coroutines - will not work properly in tests")
    public static <T> Observable<T> e(Observable.OnSubscribe<T> onSubscribe, boolean z10) {
        Observable<T> observableSubscribeOn = Observable.create(onSubscribe).subscribeOn(c.f224933c);
        return z10 ? observableSubscribeOn.observeOn(c.f224934d) : observableSubscribeOn;
    }

    public static <T> Observable<T> f(final Callable<T> callable) {
        return Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.services.rx.g
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                i.a(callable, (Subscriber) obj);
            }
        });
    }

    public static Observable<Void> g(Callable<Void> callable) {
        return f(callable);
    }

    public static <T> Observable<T> h(final Runnable runnable) {
        return Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.services.rx.f
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                i.b(runnable, (Subscriber) obj);
            }
        });
    }

    public static Observable<Void> i(Runnable runnable) {
        return h(runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fj.g
    public static <T> Subscription j(@fj.g Observable<T> observable, @fj.g Subscriber<T> subscriber, @fj.g final CompositeSubscription compositeSubscription) {
        final w wVar = new w(null);
        Subscription subscriptionSubscribe = observable.doAfterTerminate(new Action0() { // from class: com.planner5d.library.services.rx.h
            @Override // rx.functions.Action0
            public final void call() {
                i.c(wVar, compositeSubscription);
            }
        }).subscribe((Subscriber) subscriber);
        wVar.b(subscriptionSubscribe);
        compositeSubscription.add(subscriptionSubscribe);
        return subscriptionSubscribe;
    }

    public static <T> T k(Observable<T> observable) throws Throwable {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicReference atomicReference = new AtomicReference(null);
        AtomicReference atomicReference2 = new AtomicReference(null);
        observable.subscribe((Subscriber) new a(atomicBoolean, atomicReference2, atomicReference));
        while (!atomicBoolean.get()) {
            Thread.yield();
        }
        Throwable th2 = (Throwable) atomicReference2.get();
        if (th2 == null) {
            return (T) atomicReference.get();
        }
        throw th2;
    }
}
